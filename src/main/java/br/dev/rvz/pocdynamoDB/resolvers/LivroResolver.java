package br.dev.rvz.pocdynamoDB.resolvers;

import br.dev.rvz.pocdynamoDB.models.Livro;
import br.dev.rvz.pocdynamoDB.services.LivroService;
import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LivroResolver implements GraphQLMutationResolver, GraphQLQueryResolver {

    @Autowired
    private LivroService livroService;

    public Livro cadastrarNovoLivro(Livro livro) {
        livroService.cadastrarLivro(livro);
        return livro;
    }
}
