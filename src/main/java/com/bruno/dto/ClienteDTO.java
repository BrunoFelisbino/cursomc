package com.bruno.dto;

import java.io.Serializable;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import com.bruno.domain.Cliente;
import com.bruno.service.validation.ClienteUpdate;

import org.hibernate.validator.constraints.Length;

@ClienteUpdate
public class ClienteDTO implements Serializable{

    
    private static final long serialVersionUID = 1L;

private Integer id;
    @NotEmpty(message="Preenchimento obrigatório")
	@Length(min=5, max=80, message="O tamanho deve ser entre 5 e 80 caracteres")
    private String nome;
    @NotEmpty(message = "Preenchimento Obrigatório")
    @Email(message = "E-mail invalido")
    private String email;

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

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public ClienteDTO() {
}


public ClienteDTO(Cliente obj) {
    id = obj.getId();
    nome = obj.getNome();
    email = obj.getEmail();
}




    
}
