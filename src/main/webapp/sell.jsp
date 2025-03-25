<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Luxury Timepieces</title>
    <link rel="stylesheet" href="sell.css">
</head>
<body>
    <header>
        <div class="top-bar">
            <p>Retrouvez notre selection exclusive de montres de luxe !</p>
        </div>
        <nav class="navbar">
            <div class="logo">Luxury Time</div>
            <ul class="nav-links"></ul>
            <div class="icons">
                <a href="#">Recherche</a>
                <a href="#">Notifications</a>
                <a href="#">Compte</a>
                <a href="#" class="panier">Panier <span class="panier-count">0</span></a>
            </div>
        </nav>
    </header>

    <section class="hero">
        <div class="hero-content">
            <h1>Luxury Time, l'elegance du temps</h1>
            <buttona class="btn">Explorer</button>
        </div>
    </section>

    <section class="products">
        <h2>Nos Montres de Luxe</h2>
        <div class="product-container">
            <button class="scroll-button left">&larr;</button>
            <div class="product-list">
                <div class="product">
                    <img src="img/rolex.jpg" alt="Rolex Submariner">
                    <h3>Rolex Submariner</h3>
                    <p>Acier inoxydable - Etanche 300m - Mouvement automatique</p>
                    <span class="price">9 500 &euro;</span>
                    <br><br>
                    <button>+ Ajouter au panier</button>
                </div>
                <div class="product">
                    <img src="img/audemars.jpg" alt="Audemars Piguet Royal Oak Flying Tourbillon In Sand Gold">
                    <h3>Audemars Piguet Royal Oak Flying Tourbillon</h3>
                    <p>Or rose 18k - Tourbillon volant - Mouvement automatique</p>
                    <span class="price">125 000 &euro;</span>
                    <br><br>
                    <button>+ Ajouter au panier</button>
                </div>
                <div class="product">
                    <img src="img/patek.jpg" alt="Patek Philippe Nautilus">
                    <h3>Patek Philippe Nautilus</h3>
                    <p>Boitier en platine - Reserve de marche 60h - Bracelet integre</p>
                    <span class="price">70 000 &euro;</span>
                    <br><br>
                    <button>+ Ajouter au panier</button>
                </div>
                <div class="product">
                    <img src="img/richard.jpg" alt="Richard Mille Rafael Nadal">
                    <h3>Richard Mille Rafael Nadal</h3>
                    <p>Boitier en platine - Reserve de marche 60h - Bracelet integre</p>
                    <span class="price">225 000 &euro;</span>
                    <br><br>
                    <button>+ Ajouter au panier</button>
                </div>
                <!-- Nouveaux produits -->
                <div class="product">
                    <img src="img/alange.jpg" alt="A. Lange & Söhne Tourbograph Perpetuel">
                    <h3>A. Lange & Söhne Tourbograph Perpetuel</h3>
                    <p>Or gris 18k - Mouvement manuel - Tourbillon</p>
                    <span class="price">400 000 &euro;</span>
                    <br><br>
                    <button>+ Ajouter au panier</button>
                </div>
                <div class="product">
                    <img src="img/omega.jpg" alt="Montre OMEGA Speedmaster '57">
                    <h3>Montre OMEGA Speedmaster '57</h3>
                    <p>Acier inoxydable - Mouvement chronographe - Resistance 100m</p>
                    <span class="price">6 000 &euro;</span>
                    <br><br>
                    <button>+ Ajouter au panier</button>
                </div>
                <div class="product">
                    <img src="img/jaeger.jpg" alt="Jaeger-LeCoultre Master Grande Tradition Gyrotourbillon Westminster Perpetuel">
                    <h3>Jaeger-LeCoultre Master Grande Tradition Gyrotourbillon Westminster Perpetuel</h3>
                    <p>Or gris - Gyrotourbillon - Sonnerie Westminster</p>
                    <span class="price">600 000 &euro;</span>
                    <br><br>
                    <button>+ Ajouter au panier</button>
                </div>
            </div>
            <button class="scroll-button right">&rarr;</button>
        </div>
    </section>

    <!-- Panier latéral -->
    <div class="cart-sidebar">
            <div class="cart-header">
                <h2>Votre Panier</h2>
                <button class="close-cart">&times;</button>
            </div>
        <div class="cart-content">
            <p>Votre panier est vide.</p>
        </div>
        <div class="cart-footer">
            <p>Total: <span class="cart-total">0 &euro;</span></p>
            <button class="checkout-btn">Effectuer le paiement</button>
        </div>
    </div>
    <div class="overlay"></div>

<script src="script.js"></script>

    
    <script src="script.js"></script>
</body>
</html>
