package br.pro.cadastra.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.pro.cadastra.cadastro.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Short> {

}
