package com.application.e_commerce;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {
    private List<CategoryModal> categoryModalList;

    public CategoryAdapter(List<CategoryModal> categoryModalList) {
        this.categoryModalList = categoryModalList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.component_category_item,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.tvCategory.setText(categoryModalList.get(position).getCategroy());
    }

    @Override
    public int getItemCount() {
        return categoryModalList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tvCategory;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvCategory = itemView.findViewById(R.id.component_category_item_tv_category);
        }
    }
}
