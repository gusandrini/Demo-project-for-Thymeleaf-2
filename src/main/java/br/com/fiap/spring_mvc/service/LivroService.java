package br.com.fiap.spring_mvc.service;

import br.com.fiap.spring_mvc.entity.Livro;
import br.com.fiap.spring_mvc.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    private final LivroRepository livroRepository;

    @Autowired
    public LivroService(LivroRepository livroRepository){

    }
    //CRUD
    public Livro createLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public Livro readLivro(longId){
        return livroRepository.findById(id).orElse(null);
    }

    public Livro updateLivro(Livro livro){
        return livroRepository.save(livro);
    }

    public void deleteLivro(Long id){
        livroRepository.deleteById(id);
    }

}
