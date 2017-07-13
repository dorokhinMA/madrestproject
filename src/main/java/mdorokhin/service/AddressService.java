package mdorokhin.service;

import mdorokhin.model.Address;
import mdorokhin.utils.exeption.AppException;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public interface AddressService {

    Address save(Address address) throws AppException;

    void remove(Integer id) throws AppException;

    Address getById(Integer id) throws AppException;

    List<Address> getAll();


}
