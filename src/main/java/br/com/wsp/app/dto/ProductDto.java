package br.com.wsp.app.dto;

import br.com.wsp.app.entity.Product;

import java.math.BigDecimal;

public class ProductDto {

    private Long id;
    private String name;
    private String description;
    private BigDecimal value;

    public ProductDto() {
    }

    public ProductDto(Product product) {

    this.id = product.getId();
    this.name = product.getName();
    this.description = product.getDescription();
    this.value = product.getValue();

    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
