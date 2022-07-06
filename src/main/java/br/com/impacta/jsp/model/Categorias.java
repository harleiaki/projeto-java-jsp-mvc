package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Categorias {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long codigo;

  @NotBlank(message = "informe uma categoria")
  private String name;
}
