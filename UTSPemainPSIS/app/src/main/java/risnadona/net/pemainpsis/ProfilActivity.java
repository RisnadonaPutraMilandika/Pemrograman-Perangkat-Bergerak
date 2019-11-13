package risnadona.net.pemainpsis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.MenuItem;

public class ProfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_profil);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Profil Saya");
        }
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final Drawable balik = ContextCompat.getDrawable(this, R.drawable.ic_arrow_back_white_24dp);
        balik.setColorFilter(ContextCompat.getColor(this, R.color.putih), PorterDuff.Mode.SRC_ATOP);
        getSupportActionBar().setHomeAsUpIndicator(balik);


    }
    public boolean onOptionsItemSelected(MenuItem mt){
        finish();
        return super.onOptionsItemSelected(mt);
    }

}
