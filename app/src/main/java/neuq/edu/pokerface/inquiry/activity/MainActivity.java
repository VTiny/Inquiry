package neuq.edu.pokerface.inquiry.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import neuq.edu.pokerface.inquiry.R;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button telButton = (Button) findViewById(R.id.btn_tel_main);
        telButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TelActivity.class);
                startActivity(intent);
            }
        });

        Button weatherButton = (Button) findViewById(R.id.btn_weather_main);
        weatherButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, WeatherActivity.class);
                startActivity(intent);
            }
        });

        Button movieButton = (Button) findViewById(R.id.btn_movie_main);
        movieButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MovieActivity.class);
                startActivity(intent);
            }
        });

        Button ipButton = (Button) findViewById(R.id.btn_ip_main);
        ipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, IpActivity.class);
                startActivity(intent);
            }
        });

        Button appleButton = (Button) findViewById(R.id.btn_apple_main);
        appleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AppleActivity.class);
                startActivity(intent);
            }
        });

    }


}
