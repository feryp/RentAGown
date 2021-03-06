package com.example.rentagown.Fragment;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.example.rentagown.InvoiceHistoryActivity;
import com.example.rentagown.SignInActivity;
import com.example.rentagown.R;
import com.example.rentagown.SettingActivity;
import com.example.rentagown.SignUpActivity;


public class ProfileBeforeFragment extends Fragment implements View.OnClickListener {

    ConstraintLayout invoiceHistory, settings, helpCenter, privacyPolicy, termsConditions, signOut;
    Button btnCreateAccount, btnSignIn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_profile_before, container, false);

        //INIT VIEW
        btnCreateAccount = v.findViewById(R.id.btn_create_account);
        btnSignIn = v.findViewById(R.id.btn_to_layout_login);
        invoiceHistory = v.findViewById(R.id.menu_invoice_history);
        settings = v.findViewById(R.id.menu_setting);
        helpCenter = v.findViewById(R.id.menu_help_center);
        privacyPolicy = v.findViewById(R.id.menu_privacy_policy);
        termsConditions = v.findViewById(R.id.menu_terms_condition);
        signOut = v.findViewById(R.id.btn_logout);

        //SET LISTENER
        btnSignIn.setOnClickListener(ProfileBeforeFragment.this);
        btnCreateAccount.setOnClickListener(ProfileBeforeFragment.this);
        invoiceHistory.setOnClickListener(ProfileBeforeFragment.this);
        settings.setOnClickListener(ProfileBeforeFragment.this);
        signOut.setOnClickListener(ProfileBeforeFragment.this);

        return v;
    }

    @SuppressLint("NonConstantResourceId")
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_to_layout_login:
                Intent login = new Intent(getActivity(), SignInActivity.class);
                startActivity(login);
                break;

            case R.id.btn_create_account:
                Intent createAccount = new Intent(getActivity(), SignUpActivity.class);
                startActivity(createAccount);
                break;

            case R.id.menu_invoice_history:
                Toast.makeText(getActivity().getApplicationContext(), "Invoice History", Toast.LENGTH_SHORT).show();
                Intent invoiceHistory = new Intent(getActivity(), InvoiceHistoryActivity.class);
                startActivity(invoiceHistory);
                break;

            case R.id.menu_setting:
                Toast.makeText(getActivity().getApplicationContext(),"Settings", Toast.LENGTH_SHORT).show();
                Intent settings = new Intent(getActivity(), SettingActivity.class);
                startActivity(settings);
                break;

        }
    }
}