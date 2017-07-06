package example.com.lekcja3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Obrazek extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.obrazek);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context;
                context = getApplicationContext();
                Intent intent = new Intent(context, MainActivityApp.class);
                startActivity(intent);
            }
        });
    }

    public void zmienObrazek(View v) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.mipmap.android2);
    }
    public void poprzedniObrazek(View v) {
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.mipmap.android);
    }

}
