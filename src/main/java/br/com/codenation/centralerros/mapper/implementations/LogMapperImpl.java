package br.com.codenation.centralerros.mapper.implementations;

import br.com.codenation.centralerros.dto.LogDto;
import br.com.codenation.centralerros.entity.Log;
import br.com.codenation.centralerros.mapper.LogMapper;

import java.util.List;
import java.util.stream.Collectors;

public class LogMapperImpl implements LogMapper {

    @Override
    public LogDto logToLogDto(Log log) {
        if (log == null) return null;

        LogDto logDto = new LogDto();

        logDto.setCodigo(log.getCodigo());
        logDto.setData(log.getData());
        logDto.setDescricao(log.getDescricao());
        logDto.setLevel(log.getLevel());
        logDto.setOrigem(log.getOrigem());
        logDto.setQuantidade(log.getQuantidade());

        return logDto;
    }

    @Override
    public List<LogDto> logsToLogsDto(List<Log> logs) {
        return logs.stream().map(log -> logToLogDto(log)).collect(Collectors.toList());
    }
}
