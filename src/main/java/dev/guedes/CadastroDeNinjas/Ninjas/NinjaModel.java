package dev.guedes.CadastroDeNinjas.Ninjas;

import dev.guedes.CadastroDeNinjas.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_cadastro")
@Data //getter e setters
@NoArgsConstructor
@AllArgsConstructor
public class NinjaModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column (name = "id")
    private Long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "idade")
    private int idade;

    @Column(name= "rank")
    private String rank;

    //Um ninja tem uma unica missão
    @ManyToOne
    @JoinColumn(name="missoes_id") // Foreign Key
    private MissoesModel missoes;
}
