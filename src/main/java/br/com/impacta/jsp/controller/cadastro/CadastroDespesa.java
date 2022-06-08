package br.com.impacta.jsp.controller.cadastro;

import br.com.impacta.jsp.model.Despesa;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/cadastrodespesa")
public class CadastroDespesa {

  @GetMapping
  public String getCadastroDespesa(){
    return "/cadastro/cadastro-de-despesa";
  }

  @PostMapping
  public String salvar(Despesa despesa){
    // gravar no banco
    log.info("Objeto de despesa {}", despesa );
    return "/cadastro/cadastro-de-despesa";
  }
}
