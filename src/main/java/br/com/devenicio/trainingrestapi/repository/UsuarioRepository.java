package br.com.devenicio.trainingrestapi.repository;

import br.com.devenicio.trainingrestapi.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer> {
}
