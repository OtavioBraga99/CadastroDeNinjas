package dev.java10x.cadastrodeninjas.Missoes;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/missoes")
public class MissaoController {

    private MissaoRepository repository;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<MissaoModel> listaDeMissoes() {
        return repository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MissaoModel criarMissao(@RequestBody MissaoModel missao){
        return repository.save(missao);
    }

}
