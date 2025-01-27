package br.com.wsp.app.service;

import br.com.wsp.app.dto.ProductDto;
import br.com.wsp.app.entity.Product;
import br.com.wsp.app.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public ProductDto save(ProductDto productDto){


        Product product = new Product();
        product.setName(productDto.getName());
        product.setDescription(productDto.getDescription());
        product.setValue(productDto .getValue());


        Product save = repository.save(product);

        return new ProductDto(save);
    }

}
