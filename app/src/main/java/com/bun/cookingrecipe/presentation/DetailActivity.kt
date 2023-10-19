package com.bun.cookingrecipe.presentation

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bun.cookingrecipe.R
import com.bun.cookingrecipe.databinding.ActivityDetailBinding
import com.bun.cookingrecipe.presentation.adapter.IngredientsAdapter
import com.bun.cookingrecipe.presentation.model.FoodModel
import com.google.android.material.bottomsheet.BottomSheetBehavior

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val foodItem = intent.getSerializableExtra("foodItem") as FoodModel

        BottomSheetBehavior.from(binding.sheet).apply {
            peekHeight = 850
            this.state = BottomSheetBehavior.STATE_COLLAPSED
        }

        binding.itemImg.setImageResource(foodItem.img)
        binding.itemTitle.text = foodItem.title
        binding.cookingTime.text = foodItem.cookingTime
        binding.tvServings.text = foodItem.servings.toString()
        binding.tvKcal.text = foodItem.kcal
        binding.itemNetCarbs.text = foodItem.netCarbs.toString()
        binding.itemFat.text = foodItem.fat.toString()
        binding.itemProtein.text = foodItem.protein.toString()

        val adapter = IngredientsAdapter()
        binding.recyclerView.adapter = adapter
        adapter.submitList(foodItem.ingredients)

        binding.netCarbsProgressPercent.apply {
            progressMax = 100f
            progress = foodItem.netCarbs.toFloat()
            progressBarColor = R.color.system_color
        }
        binding.fatProgressPercent.apply {
            progressMax = 100f
            progress = foodItem.fat.toFloat()
            progressBarColor = R.color.system_color2
        }
        binding.proteinProgressPercent.apply {
            progressMax = 100f
            progress = foodItem.protein.toFloat()
            progressBarColor = R.color.system_color3
        }
        binding.btnStartProgram.setOnClickListener {
            val intent = Intent(this, AllDetailActivity::class.java)
            intent.putExtra("all", foodItem)
            startActivity(intent)
        }
    }
}
