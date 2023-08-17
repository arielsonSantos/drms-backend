package br.com.arielsonsantos.drms.exceptions;

public class EntityNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	private static final String ENTITY_NOT_FOUND_EXCEPTION_MESSAGE = "%s com id '%d' não existe!";
	
	public EntityNotFoundException(final String entityName, final Long id) {
		super(String.format(ENTITY_NOT_FOUND_EXCEPTION_MESSAGE, entityName, id));
	}
}
