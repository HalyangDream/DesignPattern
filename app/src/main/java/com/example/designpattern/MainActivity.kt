package com.example.designpattern

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.designpattern.databinding.ActivityMainBinding
import com.example.designpattern.factory.FactoryActivity
import com.example.designpattern.observer.ObserverActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListener()
    }

    private fun setListener() {
        binding.observerTv.setOnClickListener {
            val intent = Intent(it.context, ObserverActivity::class.java)
            startActivity(intent)
        }
        binding.factoryTv.setOnClickListener {
            val intent = Intent(it.context, FactoryActivity::class.java)
            startActivity(intent)
        }
    }
}
