package com.example.katinotu_details;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ListFragment extends Fragment {


    RecyclerView recyclerView;
    RecyclerView innerRecyclerView;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.list_fragment, container, false);
        recyclerView = view.findViewById(R.id.main_recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ArrayList<String> str = new ArrayList<>();
        str.add("hello");
        str.add("bye");
        str.add("hello");
        str.add("bye");
        MainAdapter adapter = new MainAdapter(getActivity(), str);
        Log.d("Актив", getActivity().toString());
        recyclerView.setAdapter(adapter);
       // recyclerView.setNestedScrollingEnabled(false);
        return view;
    }
}
