package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Despesa {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long codigo;
  private String descricao;

  @Enumerated(EnumType.STRING)
  private Categoria categoria;

  @Temporal(TemporalType.DATE)
  private Date data;
  private BigDecimal valor;
  private String observacoes;


}
