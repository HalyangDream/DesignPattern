package com.example.designpattern.simplefactory;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.designpattern.databinding.ActivitySimpleFactoryBinding;

public class SimpleFactoryActivity extends AppCompatActivity {

    private ActivitySimpleFactoryBinding simpleFactoryBinding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        simpleFactoryBinding = ActivitySimpleFactoryBinding.inflate(getLayoutInflater());
        setContentView(simpleFactoryBinding.getRoot());
        simpleFactoryBinding.getResultBtn.setOnClickListener(v -> {
            calc();
        });
    }

    private void calc() {
        double num1 = Double.parseDouble(simpleFactoryBinding.numText1.getText().toString());
        double num2 = Double.parseDouble(simpleFactoryBinding.numText2.getText().toString());
        String operated = simpleFactoryBinding.operaEditText.getText().toString();
        Operation operation = OperationFactory.create(operated);
        operation.setNumberA(num1);
        operation.setNumberB(num2);
        double result = operation.getResult();
        simpleFactoryBinding.result.setText("结果：" + result);
    }


}
