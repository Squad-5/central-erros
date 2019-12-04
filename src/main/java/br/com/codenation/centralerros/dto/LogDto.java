package br.com.codenation.centralerros.dto;

import br.com.codenation.centralerros.enums.LevelEnum;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LogDto {

    private Integer codigo;
    private LevelEnum level;
    private String descricao;
    private Integer quantidade;
    private String origem;
    private String data;

}
