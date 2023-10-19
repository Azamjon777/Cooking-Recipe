package com.bun.cookingrecipe.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.bun.cookingrecipe.presentation.model.FoodCategoryModel

class CategoryDiffCallback : DiffUtil.ItemCallback<FoodCategoryModel>() {

    override fun areItemsTheSame(oldItem: FoodCategoryModel, newItem: FoodCategoryModel): Boolean {
        return oldItem.categoryName == newItem.categoryName
    }

    override fun areContentsTheSame(
        oldItem: FoodCategoryModel,
        newItem: FoodCategoryModel
    ): Boolean {
        return true
    }
}
