package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.unidirectional.Address;
import edu.miu.springdata.repository.AddressRepo;
import edu.miu.springdata.service.AddressService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    @Override
    public void save(Address p) {
        addressRepo.save(p);
    }

    @Override
    public void deleteById(int id) {
        addressRepo.deleteById(id);
    }

    @Override
    public Address getById(int id) {
        return addressRepo.findById(id).get();
    }

    @Override
    public List<Address> getAll() {
        var result  = new ArrayList<Address>();
        addressRepo.findAll().forEach(result::add);
        return result;
    }
}
