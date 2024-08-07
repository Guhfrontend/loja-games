package com.gupoint.todolist.lojagames.controller;

import com.gupoint.todolist.lojagames.model.Produto;
import com.gupoint.todolist.lojagames.repository.ProdutoRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ProdutoControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Autowired
    private ProdutoRepository produtoRepository;

    @BeforeAll
    void start(){
        produtoRepository.deleteAll();

    }

    @Test
    @DisplayName("Cadastrar produto")
    public void cadastrarUmProduto(){
        HttpEntity<Produto> corpoRequisicao = new HttpEntity<>(new Produto(10L,"Jogo00", "Jogo para jogar", 40.1));

        ResponseEntity<Produto> corpoResposta = testRestTemplate.exchange("/produtos", HttpMethod.POST, corpoRequisicao, Produto.class);

        assertEquals(HttpStatus.CREATED, corpoResposta.getStatusCode());
    }
}
