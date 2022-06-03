package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TB_USUARIOS")

public class Usuarios {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long primarykey;
  private String nome;
  private String email;
  private long usurId;
}
