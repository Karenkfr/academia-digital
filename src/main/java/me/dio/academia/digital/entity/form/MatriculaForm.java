package me.dio.academia.digital.entity.form;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  
  @NotNull(message = "Preencha o campo corretamente. ")
  @Positive(message = "O Id do aluno precisa ser positivo. ")
  private Long alunoId;

}
