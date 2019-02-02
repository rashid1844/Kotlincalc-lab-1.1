package com.example.kotlincalc



import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button;
import android.widget.TextView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.view.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val one: Button = findViewById(R.id.button1);
        val two: Button = findViewById(R.id.button2);
        val three: Button = findViewById(R.id.button3);
        val four: Button = findViewById(R.id.button4);
        val five: Button = findViewById(R.id.button5);
        val six: Button = findViewById(R.id.button6);
        val seven: Button = findViewById(R.id.button7);
        val eight: Button = findViewById(R.id.button8);
        val nine: Button = findViewById(R.id.button9);
        val zero: Button = findViewById(R.id.button0);
        val add: Button = findViewById(R.id.buttonadd);
        val sub: Button = findViewById(R.id.buttonsub);
        val mult: Button = findViewById(R.id.buttonmult);
        val divide: Button = findViewById(R.id.buttondivide);
        val equal: Button = findViewById(R.id.buttonequal);
        val clear: Button = findViewById(R.id.buttonclear);


        val output: TextView = findViewById(R.id.output);





        one.setOnClickListener{ output.setText(output.getText().toString() + "1"); }
        two.setOnClickListener{ output.setText(output.getText().toString() + "2"); }
        three.setOnClickListener{ output.setText(output.getText().toString() + "3"); }
        four.setOnClickListener{ output.setText(output.getText().toString() + "4"); }
        five.setOnClickListener{ output.setText(output.getText().toString() + "5"); }
        six.setOnClickListener{ output.setText(output.getText().toString() + "6"); }
        seven.setOnClickListener{ output.setText(output.getText().toString() + "7"); }
        eight.setOnClickListener{ output.setText(output.getText().toString() + "8"); }
        nine.setOnClickListener{ output.setText(output.getText().toString() + "9"); }
        zero.setOnClickListener{ output.setText(output.getText().toString() + "0"); }
        add.setOnClickListener{ output.setText(output.getText().toString() + "+"); }
        sub.setOnClickListener{ output.setText(output.getText().toString() + "-"); }
        mult.setOnClickListener{ output.setText(output.getText().toString() + "*"); }
        divide.setOnClickListener{ output.setText(output.getText().toString() + "/"); }

        clear.setOnClickListener{ output.setText(""); }

        equal.setOnClickListener{






        }


















    }
}
