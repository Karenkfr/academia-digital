package me.dio.academia.digital.entity.form;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @NotNull(message = "Preencha o campo corretamente. ")
  @Positive(message = "O Id do aluno precisa ser positivo")
  private Long alunoId;

  @NotNull(message = "Preencha o campo corretamente. ")
  @Positive(message = " '${validatedValue}' precisa ser positivo ")
  private double peso;

  @NotNull(message = "Preencha o campo corretamente. ")
  @Positive(message = " '${validatedValue}' precisa ser positivo. ")
  @DecimalMin(value = "150", message = " '${validatedValue}' precisa ser no mínimo {value}. ")
  @DecimalMax(value = "300", message = " '${validatedValue}' precisa ser no máximo {value}. ")
  private double altura;
}
