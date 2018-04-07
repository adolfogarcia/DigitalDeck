package com.example.adolfo.digitaldeck;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.PopupMenu;
import android.widget.Toast;

import java.util.LinkedList;
import java.util.List;

import static android.app.PendingIntent.getActivity;

/**
 * Created by Adolfo on 3/20/2018.
 */

public class Hand {
    List<handCard> mHand;
    //int mHandSize;
    static final int HAND_SIZE = 5;

    Hand()
    {
        mHand = new LinkedList<handCard>();

    }

    public void add(Context c , Deck deck)
    {
        if(mHand.size() < HAND_SIZE)
        {
            handCard newHandCard = new handCard(deck.drawCard(), mHand.size() + 1);
            mHand.add(newHandCard);
        }
        else
        {

            Toast.makeText(c,"ERROR! Hand is full!", Toast.LENGTH_LONG).show();
        }
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


