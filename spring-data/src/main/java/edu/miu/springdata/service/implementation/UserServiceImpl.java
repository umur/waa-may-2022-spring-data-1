package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.unidirectional.User;
import edu.miu.springdata.repository.UserRepo;
import edu.miu.springdata.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    @Override
    public void save(User u) {
        userRepo.save(u);
    }

    @Override
    public void deleteById(int id) {
        userRepo.deleteById(id);
    }

    @Override
    public User getById(int id) {
        return userRepo.findById(id).get();
    }

    @Override
    public List<User> getAll() {
        List<User> result = new ArrayList<>();
        userRepo.findAll().forEach(result::add);
        return result;
    }
}
