package br.com.codenation.centralerros.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = Usuario.TABLE_NAME)
@Getter
@Setter
public class Usuario {

    public static final String TABLE_NAME = "usuario";

    @Id
    @GeneratedValue
    private Integer id;

    @NotNull
    @NotBlank
    private String usuario;

    @NotNull
    @NotBlank
    private String senha;

    public Usuario(String usuario, String senha) {
    }

}
