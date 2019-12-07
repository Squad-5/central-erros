package br.com.codenation.centralerros.entity;

import br.com.codenation.centralerros.enums.AmbienteEnum;
import br.com.codenation.centralerros.enums.LevelEnum;
import io.swagger.model.LogResponseModel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = Log.TABLE_NAME)
@Getter
@Setter
public class Log {

    public static final String TABLE_NAME = "logs";

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @NotNull
    @NotBlank
    private LevelEnum level;

    private String descricao;

    @NotBlank
    private Integer quantidade;

    @DateTimeFormat
    @CreatedDate
    @NotNull
    private String data;

    @NotNull
    @NotBlank
    private String origem;

    private String coletor;

    private String detalhes;

    @NotBlank
    @NotNull
    private AmbienteEnum ambiente;

}
