package mdorokhin.service;

import mdorokhin.model.Person;
import mdorokhin.model.Phone;
import mdorokhin.repository.PhoneRepository;
import mdorokhin.utils.exeption.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.ws.rs.core.Response;
import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
@Service
public class PhoneServiceImpl implements PhoneService {


    private final PhoneRepository phoneRepository;

    @Autowired
    public PhoneServiceImpl(PhoneRepository phoneRepository) {
        this.phoneRepository = phoneRepository;
    }

    @Override
    public Phone save(Phone phone) {
        phoneRepository.save(phone);
        return phone;
    }

    @Override
    public void remove(Integer id) throws AppException {

        phoneRepository.remove(id);
    }

    @Override
    public Phone getById(Integer id) throws AppException {

        return phoneRepository.getById(id);
    }

    @Override
    public Phone getByNumber(String number) throws AppException {

        Phone phone = phoneRepository.getByNumber(number);

        if (phone == null) {

            throw new AppException(Response.Status.NOT_FOUND.getStatusCode(), //404
                    404,
                    "The person you requested with phone " + number + " was not found in the database");
        }

        return phone;
    }


    @Override
    public List<Phone> getAll() {
        return phoneRepository.getAll();
    }
}
