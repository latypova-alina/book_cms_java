<%@ page contentType="text/html;charset=UTF-8" %>
<head>
    <meta charset="UTF-8">
    <script type="text/javascript" src="lib/jquery/jquery.js"></script>
    <script type="text/javascript" src="lib/jquery/jquery.form.js"></script>
    <script type="text/javascript" src="lib/jquery/jquery.validate.js"></script>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/foundation/6.2.3/foundation.min.css">
    <link rel="stylesheet" type="text/css" href="styles/foundation-icons/foundation-icons.css">
    <script src="https://cdn.jsdelivr.net/foundation/6.2.3/foundation.min.js"></script>
    <link rel="stylesheet" type="text/css" href="styles/registrationForm.css">
    <script src="javascript/registrationForm.js"></script>
</head>
<form method="POST" action="/login">

    <div class="row">
        <div class="large-6 large-offset-3 column">
            <div class="signup-panel">
                <p class="welcome"> Welcome to this awesome app!</p>
                <label id="valid"></label>
                <form id="registrationForm">
                    <div class="row collapse">
                        <div class="small-2 columns">
                            <span class="prefix"><i class="fi-mail"></i></span>
                        </div>
                        <div class="small-10  columns">
                            <input type="text" placeholder="email" name="email" id="email">
                            <div class="error-box"></div>
                        </div>
                    </div>
                    <div class="row collapse">
                        <div class="small-2 columns ">
                            <span class="prefix"><i class="fi-lock"></i></span>
                        </div>
                        <div class="small-10 columns ">
                            <input type="password" placeholder="password" name="password">
                        </div>
                    </div>
                </form>
                <input type="submit" class="button " value="Sign In">
            </div>
        </div>
    </div>
</form>