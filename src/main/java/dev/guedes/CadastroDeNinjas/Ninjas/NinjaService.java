package dev.guedes.CadastroDeNinjas.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    //Listar todos os ninjas

    public List<NinjaModel> listarNinjas() {
        return ninjaRepository.findAll();
    }

    //Listar ninja por ID

    public NinjaModel listarNinjasPorId(Long id) {
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse( null);
    }

    //Adicionar ninja

    public NinjaModel criarNinja(NinjaModel ninja ) {
        return ninjaRepository.save(ninja);
    }

    //Deletar ninja por ID

    public void deletarNinjaPorId(Long id) {
       ninjaRepository.deleteById(id);
    }
}
