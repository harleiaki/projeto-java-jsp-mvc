package br.com.impacta.jsp.repository;

import br.com.impacta.jsp.model.Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios,Long> {

  
}
