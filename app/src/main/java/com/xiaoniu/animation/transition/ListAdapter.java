package com.xiaoniu.animation.transition;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.xiaoniu.animation.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.MyViewHolder>{
    private List<NewBean> list;
    private Activity activity;

    public ListAdapter(Activity activity, List<NewBean> list) {
        this.activity = activity;
        this.list = list;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        final NewBean newBean = list.get(position);
        holder.ic_icon.setImageResource(newBean.getIconId());
        holder.tv_title.setText(newBean.getTitle());
        holder.tv_description.setText(newBean.getDescription());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity, ShareDetailActivity.class);
                intent.putExtra("bean", newBean);
                activity.startActivity(intent,
                        ActivityOptions
                                .makeSceneTransitionAnimation(activity,
                                        Pair.create((View)holder.ic_icon, "iv_icon"),
                                        Pair.create((View)holder.tv_title, "title"),
                                        Pair.create((View)holder.tv_description, "description"))
                                .toBundle());
            }
        });
    }

    @Override
    public int getItemCount() {
        return list == null?0:list.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.iv_icon)
        ImageView ic_icon;
        @BindView(R.id.tv_title)
        TextView tv_title;
        @BindView(R.id.tv_description)
        TextView tv_description;

        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
