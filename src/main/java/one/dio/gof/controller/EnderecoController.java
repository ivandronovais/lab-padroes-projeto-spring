package one.dio.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import one.dio.gof.model.Endereco;
import one.dio.gof.service.EnderecoService;

@RestController
@RequestMapping("enderecos")
public class EnderecoController {
    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public ResponseEntity<Iterable<Endereco>> buscarTodos() {
        return ResponseEntity.ok(enderecoService.buscarTodos());
    }
    @PostMapping
    public ResponseEntity<Endereco> inserirEndereco(Endereco endereco){
        enderecoService.inserir(endereco);
        return ResponseEntity.ok(endereco);
    }
}
