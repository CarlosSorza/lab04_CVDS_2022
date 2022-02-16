package hangman;

import org.junit.Assert;
import org.junit.Test;
import hangman.model.BonusScore;
import hangman.model.GameScore;
import hangman.model.HangmanException;
import hangman.model.OriginalScore;
import hangman.model.PowerScore;

public class GameScoreTest{
	GameScore game;
	

    @Test
    public void menor_OriginalScore() {
    	game = new OriginalScore();
        try{
        	game.calculateScore(-1,1);
            Assert.assertTrue(false);   
        }
        catch(HangmanException e){

        	Assert.assertTrue(true);
        }
    }

    @Test
   public void datoscorrectos_OriginalScore() {
    	game = new OriginalScore();
        int numero = 0;
        try {
			numero = game.calculateScore(1,1);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Assert.assertEquals(90,numero);    


    }
    

    @Test
    public void noletrasCorre_OriginalScore() {
    	game = new OriginalScore();
        int numero = 0;
        try {
			numero = game.calculateScore(1,0);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Assert.assertEquals(100,numero);       
  
    }

    /* Bonus Score */

    @Test
    public void menor_BonusScore() {
    	game = new BonusScore();
        try{
        	game.calculateScore(-1,1);
            Assert.assertTrue(false);   
        }
        catch(HangmanException e){

        	Assert.assertTrue(true);
        }

    }

    @Test
    public void datosCorre_BonusScore() {
    	game = new BonusScore();
        int numero = 0;
        try {
			numero = game.calculateScore(1,1);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Assert.assertEquals(0,numero);   

    }

    @Test
    public void noletrasCorre_BonusScore() {
    	game = new BonusScore();
        int numero = 0;
        try {
			numero = game.calculateScore(0,2);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Assert.assertEquals(0,numero);   

    }


    /* Power Bonus Score */

    @Test
    public void points_PowerScore() {
    	game = new PowerScore();
        try{
        	game.calculateScore(-1,1);
            Assert.assertTrue(false);   
        }
        catch(HangmanException e){
        	Assert.assertTrue(true);
        }

    }

    @Test
    public void Bonus_PowerScore() {
    	game = new PowerScore();
        int numero = 0;
        try {
			numero = game.calculateScore(3,0);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Assert.assertEquals(155,numero);   

    }

    @Test
    public void CorreYIncoree_PowerScore() {
    	game = new PowerScore();
        int numero = 0;
        try {
			numero = game.calculateScore(3,10);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Assert.assertEquals(150,numero);   

    }

    @Test
    public void fueraScore_PowerScore() {
    	game = new PowerScore();
        int numero = 0;
        try {
			numero = game.calculateScore(0,1);
		} catch (HangmanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        Assert.assertEquals(0,numero);   

    }
}