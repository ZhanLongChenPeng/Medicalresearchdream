package com.example.medicalresearchdream.view.shopping_Mall;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.medicalresearchdream.R;
import com.example.medicalresearchdream.base.BaseFragment;
import com.example.medicalresearchdream.interfaces.IPersenter;
import com.example.medicalresearchdream.view.shopping_Mall.fragment.QuanBuFragment;
import com.example.medicalresearchdream.view.shopping_Mall.fragment.ShiPingFragment;
import com.example.medicalresearchdream.view.shopping_Mall.fragment.TuShuFragment;

import java.util.ArrayList;


public class ShoppingMallFragment extends BaseFragment implements View.OnClickListener {


    private ArrayList <Fragment> fragments;
    private final int TYPE_quanBuFragment = 0;
    private final int TYPE_shiPingFragment = 1;
    private final int TYPE_tuShuFragment = 2;
    public int mLastFragmentPosition;
    private FragmentManager childFragmentManager;
    private TextView te_im;
    private ImageView im;
    private RadioButton bt_quanbu;
    private RadioButton bt_tushu;
    private RadioButton bt_shiping;
    private RadioGroup rgp;
    private FrameLayout fl_we;


    @Override
    protected int getLayout() {
        return R.layout.fragment_shoppingmall;
    }

    @Override
    protected void initView(View view) {
        te_im =(TextView) view.findViewById(R.id.te_im);
        im =(ImageView) view.findViewById(R.id.im);
        bt_quanbu = (RadioButton) view.findViewById(R.id.bt_quanbu);
        bt_quanbu.setOnClickListener(this);
        bt_tushu = (RadioButton)view.findViewById(R.id.bt_tushu);
        bt_tushu.setOnClickListener(this);
        bt_shiping = (RadioButton)view.findViewById(R.id.bt_shiping);
        bt_shiping.setOnClickListener(this);
        rgp = (RadioGroup) view.findViewById(R.id.rgp);
        rgp.setOnClickListener(this);
        fl_we = (FrameLayout) view.findViewById(R.id.fl_we);
        fl_we.setOnClickListener(this);

        initFragment();
    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPersenter createPersenter() {
        return null;
    }

    @Override
    public void showErrMsg(String err) {

    }

    private void switchFragment(int type) {
        FragmentTransaction fragmentTransaction = childFragmentManager.beginTransaction();
        Fragment showFragment = fragments.get(type);
        Fragment hideFragment = fragments.get(mLastFragmentPosition);
        if (!showFragment.isAdded()) {
            fragmentTransaction.add(R.id.fl_we, showFragment);
        }
        fragmentTransaction.hide(hideFragment);
        fragmentTransaction.show(showFragment);
        fragmentTransaction.commit();
        mLastFragmentPosition = type;
    }

    private void initFragment() {
        QuanBuFragment quanBuFragment = new QuanBuFragment();
        ShiPingFragment shiPingFragment = new ShiPingFragment();
        TuShuFragment tuShuFragment = new TuShuFragment();
        fragments = new ArrayList <>();
        fragments.add(quanBuFragment);
        fragments.add(shiPingFragment);
        fragments.add(tuShuFragment);
        childFragmentManager = getChildFragmentManager();
        FragmentTransaction fragmentTransaction = childFragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.fl_we, fragments.get(0));
        fragmentTransaction.commit();

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt_quanbu:
                switchFragment(TYPE_quanBuFragment);
                Toast.makeText(context, "11", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_tushu:
                switchFragment(TYPE_shiPingFragment);
                Toast.makeText(context, "222", Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_shiping:
                switchFragment(TYPE_tuShuFragment);
                Toast.makeText(context, "333", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
