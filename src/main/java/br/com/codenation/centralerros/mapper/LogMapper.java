package br.com.codenation.centralerros.mapper;

import br.com.codenation.centralerros.dto.LogDto;
import br.com.codenation.centralerros.entity.Log;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface LogMapper {
    LogDto logToLogDto(Log log);

    List<LogDto> logsToLogsDto(List<Log> logs);
}
