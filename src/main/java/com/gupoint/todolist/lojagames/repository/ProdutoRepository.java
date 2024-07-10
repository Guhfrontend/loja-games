package com.gupoint.todolist.lojagames.repository;

import com.gupoint.todolist.lojagames.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
