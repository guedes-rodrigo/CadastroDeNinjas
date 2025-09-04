package dev.guedes.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Essa é a minha primeira mensagem nesta rota!";
    }

    //Adicionar ninja

    @PostMapping("/criar")
    public String criarNinja(){
        return "Ninja criado";
    }
    //Mostrar todos os ninjas

    @GetMapping("/todos")
    public String mostrarTodosNinja(){
        return "Mostrar ninja";
    }
    //Mostrar ninja por ID

    @GetMapping("/todosId")
    public String mostrarTodosNinjaPorId(){
        return "Mostrar ninja por id";
    }

    //Alterar dados ninja
    @PutMapping("/alterarId")
    public String alterarNinjaPorId(){
        return "Ninja alterado por id";
    }

    //Deletar dados ninja
    @DeleteMapping("/deletarId")
    public String deletarNinjaPorId(){
        return "Ninja deletado por id";
    }
}
