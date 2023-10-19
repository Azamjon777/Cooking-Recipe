package com.bun.cookingrecipe.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bun.cookingrecipe.databinding.ActivityAllDetailBinding
import com.bun.cookingrecipe.presentation.model.FoodModel

class AllDetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAllDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAllDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val foodItem = intent.getSerializableExtra("all") as FoodModel

        binding.itemImg.setImageResource(foodItem.img)
        binding.itemTitle.text = foodItem.title
        binding.itemDesc.text = foodItem.desc

        binding.imgBack.setOnClickListener {
            finish()
        }
        binding.btnDone.setOnClickListener {
            finish()
        }
    }
}