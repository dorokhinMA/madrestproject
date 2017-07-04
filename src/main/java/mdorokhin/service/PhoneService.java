package mdorokhin.service;

import mdorokhin.model.Phone;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public interface PhoneService {

    Phone save(Phone phone);

    boolean remove(Integer id);

    Phone getById(Integer id);

    List<Phone> getAll();


}
