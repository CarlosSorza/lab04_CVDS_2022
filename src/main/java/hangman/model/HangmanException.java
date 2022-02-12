package hangman.model;

public class HangmanException extends Exception {
    public static final String INVALID_PARAMETERS = "Los parametros NO deben ser negativos";

    public HangmanException(String message) {
        super(message);
    }
}