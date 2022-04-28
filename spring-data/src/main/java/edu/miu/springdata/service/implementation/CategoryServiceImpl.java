package edu.miu.springdata.service.implementation;

import edu.miu.springdata.DTO.CategoryDto;
import edu.miu.springdata.entity.unidirectional.Category;
import edu.miu.springdata.repository.CategoryRepo;
import edu.miu.springdata.service.CategoryService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepo categoryRepo;
    private final ModelMapper modelMapper;
    @Override
    public void save(CategoryDto p) {
        Category c = modelMapper.map(p, Category.class);
        categoryRepo.save(c);
    }

    @Override
    public void deleteById(int id) {
        categoryRepo.deleteById(id);
    }

    @Override
    public CategoryDto getById(int id)
    {
        return modelMapper.map(categoryRepo.findById(id).get(), CategoryDto.class);
    }

    @Override
    public List<CategoryDto> getAll() {
        List<CategoryDto> result = new ArrayList<>();
        categoryRepo.findAll().forEach(
                c -> result.add(modelMapper.map(c, CategoryDto.class))
        );
        return result;
    }
}
