package hangman.model;
public class PowerScore implements GameScore{
        /** 
    @pre El juego inicia en 0 puntos.
    @pos La $i-ésima$ letra correcta se bonifica con $5^i$.
         Se penaliza con 8 puntos cada letra incorrecta.
        Si con las reglas anteriores sobrepasa 500 puntos, el puntaje es 500.
    @param  correctCount - incorrectCount
    @throws Si el puntaje es menor a 0 genera una exepcion
     */
    public int calculateScore(int correctCount, int incorrectCount){

    }
}