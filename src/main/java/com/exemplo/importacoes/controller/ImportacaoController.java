package com.exemplo.importacoes.controller;

import com.exemplo.importacoes.model.Importacao;
import com.exemplo.importacoes.service.ImportacaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@Controller
@RequestMapping("/importacoes")
public class ImportacaoController {

    private final ImportacaoService service;

    public ImportacaoController(ImportacaoService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("importacoes", service.listarTodas());
        model.addAttribute("novaImportacao", new Importacao());
        return "importacoes";
    }

    @PostMapping
    public String salvar(@ModelAttribute("novaImportacao") Importacao importacao) {
        importacao.setDataImportacao(LocalDate.now());
        importacao.setStatus("PENDENTE");
        service.salvar(importacao);
        return "redirect:/importacoes";
    }

    @PostMapping("/{id}/atualizarStatus")
    public String atualizarStatus(@PathVariable Long id, @RequestParam String status) {
        Importacao importacao = service.buscarPorId(id);
        if (importacao != null) {
            importacao.setStatus(status);
            service.salvar(importacao);
        }
        return "redirect:/importacoes";
    }

    @GetMapping("/{id}/excluir")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/importacoes";
    }
}