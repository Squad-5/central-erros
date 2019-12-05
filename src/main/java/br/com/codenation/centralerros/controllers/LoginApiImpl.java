package br.com.codenation.centralerros.controllers;

import io.swagger.annotations.ApiParam;
import io.swagger.api.LoginApi;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginApiImpl implements LoginApi {

    @Override
    public ResponseEntity<String> loginUser(@ApiParam(value = "The user name for login" ,required=true) @RequestHeader(value="x-username", required=true) String xUsername,
                                            @ApiParam(value = "The password for login in clear text" ,required=true) @RequestHeader(value="x-password", required=true) String xPassword) {
        return null;
    }

}
