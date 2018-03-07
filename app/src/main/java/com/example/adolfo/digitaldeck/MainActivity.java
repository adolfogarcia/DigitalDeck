package com.example.adolfo.digitaldeck;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends Activity {
    Deck mDeck = new Deck();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
      //  this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);



    }

    public void hitMe(View v)
    {
        TextView textBox = (TextView) findViewById(R.id.textView1);
        textBox.setText("About to shuffle!");

        textBox.setText(mDeck.drawCard());
        textBox.append('\n'+ Integer.toString(mDeck.topOfDeck));
    }


}
