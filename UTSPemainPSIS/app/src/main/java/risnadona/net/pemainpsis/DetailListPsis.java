package risnadona.net.pemainpsis;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;
import java.util.List;

public class DetailListPsis extends AppCompatActivity {
    private int psis_id;
    ImageView imgDetail;
    TextView tvName, tvDesc;
    private ArrayList<Psis> listPsis = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_list_psis);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Biodata Pemain");

        psis_id = getIntent().getIntExtra("psis_id",0);
        tvName = findViewById(R.id.nama_psis);
        tvDesc = findViewById(R.id.desc_detail);
        imgDetail = findViewById(R.id.img_detail);

        listPsis.addAll(PsisData.getListData());
        setTitleLayout();
        setLayout();
    }}

    void setLayout(){
        tvName.setText(listPsis.get(psis_id).getName());
        tvDesc.setText(listPsis.get(psis_id).getDescription());
        Glide.with(this)
                .load(listPsis.get(psis_id).getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(imgDetail);
    }

    public void setTitleLayout(){
        getSupportActionBar().setTitle(listPsis.get(psis_id).getName());
    }
}
