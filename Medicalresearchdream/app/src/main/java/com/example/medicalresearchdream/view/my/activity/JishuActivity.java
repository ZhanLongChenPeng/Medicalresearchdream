package com.example.medicalresearchdream.view.my.activity;


import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalresearchdream.R;

public class JishuActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 返回
     */
    private TextView mTeFan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jishu);
        initView();
    }

    private void initView() {
        mTeFan = (TextView) findViewById(R.id.te_fan);
        mTeFan.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.te_fan:
                finish();
                break;
        }
    }
}
