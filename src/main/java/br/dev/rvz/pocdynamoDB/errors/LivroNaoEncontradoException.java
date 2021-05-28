package br.dev.rvz.pocdynamoDB.errors;

import java.util.List;

import graphql.ErrorType;
import graphql.GraphQLError;
import graphql.language.SourceLocation;

public class LivroNaoEncontradoException extends RuntimeException implements GraphQLError {

	public LivroNaoEncontradoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<SourceLocation> getLocations() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ErrorType getErrorType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public synchronized Throwable fillInStackTrace() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
