package hangman.model;
public class BonusScore implements GameScore{
    /** 
    @pre El juego inicia en 0 puntos.
    @pos Se bonifica con 10 puntos cada letra correctas - Se penaliza con 5 puntos cada letra incorrecta.
    @param  correctCount - incorrectCount
    @throws Si el puntaje es menor a 0 genera una exepcion
     */
    public int calculateScore(int correctCount, int incorrectCount) throws HangmanException{
                int score;
                if(CorrectCount < 0 || IncorrectCount < 0) {throw new HangmanException(HangmanException.INVALID_PARAMETERS);}
                score = 0;
                if(correctCount >0 && incorrectCount =0){
                    score += correctCount * 10;
                }
                if(correctCount >0 && incorrectCount < correctCount){
                     score += correctCount * 10 - incorrectCount * 5;
                }
                if(correctCount >0 && incorrectCount >= correctCount*2){
                    score = 0; 
                }
                if  (score < 0){    
                     score = 0;            
                 }
                return score;
            }
}
