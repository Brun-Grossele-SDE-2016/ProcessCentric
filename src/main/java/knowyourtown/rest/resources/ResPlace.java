package knowyourtown.rest.resources;

import com.google.gson.Gson;
import knowyourtown.business.BusinessClient;
import knowyourtown.storage.StorageClient;
import knowyourtown.business.webservice.Business;
import knowyourtown.localdb.webservice.PlaceType;
import knowyourtown.storage.webservice.Storage;
import knowyourtown.rest.models.Success;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by matteo on 10/05/17.
 */

@Path("/place")
public class ResPlace {

    @GET
    @Produces("application/json")
    public String show() {
        System.out.println(":: PLACE GET RECIEVED : /place");
        return "Welcome to place!";
    }

    @GET
    @Path("delete/{uid}/{type}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String deleteSuggestion(@PathParam("uid") Integer uid, @PathParam("type") String type) {

        System.out.println(":: PLACES DELETE RECIEVED : /place");
        
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        List<knowyourtown.localdb.webservice.Place> places = storage.getPlaceHistory(uid, type);

        Gson gson = new Gson();
        for(int i = 0; i < places.size();i++)
        {
            business.deletePlace(places.get(i).getIdPlace());
        }

        return gson.toJson(new Success(true));

    }

    @GET
    @Path("show/{id}/{type}")
    @Produces("application/json")
    public String showByType(@PathParam("id") Integer uid, @PathParam("type") String type) {

        System.out.println(":: PLACES GET RECIEVED : /place/show/" + uid + "/" + type);

        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        List<knowyourtown.localdb.webservice.Place> places = storage.getPlaceHistory(uid, type);
        ArrayList<knowyourtown.rest.models.Place> jsonPlaces = new ArrayList<knowyourtown.rest.models.Place>();

        Collections.reverse(places);

        Iterator it = places.iterator();
        int i = 0;
        while (it.hasNext() && i < 15) {
            knowyourtown.localdb.webservice.Place place = (knowyourtown.localdb.webservice.Place) it.next();

            jsonPlaces.add(new knowyourtown.rest.models.Place(uid,
                    place.getPlaceType().getType(), 
                    place.getLocation(),
                    place.getName(),
                    place.getDate()));
            i++;
        }

        Gson gson = new Gson();
        return gson.toJson(jsonPlaces, jsonPlaces.getClass());
    }

    @POST
    @Path("new")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newPlace(String placejson) {

        System.out.println(":: PLACES POST RECIEVED : /place/new");
        System.out.println("\t JSON -> " + placejson);

        Gson gson = new Gson();
        knowyourtown.rest.models.Place place = gson.fromJson(placejson, knowyourtown.rest.models.Place.class);

        knowyourtown.localdb.webservice.Place pPlace = new knowyourtown.localdb.webservice.Place();
        PlaceType type = new PlaceType();
        type.setType(place.placeType);

        pPlace.setLocation(place.location);
        pPlace.setName(place.name);
        pPlace.setPlaceType(type);
        pPlace.setDate("");

        //CALL BUSINESS SERVICE
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        business.createPlace(place.uid, pPlace);

        return "";
    }
}
