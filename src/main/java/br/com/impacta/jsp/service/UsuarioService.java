package br.com.impacta.jsp.service;

import br.com.impacta.jsp.model.Despesa;
import br.com.impacta.jsp.model.Usuarios;
import br.com.impacta.jsp.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sun.security.krb5.internal.crypto.Des;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UsuarioService {

  private final UsuarioRepository usuarioRepository;

  public Usuarios salvar (Usuarios usuarios){
    return usuarioRepository.save(usuarios);
  }


}
