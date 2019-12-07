package br.com.codenation.centralerros.services.interfaces;

import br.com.codenation.centralerros.entity.Log;
import io.swagger.models.auth.In;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface LogServiceInterface {

    public Log save(Log log);

    public void archive(Log log);

    public Log delete(Integer codigo);

    public List<Log> retrieveLogs();

    public Log findByCodigo(Integer codigo);
}
