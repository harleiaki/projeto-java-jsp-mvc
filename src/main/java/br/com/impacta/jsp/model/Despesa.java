package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Despesa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @NotBlank(message = "Insira uma descrição")
    private String descricao;

    @ManyToOne
    @NotNull(message = "Insira uma categoria")
    private Categorias categoria;

    @NotNull(message = "Insira uma data valida")
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    private Date data;

    @NotNull(message = "Insira um valor para despesa")
    @NumberFormat(pattern = "#,##0.00")
    @DecimalMin(value = "1.00", message = "despesa deve ser maior que R$1.00")
    private BigDecimal valor;

    @Column(name = "obs", nullable = false, length = 4000)
    private String observacoes;

}
