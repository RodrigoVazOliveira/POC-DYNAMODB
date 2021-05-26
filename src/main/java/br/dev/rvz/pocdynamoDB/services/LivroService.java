package br.dev.rvz.pocdynamoDB.services;

import br.dev.rvz.pocdynamoDB.models.Livro;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LivroService {

    @Autowired
    private DynamoDBMapper dynamoDBMapper;

    public void cadastrarLivro(Livro livro) {
        dynamoDBMapper.save(livro);
    }
}
