package br.com.impacta.jsp.controller.cadastro;


import br.com.impacta.jsp.model.Usuarios;
import br.com.impacta.jsp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ModelAndView getCadastro() {
        ModelAndView modelAndView = new ModelAndView("/cadastro/cadastro-usuario");
        modelAndView.addObject("usuario", new Usuarios());
        return modelAndView;
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView salvarUsuario(@Valid @ModelAttribute("usuario") Usuarios usuarios, Errors errors) {
        if (errors.hasErrors()) {
            return new ModelAndView("/cadastro/cadastro-usuario");
        }

        String senhaUsuario = usuarios.getSenha();
        String senhaCriptografada = new BCryptPasswordEncoder().encode(senhaUsuario);
        usuarios.setSenha(senhaCriptografada);
        usuarioService.salvar(usuarios);

        return new ModelAndView("redirect/listagem");
    }
}