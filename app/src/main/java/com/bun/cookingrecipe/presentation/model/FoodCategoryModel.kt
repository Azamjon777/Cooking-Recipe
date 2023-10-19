package com.bun.cookingrecipe.presentation.model

import java.io.Serializable

data class FoodCategoryModel(
    val categoryName: String,
    val categoryImg: Int,
    val listOfCategories: List<FoodModel>
) : Serializable