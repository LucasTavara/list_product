package com.desafio.desafio.Model.entity;

import com.desafio.desafio.Model.dtos.Cadastry;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


import java.util.Comparator;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@Data
@Table(name = "Products")

public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false,nullable = false)
    private Long id;


    @Column(name = "nome", nullable = false)
    private String name;

    @Column(name = "description", length = 500)
    private String description;

    @Column(name = "value")
    private double value;
    @Column(name = "avaliable")
    private boolean available;


    public Products(int id, String name, String description, double value) {
    }

    public static void sort(Comparator<Cadastry> comparing) {
    }
}
