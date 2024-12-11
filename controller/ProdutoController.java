package com.projetojpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projetojpa.entities.Produto;
import com.projetojpa.services.ProdutoService;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
private final ProdutoService produtoService;

@Autowired
	public ProdutoController (ProdutoService produtoService) {
	this.produtoService = produtoService;
}
@PostMapping
public Produto createProduct (@RequestBody Produto produto) {
	return produtoService.saveProduto(produto);
}
@GetMapping("/Id")
public Produto getProduto(@PathVariable Long Id) {
	return produtoService.getProdutoById(Id);
}
@GetMapping
public List<Produto> getAllProdutos(){
	return produtoService.getAllProdutos();
}

	@DeleteMapping ("/Id")
	public void deleteProduto(@PathVariable Long id) {
		produtoService.deleteProduto(id);
	}
	
	
}
