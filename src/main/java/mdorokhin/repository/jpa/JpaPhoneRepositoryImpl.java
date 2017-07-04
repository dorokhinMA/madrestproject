package mdorokhin.repository.jpa;

import mdorokhin.model.Phone;
import mdorokhin.repository.PhoneRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */

@Repository
@Transactional(readOnly = true)
public class JpaPhoneRepositoryImpl implements PhoneRepository {


    @Override
    public Phone save(Phone phone) {
        return null;
    }

    @Override
    public boolean remove(Integer id) {
        return false;
    }

    @Override
    public Phone getById(Integer id) {
        return null;
    }

    @Override
    public List<Phone> getAll() {
        return null;
    }
}
