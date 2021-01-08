package com.example.rentagown.ViewHolder;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.rentagown.R;

public class ChangeAddressViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

    public TextView tvLabelAddress;
    public TextView tvName;
    public TextView tvNoHp;
    public TextView tvDetailAddress;
    public Button btnChooseAddress;
    public ImageButton editAddress;
    public ImageButton deleteAddress;

    public ChangeAddressViewHolder(@NonNull View itemView) {
        super(itemView);

        tvLabelAddress = itemView.findViewById(R.id.tv_label_address);
        tvName = itemView.findViewById(R.id.tv_name_address);
        tvNoHp = itemView.findViewById(R.id.tv_nohp_address);
        tvDetailAddress = itemView.findViewById(R.id.tv_detail_address);
        btnChooseAddress = itemView.findViewById(R.id.btn_choose_address);
        editAddress = itemView.findViewById(R.id.im_edit_address);
        deleteAddress = itemView.findViewById(R.id.im_delete_address);

        btnChooseAddress.setOnClickListener(this);
        editAddress.setOnClickListener(this);
        deleteAddress.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_choose_address:
                Toast.makeText(v.getContext(),"Choose",Toast.LENGTH_SHORT).show();
//                //clear state
//                btnChooseAddress.setSelected(false);
//                btnChooseAddress.setPressed(true);
//
//                //change state
//                btnChooseAddress.setSelected(true);
//                btnChooseAddress.setPressed(false);
                break;

            case R.id.im_edit_address:
                Toast.makeText(v.getContext(),"Edit",Toast.LENGTH_SHORT).show();
                break;

            case R.id.im_delete_address:
                Toast.makeText(v.getContext(),"Delete",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
