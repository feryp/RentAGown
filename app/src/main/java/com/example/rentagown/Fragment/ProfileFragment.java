package com.example.rentagown.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.rentagown.InvoiceHistoryActivity;
import com.example.rentagown.PrivacyPolicyActivity;
import com.example.rentagown.R;
import com.example.rentagown.SettingActivity;
import com.example.rentagown.TermsConditionActivity;
import com.example.rentagown.TransactionStatusActivity;

import java.util.Objects;


public class ProfileFragment extends Fragment implements View.OnClickListener{

    ConstraintLayout invoiceHistory, settings, helpCenter, privacyPolicy, termsConditions, signOut;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment\
        View v = inflater.inflate(R.layout.fragment_profile, container, false);

        //INIT VIEW
        invoiceHistory = v.findViewById(R.id.menu_invoice_history);
        settings = v.findViewById(R.id.menu_setting);
        helpCenter = v.findViewById(R.id.menu_help_center);
        privacyPolicy = v.findViewById(R.id.menu_privacy_policy);
        termsConditions = v.findViewById(R.id.menu_terms_condition);
        signOut = v.findViewById(R.id.btn_logout);

        //SET LISTENER
        invoiceHistory.setOnClickListener(ProfileFragment.this);
        settings.setOnClickListener(ProfileFragment.this);
        helpCenter.setOnClickListener(ProfileFragment.this);
        privacyPolicy.setOnClickListener(ProfileFragment.this);
        termsConditions.setOnClickListener(ProfileFragment.this);
        signOut.setOnClickListener(ProfileFragment.this);

        return v;


    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.menu_invoice_history:
                Toast.makeText(Objects.requireNonNull(getActivity()).getApplicationContext(), "Invoice History", Toast.LENGTH_SHORT).show();
                Intent invoiceHistory = new Intent(getActivity(), InvoiceHistoryActivity.class);
                startActivity(invoiceHistory);
                break;

            case R.id.menu_setting:
                Toast.makeText(Objects.requireNonNull(getActivity()).getApplicationContext(),"Settings", Toast.LENGTH_SHORT).show();
                Intent settings = new Intent(getActivity(), SettingActivity.class);
                startActivity(settings);
                break;

            case R.id.menu_privacy_policy:
                Toast.makeText(Objects.requireNonNull(getActivity()).getApplicationContext(),"Privacy Policy", Toast.LENGTH_SHORT).show();
                Intent privacy = new Intent(getActivity(), PrivacyPolicyActivity.class);
                startActivity(privacy);
                break;

            case R.id.menu_terms_condition:
                Toast.makeText(Objects.requireNonNull(getActivity()).getApplicationContext(),"Terms and Conditions", Toast.LENGTH_SHORT).show();
                Intent terms = new Intent(getActivity(), TermsConditionActivity.class);
                startActivity(terms);
                break;

        }
    }
}
