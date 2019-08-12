package com.brunomello.testedata.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
  
import com.brunomello.testedata.server.Cliente;
  
@RepositoryRestResource(collectionResourceRel = "cliente", path = "clientes")
public interface ClienteRepository extends PagingAndSortingRepository<Cliente, Long> {
     
      List<Cliente> findByNome(@Param("name") String name);
     
      @Query("SELECT c.nome FROM Cliente c where c.id = :id") 
    Cliente findNomeById(@Param("id") Long id);
       
     
      List<Cliente> findByNomeOrderByNome(@Param("name") String name);
  
}