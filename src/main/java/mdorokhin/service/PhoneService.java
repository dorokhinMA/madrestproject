package mdorokhin.service;

import mdorokhin.model.Phone;
import mdorokhin.utils.exeption.AppException;

import java.util.List;

/**
 * @author Maxim Dorokhin
 *         03.07.2017
 */
public interface PhoneService {

    Phone save(Phone phone) throws AppException;

    void remove(Integer id) throws AppException;

    Phone getById(Integer id) throws AppException;

    Phone getByNumber(String number) throws AppException;

    List<Phone> getAll();


}
