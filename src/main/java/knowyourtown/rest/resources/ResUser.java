package knowyourtown.rest.resources;

import com.google.gson.Gson;
import knowyourtown.business.BusinessClient;
import knowyourtown.rest.models.Success;
import knowyourtown.rest.models.User;
import knowyourtown.storage.StorageClient;
import knowyourtown.business.webservice.Business;
import knowyourtown.storage.webservice.Storage;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by matteo on 15/06/17.
 */


@Path("/user")
public class ResUser {

    @POST
    @Path("new")
    @Produces({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Consumes({MediaType.TEXT_PLAIN, MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public String newUser(String json) {

        System.out.println(":: USER POST RECIEVED : /user/new/");
        System.out.println("\t JSON -> " + json);

        Gson gson = new Gson();
        User user = gson.fromJson(json, User.class);

        knowyourtown.localdb.webservice.Person person = new knowyourtown.localdb.webservice.Person();

        person.setIdPerson(user.uid);
        person.setFirstname(user.name);
        person.setLastname(user.surname);
        person.setSex(user.sex);
        person.setBirthdate(user.birthdate);
        person.setNationality(user.nationality);
        person.setBirthplace(user.birthplace);

        // CALL business service
        BusinessClient businessClient = new BusinessClient();
        Business business = businessClient.getBusiness();

        //business.createPerson(person);
        business.updatePerson(person);

        //Check if the new person operation is sucessfull
        return existUser(user.uid);
    }

    @GET
    @Path("exist/{id}")
    @Produces("application/json")
    public String existUser(@PathParam("id") Integer uid) {

        System.out.println(":: USER GET RECIEVED : /user/exist/" + uid);

        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        knowyourtown.localdb.webservice.Person person = storage.readPerson(uid);

        Gson gson = new Gson();

        if (person != null)
            return gson.toJson(new Success(true));
        else
            return gson.toJson(new Success(false));
    }

    @GET
    @Path("profile/{id}")
    @Produces("application/json")
    public String getProfile(@PathParam("id") Integer uid) {

        System.out.println(":: USER GET RECIEVED : /user/profile/" + uid);

        StorageClient storageClient = new StorageClient();
        Storage storage = storageClient.getStorage();

        knowyourtown.localdb.webservice.Person person = storage.readPerson(uid);

        User user = new User(person.getIdPerson(),
                person.getFirstname(),
                person.getLastname(),
                person.getSex(),
                person.getBirthdate(),
                person.getNationality(),
                person.getBirthplace());



        Gson gson = new Gson();
        String res = gson.toJson(user, User.class);

        return res;
    }

}