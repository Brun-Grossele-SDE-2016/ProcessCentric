package knowyourtown.rest.resources;

import com.google.gson.Gson;
import knowyourtown.business.BusinessClient;
import knowyourtown.rest.models.Suggestion;
import knowyourtown.rest.models.Success;
import knowyourtown.business.webservice.Business;

import knowyourtown.storage.StorageClient;
import knowyourtown.storage.webservice.Storage;

import knowyourtown.localdb.webservice.PlaceType;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by matteo on 10/05/17.
 */

@Path("/suggestion")
public class ResSuggestion {

    @GET
    @Produces("application/json")
    public String show() {
        System.out.println(":: GOAL GET RECIEVED : /suggestion");
        return "Welcome to suggestion!";
    }

    @GET
    @Path("delete/{uid}/{title}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String deleteSuggestion(@PathParam("uid") Integer uid, @PathParam("title") String title) {

        System.out.println(":: GOAL GET RECIEVED : /suggestion/delete/" + uid + "/" + title);

        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        Gson gson = new Gson();
        if (business.deleteSuggestionByTitle(uid, title.replace("_", " ")) == 0)
            return gson.toJson(new Success(true));
        else
            return gson.toJson(new Success(false));
    }

    @POST
    @Path("new/{uid}/{oldTitle}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newSuggestion(@PathParam("uid") Integer uid, @PathParam("oldTitle") String oldTitle, String evaluation) {

        System.out.println(":: GOAL POST RECIEVED : /suggestion/new/" + uid + "/" + oldTitle);

        //CALL BUSINESS SERVICE
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        Gson gson = new Gson();
        knowyourtown.localdb.webservice.Suggestion newSuggestion = storage.getSuggestionByTitle(uid,oldTitle);

        newSuggestion.setEvaluation(evaluation);


        if (business.updateSuggestion(uid, newSuggestion, oldTitle) == 0)
            return gson.toJson(new Success(true));
        else
            return gson.toJson(new Success(false));
    }

    @POST
    @Path("newSugg/{uid}")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newSuggestionAuto(@PathParam("uid") Integer uid, String title) {

        System.out.println(":: SUGGESTION NEW AUTO POST RECIEVED : /suggestion/newSugg/" + uid );

         Gson gson = new Gson();
        //CALL BUSINESS SERVICE
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        if (business.createSuggestion(uid,  title) == 0)
            return gson.toJson(new Success(false));
        else
            return gson.toJson(new Success(true));
    }


    @GET
    @Path("show/{id}")
    @Produces("application/json")
    public String showSuggestions(@PathParam("id") Integer uid) {

        System.out.println(":: SUGGESTION GET RECIEVED : /suggestion/show/" + uid);

        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        boolean isEmpty = false;
        List<knowyourtown.localdb.webservice.Suggestion> suggestions = null;
        try {
            suggestions = business.getSuggestions(uid);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            isEmpty = true;
        }

        Gson gson = new Gson();

        if (isEmpty == false) {
            return gson.toJson(suggestions, suggestions.getClass());
        } else {
            return gson.toJson(new ArrayList<knowyourtown.localdb.webservice.Suggestion>());
        }
    }
}
