document.addEventListener("DOMContentLoaded", function () {

    const addToCartButtons = document.querySelectorAll('.product .add-to-cart');
    const panierCount = document.querySelector('.panier-count');
    const cartSidebar = document.querySelector('.cart-sidebar');
    const closeCartButton = document.querySelector('.close-cart');
    const overlay = document.querySelector('.overlay');
    const cartContent = document.querySelector('.cart-content');
    const cartTotal = document.querySelector('.cart-total');

    let cartCount = 0;
    let cartItems = [];

    function updateCart() {
    cartContent.innerHTML = cartItems.map((item, index) => `
        <div class="cart-item" data-index="${index}">
            <img src="${item.img}" alt="${item.name}">
            <div>
                <h4>${item.name}</h4>
                <p>${item.price} &euro;</p>
                <p>Exemplaire : ${item.quantity}</p>
            </div>
            <button class="remove-item">Supprimer</button>
        </div>
    `).join("");

    const total = cartItems.reduce((sum, item) => sum + (item.price * item.quantity), 0);
    cartTotal.innerHTML = `${total.toLocaleString('fr-FR')} &euro;`;

    panierCount.textContent = cartItems.reduce((sum, item) => sum + item.quantity, 0);

    document.querySelectorAll(".remove-item").forEach(button => {
        button.addEventListener("click", function () {
            const index = this.parentElement.dataset.index;
            cartItems.splice(index, 1);
            updateCart();
        });
    });
}

    addToCartButtons.forEach(button => {
        button.addEventListener('click', function () {
            const product = this.parentElement;
            const productId = product.getAttribute('data-id');
            const productName = product.querySelector('h3').textContent;
            const productPrice = parseFloat(product.querySelector('.price').textContent.replace(/\s/g, '').replace('€', ''));
            const productImg = product.querySelector('img').src;
            let productStock = parseInt(product.getAttribute('data-stock'));

            if (productStock > 0) {
                const cartItemIndex = cartItems.findIndex(item => item.id === productId);

                if (cartItemIndex !== - 1) {
                    cartItems[cartItemIndex].quantity += 1;
                } else {
                    cartItems.push({ 
                        id: productId,
                        name: productName, 
                        price: productPrice, 
                        img: productImg, 
                        quantity: 1 
                    });
                };

                productStock = productStock - 1;
                product.setAttribute('data-stock', productStock);

                product.querySelector('.stock').textContent = `Stock disponible : ${productStock}`;

                if (productStock === 0) {
                    this.disabled = true;
                    this.textContent = 'Rupture de stock';
                }

                updateCart();
            } else {
                alert("Plus de stock disponible.");
            }
        });
    });

    document.querySelector('.panier').addEventListener("click", function (event) {
        event.preventDefault();
        cartSidebar.classList.add("active");
        overlay.classList.add("active");
    });

    closeCartButton.addEventListener("click", function () {
        cartSidebar.classList.remove("active");
        overlay.classList.remove("active");
    });

    overlay.addEventListener("click", function () {
        cartSidebar.classList.remove("active");
        overlay.classList.remove("active");
    });

    const leftButton = document.querySelector('.scroll-button.left');
    const rightButton = document.querySelector('.scroll-button.right');
    const productList = document.querySelector('.product-list');
    const products = document.querySelectorAll('.product');

    let currentIndex = Math.floor(products.length / 2);

    function updateVisibility() {
        products.forEach((product, index) => {
            product.classList.toggle('active', index === currentIndex);
        });

        const offset = currentIndex * 320 - (window.innerWidth / 2 - 160);
        productList.style.transform = `translateX(-${offset}px)`;
    }

    leftButton.addEventListener('click', () => {
        currentIndex = (currentIndex - 1 + products.length) % products.length;
        updateVisibility();
    });

    rightButton.addEventListener('click', () => {
        currentIndex = (currentIndex + 1) % products.length;
        updateVisibility();
    });

    updateVisibility();
});