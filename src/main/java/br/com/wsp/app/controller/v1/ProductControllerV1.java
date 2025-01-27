package br.com.wsp.app.controller.v1;

import br.com.wsp.app.dto.ProductDto;
import br.com.wsp.app.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/products")
public class ProductControllerV1 {

    private final ProductService productService;

    public ProductControllerV1(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ResponseEntity<ProductDto> save(@RequestBody ProductDto productDto) {


        ProductDto productSaved = productService.save(productDto);

        return ResponseEntity.ok(productSaved);
    }
}
