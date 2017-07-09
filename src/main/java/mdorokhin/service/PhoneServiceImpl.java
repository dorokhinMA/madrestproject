package mdorokhin.service;

import mdorokhin.model.Phone;
import mdorokhin.repository.PhoneRepository;
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
    public void remove(Integer id) {
        phoneRepository.remove(id);
    }

    @Override
    public Phone getById(Integer id) {
        return phoneRepository.getById(id);
    }

    @Override
    public Phone getByNumber(String number) {
        return phoneRepository.getByNumber(number);
    }


    @Override
    public List<Phone> getAll() {
        return phoneRepository.getAll();
    }
}
