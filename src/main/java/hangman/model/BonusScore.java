package hangman.model;
public class BonusScore implements GameScore{
    /** 
    @pre El juego inicia en 0 puntos.
    @pos Se bonifica con 10 puntos cada letra correctas - Se penaliza con 5 puntos cada letra incorrecta.
    @param  correctCount - incorrectCount
    @throws Si el puntaje es menor a 0 genera una exepcion
     */
    public int calculateScore(int correctCount, int incorrectCount){

    }
}