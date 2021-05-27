package br.dev.rvz.pocdynamoDB.models;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import org.jetbrains.annotations.NotNull;

@DynamoDBTable(tableName = "livros")
public class Livro implements Comparable<Livro> {

    private Long id;
    private String nome;
    private Integer ano;
    private String nomeDoAutor;

    public Livro() {
    }

    public Livro(Long id, String nome, Integer ano, String nomeDoAutor) {
        this.id = id;
        this.nome = nome;
        this.ano = ano;
        this.nomeDoAutor = nomeDoAutor;
    }

    @DynamoDBHashKey(attributeName = "Id")
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    @DynamoDBAttribute(attributeName = "nome")
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @DynamoDBAttribute(attributeName = "ano")
    public Integer getAno() {
        return ano;
    }
    public void setAno(Integer ano) {
        this.ano = ano;
    }

    @DynamoDBAttribute(attributeName = "autor")
    public String getNomeDoAutor() {
        return nomeDoAutor;
    }
    public void setNomeDoAutor(String nomeDoAutor) {
        this.nomeDoAutor = nomeDoAutor;
    }

    @Override
    public int compareTo(@NotNull Livro o) {
        return this.id.compareTo(o.id);
    }
}
