package com.testapplication.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;
import com.testapplication.R;
import com.testapplication.objects.db.FeedEntity;

import java.util.List;

/**
 * Created by Diksha Bhatia on 3/18/2016.
 */
public class RVFeedAdapter extends RecyclerView.Adapter<RVFeedAdapter.FeedViewHolder> {

    List<FeedEntity> feedEntityList;
    Context context;

    public RVFeedAdapter(Context context, List<FeedEntity> feedEntityList) {
        this.feedEntityList = feedEntityList;
        this.context = context;
    }

    public static class FeedViewHolder extends RecyclerView.ViewHolder {

        CardView cv;
        TextView tv_image_title;
        ImageView iv_image;

        public FeedViewHolder(View itemView) {
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cv);
            tv_image_title = (TextView) itemView.findViewById(R.id.tv_image_title);
            iv_image = (ImageView) itemView.findViewById(R.id.iv_image);
        }
    }

    @Override
    public FeedViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_test_list_item, viewGroup, false);
        FeedViewHolder pvh = new FeedViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(final FeedViewHolder holder, int position) {

        holder.tv_image_title.setText(feedEntityList.get(position).getImageTitle());
        Picasso.with(context)
                .load(feedEntityList.get(position).getImageUrl())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .into(holder.iv_image);

        holder.tv_image_title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(context, holder.tv_image_title.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return feedEntityList.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

}
