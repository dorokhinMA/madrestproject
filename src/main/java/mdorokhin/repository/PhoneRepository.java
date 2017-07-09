package mdorokhin.repository;

import mdorokhin.model.Phone;
import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public interface PhoneRepository {

    Phone save(Phone phone);

    boolean remove(Integer id);

    Phone getById(Integer id);

    Phone getByNumber(String number);

    List<Phone> getAll();
}
