package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorias {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long codigo;
  private String name;
}
