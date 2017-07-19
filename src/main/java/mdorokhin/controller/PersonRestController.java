package mdorokhin.controller;

import mdorokhin.model.Person;
import mdorokhin.service.AddressService;
import mdorokhin.service.PersonService;
import mdorokhin.service.PhoneService;
import mdorokhin.utils.exeption.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Path("/person")
@Controller
public class PersonRestController {

    private final AddressService addressService;

    private final PhoneService phoneService;

    private final PersonService personService;

    @Autowired
    public PersonRestController(AddressService addressService, PhoneService phoneService, PersonService personService) {
        this.addressService = addressService;
        this.phoneService = phoneService;
        this.personService = personService;
    }


    @GET
    @Path("/{id}")
    @Produces("application/json")
    public Person get(@PathParam("id") Integer id) throws AppException {

        return personService.getById(id);
    }


    @GET
    @Path("fio/{fio}")
    @Produces("application/json")
    public Person getByFio(@PathParam("fio") String fio) throws AppException {

        Person byFio = personService.getByFio(fio);
        return byFio;
    }

    @GET
    @Path("phone/{phone}")
    @Produces("application/json")
    public Person getByPhone(@PathParam("phone") String phone) throws AppException {

        return personService.getByPhone(phoneService.getByNumber(phone).getId());
    }


    @GET
    @Path("/all")
    @Produces("application/json")
    public List<Person> getAll(){

        return personService.getAll();
    }

    @POST
    @Path("/add")
    @Produces("application/json")
    @Consumes("application/json")
    public Person create(Person person) throws AppException {

        return personService.save(person);
    }

    @PUT
    @Path("/update")
    @Produces("application/json")
    @Consumes("application/json")
    public Person update(Person person) throws AppException {

        return personService.update(person);

    }

    @DELETE
    @Path("/{id}")
    public Response delete(@PathParam("id") Integer id) throws AppException {

        personService.remove(id);
        return Response.status(200).build();
    }

    public AddressService getAddressService() {
        return addressService;
    }

    public PhoneService getPhoneService() {
        return phoneService;
    }

    public PersonService getPersonService() {
        return personService;
    }


}
