package com.desafio.desafio.Service;



import com.desafio.desafio.Mapper.ProductMapper;
import com.desafio.desafio.Model.dtos.Cadastry;
import com.desafio.desafio.Model.entity.Products;
import com.desafio.desafio.Repository.Producty;
import lombok.RequiredArgsConstructor;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class ProductService {

    private Cadastry cadastry;

    @Autowired
    private Producty producty;

    public ProductService(Cadastry cadastry, Producty producty) {
        this.cadastry = cadastry;
        this.producty = producty;
    }

    public Products createAccount(Cadastry cadastry) {
        Products product = new Products();
        product.setName(cadastry.getName());
        product.setDescription(cadastry.getDescription());
        product.setValue(cadastry.getValue());
        return producty.save(product);
    }

    //Lista

    public List<Products> getAllProducts() {
        return producty.findAll(); // Retorna a lista de todos os produtos
    }
    //Delete
    public void deleteProduct(Long id) {
        Products  products = producty
                .findById(id).orElseThrow(()-> new RuntimeException("Account does exists"));

        producty.deleteById(id);
    }
}
