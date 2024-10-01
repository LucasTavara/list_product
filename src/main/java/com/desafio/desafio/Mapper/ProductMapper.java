package com.desafio.desafio.Mapper;

import com.desafio.desafio.Model.dtos.Cadastry;
import com.desafio.desafio.Model.entity.Products;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {


    public static Products mapToProduct(Cadastry cadastry){
        Products product = new Products(
                Math.toIntExact(cadastry.getId()),
                cadastry.getName(),
                cadastry.getDescription(),
                cadastry.getValue());
        return product;
    }
    public static Cadastry mapToProductDto(Products products){

        Cadastry cadastry = new Cadastry(
                Math.toIntExact(products.getId()),
                products.getName(),
                products.getDescription(),
                products.getValue()
        );

        return cadastry;
    }


}
