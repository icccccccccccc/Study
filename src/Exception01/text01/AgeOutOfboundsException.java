package Exception01.text01;

public class AgeOutOfboundsException extends RuntimeException{
    public AgeOutOfboundsException() {
    }

    public AgeOutOfboundsException(String message) {
        super(message);
    }
}
