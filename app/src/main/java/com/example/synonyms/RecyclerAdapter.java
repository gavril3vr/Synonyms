package com.example.synonyms;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;

import java.util.List;

public class RecyclerAdapter extends Adapter<RecyclerAdapter.ViewHolder> {

    LayoutInflater inflater;
    List<Synonym> synonyms;


    public RecyclerAdapter(Context context, List<Synonym> synonyms) {
        inflater = LayoutInflater.from(context);
        this.synonyms = synonyms;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_task, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Synonym current = synonyms.get(position);
        holder.textView.setText(current.getSynonym());
    }

    @Override
    public int getItemCount() {
        return synonyms.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.txt_view);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
