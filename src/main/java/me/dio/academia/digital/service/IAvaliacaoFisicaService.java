package me.dio.academia.digital.service;

import java.util.List;

import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaForm;
import me.dio.academia.digital.entity.form.AvaliacaoFisicaUpdateForm;


public interface IAvaliacaoFisicaService {
  
  AvaliacaoFisica create(AvaliacaoFisicaForm form);

  
  AvaliacaoFisica get(Long id);

  
  List<AvaliacaoFisica> getAll();

  
  AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate);

  
  void delete(Long id);
}
