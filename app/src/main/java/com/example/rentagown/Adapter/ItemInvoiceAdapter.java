package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.Invoice;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.ItemInvoiceViewHolder;

import java.util.List;

public class ItemInvoiceAdapter extends RecyclerView.Adapter<ItemInvoiceViewHolder> {

    private Context mContext;
    private List<Invoice> invoiceList;

    public ItemInvoiceAdapter(Context mContext, List<Invoice> invoiceList) {
        this.mContext = mContext;
        this.invoiceList = invoiceList;
    }

    @NonNull
    @Override
    public ItemInvoiceViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_invoice,parent,false);
        return new ItemInvoiceViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemInvoiceViewHolder holder, int position) {
        holder.tvItemName.setText(invoiceList.get(position).getItemName());
        holder.tvPrice.setText(invoiceList.get(position).getPrice());
    }

    @Override
    public int getItemCount() {
        return invoiceList.size();
    }
}
