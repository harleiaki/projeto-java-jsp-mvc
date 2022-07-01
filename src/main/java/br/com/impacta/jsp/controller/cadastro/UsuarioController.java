package br.com.impacta.jsp.controller.cadastro;


import br.com.impacta.jsp.model.Usuarios;
import br.com.impacta.jsp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ModelAndView getCadastro() {
        return new ModelAndView("/cadastro/cadastro-usuario");
    }

    @PostMapping(consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
    public RedirectView salvarUsuario(Usuarios usuarios) {

        String senhaUsuario = usuarios.getSenha();
        String senhaCriptografada = new BCryptPasswordEncoder().encode(senhaUsuario);
        usuarios.setSenha(senhaCriptografada);
        usuarioService.salvar(usuarios);

        return new RedirectView("/listagem");
    }
}
