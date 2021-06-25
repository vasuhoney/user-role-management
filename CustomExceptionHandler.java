package com.honey.in.exceptions;

import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.honey.in.errors.ErrorResponse;

@ControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
	
	@ExceptionHandler(value = DuplicateRecordException.class)
	public ResponseEntity<ErrorResponse> handleDuplicateRecordException(DuplicateRecordException duplicateRecordException) {
		ErrorResponse error = new ErrorResponse(400, "mobile number already exists", new Date());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(value = UsernotFoundException.class)
	public ResponseEntity<ErrorResponse> handleUsernotFoundException(UsernotFoundException usernotFoundException) {
		ErrorResponse error = new ErrorResponse(400, "entity not found", new Date());
		return new ResponseEntity<ErrorResponse>(error, HttpStatus.BAD_REQUEST);
	}

	
	

}
