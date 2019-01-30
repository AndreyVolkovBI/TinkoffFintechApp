package com.andreyvolkov.tinkofffintechapp.Recyclers;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.andreyvolkov.tinkofffintechapp.Model.JSONClient;
import com.andreyvolkov.tinkofffintechapp.Model.PostItem;
import com.andreyvolkov.tinkofffintechapp.R;

import java.util.ArrayList;

public class RecyclerViewNewsFeedAdapter extends RecyclerView.Adapter<RecyclerViewNewsFeedAdapter.ViewHolder>{

    private ArrayList<PostItem> postItems;
    private Context context;

    public RecyclerViewNewsFeedAdapter(Context context) {
        JSONClient jsonClient = new JSONClient(context);
        this.postItems = jsonClient.getListPostItem();
        this.context = context;
    }


    @NonNull
    @Override
    public RecyclerViewNewsFeedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_internship, viewGroup, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewNewsFeedAdapter.ViewHolder viewHolder, int i) {
        viewHolder.internshipItemName.setText(postItems.get(i).getName());
        viewHolder.internshipItemPlaces.setText(postItems.get(i).getPlaces());

        String desc = postItems.get(i).getDescription();
        desc = desc.substring(0, 100) + "...";
        viewHolder.internshipItemDescription.setText(desc);
        viewHolder.internshipItemExams.setText("Экзамены: " + postItems.get(i).getExams());
    }

    @Override
    public int getItemCount() {
        return postItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView internshipItemName;
        TextView internshipItemPlaces;
        TextView internshipItemDescription;
        TextView internshipItemExams;
        RelativeLayout itemInternshipLayout;

        public ViewHolder(View itemView) {
            super(itemView);
            internshipItemName = itemView.findViewById(R.id.internship_item_name);
            internshipItemPlaces = itemView.findViewById(R.id.internship_item_places);
            internshipItemDescription = itemView.findViewById(R.id.internship_item_description);
            internshipItemExams = itemView.findViewById(R.id.internship_item_exams);
            itemInternshipLayout = itemView.findViewById(R.id.item_internship_layout);
        }
    }
}
