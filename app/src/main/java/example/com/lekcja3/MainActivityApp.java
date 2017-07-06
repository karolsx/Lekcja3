package example.com.lekcja3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivityApp extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("pryzcisk1");
            }
        });
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("przycisk2");
            }
        });
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView);
                textView.setText("przycisk3");
            }
        });
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView textView = (TextView) findViewById(R.id.textView2);
                EditText edit1 = (EditText) findViewById(R.id.editText1);
                EditText edit2 = (EditText) findViewById(R.id.editText2);
                textView.setText(edit1.getText()+" "+edit2.getText());
            }
        });

        Button button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context, Obrazek.class);
                startActivity(intent);
            }
        });

    }
}

