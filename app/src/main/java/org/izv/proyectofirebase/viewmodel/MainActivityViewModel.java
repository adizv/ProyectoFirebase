package org.izv.proyectofirebase.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import org.izv.proyectofirebase.model.Repository;

public class MainActivityViewModel extends AndroidViewModel {

    private Repository repository;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        repository = new Repository(application);
    }
}