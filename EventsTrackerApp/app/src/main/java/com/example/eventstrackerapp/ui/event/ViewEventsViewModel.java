package com.example.eventstrackerapp.ui.event;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewEventsViewModel extends ViewModel{

    private MutableLiveData<String> mText;

    public ViewEventsViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is profile fragment");
    }

    public LiveData<String> getText(){
        return mText;
    }
}
