package br.com.impacta.jsp.controller.cadastro;

import br.com.impacta.jsp.model.Despesa;
import br.com.impacta.jsp.service.DespesaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Slf4j
@Controller
@RequestMapping("/cadastrodespesa")
public class CadastroDespesaController {

  @Autowired
  private DespesaService despesaService;

  @GetMapping
  public String getCadastroDespesa(){
    return "/cadastro/cadastro-de-despesa";
  }

  @PostMapping
  public ModelAndView salvar(@Valid Despesa despesa){
    log.info("Objeto de despesa antes de persistir{}", despesa );
    Despesa despesaEntity = despesaService.salvar(despesa);
    log.info("Objeto de despesa após persistir{}", despesaEntity );
    ModelAndView modelAndView = new ModelAndView("/cadastro/cadastro-de-despesa");
    modelAndView.addObject("mensagem", "Despesa salva");
    return modelAndView;
  }
}
