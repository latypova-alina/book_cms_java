<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/foundation/6.2.3/foundation.min.css">
    <link rel="stylesheet" type="text/css" href="styles/foundation-icons/foundation-icons.css">
    <script src="https://cdn.jsdelivr.net/foundation/6.2.3/foundation.min.js"></script>
    <link rel="stylesheet" type="text/css" href="styles/registrationForm.css">
</head>
<form method="POST" action="/registration">

<div class="row">
    <div class="large-6 large-offset-3 column">
        <div class="signup-panel">
            <p class="welcome"> Welcome to this awesome app!</p>
            <form>
                <div class="row collapse">
                    <div class="small-2  columns">
                        <span class="prefix"><i class="fi-torso-female"></i></span>
                    </div>
                    <div class="small-10  columns">
                        <input type="text" placeholder="username" name="username">
                    </div>
                </div>
                <div class="row collapse">
                    <div class="small-2 columns">
                        <span class="prefix"><i class="fi-mail"></i></span>
                    </div>
                    <div class="small-10  columns">
                        <input type="text" placeholder="email" name="email">
                    </div>
                </div>
                <div class="row collapse">
                    <div class="small-2 columns ">
                        <span class="prefix"><i class="fi-lock"></i></span>
                    </div>
                    <div class="small-10 columns ">
                        <input type="text" placeholder="password" name="password">
                    </div>
                </div>
            </form>
            <input type="submit" class="button " value="Sign Up">
            <p>Already have an account? <a href="#">Login here &raquo</a></p>
        </div>
    </div>
</div>
</form>