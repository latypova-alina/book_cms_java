$(document).ready(function(){

    function showNews() {
        $.get("/showNews", function (responseText) {
            var paths = responseText;
            paths = paths.replace('[','');
            paths = paths.replace(']','');
            var image_path = paths.split(", ");
            for (i = 1; i < image_path.length + 1; i++) {
                var img = document.getElementById('image_' + i);
                img.src = image_path[i - 1];
            }
        });
        $.get("/showNewsTitle", function (responseText) {
            var paths = responseText;
            paths = paths.replace('[','');
            paths = paths.replace(']','');
            var names = paths.split(", ");
            for (i = 1; i < names.length + 1; i++) {
                var name_title = document.getElementById('name_' + i);
                name_title.innerText = names[i - 1];
            }
        });
        for (i = 1; i<3; i++) {
            var description_field = document.getElementById('description_' + i);
            description_field.innerText = "";
        }

    }

    function showActors() {
        $.get("/showActors", function (responseText) {
            var paths = responseText;
            paths = paths.replace('[','');
            paths = paths.replace(']','');
            var image_path = paths.split(", ");
            for (i = 1; i < image_path.length; i++) {
                var img = document.getElementById('image_' + i);
                img.src = image_path[i - 1];
            }
        });
        $.get("/showActorsNames", function (responseText) {
            var paths = responseText;
            paths = paths.replace('[','');
            paths = paths.replace(']','');
            var names = paths.split(", ");
            for (i = 1; i < names.length; i++) {
                var name_title = document.getElementById('name_' + i);
                name_title.innerText = names[i - 1];
            }
        });
        for (i = 1; i<3; i++) {
            var description_field = document.getElementById('description_' + i);
            description_field.innerText = "";
        }

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
                var description_field = document.getElementById('description_' + i);
                description_field.innerText = description[i - 1];
            }
        });
    }
    function showCategories() {
    request.setAttribute("param1", "драма");
        $.get("/showFilmsByCategories", function (responseText) {
            var paths = responseText;
            var films = paths.split("][");
            var images = films[0].replace('[', '').split(", ");
            var names = films[1].split(", ");
            var descriptions = films[2].replace(']', '').split("TheEndOfDescription, ");
            descriptions[descriptions.length - 1] = descriptions[descriptions.length - 1].replace("TheEndOfDescription", '');
            for (i=1; i<images.length + 1; i++){
                var img = document.getElementById('image_' + i);
                img.src = images[i - 1];
                var name_title = document.getElementById('name_' + i);
                name_title.innerText = names[i - 1];
                var description_field = document.getElementById('description_' + i);
                description_field.innerText = descriptions[i - 1];
            }

        });

    }
    document.getElementById('actors').onclick = showActors;
    document.getElementById('films').onclick = showFilms;
    document.getElementById('drama').onclick = showCategories;
    document.getElementById('news').onclick = showNews;


});


