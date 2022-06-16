package br.com.impacta.jsp.service;

import br.com.impacta.jsp.model.Categorias;
import br.com.impacta.jsp.repository.CategoriasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriasService {

  @Autowired
  private CategoriasRepository categoriasRepository;

  public List<String> getListName(){
    //codigo , nome
    List<String> novaList = new ArrayList<>();
      categoriasRepository
        .findAll()
        .stream()
        .forEach(categorias ->{
          novaList.add(categorias.getName());
        });
    return novaList;
  }

  public List<Categorias> getListAll(){
    return categoriasRepository.findAll();
  }
}
