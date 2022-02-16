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
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
        int score=0;
        if(correctCount < 0 || incorrectCount < 0) {throw new HangmanException(HangmanException.INVALID_PARAMETERS);}
        score = 0;
        if(correctCount > 0){
                for (int i = 0; i < correctCount; i++){

                    score += Math.pow(5, i+1);
                }
        }
        if(incorrectCount>0){
            score -= 8 * incorrectCount;
        }
        if(correctCount>0 && incorrectCount>0){
            for (int i = 0; i < correctCount; i++){

                    score += Math.pow(5, i+1);
                }
            score -= 8 * incorrectCount;  
        }
        if(score > 500){
            score = 500;
        }
        if  (score < 0){    
            score = 0;            
        }
                return score;
    }
}