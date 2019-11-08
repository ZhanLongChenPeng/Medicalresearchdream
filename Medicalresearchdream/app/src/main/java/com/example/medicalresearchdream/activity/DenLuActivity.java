package com.example.medicalresearchdream.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.medicalresearchdream.R;
import com.example.medicalresearchdream.view.danglu.ShoujiFragment;
import com.example.medicalresearchdream.view.danglu.ZhanghaoFragment;

import java.util.ArrayList;

public class DenLuActivity extends AppCompatActivity implements View.OnClickListener {

    private ImageView mImageView25;
    /**
     * 账号密码登录
     */
    private TextView mTeZhanghao;
    /**
     * 手机号快速登陆
     */
    private TextView mTextView6;
    private Guideline mGuideline;
    private ArrayList <Fragment> fragments;
    private FragmentManager supportFragmentManager;
    public int mLastFragmentPosition;
    private final int TYPE_bt_ZhangHao = 0;
    private final int TYPE_bt_Shoujihao = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_den_lu);
        initView();
        initFragment();
    }

    private void initView() {
        mImageView25 = (ImageView) findViewById(R.id.imageView25);
        mTeZhanghao = (TextView) findViewById(R.id.te_zhanghao);
        mTeZhanghao.setOnClickListener(this);
        mTextView6 = (TextView) findViewById(R.id.textView6);
        mTextView6.setOnClickListener(this);
        mGuideline = (Guideline) findViewById(R.id.guideline);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.te_zhanghao:
                switchFragment(TYPE_bt_ZhangHao);
                break;
            case R.id.textView6:
                switchFragment(TYPE_bt_Shoujihao);
                break;
        }
    }

    private void switchFragment(int type) {
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        Fragment showFragment = fragments.get(type);
        Fragment hideFragment = fragments.get(mLastFragmentPosition);
        if (!showFragment.isAdded()) {
            fragmentTransaction.add(R.id.fl, showFragment);
        }
        fragmentTransaction.hide(hideFragment);
        fragmentTransaction.show(showFragment);
        fragmentTransaction.commit();
        mLastFragmentPosition = type;
    }
    private void initFragment() {
        ZhanghaoFragment zhanghaoFragment = new ZhanghaoFragment();
        ShoujiFragment shoujiFragment = new ShoujiFragment();
        fragments = new ArrayList <Fragment>();
        fragments.add(zhanghaoFragment);
        fragments.add(shoujiFragment);
        supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fl, fragments.get(0));
        fragmentTransaction.commit();

    }
}
