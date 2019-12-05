package br.com.codenation.centralerros.controllers;

import io.swagger.annotations.ApiParam;
import io.swagger.api.LogApi;
import io.swagger.model.DetailedLogsModel;
import io.swagger.model.LogsModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
public class LogApiImpl implements LogApi {

    @Override
    public ResponseEntity<Void> archiveLog(@ApiParam(value = "Token de autenticacao do cliente" ,required=true) @RequestHeader(value="x-token", required=true) String xToken,
                                           @NotNull @ApiParam(value = "Codigo do log a ser arquivado", required = true) @Valid @RequestParam(value = "codigo", required = true) Integer codigo) {
        return null;
    }

    @Override
    public ResponseEntity<Void> deleteLog(@ApiParam(value = "Token de autenticacao do cliente" ,required=true) @RequestHeader(value="x-token", required=true) String xToken,
                                          @NotNull @ApiParam(value = "Codigo do log a ser arquivado", required = true) @Valid @RequestParam(value = "codigo", required = true) Integer codigo) {
        return null;
    }

    @Override
    public ResponseEntity<DetailedLogsModel> retrieveDetailedLogs(@ApiParam(value = "Token recebido no login" ,required=true) @RequestHeader(value="x-token", required=true) String xToken,
                                                                  @NotNull @ApiParam(value = "Codigo do log", required = true) @Valid @RequestParam(value = "codigo", required = true) Integer codigo) {
        return null;
    }

    @Override
    public ResponseEntity<LogsModel> retrieveLogs(@ApiParam(value = "Token recebido no login" ,required=true) @RequestHeader(value="x-token", required=true) String xToken) {
        return null;
    }

}
