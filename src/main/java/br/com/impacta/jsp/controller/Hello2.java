package br.com.impacta.jsp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class Hello2 {

  @GetMapping("/hello2")
  public String getHello2(){
    log.info("nova pagina acessada");
    return "nome-da-pagina";
  }
}
