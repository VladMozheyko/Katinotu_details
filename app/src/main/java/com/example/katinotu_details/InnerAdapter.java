package com.example.katinotu_details;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class InnerAdapter extends RecyclerView.Adapter<InnerAdapter.ViewHolder> {

    List<String> str;

    LayoutInflater inflater;

    public InnerAdapter(Context context, List<String> str) {
        this.str = str;
        inflater = LayoutInflater.from(context);
        Log.d("Актив", context.toString());

    }

    @NonNull
    @Override
    public InnerAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.inner_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull InnerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return str.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView rc;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
          //  rc = itemView.findViewById(R.id.innerImage);
        }
    }
}
