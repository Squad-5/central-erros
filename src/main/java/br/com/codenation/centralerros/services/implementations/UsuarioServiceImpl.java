package br.com.codenation.centralerros.services.implementations;

import br.com.codenation.centralerros.entity.Usuario;
import br.com.codenation.centralerros.repository.UsuarioRepository;
import br.com.codenation.centralerros.services.interfaces.UsuarioServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioServiceInterface {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario save(Usuario u) {
        return usuarioRepository.save(u);
    }

    @Override
    public Usuario findByUsuario(String usuario) {
        return usuarioRepository.findByUsuario(usuario);
    }
}
