package mdorokhin.repository;

import mdorokhin.model.Address;

import java.util.List;


/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public interface AddressRepository {

    Address save(Address address);

    boolean remove(Integer id);

    Address getById(Integer id);

    List<Address> getAll();

}
