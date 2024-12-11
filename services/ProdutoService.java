package com.projetojpa.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetojpa.entities.Produto;
import com.projetojpa.repository.ProdutoRepository;

@Service
public class ProdutoService {
private final ProdutoRepository produtoRepository;

@Autowired
public ProdutoService(ProdutoRepository produtoRepository) {
	this.produtoRepository = produtoRepository;
}
public Produto saveProduto(Produto produto) {
	return produtoRepository.save(produto);
}

public Produto getProdutoById(long Id) {
	return produtoRepository.findById(Id).orElse(null);
}

public List<Produto> getAllProdutos(){
	return produtoRepository.findAll();
}
public void deleteProduto (Long id){
	produtoRepository.deleteById(id);
}

}
