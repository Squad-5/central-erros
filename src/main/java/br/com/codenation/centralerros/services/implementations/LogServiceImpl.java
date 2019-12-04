package br.com.codenation.centralerros.services.implementations;

import br.com.codenation.centralerros.entity.Log;
import br.com.codenation.centralerros.repository.LogRepository;
import br.com.codenation.centralerros.services.interfaces.LogServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

public class LogServiceImpl implements LogServiceInterface {

    private final LogRepository logRepository;

    @Autowired
    public LogServiceImpl(LogRepository logRepository) {
        this.logRepository = logRepository;
    }

    @Override
    public Log save(Log log) {
        return logRepository.save(log);
    }
}
