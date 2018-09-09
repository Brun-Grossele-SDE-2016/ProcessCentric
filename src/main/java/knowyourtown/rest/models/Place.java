package knowyourtown.rest.models;

public class Place {

    public Integer uid;
    public String placeType;
    public String location;
    public String name;
    public String date;

    public Place(Integer uid, String placeType, String location, String name, String date) {
        this.uid = uid;
        this.placeType = placeType;
        this.location = location;
        this.name = name;
        this.date = date;
    }
}
