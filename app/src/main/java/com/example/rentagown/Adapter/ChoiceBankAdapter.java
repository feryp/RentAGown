package com.example.rentagown.Adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Interface.OnMyListItemClick;
import com.example.rentagown.Model.Bank;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.ChoiceBankViewHolder;

import java.util.List;

public class ChoiceBankAdapter extends RecyclerView.Adapter<ChoiceBankViewHolder> {

    private List<Bank> bankList;
    Context context;

    //Here is current selection position
    private int mSelectedPosition = -1;
    private OnMyListItemClick mOnMainMenuClickListener = OnMyListItemClick.NULL;

    public ChoiceBankAdapter(List<Bank> bankList, Context context) {
        this.bankList = bankList;
        this.context = context;
    }

    @NonNull
    @Override
    public ChoiceBankViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_bank,parent,false);
        final ChoiceBankViewHolder result = new ChoiceBankViewHolder(view);
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //here you set your current position from holder of clicked view
                mSelectedPosition = result.getAdapterPosition();

                //here you pass object from your list - item value which you clicked
                mOnMainMenuClickListener.onMyListItemClick(bankList.get(mSelectedPosition));

                //here you inform view that something was change - view will be invalidated
                notifyDataSetChanged();
            }
        });

        return result;
    }

    @Override
    public void onBindViewHolder(@NonNull ChoiceBankViewHolder holder, int position) {

        holder.imLogoBank.setImageResource(bankList.get(position).getLogoBank());
        holder.tvNameBank.setText(bankList.get(position).getNameBank());
        holder.tvAccountNameBank.setText(bankList.get(position).getAccountNameBank());
        holder.tvAccountNumberBank.setText(bankList.get(position).getAccountNumberBank());

        holder.bind(bankList);
        if (mSelectedPosition == position){
            holder.itemView.setBackgroundColor(Color.parseColor("#FAE6AB"));
        } else {
            holder.itemView.setBackgroundColor(Color.parseColor("#FFFFFF"));
            holder.itemView.setBackgroundResource(R.drawable.border_bottom);
        }
    }

    @Override
    public int getItemCount() {
        return bankList.size();
    }

    // you can create your own listener which you set for adapter
    public void setOnMainMenuClickListener(OnMyListItemClick onMyListItemClick) {
        mOnMainMenuClickListener = onMyListItemClick == null ? OnMyListItemClick.NULL : onMyListItemClick;
    }

}
