package mdorokhin.service;

import mdorokhin.model.Phone;
import mdorokhin.repository.PhoneRepository;
import mdorokhin.utils.exeption.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

        if (!phoneRepository.remove(id)) {

            throw new AppException("Can't remove phone with ID == " + id);
        }
    }

    @Override
    public Phone getById(Integer id) throws AppException {

        Phone phone = phoneRepository.getById(id);

        if (phone == null) {

            throw new AppException("Phone with ID == " + id + " not found");
        }
        return phone;
    }

    @Override
    public Phone getByNumber(String number) throws AppException {

        Phone phone = phoneRepository.getByNumber(number);

        if (phone == null) {

            throw new AppException("Phone with ID == " + number + " not found");
        }

        return phone;
    }


    @Override
    public List<Phone> getAll() {
        return phoneRepository.getAll();
    }
}
