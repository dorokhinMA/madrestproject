package mdorokhin.service;

import mdorokhin.model.Address;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public interface AddressService {

    Address save(Address address);

    boolean remove(Integer id);

    Address getById(Integer id);

    List<Address> getAll();


}
