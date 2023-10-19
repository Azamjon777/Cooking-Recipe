package com.bun.cookingrecipe.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.bun.cookingrecipe.presentation.model.FoodModel

class FoodDiffCallback : DiffUtil.ItemCallback<FoodModel>() {
    override fun areItemsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: FoodModel, newItem: FoodModel): Boolean {
        return oldItem == newItem
    }
}
