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

        if (!addressRepository.remove(id)){
            throw new AppException("Can't remove address with ID == " + id);
        }
    }

    @Override
    public Address getById(Integer id) throws AppException {

        Address address = addressRepository.getById(id);

        if (address == null){
            throw new AppException("Address with ID == " + id + " not found");
        }

        return address ;
    }

    @Override
    public List<Address> getAll() {
        return addressRepository.getAll();
    }

}
