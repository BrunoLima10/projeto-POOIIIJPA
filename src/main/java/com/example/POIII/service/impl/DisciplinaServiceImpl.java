package com.example.POIII.service.impl;

import com.example.POIII.model.Disciplina;
import com.example.POIII.repository.DisciplinaRepository;
import com.example.POIII.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DisciplinaServiceImpl implements DisciplinaService {

    private final DisciplinaRepository disciplinaRepository;

    @Autowired
    public DisciplinaServiceImpl(DisciplinaRepository disciplinaRepository) {
        this.disciplinaRepository = disciplinaRepository;
    }

    @Override
    public List<Disciplina> listarDisciplinas() {
        return disciplinaRepository.findAll();
    }

    @Override
    public Disciplina buscarDisciplinaPorId(Long id) {
        return disciplinaRepository.findById(id)
                .orElseThrow(() -> new NoSuchElementException("Disciplina não encontrada"));
    }

    @Override
    public Disciplina salvarDisciplina(Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @Override
    public Disciplina atualizarDisciplina(Long id, Disciplina disciplina) {
        Disciplina disciplinaExistente = buscarDisciplinaPorId(id);
        disciplinaExistente.setProfessor(disciplina.getProfessor());
        disciplinaExistente.setTurma(disciplina.getTurma());
        disciplinaExistente.setSala(disciplina.getSala());
        disciplinaExistente.setHorario(disciplina.getHorario());
        return disciplinaRepository.save(disciplinaExistente);
    }

    @Override
    public void deletarDisciplina(Long id) {
        disciplinaRepository.deleteById(id);
    }
}
