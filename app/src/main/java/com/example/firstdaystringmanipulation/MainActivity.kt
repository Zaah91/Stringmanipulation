package com.example.firstdaystringmanipulation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.firstdaystringmanipulation.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding // binder til ActivityMain

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.buttonLowerCase.setOnClickListener {
            val name = binding.edittextTextOutput.text.toString() .trim()

            if (name.isEmpty()){
                binding.edittextTextOutput.error = "Insert text"
                return@setOnClickListener
            }
            val lowercase = name.lowercase()
            binding.textviewOutput.text = "Result: $lowercase"
        }
        binding.buttonUpperCase.setOnClickListener {
            val name = binding.edittextTextOutput.text.toString() .trim()

            if (name.isEmpty()){
                binding.edittextTextOutput.error = "Insert text"
                return@setOnClickListener
            }
            val uppercase = name.uppercase()
            binding.textviewOutput.text = "Result: $uppercase"
        }
        binding.buttonCapitalize.setOnClickListener {
            val name = binding.edittextTextOutput.text.toString() .trim()

            if (name.isEmpty()){
                binding.edittextTextOutput.error = "Insert text"
                return@setOnClickListener
            }
            val capitalize = name.replaceFirstChar { it.uppercase() }
            binding.textviewOutput.text = "Result: $capitalize"
        }
        binding.buttonReverse.setOnClickListener {
            val name = binding.edittextTextOutput.text.toString() .trim()

            if (name.isEmpty()){
                binding.edittextTextOutput.error = "Insert text"
                return@setOnClickListener
            }
            val reverse = name.reversed()
            binding.textviewOutput.text = "Result: $reverse"
        }

    }
}