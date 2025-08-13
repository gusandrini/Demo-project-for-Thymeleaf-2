package br.com.fiap.spring_mvc.service;

import br.com.fiap.spring_mvc.entity.Livro;
import br.com.fiap.spring_mvc.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository) {
        this.livroRepository = livroRepository;
    }

    // CREATE
    public Livro createLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    // READ por ID
    public Livro readLivro(Long id) {
        return livroRepository.findById(id).orElse(null);
    }

    // READ listar todos
    public List<Livro> listLivros() {
        return livroRepository.findAll();
    }

    // UPDATE
    public Livro updateLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    // DELETE
    public void deleteLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
