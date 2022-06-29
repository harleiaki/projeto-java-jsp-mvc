package br.com.impacta.jsp.service;

import br.com.impacta.jsp.model.Usuarios;
import br.com.impacta.jsp.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuarios salvar(Usuarios usuarios) {
        return usuarioRepository.save(usuarios);
    }

    public Usuarios getEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }
}
