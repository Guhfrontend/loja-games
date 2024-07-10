package com.gupoint.todolist.lojagames.repository;

import com.gupoint.todolist.lojagames.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
