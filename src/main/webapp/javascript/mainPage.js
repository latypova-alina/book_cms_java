$(document).ready(function(){
    var img = document.getElementById('image');
    function showActors() {
        $.get("/showActors", function(responseText) {
            var image_path = responseText;
            img.src = image_path;
        });
    }
    function showFilms() {
        $.get("/showFilms", function(responseText) {
            var image_path = responseText;
            img.src = image_path;
        });
    }
    document.getElementById('actors').onclick = showActors;
    document.getElementById('films').onclick = showFilms;
});


