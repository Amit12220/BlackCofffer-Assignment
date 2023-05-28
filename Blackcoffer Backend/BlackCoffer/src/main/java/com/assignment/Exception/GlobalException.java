package com.assignment.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(DataException.class)
	public ResponseEntity<MyErrorDetails> dataModelExceptionHandler(DataException u, WebRequest req){

		MyErrorDetails err = new MyErrorDetails(LocalDateTime.now(),u.getMessage(),req.getDescription(false));

		return new ResponseEntity<MyErrorDetails>(err, HttpStatus.OK);

	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails>  exceptionHandler(Exception e,WebRequest req){
		MyErrorDetails mrd=new MyErrorDetails(LocalDateTime.now(),e.getMessage(),req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(mrd,HttpStatus.OK);
	}
	@ExceptionHandler(NoHandlerFoundException.class)
	public ResponseEntity<MyErrorDetails> nohandler(NoHandlerFoundException nhf,WebRequest req){
		MyErrorDetails mrd=new MyErrorDetails(LocalDateTime.now(),nhf.getMessage(),req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(mrd,HttpStatus.OK);
	}
}
