package br.com.impacta.jsp.controller.cadastro;

import br.com.impacta.jsp.model.Categorias;
import br.com.impacta.jsp.model.Despesa;
import br.com.impacta.jsp.service.CategoriasService;
import br.com.impacta.jsp.service.DespesaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import javax.validation.Valid;
import java.util.List;

@Slf4j
@Controller
@RequestMapping("/cadastrodespesa")
public class CadastroDespesaController {

  @Autowired
  private DespesaService despesaService;
  @Autowired
  private CategoriasService categoriasService;

  @GetMapping
  public ModelAndView getCadastroDespesa(){
    ModelAndView modelAndView =
            new ModelAndView("/cadastro/cadastro-de-despesa");
    return modelAndView.addObject(new Despesa());
  }

  @PostMapping
  public ModelAndView salvar(@Valid @ModelAttribute("despesa") Despesa despesa,
                             Errors errors){
    ModelAndView modelAndView =
            new ModelAndView("/cadastro/cadastro-de-despesa");

    if(errors.hasErrors()){
      return modelAndView;
    }

    log.info("Objeto de despesa antes de persistir{}", despesa );
    Despesa despesaEntity = despesaService.salvar(despesa);
    log.info("Objeto de despesa após persistir{}", despesaEntity );


    modelAndView.addObject("mensagem", "Despesa salva");
    return modelAndView;
  }

  @ModelAttribute("todasCategoria")
  public List<Categorias> todasCategoria(){
    return categoriasService.getListAll();
  }


  @RequestMapping(value = "{codigo}")
  public RedirectView excluir(@PathVariable Long codigo ) {
    despesaService.excluir(codigo);
    return new RedirectView("/listagem");
  }
}
