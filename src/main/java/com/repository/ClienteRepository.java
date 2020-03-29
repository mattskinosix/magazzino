package com.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Cliente;

import java.util.List;
import java.util.Optional;

@Repository("Cliente")
public interface ClienteRepository extends  JpaRepository<Cliente, String> {


  List<Cliente> findAllByNomeAndCognome(String nome,String cognome);
  List<Cliente> findAllByVia(String via);
  List<Cliente> findAllByNome(String nome);
  List<Cliente> findAllByCognome(String cognome);

} 	 