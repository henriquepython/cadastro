package br.pro.cadastra.cadastro.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.pro.cadastra.cadastro.domain.Categoria;
import br.pro.cadastra.cadastro.exception.RecursoNaoEncontradoException;
import br.pro.cadastra.cadastro.repository.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscarPorCodigo (Short codigo) {
		Optional<Categoria> resultado = categoriaRepository.findById(codigo);
		
		if(resultado.isEmpty()) {
			throw new RecursoNaoEncontradoException();
		}
		
		Categoria categoria = resultado.get();
		return categoria;
	}
	
	public List<Categoria> listar() {
		List<Categoria> resultado = categoriaRepository.findAll();
		return resultado;
	}
	
	public Categoria inserir (Categoria categoria) {
		Categoria categoriaSalva = categoriaRepository.save(categoria);
		return categoriaSalva;
	}
	
	public Categoria editar (Categoria categoria) {
		Categoria categoriaEditada =  categoriaRepository.save(categoria);
		return categoriaEditada;
		
	}
	
	public Categoria excluir (Short codigo) {
		Optional<Categoria> resultado = categoriaRepository.findById(codigo);	
		Categoria categoria = resultado.get();
		categoriaRepository.delete(categoria);
		return categoria;
	}
}
