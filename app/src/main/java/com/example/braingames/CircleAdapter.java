package com.example.braingames;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

import com.example.braingames.databinding.CircleBinding;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CircleAdapter extends RecyclerView.Adapter<CircleAdapter.ViewHolder> {
    private List<Circle> mCircleList;

    public CircleAdapter(Context context) {
        mCircleList = new ArrayList<>();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CircleBinding binding = CircleBinding.inflate(LayoutInflater.from(parent.getContext()));
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.bindView(mCircleList.get(position));
    }

    @Override
    public int getItemCount() {
        return mCircleList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        CircleBinding binding;
        Circle mCircle;

        ViewHolder(CircleBinding binding){
            super(binding.getRoot());
            this.binding = binding;
        }

        void bindView(Circle circle){
            mCircle = circle;
            Date date = new Date();
            mCircle.startTime = date.getTime();

            binding.imageView.setOnClickListener((new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    mCircle.endTime = date.getTime();
                }
            }));

        }

    }
}

}
