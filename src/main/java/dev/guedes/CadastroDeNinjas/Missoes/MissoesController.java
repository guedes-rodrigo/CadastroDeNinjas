package dev.guedes.CadastroDeNinjas.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada com sucesso!";
    }

    @PutMapping ("/alterar")
    public String alterarMissao(){
        return "Missão alterada com sucesso!";
    }

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Missões listadas com sucesso!";
    }

    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missão excluída com sucesso!";
    }

}
