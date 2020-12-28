package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.Interface.ItemClickListener;
import com.example.rentagown.Model.InvoiceHistory;
import com.example.rentagown.R;

public class InvoiceHistoryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    public TextView tvIdInvoice, tvPriceInvoice, tvStatusIncvoice, tvTimeInvoice, tvDateInvoice;

    private InvoiceHistory invoiceHistory;

    private ItemClickListener itemClickListener;
    private View.OnClickListener onClickListener;

    public InvoiceHistoryViewHolder(@NonNull View itemView) {
        super(itemView);

        tvIdInvoice = itemView.findViewById(R.id.tv_id_invoice_history);
        tvPriceInvoice = itemView.findViewById(R.id.tv_price_invoice_history);
        tvStatusIncvoice = itemView.findViewById(R.id.tv_status_invoice_history);
        tvTimeInvoice = itemView.findViewById(R.id.tv_time_invoice_history);
        tvDateInvoice = itemView.findViewById(R.id.tv_date_invoice_history);

        itemView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }
}
