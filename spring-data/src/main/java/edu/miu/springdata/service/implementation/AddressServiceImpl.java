package edu.miu.springdata.service.implementation;

import edu.miu.springdata.DTO.AddressDto;
import edu.miu.springdata.entity.unidirectional.Address;
import edu.miu.springdata.repository.AddressRepo;
import edu.miu.springdata.service.AddressService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@Transactional
public class AddressServiceImpl implements AddressService {

    private final AddressRepo addressRepo;
    private final ModelMapper modelMapper;
    @Override
    public void save(AddressDto u) {
        Address address = modelMapper.map(u, Address.class);
        addressRepo.save(address);
    }

    @Override
    public void deleteById(int id) {
        addressRepo.deleteById(id);
    }

    @Override
    public AddressDto getById(int id) {
        return modelMapper.map(addressRepo.findById(id).get(), AddressDto.class);
    }

    @Override
    public List<AddressDto> getAll() {
        var result  = new ArrayList<AddressDto>();
        addressRepo.findAll().forEach(a -> result.add(modelMapper.map(a, AddressDto.class)));
        return result;
    }
}
