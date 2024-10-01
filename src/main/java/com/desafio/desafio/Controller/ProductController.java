package com.desafio.desafio.Controller;

import com.desafio.desafio.Model.dtos.Cadastry;

import com.desafio.desafio.Model.entity.Products;
import com.desafio.desafio.Service.ProductService;




import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/create")
    public ResponseEntity<Products> addProduct(@RequestBody Cadastry cadastry) {
        if (cadastry.getName() == null || cadastry.getName().isEmpty()) {
            return ResponseEntity.badRequest().body(null);
        }
        Products createdProduct = productService.createAccount(cadastry);
        return ResponseEntity.ok(createdProduct);
    }
    @GetMapping
    public ResponseEntity<List<Products>> getAllProducts() {
        List<Products> products = productService.getAllProducts();
        return ResponseEntity.ok(products); // Retorna a lista de produtos
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
        return  ResponseEntity.ok("Product is deleted successfully!");
    }


}
