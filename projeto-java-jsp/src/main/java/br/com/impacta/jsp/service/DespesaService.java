package br.com.impacta.jsp.service;

import br.com.impacta.jsp.model.Despesa;
import br.com.impacta.jsp.repository.DespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

  @Autowired
  private DespesaRepository despesaRepository;

  public Despesa salvar(Despesa despesa) {
    return despesaRepository.save(despesa);
  }

  public List<Despesa> getListAll(){
    return despesaRepository.findAll();
  }

    public void excluir(Long codigo) {
      despesaRepository.deleteById(codigo);
    }

    public List<Despesa> findByDescricaoContainingIgnoreCase(String descricao) {
        return despesaRepository.findByDescricaoContainingIgnoreCase(descricao);
    }
}
