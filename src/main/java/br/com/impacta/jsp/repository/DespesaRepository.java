package br.com.impacta.jsp.repository;

import br.com.impacta.jsp.model.Despesa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DespesaRepository extends JpaRepository<Despesa, Long> {

  String findByDescricao(String descricao);

  String findByCategoriaAndAndDataAfter(String categoria, String data);
 @Query("SELECT 1 FROM Despesa ")
  String findByAlgumaCoisa();

    List<Despesa> findByDescricaoContainingIgnoreCase(String descricao);
}
