package com.exemplo.importacoes.service;

import com.exemplo.importacoes.model.Importacao;
import com.exemplo.importacoes.repository.ImportacaoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImportacaoService {

    private final ImportacaoRepository repository;

    public ImportacaoService(ImportacaoRepository repository) {
        this.repository = repository;
    }

    public List<Importacao> listarTodas() {
        return repository.findAll();
    }

    public Importacao salvar(Importacao importacao) {
        return repository.save(importacao);
    }

    public Importacao buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}