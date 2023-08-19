package com.astara.processing.config;

import com.astara.processing.exception.ApplicationException;
import com.astara.processing.exception.ErrorClass;
import com.astara.processing.exception.ErrorCode;
import com.astara.processing.exception.ErrorDto;
import org.springframework.core.NestedExceptionUtils;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler  extends ResponseEntityExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<ErrorDto> hanle(RuntimeException ex){
        if(ex instanceof ApplicationException){
            ApplicationException applicationException=(ApplicationException) ex;
            return new ResponseEntity<ErrorDto>(applicationException.getError(), ErrorClassToStatus(applicationException.getErrorClass()));

        }else{
            Throwable root= NestedExceptionUtils.getRootCause(ex);
            if(root==null){
                root=ex;
            }

            String rootMessage=root.getMessage();
            if(rootMessage==null){
                rootMessage=root.getClass().getName();
            }

            String message =String.format(ErrorCode.EX_COR_000.getMessage(),rootMessage);

            //LOG.error(message, root);

            ErrorDto errorDto=new ErrorDto(ErrorCode.EX_COR_000.toString(),message, ex.getMessage());
            return new ResponseEntity<ErrorDto>(errorDto, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @Override
    protected ResponseEntity<Object> handleBindException(BindException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
        return super.handleBindException(ex, headers, status, request);
    }

    private HttpStatus ErrorClassToStatus(ErrorClass errorClass){
        switch (errorClass){
            case NotFound:
                return HttpStatus.NOT_FOUND;
            case InternalError:
                return HttpStatus.INTERNAL_SERVER_ERROR;
            case BadRequest:
                return HttpStatus.BAD_REQUEST;
            case ValidationError:
                return HttpStatus.CONFLICT;
            default:
                return HttpStatus.INTERNAL_SERVER_ERROR;
        }
    }
}
