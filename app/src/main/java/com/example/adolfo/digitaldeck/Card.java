package com.example.adolfo.digitaldeck;

import java.util.Comparator;

/**
 * Created by Adolfo on 3/6/2018.
 */

public class Card implements Comparable<Card> {
    public Suit mSuit = Suit.NONE;
    public Face  mFace = Face.NONE;
    public boolean isDrawn = false;

    Card()
    {
        mSuit = Suit.NONE;
        mFace = Face.NONE;
        isDrawn = false;
    }

    //Copy Constructor
    Card(Card copy)
    {
        this.mSuit = copy.mSuit;
        this.mFace = copy.mFace;
        this.isDrawn = copy.isDrawn;
    }

    Card(Suit newSuit, Face newFace)
    {
        mSuit = newSuit;
        mFace = newFace;
    }

    public Suit getSuit()
    {
        return mSuit;
    }

    public Face getFace()
    {
        return mFace;
    }

    public String toString()
    {
        return mFace.name() + " of " + mSuit.name();
    }

    public int compareTo(Card rhs)
    {
        if(this.mFace.ordinal() < rhs.mFace.ordinal())
        {
          // this card is less than the card on the rhs
            return -1;
        }
        else  if(this.mFace.ordinal() > rhs.mFace.ordinal())
        {
            // this card is greater than the card on the lhs
            return 1;
        }
        else if (this.mFace.ordinal() == rhs.mFace.ordinal())
            return 0;
        return 0;
    }





}


