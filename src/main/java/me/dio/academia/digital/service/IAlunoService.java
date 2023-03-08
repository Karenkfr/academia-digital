package me.dio.academia.digital.service;

import java.util.List;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;

public interface IAlunoService {
  
  
  Aluno create(AlunoForm form);

  
  Aluno get(Long id);

  
  List<Aluno> getAll(String datataDeNascimento);

  
  Aluno update(Long id, AlunoUpdateForm formUpdate);

  
  void delete(Long id);
  
  public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
	
