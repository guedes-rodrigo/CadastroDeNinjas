package dev.guedes.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("ninjas")
public class NinjaController {

    private NinjaService ninjaService;

    public NinjaController(NinjaService ninjaService) {
        this.ninjaService = ninjaService;
    }

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

    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }
    //Mostrar ninja por ID

    @GetMapping("/listarId")
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
