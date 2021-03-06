package hangman.model;
public class OriginalScore implements GameScore{
    /** 
    @pre Es el esquema actual, se inicia con 100 puntos.
    @pos No se bonifican las letras correctas -Se penaliza con 10 puntos con cada letra incorrecta.
    @param  correctCount - incorrectCount
    @throws Si el puntaje es menor a 0 genera una exepcion
     */
    public int calculateScore(int correctCount, int incorrectCount)throws HangmanException{
        int score=100;
        if(correctCount < 0 || incorrectCount < 0) {throw new HangmanException(HangmanException.INVALID_PARAMETERS);}
        score = 100;
        if(incorrectCount > 0 ){
            score -= incorrectCount * 10;
        }
        if  (score < 0){    
            score = 0;            
        }
        return score;
    }
}