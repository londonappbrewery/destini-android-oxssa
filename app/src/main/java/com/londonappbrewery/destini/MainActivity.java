package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView T;
    Button Answ1;
    Button Answ2;
    boolean btnt, btnb; // button top and bottom
    String pos="T1"; //possision


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:

        T = (TextView) findViewById(R.id.storyTextView);
        Answ1 = (Button) findViewById(R.id.buttonTop);
        Answ2 = (Button) findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        Answ1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnt = true;
                finder ();
                btnt=false;


            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        Answ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnb = true;
                finder ();
                btnb=false;

            }
        });


    }

    public void finder (){

        if (pos=="T1" && btnt==true){
            T.setText(R.string.T3_Story);
            Answ1.setText(R.string.T3_Ans1);
            Answ2.setText(R.string.T3_Ans2);
            pos="T3";
        }
        else if(pos=="T1" && btnb==true){
            T.setText(R.string.T2_Story);
            Answ1.setText(R.string.T2_Ans1);
            Answ2.setText(R.string.T2_Ans2);
            pos="T2";
        }
        else if(pos=="T3" && btnt==true){
            T.setText(R.string.T6_End);
            Answ1.setVisibility(View.GONE);
            Answ2.setVisibility(View.GONE);
        }
        else if(pos=="T3" && btnb==true){
            T.setText(R.string.T5_End);
            Answ1.setVisibility(View.GONE);
            Answ2.setVisibility(View.GONE);
        }
        else if(pos=="T2" && btnb==true){
            T.setText(R.string.T4_End);
            Answ1.setVisibility(View.GONE);
            Answ2.setVisibility(View.GONE);
        }
        else if(pos=="T2" && btnt==true){
            T.setText(R.string.T3_Story);
            Answ1.setText(R.string.T3_Ans1);
            Answ2.setText(R.string.T3_Ans2);
            pos="T3b";
        }
        else if(pos=="T3b" && btnt==true){
            T.setText(R.string.T6_End);
            Answ1.setVisibility(View.GONE);
            Answ2.setVisibility(View.GONE);
        }
        else if(pos=="T3b" && btnb==true){
            T.setText(R.string.T5_End);
            Answ1.setVisibility(View.GONE);
            Answ2.setVisibility(View.GONE);
        }
    }


}
