package br.com.relatorioprogweb.crud.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Não foi possível localizar o cadastro de ID " + id + ". Por favor, verifique se o registro está correto.");
	}
}
