package com.example.designpattern.observer;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.designpattern.databinding.ActivityEditBinding;

/**
 * layout = activity_edit
 */
public class EditActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityEditBinding binding = ActivityEditBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.saveBtn.setOnClickListener(v -> {
            Subject.getInstance().notifyObserver(binding.editTv.getText().toString());
        });

    }
}
