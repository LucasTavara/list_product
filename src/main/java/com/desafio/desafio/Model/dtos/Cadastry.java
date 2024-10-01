package com.desafio.desafio.Model.dtos;

import com.desafio.desafio.Model.entity.Products;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.validation.annotation.Validated;


import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cadastry implements Serializable {
private Long id;


@NotNull
private String name;
@NotNull
private String description;
@NotNull
private double value;
@NotNull
private boolean avaliable;

    public Cadastry(int id, String name, String description, double value ) {
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }
}
