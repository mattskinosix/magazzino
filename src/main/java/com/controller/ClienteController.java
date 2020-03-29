package com.controller;
import java.util.ArrayList;
import java.util.List;


import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.Cliente;
import com.entity.Pesata;
import com.repository.ClienteRepository;


@RestController
@CrossOrigin("*")
public class ClienteController {
	private	ClienteRepository clienteRepository ;
	
    	

    @Autowired
    public void setClienteRepository(ClienteRepository cl) {
        this.clienteRepository = cl;
    }
    

	
	  @GetMapping("/cliente")
	  public  List<Cliente> index(){
		  List<Cliente> clienti=clienteRepository.findAll();
		  for(Cliente cliente: clienti) {
			  if (cliente.pesate!=null) {
			  for(Pesata pesa: cliente.pesate) {
				  cliente.somma+=pesa.getQuintali();
				  cliente.mediaPrezzo+=pesa.getPrezzo();
				  }
			  cliente.mediaPrezzo=cliente.mediaPrezzo/cliente.pesate.size();
			  }
			  }
		  return clienti;
	    }
	  
	  @GetMapping("/cliente/ricerca/nome/{nome}")
	  public List<Cliente> researchByName(@PathVariable String nome){
		  List<Cliente> clienti=clienteRepository.findAllByNome(nome);
		  for(Cliente cliente: clienti) {
			  if (cliente.pesate!=null)
			  for(Pesata pesa: cliente.pesate) {
				  cliente.somma+=pesa.getQuintali();
			  }
		  }
		  return clienti;
	    }
	  
	  @GetMapping("/cliente/ricerca/cognome/{cognome}")
	  public List<Cliente> researchBySurname(@PathVariable String cognome){
		  return  clienteRepository.findAllByCognome(cognome);
	    }
	  
	  
	  @GetMapping("/cliente/ricerca/nome-cognome/{nome}--{cognome}")
	  public List<Cliente> researchByNameAndSurname(@PathVariable String nome,@PathVariable String cognome  ){
		  return  clienteRepository.findAllByNomeAndCognome(nome, cognome);
	    }
	  
	  @GetMapping("/cliente/ricerca/via/{nome}")
	  public List<Cliente> researchByVia(@PathVariable String via){
		  return  clienteRepository.findAllByVia(via);
	    }
	  
	  
	  @GetMapping("/cliente/ricerca/cf/{cf}")
	  public Optional<Cliente> show(@PathVariable String cf){
		  return  clienteRepository.findById(cf);
	    } 	  
	  
	  
	  
	

	  
	  
	  
	  @PostMapping("/cliente")
	   void addCliente(@RequestBody Cliente cliente) {
		  clienteRepository.save(cliente);
	    }
	
	
	public ClienteRepository getClienteRepository() {
		return clienteRepository;
	} 	  
}
