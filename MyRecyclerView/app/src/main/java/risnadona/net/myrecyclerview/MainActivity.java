package risnadona.net.myrecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPlayers;
    private ArrayList<Player> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPlayers = findViewById(R.id.rv_player);
        rvPlayers.setHasFixedSize(true);

        list.addAll(PlayersData.getListData());
        showRecyclerList();
    }
    private void showRecyclerList(){
        rvPlayers.setLayoutManager(new LinearLayoutManager(this));
        ListPlayerAdapter listPlayerAdapter = new ListPlayerAdapter(list);
        rvPlayers.setAdapter(listPlayerAdapter);
    }
}
