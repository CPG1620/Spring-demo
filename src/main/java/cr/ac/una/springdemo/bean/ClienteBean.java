/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.una.springdemo.bean;


import cr.ac.una.springdemo.entity.Cliente;
import cr.ac.una.springdemo.entity.repository.ClienteRepository;
import javax.faces.event.ActionEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 * @author allamchaves
 */
@Component
@Scope("session")
public class ClienteBean {
    
    @Autowired
    ClienteRepository clienteRepository;
    
    public void guardar(ActionEvent actionEvent){
        
        clienteRepository.save(new Cliente("Allam","Chaves"));
    }
    
}
