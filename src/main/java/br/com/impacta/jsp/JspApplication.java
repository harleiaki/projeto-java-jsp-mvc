package br.com.impacta.jsp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class JspApplication {

  public static void main(String[] args) {
    SpringApplication.run(JspApplication.class, args);
  }

}





