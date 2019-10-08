package risnadona.net.myviewandviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btn_donasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_donasi = findViewById(R.id.btnDonasi);
        btn_donasi.setOnClickListener(this);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Donasi Pesawat R80");
        }
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnDonasi:
                Intent moveIntent = new Intent(MainActivity.this, DonasiActivity.class);
                startActivity(moveIntent);
                break;
        }
    }
}
