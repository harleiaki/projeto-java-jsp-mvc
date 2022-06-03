package br.com.impacta.jsp.controller.carrinho;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Carrinho {

  @GetMapping("/carrinho")
  public String getCarrinho(){
    return "/carrinho-de-compra/carrinho";
  }
}
