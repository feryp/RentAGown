package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Interface.ItemClickListener;
import com.example.rentagown.Model.InvoiceHistory;
import com.example.rentagown.R;

public class InvoiceHistoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView tv_id_invoice, tv_price_invoice, tv_status_incvoice, tv_time_invoice, tv_date_invoice;

    private InvoiceHistory invoiceHistory;

    private ItemClickListener itemClickListener;
    private View.OnClickListener onClickListener;

    public InvoiceHistoryViewHolder(@NonNull View itemView) {
        super(itemView);

        tv_id_invoice = itemView.findViewById(R.id.tv_id_invoice_history);
        tv_price_invoice = itemView.findViewById(R.id.tv_price_invoice_history);
        tv_status_incvoice = itemView.findViewById(R.id.tv_status_invoice_history);
        tv_time_invoice = itemView.findViewById(R.id.tv_time_invoice_history);
        tv_date_invoice = itemView.findViewById(R.id.tv_date_invoice_history);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
