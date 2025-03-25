document.addEventListener("DOMContentLoaded", function () {
    // 🛒 Gestion du Panier
    const addToCartButtons = document.querySelectorAll('.product button');
    const panierCount = document.querySelector('.panier-count');
    const cartSidebar = document.querySelector('.cart-sidebar');
    const closeCartButton = document.querySelector('.close-cart');
    const overlay = document.querySelector('.overlay');
    const cartContent = document.querySelector('.cart-content');
    const cartTotal = document.querySelector('.cart-total');
    let cartCount = 0;
    let cartItems = [];

    // Fonction pour ajouter un produit au panier
    addToCartButtons.forEach(button => {
        button.addEventListener('click', function () {
            cartCount++;
            panierCount.textContent = cartCount;

            const product = this.parentElement;
            const productName = product.querySelector('h3').textContent;
            const productPrice = product.querySelector('.price').textContent;
            const productImg = product.querySelector('img').src;

            const newItem = `
                <div class="cart-item">
                    <img src="${productImg}" alt="${productName}">
                    <div>
                        <h4>${productName}</h4>
                        <p>${productPrice}</p>
                    </div>
                </div>
            `;
            cartItems.push(newItem);
            cartContent.innerHTML = cartItems.join("");
            cartTotal.textContent = `${cartCount * parseFloat(productPrice)} €`;
        });
    });

    // 🎛️ Ouvrir et fermer le panier latéral
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

    // 🎥 Animation du défilement des montres
    const leftButton = document.querySelector('.scroll-button.left');
    const rightButton = document.querySelector('.scroll-button.right');
    const productList = document.querySelector('.product-list');
    const products = document.querySelectorAll('.product');

    let currentIndex = Math.floor(products.length / 2);

    function updateVisibility() {
        products.forEach((product, index) => {
            product.classList.toggle('active', index === currentIndex);
        });

        // Centrage automatique
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
