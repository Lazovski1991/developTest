package my.company.front.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ExceptionAdvice {
    private static final String DEFAULT_MESSAGE = "Сорри братан, но мне в лом было все обрабатывать исключения";

    @ExceptionHandler(value = {DeveloperException.class})
    protected ResponseEntity<Object> handleAuthExc(DeveloperException ex, WebRequest request) {
        return new ResponseEntity<>(new ExceptionResponse().setMessage(ex.getMessage()), HttpStatus.INTERNAL_SERVER_ERROR);
    }

    @ExceptionHandler(value = {Exception.class})
    protected ResponseEntity<Object> handleAuthExc(Exception ex, WebRequest request) {
        return new ResponseEntity<>(new ExceptionResponse().setMessage(DEFAULT_MESSAGE), HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
