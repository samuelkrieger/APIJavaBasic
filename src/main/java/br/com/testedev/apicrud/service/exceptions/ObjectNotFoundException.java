package br.com.testedev.apicrud.service.exceptions;

public class ObjectNotFoundException extends RuntimeException{

    private static final long serialVercionUID=1L;

    public ObjectNotFoundException(String message,Throwable cause){
        super(message, cause);
    }

    public ObjectNotFoundException(String message){
        super(message);
    }
}
