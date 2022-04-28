package edu.miu.springdata.service.implementation;

import edu.miu.springdata.entity.unidirectional.Review;
import edu.miu.springdata.repository.ReviewRepo;
import edu.miu.springdata.service.ReviewService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class ReviewServiceImpl implements ReviewService {
    private final ReviewRepo reviewRepo;

    @Override
    public void save(Review p) {
        reviewRepo.save(p);
    }

    @Override
    public void deleteById(int id) {
        reviewRepo.deleteById(id);
    }

    @Override
    public Review getById(int id) {
        return reviewRepo.findById(id).get();
    }

    @Override
    public List<Review> getAll() {
        List<Review> result = new ArrayList<>();
        reviewRepo.findAll().forEach(result::add);
        return result;
    }
}
