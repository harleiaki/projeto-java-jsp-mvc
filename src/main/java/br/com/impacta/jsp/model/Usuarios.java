package br.com.impacta.jsp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
    private String nome;
    @Email(message = "Insira um email valido")
    private String email;
    @NotBlank(message = "Insira uma senha")
    private String senha;
}
