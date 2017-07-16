package mdorokhin.service;

import mdorokhin.model.Address;
import mdorokhin.repository.AddressRepository;
import mdorokhin.utils.exeption.AppException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
@Service
public class AddressServiceImpl implements AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressServiceImpl(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    @Override
    public Address save(Address address) {
        addressRepository.save(address);
        return address;
    }

    @Override
    public void remove(Integer id) throws AppException {

        addressRepository.remove(id);
    }

    @Override
    public Address getById(Integer id) throws AppException {

        return addressRepository.getById(id);
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.getAll();
    }

}
