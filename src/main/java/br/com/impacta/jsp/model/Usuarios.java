package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "TB_USUARIOS")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long primarykey;

    @NotBlank(message = "Insira um nome")
    @Column(nullable = false)
    private String nome;

    @Email(message = "Insira um email valido")
    @Column(unique = true, nullable = false)
    private String email;

    @NotBlank(message = "Insira uma senha")
    @Column(nullable = false)
    private String senha;
}
