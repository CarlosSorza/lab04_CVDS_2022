package hangman.model;

public class HangmanException extends Exception {
    public static final String PARAMETROS_NEGATIVOS = "Los parametros NO deben ser negativos";

    public HangmanException(String message) {
        super(message);
    }
}