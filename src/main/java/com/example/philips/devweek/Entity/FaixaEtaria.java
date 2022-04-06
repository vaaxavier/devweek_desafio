package com.example.philips.devweek.Entity;

import javax.persistence.*;

@Entity
public class FaixaEtaria {
    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false, updatable = false)
    private Long id;
    private Long Faixa_i;
    private Long Faixa_n;
    private String Descricao;

    public FaixaEtaria(Long faixaI, Long faixaN, String descricao) {
        Faixa_i = faixaI;
        Faixa_n = faixaN;
        Descricao = descricao;
    }

    public FaixaEtaria() {}

    public Long getId() {

        return id;
    }

    public Long getFaixa_i() {

        return Faixa_i;
    }

    public void setFaixa_i(Long faixa_i) {

        Faixa_i = faixa_i;
    }

    public Long getFaixa_n() {

        return Faixa_n;
    }

    public void setFaixa_n(Long faixa_n) {

        Faixa_n = faixa_n;
    }

    public String getDescricao() {

        return Descricao;
    }

    public void setDescricao(String descricao) {

        this.Descricao = descricao;
    }
}
