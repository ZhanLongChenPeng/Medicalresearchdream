package com.example.medicalresearchdream.view.forum;


import android.view.View;
import android.widget.RadioButton;

import androidx.fragment.app.Fragment;

import com.example.medicalresearchdream.R;
import com.example.medicalresearchdream.base.BaseFragment;
import com.example.medicalresearchdream.interfaces.IPersenter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ForumFragment extends BaseFragment {


    private RadioButton bt_tt;
    private RadioButton bt_ee;

    @Override
    protected int getLayout() {
        return R.layout.fragment_forum;
    }

    @Override
    protected void initView(View view) {
//        bt_tt = view.findViewById(R.id.tv_school);
//        bt_tt.setOnClickListener(this);
//        bt_ee = view.findViewById(R.id.tv_luntan);
//        bt_ee.setOnClickListener(this);
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
//
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()) {
//            case R.id.tv_school:
//                Toast.makeText(context, "1", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.tv_luntan:
//                Toast.makeText(context, "2", Toast.LENGTH_SHORT).show();
//                break;
//        }
//    }
}
