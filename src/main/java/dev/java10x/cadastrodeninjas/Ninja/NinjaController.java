package dev.java10x.cadastrodeninjas.Ninja;

import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninja")
@NoArgsConstructor
public class NinjaController {

    private NinjaRepository repository;

    @PostMapping("/cadastro")
    public NinjaModel cadastrarNinja(@RequestBody NinjaModel ninja){
        return repository.save(ninja);
    }

    @GetMapping("/lista")
       public List<NinjaModel> ListarNinjas() {
        return repository.findAll();
    }
}
