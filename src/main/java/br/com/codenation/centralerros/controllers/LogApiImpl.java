package br.com.codenation.centralerros.controllers;

import br.com.codenation.centralerros.dto.LogDto;
import br.com.codenation.centralerros.entity.Log;
import br.com.codenation.centralerros.services.interfaces.LogServiceInterface;
import io.swagger.annotations.ApiParam;
import io.swagger.api.LogApi;
import io.swagger.model.ArrayOfLogsDto;
import io.swagger.model.LogResponseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.threeten.bp.OffsetDateTime;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
public class LogApiImpl implements LogApi {

    private final LogServiceInterface logServiceInterface;

    @Autowired
    public LogApiImpl(LogServiceInterface logServiceInterface) {
        this.logServiceInterface = logServiceInterface;
    }

    @Override
    public ResponseEntity<Void> archiveLog(@ApiParam(value = "Token de autenticacao do cliente" ,required=true) @RequestHeader(value="x-token", required=true) String xToken,
                                           @NotNull @ApiParam(value = "Codigo do log a ser arquivado", required = true) @Valid @RequestParam(value = "codigo", required = true) Integer codigo) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteLog(@ApiParam(value = "Token de autenticacao do cliente" ,required=true) @RequestHeader(value="x-token", required=true) String xToken,
                                          @NotNull @ApiParam(value = "Codigo do log a ser arquivado", required = true) @Valid @RequestParam(value = "codigo", required = true) Integer codigo) {
        logServiceInterface.delete(codigo);
        return ResponseEntity.noContent().build();
    }

    @Override
    public ResponseEntity<LogResponseModel> retrieveDetailedLogs(@ApiParam(value = "Token recebido no login" ,required=true) @RequestHeader(value="x-token", required=true) String xToken,
                                                                 @NotNull @ApiParam(value = "Codigo do log", required = true) @Valid @RequestParam(value = "codigo", required = true) Integer codigo) {

        LogResponseModel response = new LogResponseModel();

        Log log = logServiceInterface.findByCodigo(codigo);

        response.setCodigo(log.getCodigo());
        response.setColetor(log.getColetor());
        response.setData(OffsetDateTime.parse(log.getData()));
        response.setDescricao(log.getDescricao());
        response.setDetalhes(log.getDetalhes());
        response.setLevel(LogResponseModel.LevelEnum.valueOf(log.getLevel().toString()));
        response.setOrigem(log.getOrigem());
        response.setQuantidade(log.getQuantidade());

        return ResponseEntity.ok(response);
    }

    @Override
    public ResponseEntity<ArrayOfLogsDto> retrieveLogs(@ApiParam(value = "Token recebido no login" ,required=true) @RequestHeader(value="x-token", required=true) String xToken) {

        return null;
    }

}
