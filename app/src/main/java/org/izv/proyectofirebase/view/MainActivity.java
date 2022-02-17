package org.izv.proyectofirebase.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import org.izv.proyectofirebase.R;
import org.izv.proyectofirebase.viewmodel.MainActivityViewModel;

public class MainActivity extends AppCompatActivity {

    private MainActivityViewModel maViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        maViewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);
    }
}