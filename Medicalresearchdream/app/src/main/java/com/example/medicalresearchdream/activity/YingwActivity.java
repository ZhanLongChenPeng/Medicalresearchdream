package com.example.medicalresearchdream.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalresearchdream.R;

public class YingwActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 跳过
     */
    private Button mButton2;
    /**
     * 3
     */
    private TextView mTeDao;
    private long mMillisUntilFinished1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yingw);
        initView();
        Count();
    }

    private void initView() {
        mButton2 = (Button) findViewById(R.id.button2);
        mButton2.setOnClickListener(this);
        mTeDao = (TextView) findViewById(R.id.te_dao);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.button2:
                Intent intent = new Intent(YingwActivity.this, DenLuActivity.class);
                startActivity(intent);
                break;
        }
    }

    public void Count(){
            CountDownTimer countDownTimer = new CountDownTimer(4000,1000) {
                @Override
                public void onTick(long millisUntilFinished) {
                    mMillisUntilFinished1 = millisUntilFinished;
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            mTeDao.setText(mMillisUntilFinished1 / 1000 +"s");
                        }
                    });
                }

                @Override
                public void onFinish() {
                    Intent intent = new Intent(YingwActivity.this, DenLuActivity.class);
                    startActivity(intent);
                }
            };
            countDownTimer.start();
        }

}
