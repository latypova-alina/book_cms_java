package Entities;

/**
 * Created by alina on 06.11.16.
 */
public class Film {
    public String name;
    private String description;
    private int id;
    private String image;



    public Film(String name, String description, int id, String image) {

        this.name = name;
        this.description = description;
        this.id = id;
        this.image = image;
    }

    public String getName() { return name; }

    public String getDescription() {return description;}

    public String getImage() {
        return image;
    }

    public int getId() { return id; }
}
