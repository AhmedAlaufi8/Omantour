package com.codingtester.tourisminoman.models;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codingtester.tourisminoman.Category;
import com.codingtester.tourisminoman.DetailsActivity;
import com.codingtester.tourisminoman.Model;
import com.codingtester.tourisminoman.R;
import com.codingtester.tourisminoman.category.OnClickToCat;

import java.util.List;

public class ModelsAdapter extends RecyclerView.Adapter<ModelsAdapter.ViewHolder> {

    private List<Model> models;

    private OnClickToCat onClickToCat;

    public ModelsAdapter(List<Model> models) {
        this.models = models;
    }

    @NonNull
    @Override
    public ModelsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(
                LayoutInflater.from(parent.getContext()).inflate(
                        R.layout.models_item, parent, false
                )
        );
    }

    @Override
    public void onBindViewHolder(@NonNull ModelsAdapter.ViewHolder holder, int position) {

        Context context = holder.img.getContext();
        Model model = models.get(position);
        holder.txt.setText(model.getName());
        holder.img.setImageResource(model.getImage());

        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, DetailsActivity.class);
            intent.putExtra("model", model);
            context.startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txt;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.imgModel);
            txt = itemView.findViewById(R.id.txtName);
        }
    }
}
