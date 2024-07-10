package com.gupoint.todolist.lojagames.repository;

import com.gupoint.todolist.lojagames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    List<Categoria> findAllByDescricaoCategoriaContainingIgnoreCase(@Param("descricaoCategoria") String descricaoCategoria);

}
