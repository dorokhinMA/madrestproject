package mdorokhin.controller;

import mdorokhin.model.Person;
import mdorokhin.service.AddressService;
import mdorokhin.service.PersonService;
import mdorokhin.service.PhoneService;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Path("/person")
public class PersonRestController {

    private AddressService addressService;
    private PhoneService phoneService;
    private PersonService personService;



    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Person get(@PathParam("id") Integer id){

        return null;
    }

    @GET
    @Path("/{fio}")
    @Produces("application/json")
    public Person getByFio(@PathParam("fio") String fio){

        return null;
    }

    @GET
    @Path("/{phone}")
    @Produces("application/json")
    public Person getByPhone(@PathParam("phone") String phone){

        return null;
    }


    @GET
    @Path("/")
    @Produces("application/json")
    public List<Person> getAll(){

        return null;
    }

    @POST
    @Path("/add")
    @Produces("application/json")
    @Consumes("application/json")
    public Person create(Person person){

        return null;
    }

    @PUT
    @Path("/update")
    @Produces("application/json")
    @Consumes("application/json")
    public Person update(Person person){

        return null;

    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Integer id){

        return Response.status(200).build();
    }




}
