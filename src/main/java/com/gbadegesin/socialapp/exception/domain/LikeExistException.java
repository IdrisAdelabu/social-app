package com.gbadegesin.socialapp.exception.domain;

public class LikeExistException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public LikeExistException(String message) {
		super(message);
	}

}
