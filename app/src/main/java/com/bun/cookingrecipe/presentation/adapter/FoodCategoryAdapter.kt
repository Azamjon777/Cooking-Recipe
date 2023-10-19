package com.bun.cookingrecipe.presentation.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bun.cookingrecipe.databinding.CategoryItemBinding
import com.bun.cookingrecipe.presentation.model.FoodCategoryModel

class FoodCategoryAdapter :
    ListAdapter<FoodCategoryModel, FoodCategoryAdapter.CategoryViewHolder>(CategoryDiffCallback()) {

    inner class CategoryViewHolder(private val binding: CategoryItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(categoryItem: FoodCategoryModel) {
            binding.categoryName.text = categoryItem.categoryName
            binding.categoryImg.setImageResource(categoryItem.categoryImg)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = CategoryItemBinding.inflate(inflater, parent, false)
        return CategoryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val categoryItem = getItem(position)
        holder.bind(categoryItem)
    }
}
