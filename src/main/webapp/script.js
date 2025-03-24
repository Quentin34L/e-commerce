// Gestion du Panier
document.addEventListener("DOMContentLoaded", function () {
    const addToCartButtons = document.querySelectorAll('.product button');
    const panierCount = document.querySelector('.panier-count');
    let cartCount = 0;

    // Fonction pour ajouter un produit au panier
    addToCartButtons.forEach(button => {
        button.addEventListener('click', function () {
            cartCount++;
            panierCount.textContent = cartCount;
        });
    });
});


// Animation défilement des montres :
document.addEventListener("DOMContentLoaded", function () {
    const leftButton = document.querySelector('.scroll-button.left');
    const rightButton = document.querySelector('.scroll-button.right');
    const productList = document.querySelector('.product-list');
    const products = document.querySelectorAll('.product');

    let currentIndex = Math.floor(products.length / 2);

    function updateVisibility() {
        products.forEach((product, index) => {
            product.classList.toggle('active', index === currentIndex);
        });

        // Centrage automatique de l'affichage
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
