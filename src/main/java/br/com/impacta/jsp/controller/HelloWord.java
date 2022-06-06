package br.com.impacta.jsp.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Slf4j
@Controller
public class HelloWord {
  @RequestMapping(value = "/hello", method = RequestMethod.GET)
  public String getHello(Map<String, String> model) {
    model.put("message", "Alex");
    log.info("acessou metodo get url hello: ");
    return "hello"; // nome do arquivo
  }
}
