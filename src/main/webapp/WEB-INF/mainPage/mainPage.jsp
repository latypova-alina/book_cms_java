<!doctype html>
<html class="no-js" lang="en">
<%@ page contentType="text/html;charset=UTF-8" %>
<head>
    <script type="text/javascript" src="lib/jquery/jquery.js"></script>
    <script type="text/javascript" src="lib/jquery/jquery.form.js"></script>
    <script type="text/javascript" src="lib/jquery/jquery.validate.js"></script>
    <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Foundation | Welcome</title>
    <script src="javascript/mainPage.js"></script>
    <link rel="stylesheet" href="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.min.css">
</head>
<body>

<!-- Start Top Bar -->
<div class="top-bar">
    <div class="top-bar-left">
        <ul class="menu">
            <li class="menu-text">Yeti Agency</li>
        </ul>
    </div>
    <div class="top-bar-right">
        <ul class="menu">
            <li><a href="/registration">Sign up</a></li>
            <li><a href="/login">Sign in</a></li>
            <li><a href="#">Three</a></li>
            <li><a href="#">Four</a></li>
        </ul>
    </div>
</div>
<!-- End Top Bar -->

<div class="callout large primary">
    <div class="row column text-center">
        <h1>Our Blog</h1>
    </div>
</div>

<div class="row">
    <div class="top-bar-left">
            <a href="#" id="actors" class="button success">Actors</a>
            <a href="#" id="films" class="button success">Films</a>
            <a href="#" id="news" class="button success">News</a>
    </div>

</div>
<div class="row" id="content">
    <div class="medium-8 columns">

        <div class="blog-post">
            <h3 id = 'name_1'></h3>
            <img class="image" id="image_1" src="">
            <p id="description_1"></p>
            <div class="callout">
                <ul class="menu simple">
                    <li><a href="#">Author: Mike Mikers</a></li>
                    <li><a href="#">Comments: 3</a></li>
                </ul>
            </div>
        </div>

        <div class="blog-post">
            <h3 id="name_2"></h3>
            <img class="image" id="image_2" src="">
            <p id="description_2"></p>
            <div class="callout">
                <ul class="menu simple">
                    <li><a href="#">Author: Mike Mikers</a></li>
                    <li><a href="#">Comments: 3</a></li>
                </ul>
            </div>
        </div>
        <div class="blog-post">
            <h3 id="name_3"></h3>
            <img class="image" id="image_3" src="">
            <p id="description_3"></p>
            <div class="callout">
                <ul class="menu simple">
                    <li><a href="#">Author: Mike Mikers</a></li>
                    <li><a href="#">Comments: 3</a></li>
                </ul>
            </div>
        </div>

        <div class="blog-post">
            <h3 id="name_4"></h3>
            <img class="image" src="">
            <p id="description_4"></p>
            <div class="callout">
                <ul class="menu simple">
                    <li><a href="#">Author: Mike Mikers</a></li>
                    <li><a href="#">Comments: 3</a></li>
                </ul>
            </div>
        </div>
    </div>
    <div class="medium-3 columns" data-sticky-container>
        <div class="sticky" data-sticky data-anchor="content">
            <h4>Categories</h4>
            <ul>
                <li><a id="drama" href="#">Драма</a></li>
                <li><a href="#">Комедия</a></li>
                <li><a href="#">Mike</a></li>
                <li><a href="#">Holly</a></li>
            </ul>

            <h4>Authors</h4>
            <ul>
                <li><a href="#">Skyler</a></li>
                <li><a href="#">Jesse</a></li>
                <li><a href="#">Mike</a></li>
                <li><a href="#">Holly</a></li>
            </ul>
        </div>
    </div>
</div>

<div class="row column">
    <ul class="pagination" role="navigation" aria-label="Pagination">
        <li class="disabled">Previous</li>
        <li class="current"><span class="show-for-sr">You're on page</span> 1</li>
        <li><a href="#" aria-label="Page 2">2</a></li>
        <li><a href="#" aria-label="Page 3">3</a></li>
        <li><a href="#" aria-label="Page 4">4</a></li>
        <li class="ellipsis"></li>
        <li><a href="#" aria-label="Page 12">12</a></li>
        <li><a href="#" aria-label="Page 13">13</a></li>
        <li><a href="#" aria-label="Next page">Next</a></li>
    </ul>
</div>

<script src="https://code.jquery.com/jquery-2.1.4.min.js"></script>
<script src="http://dhbhdrzi4tiry.cloudfront.net/cdn/sites/foundation.js"></script>
<script>
    $(document).foundation();
</script>
</body>
</html>



