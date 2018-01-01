package com.example.fanjie.firstweek.presenter;

import com.example.fanjie.firstweek.inter.CallBack;
import com.example.fanjie.firstweek.inter.IView;
import com.example.fanjie.firstweek.utils.RetrofitUtils;

import java.util.Map;

/**
 * author:Created by Constraint.
 */

public class GoodsPresenter {
    private IView iView;
    public GoodsPresenter(){

    }
    public void attachView(IView iView){
        this.iView=iView;
    }
    public void getData(String url, Map<String,String> map){
        RetrofitUtils.getInstance().getNews(url, new CallBack() {
            @Override
            public void onSuccess(Object o) {
                iView.success(o);
            }

            @Override
            public void onFailed(Throwable t) {
                iView.failed(t);
            }
        },map);
    }
    public void detachView(){
        if (iView!=null){
            iView=null;
        }
    }
}
