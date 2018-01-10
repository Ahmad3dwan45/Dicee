package com.ahmadedwan.dicee;

import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollButton;
        rollButton = (Button) findViewById(R.id.rollButton);

        final TextView totalView = (TextView) findViewById(R.id.total);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);

        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int[] diceArray = { R.drawable.dice1,
                            R.drawable.dice2,
                            R.drawable.dice3,
                            R.drawable.dice4,
                            R.drawable.dice5,
                            R.drawable.dice6};


        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int total = 0;
                Log.d( "Dicee", "Zee button has been pressed! ");

                Random randomNumGen = new Random();

                int num = randomNumGen.nextInt(6);

                leftDice.setImageResource(diceArray[num]);
                total = total+ num + 1 ;

                num = randomNumGen.nextInt(6);


                rightDice.setImageResource(diceArray[num]);
                total = total+ num + 1 ;
                totalView.setText(String.valueOf(total));
                Log.d("Total", "This is the total:" + total );
            }
        });
    }
}
