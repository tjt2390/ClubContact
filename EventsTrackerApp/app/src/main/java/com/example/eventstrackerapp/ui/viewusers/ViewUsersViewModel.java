package com.example.eventstrackerapp.ui.viewusers;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ViewUsersViewModel extends ViewModel{

    private MutableLiveData<String> mText;

    public ViewUsersViewModel(){
        mText = new MutableLiveData<>();
        mText.setValue("This is profile fragment");
    }

    public LiveData<String> getText(){
        return mText;
    }
}