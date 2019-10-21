package com.example.eventstrackerapp.ui.event;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.eventstrackerapp.R;

public class CreateEventFragment extends Fragment{

    private CreateEventViewModel createEventViewModel;

    public View onCreateView(@NonNull LayoutInflater inflator,
                             ViewGroup container, Bundle savedInstanceState){
        createEventViewModel =
                ViewModelProviders.of(this).get(CreateEventViewModel.class);
        View root = inflator.inflate(R.layout.fragment_createevent, container, false);
        final TextView textView = root.findViewById(R.id.nav_createEvent);
        createEventViewModel.getText().observe(this, new Observer<String>(){
            @Override
            public void onChanged(@Nullable String s){
                textView.setText(s);
            }
        });
        return root;
    }
}

