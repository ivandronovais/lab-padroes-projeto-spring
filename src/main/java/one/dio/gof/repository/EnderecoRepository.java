package one.dio.gof.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import one.dio.gof.model.Endereco;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}
