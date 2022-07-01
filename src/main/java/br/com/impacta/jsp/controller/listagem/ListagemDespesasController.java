package br.com.impacta.jsp.controller.listagem;

import br.com.impacta.jsp.model.Despesa;
import br.com.impacta.jsp.service.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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

  @GetMapping("/filtrar")
  public ModelAndView despesas(@RequestParam(defaultValue = "%") String descricao) {
    List<Despesa> listaDespesas = despesaService.findByDescricaoContainingIgnoreCase(descricao);
    ModelAndView mv = new ModelAndView("/cadastro/listagem-de-despesas");
    mv.addObject("despesas", listaDespesas);
    return mv;
  }
}
