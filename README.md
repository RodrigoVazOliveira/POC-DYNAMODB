### POC DYNAMODB AWS

----

### Tecnologias utilizadas:
* Java 11
* Spring Boot Web
* Spring Boot GraphQL
* GraphQL Tools
* AWS SDK
* AWS dynamoDB SDK

### Modo de uso:

* endpont principal: POST http://localhost:8080/graphql 
* cadastro de livro:
	```graphql
	
		{
		"query":
			"mutation($livro: LivroInput) { 
				cadastrarNovoLivro(livro: $livro) {
					id
					nome
					ano
					nomeDoAutor
			   }
			}",
		"variables": {
			"livro": {
				"id":"4",
				"nome":"Livro 4",
				"ano":2013,
				"nomeDoAutor":"Jailson"
				}
			}
	}	

	
* obter todos livros cadastrados:
	```graphql

	query {
	    obterTodosOsRegistros {
	        id
	        nome
	        ano
	        nomeDoAutor
	    }
	}
	
* atualizar um livro
```graphql
	
		{
		"query":
			"mutation($livro: LivroInput) { 
				atualizarLivro(livro: $livro) {
					id
					nome
					ano
					nomeDoAutor
			   }
			}",
		"variables": {
			"livro": {
				"id":"4",
				"nome":"Novo nome",
				"ano":2013,
				"nomeDoAutor":"Jailson"
				}
			}
	}	


* excluir um livro:
```graphql

	{
		"query": "mutation($id: Int) {
			deleteLivro(id: $id)
		}",
		"variables": {
			"id": 3
		}
	}

