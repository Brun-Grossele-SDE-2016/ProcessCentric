package knowyourtown.rest.resources;

import com.google.gson.Gson;
import knowyourtown.business.BusinessClient;
import knowyourtown.rest.models.Suggestion;
import knowyourtown.rest.models.Success;
import knowyourtown.business.webservice.Business;

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
    public String newSuggestion(@PathParam("uid") Integer uid, @PathParam("oldTitle") String oldTitle, String suggestionjson) {

        System.out.println(":: GOAL POST RECIEVED : /suggestion/new/" + uid + "/" + oldTitle);
        System.out.println("\t JSON -> " + suggestionjson);

        //CALL BUSINESS SERVICE
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        Gson gson = new Gson();
        Suggestion newSuggestion = gson.fromJson(suggestionjson, Suggestion.class);

        knowyourtown.localdb.webservice.Suggestion wsSuggestion = new knowyourtown.localdb.webservice.Suggestion();
        wsSuggestion.setTitle(newSuggestion.title);

        wsSuggestion.setDescription(newSuggestion.description);

        // ** *** * * ** **  parse condition
        /*String condition[] = newSuggestion.condition.split(" ");
        String cType = condition[0].toLowerCase();
        String cIncrease = condition[1];
        Float cValue = Float.valueOf(condition[2]);*/

        /*PlaceType placeType = new PlaceType();
        //placeType.setType(cType);
        //wsSuggestion.setPlaceType(placeType);

        wsSuggestion.setValue(cValue);

        SuggestionType suggestionType = new SuggestionType();
        suggestionType.setType(cIncrease);
        wsSuggestion.setSuggestionType(suggestionType);

*/
        if (business.updateSuggestion(uid, wsSuggestion, oldTitle) == 0)
            return gson.toJson(new Success(true));
        else
            return gson.toJson(new Success(false));
    }

/*
    @GET
    @Path("show/{id}")
    @Produces("application/json")
    public String showSuggestions(@PathParam("id") Integer uid) {

        System.out.println(":: GOAL GET RECIEVED : /suggestion/show/" + uid);

        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        boolean isEmpty = false;
        List<SuggestionBusiness> suggestions = null;
        try {
            suggestions = business.getSuggestions(uid);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            isEmpty = true;
        }

        Gson gson = new Gson();

        if (isEmpty == false) {
            Iterator it;
            it = suggestions.iterator();

            List<Suggestion> suggestionsRest = new ArrayList<Suggestion>();
            while (it.hasNext()) {
                SuggestionBusiness suggestionBusiness = (SuggestionBusiness) it.next();
                business.webservice.Suggestion suggestion = suggestionBusiness.getSuggestion();

                String condition = "";
                if (suggestion.getSuggestionType().getType().equals("increase"))
                    condition = suggestion.getPlaceType().getType()
                            + " > "
                            + suggestion.getValue();
                else
                    condition = suggestion.getPlaceType().getType()
                            + " < "
                            + suggestion.getValue();


                suggestionsRest.add(new Suggestion(suggestion.getTitle(), suggestion.getDescription(), suggestionBusiness.isDone(), condition));
            }
            return gson.toJson(suggestionsRest, suggestionsRest.getClass());
        } else {
            return gson.toJson(new ArrayList<Suggestion>());
        }
    }*/
}
