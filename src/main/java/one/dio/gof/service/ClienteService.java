package one.dio.gof.service;

import java.util.Optional;

import one.dio.gof.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Optional<Cliente> buscarPorId(Long id);

    void inserir(Cliente cliente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);
}
