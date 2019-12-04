package br.com.codenation.centralerros.services.interfaces;

import br.com.codenation.centralerros.entity.Usuario;

public interface UsuarioServiceInterface{

    public Usuario save(Usuario u);

    public Usuario findByUsuario(String usuario);

}
