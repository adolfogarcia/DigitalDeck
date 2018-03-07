package com.example.adolfo.digitaldeck;

import java.util.Random;

import static java.util.Collections.swap;

/**
 * Created by Adolfo on 3/6/2018.
 */


public class Deck {
    Card []mDeck;
    int topOfDeck;
    static final int DECK_SIZE = 52;

    Deck()
    {
        mDeck = new Card[DECK_SIZE];
        for(int i = 0; i < DECK_SIZE; i++)
        {
            mDeck[i] = new Card();
        }
        topOfDeck = 1;
        this.shuffleDeck();
    }

    // set Deck back in order; all cards go back into deck
    private void setDeck()
    {
        topOfDeck = 0;
        int x = 0;
        Face[] faces = Face.values();
        Suit[] suits = Suit.values();

        for (int suit = 1; suit < 5; suit++)
        {
            for (int face = 2; face < 15; face++)
            {
                mDeck[x].mFace = faces[face];
                mDeck[x].mSuit = suits[suit];
                x++;
            }
        }

    }

    private void shuffleDeck()
    {
        Random rand = new Random();
        this.setDeck();
        for(int x =0; x < DECK_SIZE; x++)
        {
            int i = rand.nextInt(52 - x) + x;

            Card temp = mDeck[x];
            mDeck[x] = mDeck[i];
            mDeck[i] = temp;
        }
    }

    public String toString()
    {
        String returnStr = "";

        for(Card x : mDeck)
            returnStr += x.toString() + '\n';

        return returnStr;
    }

}
