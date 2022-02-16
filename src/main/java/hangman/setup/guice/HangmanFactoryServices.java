/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hangman.setup.guice;

/**
 *
 * @author 2106913
 */

import hangman.model.French;
import hangman.model.GameScore;
import hangman.model.Language;
import hangman.model.PowerScore;
import hangman.model.Spanish;
import hangman.model.dictionary.HangmanDictionary;
import hangman.model.dictionary.SpanishDictionaryDataSource;
import hangman.model.dictionary.FrenchDictionaryDataSource;
import hangman.view.HangmanNoviolentoPanel;
import hangman.view.HangmanPanel;

public class HangmanFactoryServices extends com.google.inject.AbstractModule {

    @Override
    protected void configure() {
        bind(GameScore.class).to(PowerScore.class);
        bind(Language.class).to(Spanish.class);
        bind(HangmanPanel.class).to(HangmanNoviolentoPanel.class);
        bind(HangmanDictionary.class).to(SpanishDictionaryDataSource.class);
    }

}
