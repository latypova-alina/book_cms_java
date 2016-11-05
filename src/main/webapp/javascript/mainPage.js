$(document).ready(function(){

    function showActors() {
        $.get("/showActors", function (responseText) {
            var paths = responseText;
            paths = paths.replace('[','');
            paths = paths.replace(']','');
            var image_path = paths.split(", ");
            for (i = 1; i<3; i++) {
                var img = document.getElementById('image_' + i);
                img.src = image_path[i - 1];
            }
        });

    }
    function showFilms() {
        $.get("/showFilms", function(responseText) {
            var image_path = responseText;
            img.src = image_path;
        });
        image_id = image_id + 1;
    }
    document.getElementById('actors').onclick = showActors;
    document.getElementById('films').onclick = showFilms;
});


