package com.sofka.ApiDemo.api.repositories;

import java.util.ArrayList;
import com.sofka.ApiDemo.api.models.UsuarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    public abstract UsuarioModel findByEmail(String email);

    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);

}
