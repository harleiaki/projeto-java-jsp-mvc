package br.com.impacta.jsp.controller.cadastro;


import br.com.impacta.jsp.model.Usuarios;
import br.com.impacta.jsp.service.UsuarioService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ModelAndView getCadastro() {
        return new ModelAndView("/cadastro/cadastro-usuario");
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public ModelAndView salvarUsuario(Usuarios user) {
        ModelAndView modelAndView = new ModelAndView("/login");


        user.setSenha(new BCryptPasswordEncoder().encode(user.getSenha()));
        usuarioService.salvar(user);
        modelAndView.addObject("message", "Usuario Salvo com sucesso");

        return modelAndView;
    }
}
