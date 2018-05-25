/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.springdemo.entity.repository;

import cr.ac.una.springdemo.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author allamchaves
 */
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    
}
