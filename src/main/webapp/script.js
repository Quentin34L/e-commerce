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

    // Fonction pour mettre à jour le panier
    function updateCart() {
        // Générer le HTML des articles
        cartContent.innerHTML = cartItems.map((item, index) => `
            <div class="cart-item" data-index="${index}">
                <img src="${item.img}" alt="${item.name}">
                <div>
                    <h4>${item.name}</h4>
                    <p>${item.price} &euro;</p>
                </div>
                <button class="remove-item">Supprimer</button>
            </div>
        `).join("");

        // Mettre à jour le total avec séparation des milliers
        const total = cartItems.reduce((sum, item) => sum + item.price, 0);
        cartTotal.innerHTML = `${total.toLocaleString('fr-FR')} &euro;`;

        // Mise à jour du compteur panier
        panierCount.textContent = cartItems.length;

        // Ajouter les événements de suppression
        document.querySelectorAll(".remove-item").forEach(button => {
            button.addEventListener("click", function () {
                const index = this.parentElement.dataset.index;
                cartItems.splice(index, 1);
                updateCart();
            });
        });
    }

    // Fonction pour ajouter un produit au panier
    addToCartButtons.forEach(button => {
        button.addEventListener('click', function () {
            const product = this.parentElement;
            const productName = product.querySelector('h3').textContent;
            const productPrice = parseFloat(product.querySelector('.price').textContent.replace(/\s/g, '').replace('€', ''));
            const productImg = product.querySelector('img').src;

            cartItems.push({ name: productName, price: productPrice, img: productImg });
            updateCart();
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
