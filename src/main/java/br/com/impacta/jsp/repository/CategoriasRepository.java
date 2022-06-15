package br.com.impacta.jsp.repository;

import br.com.impacta.jsp.model.Categorias;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriasRepository extends JpaRepository<Categorias,Long> {
}
