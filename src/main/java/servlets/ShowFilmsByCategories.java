package servlets;

import Entities.Film;
import org.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

import static Services.FilmService.searchFilmImage;
import static Services.FilmService.searchFilmName;
import static Services.FilmService.sortByCategory;
import static Services.FilmService.searchFilmDescription;


/**
 * Created by alina on 06.11.16.
 */
public class ShowFilmsByCategories extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println(req.getAttribute("param1"));

        int [] films_ids = sortByCategory("драма");
        String [] films_images = new String[films_ids.length];
        String [] films_names = new String[films_ids.length];
        String [] films_descriptions = new String[films_ids.length];

        for (int i=0; i<films_ids.length; i++){
            films_images[i] = searchFilmImage(films_ids[i]);
            films_names[i] = searchFilmName(films_ids[i]);
            films_descriptions[i] = searchFilmDescription(films_ids[i]) + "TheEndOfDescription";
        }

        resp.setContentType("text/plain");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write(Arrays.toString(films_images) + Arrays.toString(films_names)
        + Arrays.toString(films_descriptions));

       /* int [] films_ids = sortByCategory("драма");
        Film [] films = new Film [films_ids.length];

        for (int i=0; i<films_ids.length; i++){
            int id = films_ids[i];
            String image = searchFilmImage(films_ids[i] + 1);
            String name = searchFilmName(films_ids[i] + 1);
            String description = searchFilmDescription(films_ids[i] + 1);
            Film film = new Film(name, description, id, image);
            films[i] = film;
        }
        String [] films_string = new String [films.length];
        for (int i = 0; i < films_string.length; i++){
            System.out.println(films_string[i]);
        }

        resp.setContentType("text/plain");  // Set content type of the response so that jQuery knows what it can expect.
        resp.setCharacterEncoding("UTF-8"); // You want world domination, huh?
        resp.getWriter().write(Arrays.toString(films_string)); */
    }
}