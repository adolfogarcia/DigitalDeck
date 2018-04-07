package com.example.adolfo.digitaldeck;

/**
 * Created by Adolfo on 4/6/2018.
 */

public class handCard extends Card {
    int handPosition;

    handCard() {
        super();
        mSuit = Suit.NONE;
        mFace = Face.NONE;
        isDrawn = false;
        handPosition = 0;
    }

    public handCard(Card baseCard, int pos) {
        super();
        this.mSuit = baseCard.mSuit;
        this.mFace = baseCard.mFace;
        this.isDrawn = baseCard.isDrawn;
        handPosition = pos;
    }
}
