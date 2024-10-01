package com.desafio.desafio.Repository;


import com.desafio.desafio.Model.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;


@Repository
public interface Producty extends JpaRepository<Products, Long> {




    Optional<Products> findById(Long id);

}
