package br.com.codenation.centralerros.controllers;

import br.com.codenation.centralerros.entity.Usuario;
import br.com.codenation.centralerros.services.interfaces.UsuarioServiceInterface;
import io.swagger.annotations.ApiParam;
import io.swagger.api.CadastroApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroApiImpl implements CadastroApi {

    private UsuarioServiceInterface usuarioServiceInterface;

    @Override
    public ResponseEntity<Void> addUser(@ApiParam(value = "Usuário a ser adicionado" ,required=true) @RequestHeader(value="x-usuário", required=true) String xUsurio,
                                        @ApiParam(value = "Senha desejada pelo usuário" ,required=true) @RequestHeader(value="x-senha", required=true) String xSenha) {

        usuarioServiceInterface.save(new Usuario(xUsurio, xSenha));

        return null;
    }

}
