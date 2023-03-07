package me.dio.academia.digital.entity.form;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.br.CPF;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class AlunoForm {


  @NotEmpty(message = "Preencha o campo corretamente. ")
  @Size(min = 3, max =50, message =" '${validatedValue}' precisa estar entre {min} e {max} caracteres. ")
  private String nome;

  @NotEmpty(message = "Preencha o campo corretamente. ")
  @CPF(message = " '${validatedValue}' é inválido. ")
  private String cpf;

  @NotEmpty(message = "Preencha o campo corretamente. ")
  @Size(min = 3, max = 50, message = " '${validatedValue}' precisa estar entre {min} e {max} caracteres. ")
  private String bairro;

  @NotNull(message = "Preencha o campo corretamente")
  @Past(message = "Data '${validatedValue}' é inválida. ")
  private LocalDate dataDeNascimento;
}
