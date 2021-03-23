package com.romagnolocesar.controleenfermagem.repositorio;

import com.romagnolocesar.controleenfermagem.modelo.Funcionario.Funcionario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "funcionario", path = "funcionarios")
public interface FuncionarioRepository extends PagingAndSortingRepository<Funcionario, Long> {

    /**
     * Método que retorna uma lista de clientes fazendo a busca pelo nome
     passado como parâmetro.
     *
     * @param nome
     * @return lista de clientes
     */
    List<Funcionario> findByNome(@Param("nome") String nome);

    /**
     * Método que retorna o cliente com apenas seu nome fazendo a busca
     com o id passado como parâmetro.
     *
     * @param id
     * @return cliente do id passado como parâmetro.
     */
    @Query(value="SELECT c.nome FROM Funcionario c where c.id = :id_funcionario", nativeQuery = true)
    Funcionario findNomeById(@Param("id") Long id);

    /**
     * Método que retorna uma lista de clientes fazendo a busca pelo nome passado
     como parâmetro e ordenando os
     * clientes pelo nome.
     *
     * @param name
     * @return lista de clientes
     */
    List<Funcionario> findByNomeOrderByNome(@Param("nome") String name);

}