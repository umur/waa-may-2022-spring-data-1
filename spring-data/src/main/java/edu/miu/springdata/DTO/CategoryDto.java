package edu.miu.springdata.DTO;

import edu.miu.springdata.entity.unidirectional.Product;
import lombok.Data;

import java.util.List;

@Data
public class CategoryDto {
    private int id;
    private String name;
    private List<Product> products;
}
