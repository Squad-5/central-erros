package br.com.codenation.centralerros.services.implementations;

import br.com.codenation.centralerros.entity.Log;
import br.com.codenation.centralerros.repository.LogRepository;
import br.com.codenation.centralerros.services.interfaces.LogServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


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

    @Override
    public void archive(Log log) {
    }

    @Override
    public Log delete(Integer codigo) {

        return logRepository.deleteByCodigo(codigo);

    }

    @Override
    public List<Log> retrieveLogs() {
        return logRepository.findAll();
    }

    @Override
    public Log findByCodigo(Integer codigo) {
        return logRepository.findByCodigo(codigo);
    }
}
