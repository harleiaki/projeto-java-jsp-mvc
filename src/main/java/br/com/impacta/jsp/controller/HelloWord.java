package br.com.impacta.jsp.controller;

import br.com.impacta.jsp.model.Usuarios;
import br.com.impacta.jsp.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/hello")
@RequiredArgsConstructor
public class HelloWord {

  private final UsuarioService usuarioService;

  @GetMapping
  public String getHello() {
    log.info("acessou metodo get url hello");
    return "HelloWord";
  }

  @PostMapping
  public Usuarios postUsuario(@RequestBody Usuarios usuarios) {
    log.info("acessou metodo post url hello");
    return usuarioService.salvar(usuarios);
  }

}
