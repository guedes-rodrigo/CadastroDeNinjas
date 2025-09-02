package dev.guedes.CadastroDeNinjas.Missoes;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeMissao;
    private String rank;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String nomeMissao, String rank) {
        this.id = id;
        this.nomeMissao = nomeMissao;
        this.rank = rank;
    }

     public String getNomeMissao() {
        return nomeMissao;
    }

    public void setNomeMissao(String nomeMissao) {
        this.nomeMissao = nomeMissao;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }
}
