package org.openmrs.module.xdsbrepository.exceptions;


public class UnsupportedGenderException extends XdsRepositoryException {
	
	private static final long serialVersionUID = 1L;

	public UnsupportedGenderException(String msg) {
		super(msg);
	}

	public UnsupportedGenderException(String msg, Throwable t) {
		super(msg, t);
	}

}
