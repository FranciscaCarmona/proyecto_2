/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_2.demo.dao;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import proyecto_2.demo.modelo.TipoDeServicio;

/**
 *
 * @author Claudia
 */
public interface TipoDeServicioDAO extends CrudRepository<TipoDeServicio,Integer> {
    @Override
    public List<TipoDeServicio> findAll();
}