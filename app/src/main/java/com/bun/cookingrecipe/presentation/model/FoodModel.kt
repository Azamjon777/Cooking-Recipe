package com.bun.cookingrecipe.presentation.model

import java.io.Serializable

data class FoodModel(
    val title: String,
    val desc: String,
    val img: Int,
    val netCarbs: Int,
    val fat: Int,
    val protein: Int,
    val ingredients: List<String>,
    val recipe: String,
    val categoryOfFood: String,
    val cookingTime: String,
    val servings: Int,
    val kcal: String
) : Serializable