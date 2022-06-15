package br.com.impacta.jsp.controller.listagem;

import br.com.impacta.jsp.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/listagem")
public class ListagemDespesasController {

  @Autowired
  private DespesaService despesaService;


  @GetMapping
  public ModelAndView listagemDespesas(){
    ModelAndView modelAndView = new ModelAndView("/cadastro/listagem-de-despesas");
    modelAndView.addObject("despesas", despesaService.getListAll());
    return modelAndView;
  }
}
