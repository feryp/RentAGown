package com.example.rentagown.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Model.InvoiceHistory;
import com.example.rentagown.R;
import com.example.rentagown.ViewHolder.InvoiceHistoryViewHolder;

import java.util.List;

public class InvoiceHistoryAdapter extends RecyclerView.Adapter<InvoiceHistoryViewHolder> {

    private List<InvoiceHistory> invoiceHistoryList;
    Context mContext;

    public InvoiceHistoryAdapter(List<InvoiceHistory> invoiceHistoryList, Context mContext) {
        this.invoiceHistoryList = invoiceHistoryList;
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public InvoiceHistoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_invoice_history,parent, false);
        return new InvoiceHistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InvoiceHistoryViewHolder holder, int position) {
        holder.tv_id_invoice.setText(invoiceHistoryList.get(position).getIdInvoice());
        holder.tv_price_invoice.setText(invoiceHistoryList.get(position).getPriceInvoice());
        holder.tv_status_incvoice.setText(invoiceHistoryList.get(position).getStatusInvoice());
        holder.tv_time_invoice.setText(invoiceHistoryList.get(position).getTimeInvoice());
        holder.tv_date_invoice.setText(invoiceHistoryList.get(position).getDateInvoice());
    }

    @Override
    public int getItemCount() {
        return invoiceHistoryList.size();
    }
}
