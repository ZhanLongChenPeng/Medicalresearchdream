package com.example.medicalresearchdream.interfaces;

public interface IPersenter<V extends IBaseView> {

    //p层关联V层
    void attchView(V view);

    void detachView();

}
