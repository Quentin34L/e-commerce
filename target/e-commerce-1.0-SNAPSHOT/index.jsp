<!DOCTYPE html>
<html lang="en">
   <head>
      <meta charset="UTF-8">
      <meta http-equiv="X-UA-Compatible" content="IE=edge">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <link rel="stylesheet" href="style.css"> 
      <title>Site E-Commerce</title>
   </head>
   <body>
      <a href="sell.jsp"><h2 id="TextWelcome">Site E-Commerce Java</h2></a>
      
      <div class="container" id="container">

         <div class="form-container sign-up-container">
            <form action="/register" method="post">

               <h1 class="signup">Tu veux un compte ?</h1>
               <span>ou utilise ton email pour te connecter</span>
               <input type="text" placeholder="Username" name="username"  required/>
               <input type="email" placeholder="Email"  name="email" required/>
               <input type="password" placeholder="Password" id="password" name="password" required>
               <input type="password" placeholder="Confirm Password" id="confirm_password" name="confirm_password" required>
               <button type="submit">Inscription</button>

            </form>
         </div>

         <div class="form-container sign-in-container">
            <form action="/login" method="post">

               <h1>Connexion</h1>
               <input type="email" placeholder="Email" name="Email" required/>
               <input type="password" placeholder="Password" name="Password" required />
               <a id="mdp" href="#"> Mot de passe oublie ?</a>
               <button >Connexion</button>

            </form>
         </div>

         <div class="overlay-container">
            <div class="overlay">

               <div class="overlay-panel overlay-left">
                  <h1>Tu as un compte ?</h1>
                  <p>Pour te connecter avec tes identifiants c'est juste ici</p>
                  <button class="ghost" id="signIn">Connexion</button>
               </div>

               <div class="overlay-panel overlay-right">
                  <h1>Salut !</h1> 
                  <p>Si tu veux pouvoir acheter, il te faut un compte c'est par ici !</p>
                  <button class="ghost" id="signUp">Inscription</button>
               </div>

            </div>
         </div>

      </div>

      <!--  hash le mot de passe -->
      <script src="https://cdnjs.cloudflare.com/ajax/libs/crypto-js/4.0.0/crypto-js.min.js"></script>   
      <script>
         const signUpButton = document.getElementById('signUp');
         const signInButton = document.getElementById('signIn');
         const container = document.getElementById('container');
         
         signUpButton.addEventListener('click', () => {
         container.classList.add("right-panel-active");
         });
         
         signInButton.addEventListener('click', () => {
         container.classList.remove("right-panel-active");
         });
      </script>
      <script>
         var password = document.getElementById("password"),
             confirm_password = document.getElementById("confirm_password");
         
         function validatePassword() {
            if (password.value != confirm_password.value) {
               confirm_password.setCustomValidity("Passwords Don't Match");
            } else {
               confirm_password.setCustomValidity('');
            }
         }
         
         password.onchange = validatePassword;
         confirm_password.onkeyup = validatePassword;
      </script>
   </body>

   <!--  hash le mot de passe REGISTER -->
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

      <!--  hash le mot de passe LOGIN -->
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
      
            // Soumettre le formulaire d'inscription
            
         });
      </script> 
</html>
