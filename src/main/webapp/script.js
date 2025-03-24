document.addEventListener("DOMContentLoaded", function () {
    const leftButton = document.querySelector('.scroll-button.left');
    const rightButton = document.querySelector('.scroll-button.right');
    const productList = document.querySelector('.product-list');
    const products = document.querySelectorAll('.product');

    let currentIndex = Math.floor(products.length / 2); // Position initiale au centre

    function updateVisibility() {
        products.forEach((product, index) => {
            product.classList.toggle('active', index === currentIndex);
        });

        // Centrage automatique de l'affichage
        const offset = currentIndex * 320 - (window.innerWidth / 2 - 160);
        productList.style.transform = `translateX(-${offset}px)`;
    }

    leftButton.addEventListener('click', () => {
        currentIndex = (currentIndex - 1 + products.length) % products.length; // Reboucle à la fin
        updateVisibility();
    });

    rightButton.addEventListener('click', () => {
        currentIndex = (currentIndex + 1) % products.length; // Reboucle au début
        updateVisibility();
    });

    updateVisibility(); // Initialisation
});
