package com.example.rentagown.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.DetailPromoActivity;
import com.example.rentagown.Model.Promo;
import com.example.rentagown.PromoActivity;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.PromoViewHolder;
import com.example.rentagown.ViewProductActivity;

import java.util.List;

public class PromoAdapter extends RecyclerView.Adapter<PromoViewHolder>{

    private Context mContext;
    private List<Promo> promoList;

    public PromoAdapter(Context mContext, List<Promo> promoList) {
        this.mContext = mContext;
        this.promoList = promoList;
    }

    @NonNull
    @Override
    public PromoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_promo_list,parent,false);
        return new PromoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PromoViewHolder holder, int position) {
        holder.imPromoList.setImageResource(promoList.get(position).getImPromo());
        holder.tvTitlePromoList.setText(promoList.get(position).getTitle());
        holder.tvDescPromoList.setText(promoList.get(position).getDesc());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Product",Toast.LENGTH_SHORT).show();
                Intent detailPromo = new Intent(mContext, DetailPromoActivity.class);
                mContext.startActivity(detailPromo);
            }
        });
    }

    @Override
    public int getItemCount() {
        return promoList.size();
    }
}
