package br.com.impacta.jsp.controller.cadastro;

import br.com.impacta.jsp.model.Despesa;
import br.com.impacta.jsp.service.DespesaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("/cadastrodespesa")
public class CadastroDespesa {

  @Autowired
  private DespesaService despesaService;

  @GetMapping
  public String getCadastroDespesa(){
    return "/cadastro/cadastro-de-despesa";
  }

  @PostMapping
  public String salvar(Despesa despesa){

    log.info("Objeto de despesa antes de persistir{}", despesa );
    Despesa despesaEntity = despesaService.salvar(despesa);
    log.info("Objeto de despesa após persistir{}", despesaEntity );
    return "/cadastro/cadastro-de-despesa";
  }
}
