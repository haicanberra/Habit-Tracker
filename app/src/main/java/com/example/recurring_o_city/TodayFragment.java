package com.example.recurring_o_city;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class TodayFragment extends Fragment {

    ArrayList<Habit> habitList;

    public TodayFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String dtStart = "12/05/2021";
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        Date date1 = null;
        try {
            date1 = format.parse(dtStart);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        habitList = new ArrayList<>();
        habitList.add(new Habit("asd", "nice", date1, 1));
        habitList.add(new Habit("2131t", "nice", date1, 1));
        habitList.add(new Habit("Casdat", "nice", date1, 1));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_today, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.today_recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(new ItemAdapter(habitList));

        // Inflate the layout for this fragment
        return view;
    }
}