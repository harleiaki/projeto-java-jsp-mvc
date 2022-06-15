package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Categoria {

  ALIMENTACAO("Alimentação"),
  TRANSPORTE("Transporte"),
  VESTUARIO("Vestuario"),
  CUIDADOS_PESSOAIS("Cuidados Pessoais"),
  MORADIA("Moradia"),
  LAZER("Lazer"),
  EDUCACAO("Educacão"),
  COMPRAS("Compras"),
  DIVERSAO("Diversão");

  private final String nome;

}
