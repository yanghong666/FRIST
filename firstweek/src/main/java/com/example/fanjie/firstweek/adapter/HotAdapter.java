package com.example.fanjie.firstweek.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;

import com.example.fanjie.firstweek.R;
import com.example.fanjie.firstweek.bean.GoodBeanns;
import com.facebook.drawee.view.SimpleDraweeView;

import java.util.List;

/**
 * author:Created by Constraint.
 */

public class HotAdapter extends RecyclerView.Adapter<HotAdapter.ViewHolder>{
    private Context context;
    private List<GoodBeanns.DataBean.ActivityInfoBean.ActivityInfoListBean> infoList;

    public HotAdapter(Context context, List<GoodBeanns.DataBean.ActivityInfoBean.ActivityInfoListBean> infoList) {
        this.context = context;
        this.infoList = infoList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(context,R.layout.hot_item_item, null);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imgLogo.setImageURI(infoList.get(position).getActivityImg());
    }

    @Override
    public int getItemCount() {
        return infoList.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        private final SimpleDraweeView imgLogo;

        public ViewHolder(View itemView) {
            super(itemView);
            imgLogo = (SimpleDraweeView) itemView.findViewById(R.id.img_logo);
        }
    }
}
