package com.example.katinotu_details;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.zip.Inflater;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    LayoutInflater inflater;

    List<String> models;
    static Context context;

    public MainAdapter(Context context, List<String> models) {
        this.inflater = LayoutInflater.from(context);
        this.models = models;
        this.context = context;
        Log.d("АктивMain", this.context.toString());

    }

    @NonNull
    @Override
    public MainAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MainAdapter.ViewHolder holder, int position) {
       //holder.context = context;
        holder.bind(context);
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txt;
        RecyclerView rc;
        ArrayList<String> str = new ArrayList<>();
        Context context1;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txt = itemView.findViewById(R.id.txt_category);
            rc = itemView.findViewById(R.id.inner_list);
            txt.setText("Категория");

        }

        void bind(Context context){
            str = new ArrayList<>();
            str.add("Hello");
            str.add("Bye");
            str.add("Hello");
            str.add("Bye");
            str.add("Hello");
            str.add("Bye");
            str.add("Hello");
            str.add("Bye");
            Log.e("Контекс", context.toString());
            InnerAdapter innerAdapter = new InnerAdapter(context, str);
            rc.setLayoutManager(new GridLayoutManager(context, 2, LinearLayoutManager.VERTICAL, false));
            rc.setAdapter(innerAdapter);
            rc.addItemDecoration(new ProductDivider());
        }
    }
}
