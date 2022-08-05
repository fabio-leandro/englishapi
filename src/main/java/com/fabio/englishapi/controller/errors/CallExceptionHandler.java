package com.fabio.englishapi.controller.errors;

import com.fabio.englishapi.exceptions.ObjectNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class CallExceptionHandler {

    @ExceptionHandler(ObjectNotFoundException.class)
    public ResponseEntity<MsgError> objectNotFoundException(ObjectNotFoundException e, HttpServletRequest request){
        MsgError msgError = new MsgError();
        msgError.setStatus(HttpStatus.NOT_FOUND.value());
        msgError.setMessage(e.getMessage());
        msgError.setError("Object Not Found.");
        msgError.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(msgError);
    }

    @ExceptionHandler(DataIntegrityViolationException.class)
    public ResponseEntity<MsgError> dataIntegrityViolationException(DataIntegrityViolationException e, HttpServletRequest request){
        MsgError msgError = new MsgError();
        msgError.setStatus(HttpStatus.INTERNAL_SERVER_ERROR.value());
        msgError.setMessage("Dado já existente ou inválido.");
        msgError.setError("Erro na validação dos dados informados.");
        msgError.setPath(request.getRequestURI());
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(msgError);
    }


}
