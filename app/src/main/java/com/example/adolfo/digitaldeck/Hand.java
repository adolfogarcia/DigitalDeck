package com.example.adolfo.digitaldeck;

import android.view.View;

import java.util.List;

/**
 * Created by Adolfo on 3/20/2018.
 */

public class Hand {
    List<handCard> mHand;
    //int mHandSize;
   // static final int HAND_SIZE = 5;

    Hand()
    {
    }

    public void add(Card newCard)
    {
        handCard newHandCard = new handCard(newCard, mHand.size());
        mHand.add(newHandCard);
    }

    public void removeCard(View v)
    {

    }

    public String toString()
    {
        String returnStr = "";
        for (handCard handCard : mHand) {
            returnStr += handCard.toString() + '\n';
        }
        return returnStr;
    }

}


