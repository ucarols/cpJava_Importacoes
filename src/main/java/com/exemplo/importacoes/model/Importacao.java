package com.exemplo.importacoes.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Importacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String paisOrigem;
    private Double valor;
    private LocalDate dataImportacao;
    private String status;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public String getPaisOrigem() { return paisOrigem; }
    public void setPaisOrigem(String paisOrigem) { this.paisOrigem = paisOrigem; }

    public Double getValor() { return valor; }
    public void setValor(Double valor) { this.valor = valor; }

    public LocalDate getDataImportacao() { return dataImportacao; }
    public void setDataImportacao(LocalDate dataImportacao) { this.dataImportacao = dataImportacao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}