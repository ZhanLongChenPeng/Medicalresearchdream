package com.example.medicalresearchdream;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.medicalresearchdream.view.curriculum.CurriculumFragment;
import com.example.medicalresearchdream.view.forum.ForumFragment;
import com.example.medicalresearchdream.view.item_bank.ItembankFragment;
import com.example.medicalresearchdream.view.my.MyFragment;
import com.example.medicalresearchdream.view.shopping_Mall.ShoppingMallFragment;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private FragmentManager supportFragmentManager;
    private final int TYPE_bt_Item_bank = 0;
    private final int TYPE_bt_Shopping_Mall = 1;
    private final int TYPE_bt_curriculum = 2;
    private final int TYPE_bt_forum = 3;
    private final int TYPE_bt_my = 4;
    public int mLastFragmentPosition;

    private int type;
    private ArrayList <Fragment> fragments;
    private FragmentManager manager;
    private FrameLayout mFl;
    /**
     * 题库
     */
    private RadioButton mBtn1;
    /**
     * 商城
     */
    private RadioButton mBtn2;
    /**
     * 课程
     */
    private RadioButton mBtn3;
    /**
     * 论坛
     */
    private RadioButton mBtn4;
    /**
     * 我
     */
    private RadioButton mBtn5;
    private RadioGroup mRg;
    private LinearLayout mRll;
    private DrawerLayout mDl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }


    protected void initView() {
        mBtn1 = (RadioButton) findViewById(R.id.btn1);
        mBtn1.setOnClickListener(this);
        mBtn2 = (RadioButton) findViewById(R.id.btn2);
        mBtn2.setOnClickListener(this);
        mBtn3 = (RadioButton) findViewById(R.id.btn3);
        mBtn3.setOnClickListener(this);
        mBtn4 = (RadioButton) findViewById(R.id.btn4);
        mBtn4.setOnClickListener(this);
        mBtn5 = (RadioButton) findViewById(R.id.btn5);
        mBtn5.setOnClickListener(this);
        mRg = (RadioGroup) findViewById(R.id.rg);
        mRg.setOnClickListener(this);
        mRll = (LinearLayout) findViewById(R.id.rll);
        mDl = (DrawerLayout) findViewById(R.id.dl);
        initFragment();
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
        ItembankFragment item_bankFragment = new ItembankFragment();
        ShoppingMallFragment shopping_mallFragment = new ShoppingMallFragment();
        CurriculumFragment curriculumFragment = new CurriculumFragment();
        ForumFragment forumFragment = new ForumFragment();
        MyFragment myFragment = new MyFragment();
        fragments = new ArrayList <>();
        fragments.add(item_bankFragment);
        fragments.add(shopping_mallFragment);
        fragments.add(curriculumFragment);
        fragments.add(forumFragment);
        fragments.add(myFragment);
        supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fl, fragments.get(0));
        fragmentTransaction.commit();

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            default:
                break;
            case R.id.btn1:
                switchFragment(TYPE_bt_Item_bank);
                break;
            case R.id.btn2:
                switchFragment(TYPE_bt_Shopping_Mall);
                break;
            case R.id.btn3:
                switchFragment(TYPE_bt_curriculum);
                break;
            case R.id.btn4:
                switchFragment(TYPE_bt_forum);
                break;
            case R.id.btn5:
                switchFragment(TYPE_bt_my);
                break;
        }
    }
}
