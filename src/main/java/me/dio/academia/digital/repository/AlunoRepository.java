package me.dio.academia.digital.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import me.dio.academia.digital.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{
	
	List<Aluno> findByDataDeNascimento(LocalDate dataDeNascimento);
	
	@Query(value = "DELETE * FROM tb_alunos WHERE id= :id ", nativeQuery = true)
	public Aluno delete(Long id);
	
	
}
