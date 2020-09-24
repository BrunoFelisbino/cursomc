package com.bruno.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.bruno.domain.Categoria;

import org.springframework.validation.annotation.Validated;



@Validated
public class CategoriaDTO implements Serializable{

    
    private static final long serialVersionUID = 1L;

    private Integer id;

    @NotNull(message = "Preenchimento obrigatório" )
    @Size(min = 1, max = 60, message = "First name cannot be longer than 60 characters")   
    private String nome;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaDTO() {
    }
    public CategoriaDTO (Categoria obj) {
        id = obj.getId();
        nome = obj.getNome();
    }
    
}
