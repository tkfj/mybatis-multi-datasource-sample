package my.sample.domain.service;

public class BusinessException extends RuntimeException {

    public BusinessException(String message) {
        super(message);
    }

    private static final long serialVersionUID = 1246393981974315844L;

}
