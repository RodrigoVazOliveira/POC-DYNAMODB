package br.dev.rvz.pocdynamoDB.resolvers;

import br.dev.rvz.pocdynamoDB.models.Livro;
import br.dev.rvz.pocdynamoDB.services.LivroService;
import graphql.GraphQLError;
import graphql.GraphQLException;
import graphql.servlet.GraphQLErrorHandler;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Component
public class LivroResolver implements GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private LivroService livroService;

    public Livro cadastrarNovoLivro(Livro livro) {
        livroService.cadastrarLivro(livro);
        return livro;
    }

    public List<Livro> obterTodosOsRegistros() {
        return livroService.obterTodosLivrosCadastrados();
    }
    
    public Livro atualizarLivro(Livro livro) {
    	return livroService.atualizarLivro(livro);
    }
    
    public void deleteLivro(Long id) {
    	livroService.deleteLivro(id);

    }

}
