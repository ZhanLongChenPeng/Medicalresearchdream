package com.example.medicalresearchdream.view.my;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import com.example.medicalresearchdream.R;
import com.example.medicalresearchdream.base.BaseFragment;
import com.example.medicalresearchdream.interfaces.IPersenter;
import com.example.medicalresearchdream.view.my.activity.GouWuActivity;
import com.example.medicalresearchdream.view.my.activity.GuanyuActivity;
import com.example.medicalresearchdream.view.my.activity.JishuActivity;
import com.example.medicalresearchdream.view.my.activity.LiXianActivity;
import com.example.medicalresearchdream.view.my.activity.MyCollerActivity;
import com.example.medicalresearchdream.view.my.activity.ShiPingActivity;
import com.example.medicalresearchdream.view.my.activity.ShouHuoActivity;
import com.example.medicalresearchdream.view.my.activity.ZaiXianActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment extends BaseFragment implements View.OnClickListener {

    private ConstraintLayout wode;
    private ConstraintLayout gouwuche;
    private ConstraintLayout shouhuo;
    private ConstraintLayout shiping;
    private ConstraintLayout lixian;
    private ConstraintLayout guanyu;
    private ConstraintLayout zaixian;
    private ConstraintLayout kefu;
    private ConstraintLayout jishu;
    private PopupWindow mPopupWindow;

    @Override
    protected int getLayout() {
        return R.layout.fragment_my;
    }

    @Override
    protected void initView(View view) {
        wode = (ConstraintLayout) view.findViewById(R.id.const_wodeshouchang);
        wode.setOnClickListener(this);
        gouwuche = (ConstraintLayout) view.findViewById(R.id.const_gouwuche);
        gouwuche.setOnClickListener(this);
        shouhuo = (ConstraintLayout) view.findViewById(R.id.const_shouhuo);
        shouhuo.setOnClickListener(this);
        shiping = (ConstraintLayout) view.findViewById(R.id.const_shiping);
        shiping.setOnClickListener(this);
        lixian = (ConstraintLayout) view.findViewById(R.id.const_lixian);
        lixian.setOnClickListener(this);
        guanyu = (ConstraintLayout) view.findViewById(R.id.const_guanyu);
        guanyu.setOnClickListener(this);
        zaixian = (ConstraintLayout) view.findViewById(R.id.const_zaixian);
        zaixian.setOnClickListener(this);
        kefu = (ConstraintLayout) view.findViewById(R.id.const_kefu);
        kefu.setOnClickListener(this);
        jishu = (ConstraintLayout) view.findViewById(R.id.const_jishu);
        jishu.setOnClickListener(this);

    }

    @Override
    protected void initData() {

    }

    @Override
    protected IPersenter createPersenter() {
        return null;
    }

    private void initView() {

    }

    @Override
    public void showErrMsg(String err) {

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.const_wodeshouchang:
                Intent intent1 = new Intent(getActivity(), MyCollerActivity.class);
                getActivity().startActivity(intent1);
                break;
            case R.id.const_gouwuche:
                Intent intent2 = new Intent(getActivity(), GouWuActivity.class);
                getActivity().startActivity(intent2);
                break;
            case R.id.const_shouhuo:
                Intent intent3 = new Intent(getActivity(), ShouHuoActivity.class);
                getActivity().startActivity(intent3);
                break;
            case R.id.const_shiping:
                Intent intent4 = new Intent(getActivity(), ShiPingActivity.class);
                getActivity().startActivity(intent4);
                break;
            case R.id.const_lixian:
                Intent intent5 = new Intent(getActivity(), LiXianActivity.class);
                getActivity().startActivity(intent5);
                break;
            case R.id.const_guanyu:
                Intent intent6 = new Intent(getActivity(), GuanyuActivity.class);
                getActivity().startActivity(intent6);
                break;
            case R.id.const_zaixian:
                Intent intent7 = new Intent(getActivity(), ZaiXianActivity.class);
                getActivity().startActivity(intent7);
                break;
            case R.id.const_kefu:
//                Intent intent8 = new Intent(getActivity(), KeFuActivity.class);
//                getActivity().startActivity(intent8);
                initPoaw();
                break;
            case R.id.const_jishu:
                Intent intent9 = new Intent(getActivity(), JishuActivity.class);
                getActivity().startActivity(intent9);
//                Toast.makeText(context, "45132", Toast.LENGTH_SHORT).show();
                break;
        }
    }




    @SuppressLint("ResourceAsColor")
    private void initPoaw() {

        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.item, null);
        mPopupWindow = new PopupWindow(inflate, ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT);
        //设置背景
        mPopupWindow.setBackgroundDrawable(new ColorDrawable(R.color.c_220000000));
        // <color name="c_220000000">#22000000</color>
        //点击外部消失
        mPopupWindow.setOutsideTouchable(true);
        //水平方向
        mPopupWindow.showAtLocation(inflate, Gravity.CENTER, 0, 0);
        //                popupWindow.showAsDropDown(inflate);
        inflate.findViewById(R.id.im_weixin).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //关闭
                mPopupWindow.dismiss();
            }
        });
    }
}
