package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.ChangeAddress;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.ChangeAddressViewHolder;

import java.util.List;

public class ChangeAddressAdapter extends RecyclerView.Adapter<ChangeAddressViewHolder> {

    private List<ChangeAddress> changeAddressList;
    Context context;

    public ChangeAddressAdapter(List<ChangeAddress> changeAddressList, Context context) {
        this.changeAddressList = changeAddressList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChangeAddressViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_address,parent,false);
        return new ChangeAddressViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ChangeAddressViewHolder holder, int position) {
        holder.tvLabelAddress.setText(changeAddressList.get(position).getLabelAddress());
        holder.tvName.setText(changeAddressList.get(position).getName());
        holder.tvNoHp.setText(changeAddressList.get(position).getNoHandphone());
        holder.tvDetailAddress.setText(changeAddressList.get(position).getDetailAddress());
    }

    @Override
    public int getItemCount() {
        return changeAddressList.size();
    }
}
