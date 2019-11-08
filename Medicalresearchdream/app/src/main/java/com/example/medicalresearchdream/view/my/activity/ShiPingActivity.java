package com.example.medicalresearchdream.view.my.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalresearchdream.R;

public class ShiPingActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mImFan;
    /**
     * 返回
     */
    private TextView mTeFan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shi_ping);
        initView();
    }

    private void initView() {
        mImFan = (ImageView) findViewById(R.id.im_fan);
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
