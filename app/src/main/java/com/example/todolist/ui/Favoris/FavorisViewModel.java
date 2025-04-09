package com.example.todolist.ui.Favoris;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class FavorisViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public FavorisViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Favoris fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}