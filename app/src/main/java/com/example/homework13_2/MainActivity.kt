package com.example.homework13_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.homework13_2.databinding.ActivityMainBinding
import com.example.homework13_2.databinding.ItemRvBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ItemRvBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ItemRvBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}