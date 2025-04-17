package one.dio.gof.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.dio.gof.model.Endereco;
import one.dio.gof.repository.EnderecoRepository;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public void inserir(Endereco endereco) {
        enderecoRepository.save(endereco);
    }
    public Iterable<Endereco> buscarTodos(){
        return enderecoRepository.findAll();
    }

}
