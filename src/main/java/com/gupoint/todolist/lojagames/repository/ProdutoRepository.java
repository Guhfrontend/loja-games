package com.gupoint.todolist.lojagames.repository;

import com.gupoint.todolist.lojagames.model.Categoria;
import com.gupoint.todolist.lojagames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    List<Produto> findAllByDescricaoContainingIgnoreCase(@Param("descricao") String descricao);

}
