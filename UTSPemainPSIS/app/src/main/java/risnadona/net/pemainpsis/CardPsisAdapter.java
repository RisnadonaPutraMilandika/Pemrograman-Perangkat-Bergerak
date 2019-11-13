package risnadona.net.pemainpsis;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class CardPsisAdapter extends RecyclerView.Adapter<CardPsisAdapter.ListViewHolder> {
    private ArrayList<Psis> listPsis;
    private Context context;


    public CardPsisAdapter(Context context, ArrayList<Psis> listPsis){
        this.listPsis = listPsis;
        this.context = context;
    }

    

    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_psis, parent, false);
        return new ListViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Psis psis = listPsis.get(position);
        Glide.with(holder.itemView.getContext())
                .load(psis.getPhoto())
                .apply(new RequestOptions().fitCenter())
                .into(holder.imgphoto);

        holder.tvName.setText(psis.getName());
        holder.tvDesc.setText(psis.getDescription());
        holder.cv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent detail = new Intent(context, DetailListPsis.class);
                detail.putExtra("psis_id", psis.getId());
                context.startActivity(detail);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listPsis.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgphoto;
        TextView tvName, tvDesc;
        CardView cv;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgphoto = itemView.findViewById(R.id.img_psis_list);
            tvName = itemView.findViewById(R.id.name_list_psis);
            tvDesc = itemView.findViewById(R.id.desc_psis_list);
            cv = itemView.findViewById(R.id.cardview_item);
        }
    }
}
