package br.com.impacta.jsp.config.security;

import br.com.impacta.jsp.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        // somente para liberar o acesso ao H2-CONSOLE
        http
                .csrf().disable()
                .headers().frameOptions().sameOrigin()
                .and()
                .authorizeRequests()
                .antMatchers("/h2-console/**")
                .permitAll();
        //  configuração de segurança da aplicação
        http
                .authorizeRequests()
                .antMatchers("/images/**", "/css/**", "/js/**")
                .permitAll()
                .antMatchers("/usuario", "/").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin();
    }

    @Autowired
    public void Login(AuthenticationManagerBuilder authenticationManagerBuilder, UsuarioService usuarioService) throws Exception {
        authenticationManagerBuilder.userDetailsService(
                        email -> new UsuarioCustomDTO(usuarioService.getEmail(email)))
                .passwordEncoder(passwordEncoder());
    }

    @Bean
    public static BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
