package com.example.POIII.service;

import com.example.POIII.model.Disciplina;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DisciplinaService {

    List<Disciplina> listarDisciplinas();
    Disciplina buscarDisciplinaPorId(Long id);
    Disciplina salvarDisciplina(Disciplina disciplina);
    Disciplina atualizarDisciplina(Long id, Disciplina disciplina);
    void deletarDisciplina(Long id);
}