package me.dio.academia.digital.service;

import java.util.List;

import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;


public interface IMatriculaService {
  
  Matricula create(MatriculaForm form);

  
  Matricula get(Long id);

  
  List<Matricula> getAll(String bairro);

  
  void delete(Long id);

}
