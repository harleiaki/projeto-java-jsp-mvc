package br.com.impacta.jsp.controller.cadastro;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cadastrodespesa")
public class CadastroDespesa {

  @GetMapping
  public String getCadastroDespesa(){
    return "/cadastro/cadastro-de-despesa";
  }
}
