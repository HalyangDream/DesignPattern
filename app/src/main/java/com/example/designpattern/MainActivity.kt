package com.example.designpattern

import android.animation.ObjectAnimator
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.designpattern.databinding.ActivityMainBinding
import com.example.designpattern.observer.ObserverActivity
import com.example.designpattern.simplefactory.SimpleFactoryActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var sb = StringBuilder()
        for (i in 0 until 100) {
            sb.append("x")
        }
        binding.measureTv.text = sb
        setListener()
    }

    private fun setListener() {
        binding.observerTv.setOnClickListener {
            val intent = Intent(it.context, ObserverActivity::class.java)
            startActivity(intent)
        }
        binding.factoryTv.setOnClickListener {
            val intent = Intent(it.context, SimpleFactoryActivity::class.java)
            startActivity(intent)
        }

        binding.measureBtn.setOnClickListener {
            val top = binding.measureLayout.top
            binding.measureLayout.measure(0, 0)
            val params = LinearLayout.LayoutParams(
                binding.measureLayout.measuredWidth,
                binding.measureLayout.measuredHeight
            );
            binding.measureLayout.layoutParams = params
//            binding.measureLayout.layout(
//                0, top,
//                binding.measureLayout.measuredWidth,
//                binding.measureLayout.measuredHeight + top
//            )
//            binding.measureLayout.requestLayout()
//            binding.rootView.requestLayout()
            Log.i("Main", "bottom=$top")
            Log.i("Main", "width=${binding.measureLayout.measuredWidth}")
            Log.i("Main", "height=${binding.measureLayout.measuredHeight}")
            startAnim()
        }
    }

    private fun startAnim() {
        val width = binding.measureLayout.measuredWidth
        val anim =
            ObjectAnimator.ofFloat(binding.measureLayout, "translationX", 0f, -width.toFloat())
        anim.duration = 3000
        anim.repeatCount = -1
        anim.start()

    }
}
