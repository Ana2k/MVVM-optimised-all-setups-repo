package com.example

import android.util.Log
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclereviewplaylistyt.databinding.ExampleItemBinding

class ExampleViewHolder(private val binding: ExampleItemBinding) :
    RecyclerView.ViewHolder(binding.root) {
    init {
        binding.imageDelete.setOnClickListener {
            Log.d("Lord Krishna", "On DeleteItem CLicked")
        }

        binding.textViewFirst.setOnClickListener {
            Log.d("Lord Krishna", "Text View First clicked")
        }
    }

    fun bind(item: ExampleItem) {
        binding.textViewFirst.text = item.text1
        binding.textViewSecond.text = item.text2
        binding.imageView.setImageResource(item.imageResource)
    }
}