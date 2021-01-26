package com.example.rentagown.Adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.DetailBookingActivity;
import com.example.rentagown.InvoiceActivity;
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
        holder.tvIdInvoice.setText(invoiceHistoryList.get(position).getIdInvoice());
        holder.tvPriceInvoice.setText(invoiceHistoryList.get(position).getPriceInvoice());
        holder.tvStatusIncvoice.setText(invoiceHistoryList.get(position).getStatusInvoice());
        holder.tvTimeInvoice.setText(invoiceHistoryList.get(position).getTimeInvoice());
        holder.tvDateInvoice.setText(invoiceHistoryList.get(position).getDateInvoice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(v.getContext(),"Invoice",Toast.LENGTH_SHORT).show();
                Intent invoice = new Intent(v.getContext(), InvoiceActivity.class);
                v.getContext().startActivity(invoice);
            }
        });
    }

    @Override
    public int getItemCount() {
        return invoiceHistoryList.size();
    }
}
