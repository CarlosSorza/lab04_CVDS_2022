package hangman.model;
public class GameScoreTest{
        /**
        
        Original Score
                        Clase de equivalencia 		               		        Resultado
        # Letras correctas	     # Letras Incorrectas
        	   < 0		       			                                        Incorrecto
        		                       < 0	      		                        Incorrecto
        	  lc >= 0	                 0	                        		    100
        	  lc > 0	        li > 0  ^ li < 11	         		            100 - (10 * li)
        	  lc > 0	               li > 11	                       			    0
        */

        /**
        Bonus Score
                        Clase de equivalencia 		                        Resultado
        # Letras correctas	    # Letras Incorrectas
        	 < 0 		                                                	Incorrecto
        		                     < 0 	                          		Incorrecto
        	lc >= 0 	               0	                             	lc * 10
        	lc > 0 	             	    li < lc 	                     	(lc * 10) - (li * 5)
        	lc > 0 	                    li >= lc * 2 	                     0
        */

        /**
        
        Power Score
                            Clase de equivalencia 		                        Resultado
        # Letras correctas	    # Letras Incorrectas
        	< 0 		                                            			Incorrecto
        		                     < 0	                           		    Incorrecto
        	lc > 0 	                       0	                        		5^i i es la poscicion de la letra
        	  0	                    li > 0 	                            		0
        	lc >= 4 	               0	                                	500
        	lc > 1	                    li > 0 	                   			    5^i - (8*li) donde i es la poscicion de la letra
        */
        @Test

    public void menor_OriginalScore() {
        score = new OriginalScore();
        try{
            score.calculateScore(-1,1);
            Assert.AssertTrue(false));   
        }
        catch(HangmanException e){

            AssertTrue(true);
        }
    }

    @Test
   public void datoscorrectos_OriginalScore() {
        score = new OriginalScore();
        int numero = 0;
        numero = score.calculateScore(1,1);
        Assert.assertEquals(90,numero);    


    }
    }

    @Test
    public void noletrasCorre_OriginalScore() {
        score = new OriginalScore();
        int numero = 0;
        numero = score.calculateScore(1,0);
        Assert.assertEquals(100,numero);       
  
    }

    /* Bonus Score */

    @Test
    public void menor_BonusScore() {
        score = new BonusScore();
        try{
            score.calculateScore(-1,1);
            Assert.AssertTrue(false));   
        }
        catch(HangmanException e){

            AssertTrue(true);
        }

    }

    @Test
    public void datosCorre_BonusScore() {
        score = new BonusScore();
        int numero = 0;
        numero = score.calculateScore(1,1);
        Assert.assertEquals(5,numero);   

    }

    @Test
    public void noletrasCorre_BonusScore() {
        score = new BonusScore();
        int numero = 0;
        numero = score.calculateScore(0,2);
        Assert.assertEquals(0,numero);   

    }


    /* Power Bonus Score */

    @Test
    public void points_PowerScore() {
        score = new PowerScore();
        try{
            score.calculateScore(-1,1);
            Assert.AssertTrue(false));   
        }
        catch(HangmanException e){
            AssertTrue(true);
        }

    }

    @Test
    public void Bonus_PowerScore() {
        score = new PowerScore();
        int numero = 0;
        numero = score.calculateScore(3,0);
        Assert.assertEquals(155,numero);   

    }

    @Test
    public void CorreYIncoree_PowerScore() {
        score = new PowerScore();
        int numero = 0;
        numero = score.calculateScore(3,10);
        Assert.assertEquals(45,numero);   

    }

    @Test
    public void fueraScore_PowerScore() {
        score = new PowerScore();
        int numero = 0;
        numero = score.calculateScore(0,1);
        Assert.assertEquals(0,numero);   

    }
}