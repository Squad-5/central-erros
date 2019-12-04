package br.com.codenation.centralerros.mapper;

import br.com.codenation.centralerros.dto.LogDto;
import br.com.codenation.centralerros.entity.Log;
import org.mapstruct.Mapper;

@Mapper
public interface LogMapper {
    LogDto logToLogDto(Log log);
}
