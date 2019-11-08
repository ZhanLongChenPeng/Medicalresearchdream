package com.example.medicalresearchdream.view.my.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.medicalresearchdream.R;

public class GuanyuActivity extends AppCompatActivity implements View.OnClickListener {

    /**
     * 返回
     */
    private TextView mTeFan;
    private ImageView mImageView26;
    private ImageView mImageView27;
    /**
     * 医学考研，西医结合的每一个科目伴随真题试练，每一题也有详细的题文解析(文字解析，图片解析等)，做真题也会得心应手，在错题库找到自己的错误，并且能够克服！
     */
    private TextView mTv1;
    /**
     * APP定制放送免费的名师视频，手把手教你如何面对考研真题，难题解析等，在个人中心能够直观的看到预期大学的最新消息以及往年分数线
     */
    private TextView mTv2;
    /**
     * 乐雨科技有限公司 版权所有\nCopying© 2017 HeNan LeYu com,.Itd All Rights Reserved
     */
    private TextView mTv3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guanyu);
        initView();
    }

    private void initView() {
        mTeFan = (TextView) findViewById(R.id.te_fan);
        mTeFan.setOnClickListener(this);
        mImageView26 = (ImageView) findViewById(R.id.imageView26);
        mImageView27 = (ImageView) findViewById(R.id.imageView27);
        mTv1 = (TextView) findViewById(R.id.tv_1);
        mTv2 = (TextView) findViewById(R.id.tv_2);
        mTv3 = (TextView) findViewById(R.id.tv_3);
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
