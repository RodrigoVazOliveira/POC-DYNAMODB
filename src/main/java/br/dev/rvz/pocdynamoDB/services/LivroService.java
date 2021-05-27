package br.dev.rvz.pocdynamoDB.services;

import br.dev.rvz.pocdynamoDB.models.Livro;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class LivroService {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public void cadastrarLivro(Livro livro) {
        dynamoDBMapper.save(livro);
    }

    public List<Livro> obterTodosLivrosCadastrados() {
        List<Livro> livros = new ArrayList<>();
       livros.addAll(dynamoDBMapper.scan(Livro.class, new DynamoDBScanExpression()));
        Collections.sort(livros);
        return livros;
    }
}
