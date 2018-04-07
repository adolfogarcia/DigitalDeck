package com.example.adolfo.digitaldeck;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;

public class MainActivity extends Activity {
    Deck mDeck = new Deck();
    Hand mHand = new Hand();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
      //  this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        /// Make hand view scrollable
        TextView handTV = (TextView) findViewById(R.id.handTextView);
        handTV.setMovementMethod(new ScrollingMovementMethod());

    }



    public void hitMe(View v)
    {
        TextView textBox = (TextView) findViewById(R.id.handTextView);

        mHand.add(this.getBaseContext(), mDeck);
        textBox.setText(mHand.toString());
    }




}
