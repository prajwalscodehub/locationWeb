package com.location.exeption;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exeptionhandler {

@ExceptionHandler(value=LocationNotFound.class)
public ResponseEntity<Object> exception(LocationNotFound exception)
{
	return new ResponseEntity<Object>( "location not found", HttpStatus.NOT_FOUND);
}
}
