<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="/assets/css/style.css">
    <title>E-Commerce Login</title>
</head>
<body>
    <h2> Site E-commerce POO</h2>

    <div class="container" id="container">

        <div class="form-container sing-up container">
            <form action="/register" method="post">

                <h1 class="singup">Créer un compte</h1>
                
                <input type="text" placeholder="Username" name="username" required>
                <input type="text" placeholder="Email" name="email" required>
                <input type="password" placeholder="Password" id="password" name="password" required>
                <input type="password" placeholder="Confirm Password" name="confirm_password" id="confirm_password">
                <button type="submit">Inscription</button>
                
            </form>
        </div>

        <div class="overlay-container">

            <div class="overlay">

                <div class="overlay-panel overlay-right">
                    <h1>Déjà un compte ?</h1>
                    <p>SPour te connecter, mets t'es identifiants.</p>
                    <button class="ghost" id="singIn">Connexion</button>
                </div>

                <div class="overlay-panel overlay-fight">
                    <h1>Salut !</h1>
                    <p>Si tu veux pouvoir achetetr, créer un compte !</p>
                    <button class="ghost" id="singUp">Inscription</button>
                </div>

            </div>

        </div>

    </div>



    <script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/4.0.0/crypto-js.min.js"></script>

    <!-- Script JS -->
    <script>

        const singUpButton = document.getElementById('singUp');
        const signInButton = document.getElementById('singIn');
        const container = document.getElementById('container');

        signInButton.addEventListener('click', () => {
            container.classList.add("right-panel-active")
        });

        signInButton.addEventListener('click', () => {
            container.classList.remove("right-panel-active")
        });

    </script>



    <!-- Mettre le JS (hashage mdp) -->
    <script>
        var password = document.getElementById("password"),
            confirm_password = document.getElementById("confirm_password");
        

        function validatePassword() {
            if (password.value != confirm_password.value) {
                confirm_password.setCustomValidity("Le mot de passe ne corresponds pas");
            } else {
                confirm_password.setCustomValidity("");
            }
        }

        password.onchange = validatePassword;
        confirm_password.onkeyup = validatePassword;
    </script>



    <!-- Mettre le JS (hashage mdp) register -->
    <script>
        var signUpForm = document.querySelector(".sign-up-container form");
        signUpForm.addEventListener("submit", function(event) {
           event.preventDefault();
        
           var passwordField = document.getElementById("password");
           var passwordField2 = document.getElementById("confirm_password");
           var password = passwordField.value;
        
           // Hacher le mot de passe avec SHA-256
           var hashedPassword = CryptoJS.SHA256(password).toString();
        
           // Mettre à jour la valeur du champ de mot de passe avec le mot de passe haché
           passwordField.value = hashedPassword;
           passwordField2.value = hashedPassword;
        
        });
        </script> 



    <!-- Mettre le JS (hashage mdp) login -->
    <script>
        var signUpForm = document.querySelector(".login-container form");
        signUpForm.addEventListener("submit", function(event) {
           event.preventDefault();
     
           var passwordField = document.getElementById("password");
           var password = passwordField.value;
     
           // Hacher le mot de passe avec SHA-256
           var hashedPassword = CryptoJS.SHA256(password).toString();
     
           // Mettre à jour la valeur du champ de mot de passe avec le mot de passe haché
           passwordField.value = hashedPassword;
        });
     </script> 


</body>
</html>