package com.codingtester.tourisminoman.category;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codingtester.tourisminoman.Category;
import com.codingtester.tourisminoman.R;
import com.codingtester.tourisminoman.models.ModelsActivity;

import java.util.List;

public class CatAdapter extends RecyclerView.Adapter<CatAdapter.ViewHolder> {

    private List<Category> categories;

    private OnClickToCat onClickToCat;

    public CatAdapter(List<Category> categories) {
        this.categories = categories;
    }

    @NonNull
    @Override
    public CatAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.cat_layout, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull CatAdapter.ViewHolder holder, int position) {

        Context context = holder.img.getContext();
        Category category = categories.get(position);
        holder.txt.setText(category.getName());
        holder.img.setImageResource(category.getImage());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, ModelsActivity.class);
            intent.putExtra("type", category.getName());
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return categories.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.catImage);
            txt = itemView.findViewById(R.id.catName);
        }
    }
}
