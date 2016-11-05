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
        $.get("/showActorsNames", function (responseText) {
            var paths = responseText;
            paths = paths.replace('[','');
            paths = paths.replace(']','');
            var names = paths.split(", ");
            for (i = 1; i<3; i++) {
                var name_title = document.getElementById('name_' + i);
                name_title.innerText = names[i - 1];
            }
        });

    }
    function showFilms() {
        $.get("/showFilms", function (responseText) {
            var paths = responseText;
            paths = paths.replace('[','');
            paths = paths.replace(']','');
            var image_path = paths.split(", ");
            for (i = 1; i<3; i++) {
                var img = document.getElementById('image_' + i);
                img.src = image_path[i - 1];
            }
        });
        $.get("/showFilmsNames", function (responseText) {
            var paths = responseText;
            paths = paths.replace('[','');
            paths = paths.replace(']','');
            var names = paths.split(", ");
            for (i = 1; i<3; i++) {
                var name_title = document.getElementById('name_' + i);
                name_title.innerText = names[i - 1];
            }
        });
        $.get("/showFilmsDescription", function (responseText) {
            var paths = responseText;
            paths = paths.replace('[','');
            paths = paths.replace(']','');
            var description = paths.split("TheEndOfDescription, ");
            for (i = 1; i<3; i++) {
                var name_title = document.getElementById('description_' + i);
                name_title.innerText = description[i - 1];
            }
        });
    }
    document.getElementById('actors').onclick = showActors;
    document.getElementById('films').onclick = showFilms;
});


