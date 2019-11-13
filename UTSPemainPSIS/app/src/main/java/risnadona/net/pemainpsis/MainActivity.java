package risnadona.net.pemainpsis;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuInflater;


import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvPsis;
    private ArrayList<Psis> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Pemain PSIS 2019");
        }

        rvPsis = findViewById(R.id.rv_psis);
        rvPsis.setHasFixedSize(true);

        list.addAll(PsisData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvPsis.setLayoutManager(new LinearLayoutManager(this));
        CardPsisAdapter cardPsisAdapter = new CardPsisAdapter(this, list);
        rvPsis.setAdapter(cardPsisAdapter);
    }
    //@Override

    //public boolean onOptionsItemSelected(MenuItem item) {
     //   setMode(item.getItemId());
       // return super.onOptionsItemSelected(item);
    //}
    //public void setMode(int selectedMode) {
      //  switch (selectedMode) {

        //    case R.id.action_profil:
          //      Intent profilactivity = new Intent(this, ProfilActivity.class);
         //       startActivity(profilactivity);
        //        break;
      //  }
    //}

    @Override
    public boolean onCreateOptionsMenu(Menu mn){
        getMenuInflater().inflate(R.menu.menu_main, mn);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        if(item.getItemId()==R.id.action_profil){
            Intent profil = new Intent(this, ProfilActivity.class);
            startActivity(profil);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
