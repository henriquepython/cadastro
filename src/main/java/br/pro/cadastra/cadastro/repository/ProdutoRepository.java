package br.pro.cadastra.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pro.cadastra.cadastro.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Short> {
	
}
