package com.bun.cookingrecipe.presentation.viewmodel

import android.content.Context
import androidx.lifecycle.ViewModel
import com.bun.cookingrecipe.R
import com.bun.cookingrecipe.presentation.model.FoodCategoryModel
import com.bun.cookingrecipe.presentation.model.FoodModel

class DataViewModel(context: Context) : ViewModel() {

    val foodList = mutableListOf(
        FoodCategoryModel(
            categoryName = context.getString(R.string.fish),
            categoryImg = R.drawable.food_fish,
            listOfCategories = listOf(
                FoodModel(
                    title = context.getString(R.string.grilled_salmon),
                    desc = context.getString(R.string.desc1_1),
                    img = R.drawable.salmon_grilled,
                    netCarbs = 2,
                    fat = 12,
                    protein = 26,
                    ingredients = listOf(
                        context.getString(R.string.salmon_fillet),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.broccoli),
                        context.getString(R.string.lemon),
                        context.getString(R.string.salt_and_pepper_to_taste)
                    ),
                    recipe = context.getString(R.string.recipe1_1),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._280_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.grilled_salmon_),
                    desc = context.getString(R.string.desc1_2),
                    img = R.drawable.salmon_grill,
                    netCarbs = 2,
                    fat = 12,
                    protein = 26,
                    ingredients = listOf(
                        context.getString(R.string.salmon),
                        context.getString(R.string.garlic),
                        context.getString(R.string.lemon),
                        context.getString(R.string.olive_oil),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe1_2),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._280_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.tuna_steak),
                    desc = context.getString(R.string.desc1_3),
                    img = R.drawable.tuna_steak,
                    netCarbs = 3,
                    fat = 8,
                    protein = 30,
                    ingredients = listOf(
                        context.getString(R.string.tuna),
                        context.getString(R.string.lemon),
                        context.getString(R.string.soy_sauce),
                        context.getString(R.string.garlic),
                        context.getString(R.string.pepper)
                    ),
                    recipe = context.getString(R.string.recipe1_3),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._15_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._320_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.salmon_with),
                    desc = context.getString(R.string.desc1_4),
                    img = R.drawable.salmon_potato_puree,
                    netCarbs = 25,
                    fat = 15,
                    protein = 28,
                    ingredients = listOf(
                        context.getString(R.string.salmon),
                        context.getString(R.string.potatoes),
                        context.getString(R.string.milk),
                        context.getString(R.string.herbs),
                        context.getString(R.string.salt),
                        context.getString(R.string.pepper)
                    ),
                    recipe = context.getString(R.string.recipe1_4),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._380_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.eel_in_teriyaki_sauce),
                    desc = context.getString(R.string.desc1_5),
                    img = R.drawable.eel_teriyaki,
                    netCarbs = 15,
                    fat = 10,
                    protein = 20,
                    ingredients = listOf(
                        context.getString(R.string.eel),
                        context.getString(R.string.teriyaki_sauce),
                        context.getString(R.string.garlic),
                        context.getString(R.string.ginger),
                        context.getString(R.string.herbs)
                    ),
                    recipe = context.getString(R.string.recipe1_5),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._310_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.shrimp_with),
                    desc = context.getString(R.string.desc1_6),
                    img = R.drawable.garlic_lemon_shrimp,
                    netCarbs = 5,
                    fat = 6,
                    protein = 22,
                    ingredients = listOf(
                        context.getString(R.string.shrimp),
                        context.getString(R.string.lemon),
                        context.getString(R.string.garlic),
                        context.getString(R.string.olive_oil),
                        context.getString(R.string.parsley),
                        context.getString(R.string.pepper)
                    ),
                    recipe = context.getString(R.string.recipe1_6),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._15_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._180_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.mussels_in_creamy_sauce),
                    desc = context.getString(R.string.desc1_7),
                    img = R.drawable.mussels_in_cream_sauce,
                    netCarbs = 8,
                    fat = 12,
                    protein = 15,
                    ingredients = listOf(
                        context.getString(R.string.mussels),
                        context.getString(R.string.cream),
                        context.getString(R.string.garlic),
                        context.getString(R.string.parsley),
                        context.getString(R.string.white_wine)
                    ),
                    recipe = context.getString(R.string.recipe1_7),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._240_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.tuna_with_orange_glaze),
                    desc = context.getString(R.string.desc1_8),
                    img = R.drawable.tuna_orange_glaze,
                    netCarbs = 12,
                    fat = 10,
                    protein = 28,
                    ingredients = listOf(
                        context.getString(R.string.tuna),
                        context.getString(R.string.oranges),
                        context.getString(R.string.grapefruits),
                        context.getString(R.string.honey),
                        context.getString(R.string.soy_sauce)
                    ),
                    recipe = context.getString(R.string.recipe1_8),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._320_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.sardines_with_greens),
                    desc = context.getString(R.string.desc1_9),
                    img = R.drawable.sardines_with_greens,
                    netCarbs = 4,
                    fat = 8,
                    protein = 16,
                    ingredients = listOf(
                        context.getString(R.string.sardines),
                        context.getString(R.string.greens),
                        context.getString(R.string.lemon),
                        context.getString(R.string.olive_oil),
                        context.getString(R.string.salt),
                        context.getString(R.string.pepper)
                    ),
                    recipe = context.getString(R.string.recipe1_9),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._240_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.tuna_curry),
                    desc = context.getString(R.string.desc1_10),
                    img = R.drawable.tuna_curry,
                    netCarbs = 10,
                    fat = 14,
                    protein = 25,
                    ingredients = listOf(
                        context.getString(R.string.tuna),
                        context.getString(R.string.curry_paste),
                        context.getString(R.string.coconut_milk),
                        context.getString(R.string.vegetables),
                        context.getString(R.string.garlic),
                        context.getString(R.string.ginger)
                    ),
                    recipe = context.getString(R.string.recipe1_10),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._340_kcal)
                )
            )
        ),
        FoodCategoryModel(
            categoryName = context.getString(R.string.vegetables),
            categoryImg = R.drawable.food_vegetables,
            listOfCategories = listOf(
                FoodModel(
                    title = context.getString(R.string.broccoli_with_parmesan),
                    desc = context.getString(R.string.desc2_1),
                    img = R.drawable.broccoli_parmesan,
                    netCarbs = 5,
                    fat = 8,
                    protein = 4,
                    ingredients = listOf(
                        context.getString(R.string.broccoli),
                        context.getString(R.string.parmesan),
                        context.getString(R.string.spices),
                        context.getString(R.string.olive_oil)
                    ),
                    recipe = context.getString(R.string.recipe2_1),
                    categoryOfFood = context.getString(R.string.vegetables),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._110_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.greek_salad),
                    desc = context.getString(R.string.desc2_2),
                    img = R.drawable.greek_salad,
                    netCarbs = 7,
                    fat = 12,
                    protein = 6,
                    ingredients = listOf(
                        context.getString(R.string.cucumbers),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.feta_cheese),
                        context.getString(R.string.olives),
                        context.getString(R.string.onion),
                        context.getString(R.string.olive_oil)
                    ),
                    recipe = context.getString(R.string.recipe2_2),
                    categoryOfFood = context.getString(R.string.salads),
                    cookingTime = context.getString(R.string._15_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._160_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.potato_gratin),
                    desc = context.getString(R.string.desc2_3),
                    img = R.drawable.potato_gratin,
                    netCarbs = 20,
                    fat = 15,
                    protein = 6,
                    ingredients = listOf(
                        context.getString(R.string.potatoes),
                        context.getString(R.string.cream),
                        context.getString(R.string.cheese),
                        context.getString(R.string.garlic),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe2_3),
                    categoryOfFood = context.getString(R.string.vegetables),
                    cookingTime = context.getString(R.string._45_minutes),
                    servings = 6,
                    kcal = context.getString(R.string._280_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.ratatouille),
                    desc = context.getString(R.string.desc2_4),
                    img = R.drawable.ratatouille,
                    netCarbs = 15,
                    fat = 10,
                    protein = 5,
                    ingredients = listOf(
                        context.getString(R.string.eggplant),
                        context.getString(R.string.zucchini),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.onion),
                        context.getString(R.string.bell_pepper),
                        context.getString(R.string.garlic),
                        context.getString(R.string.tomato_sauce)
                    ),
                    recipe = context.getString(R.string.recipe2_4),
                    categoryOfFood = context.getString(R.string.vegetables),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._220_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.greek_stuffed_bake),
                    desc = context.getString(R.string.desc2_5),
                    img = R.drawable.greek_stuffed_bake,
                    netCarbs = 18,
                    fat = 14,
                    protein = 8,
                    ingredients = listOf(
                        context.getString(R.string.potatoes),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.feta_cheese),
                        context.getString(R.string.olives),
                        context.getString(R.string.olive_oil),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe2_5),
                    categoryOfFood = context.getString(R.string.vegetables),
                    cookingTime = context.getString(R.string._40_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._260_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.vegetable_rice),
                    desc = context.getString(R.string.desc2_6),
                    img = R.drawable.vegetable_rice,
                    netCarbs = 30,
                    fat = 6,
                    protein = 5,
                    ingredients = listOf(
                        context.getString(R.string.rice),
                        context.getString(R.string.broccoli),
                        context.getString(R.string.carrots),
                        context.getString(R.string.peas),
                        context.getString(R.string.onion),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe2_6),
                    categoryOfFood = context.getString(R.string.vegetables),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._240_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.spinach_soup),
                    desc = context.getString(R.string.desc2_7),
                    img = R.drawable.spinach_soup,
                    netCarbs = 12,
                    fat = 10,
                    protein = 4,
                    ingredients = listOf(
                        context.getString(R.string.spinach),
                        context.getString(R.string.potatoes),
                        context.getString(R.string.onion),
                        context.getString(R.string.cream),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe2_7),
                    categoryOfFood = context.getString(R.string.soups),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._200_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.baked_sweet_potatoes),
                    desc = context.getString(R.string.desc2_8),
                    img = R.drawable.sweet_potato,
                    netCarbs = 25,
                    fat = 2,
                    protein = 1,
                    ingredients = listOf(
                        context.getString(R.string.sweet_potatoes),
                        context.getString(R.string.honey),
                        context.getString(R.string.cinnamon),
                        context.getString(R.string.olive_oil)
                    ),
                    recipe = context.getString(R.string.recipe2_8),
                    categoryOfFood = context.getString(R.string.vegetables),
                    cookingTime = context.getString(R.string._35_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._180_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.cauliflower_salad),
                    desc = context.getString(R.string.desc2_9),
                    img = R.drawable.cauliflower_salad,
                    netCarbs = 8,
                    fat = 14,
                    protein = 6,
                    ingredients = listOf(
                        context.getString(R.string.cauliflower),
                        context.getString(R.string.bacon),
                        context.getString(R.string.ranch_dressing),
                        context.getString(R.string.herbs)
                    ),
                    recipe = context.getString(R.string.recipe2_9),
                    categoryOfFood = context.getString(R.string.salads),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._240_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.pumpkin_soup),
                    desc = context.getString(R.string.desc2_10),
                    img = R.drawable.pumpkin_soup,
                    netCarbs = 18,
                    fat = 10,
                    protein = 3,
                    ingredients = listOf(
                        context.getString(R.string.pumpkin),
                        context.getString(R.string.ginger),
                        context.getString(R.string.coconut_milk),
                        context.getString(R.string.onion),
                        context.getString(R.string.garlic),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe2_10),
                    categoryOfFood = context.getString(R.string.soups),
                    cookingTime = context.getString(R.string._35_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._220_kcal)
                )
            )

        ),
        FoodCategoryModel(
            categoryName = context.getString(R.string.meat),
            categoryImg = R.drawable.food_meat,
            listOfCategories = listOf(
                FoodModel(
                    title = context.getString(R.string.beef_steak),
                    desc = context.getString(R.string.desc3_1),
                    img = R.drawable.beef_steak,
                    netCarbs = 2,
                    fat = 18,
                    protein = 24,
                    ingredients = listOf(
                        context.getString(R.string.beef_steak),
                        context.getString(R.string.salt),
                        context.getString(R.string.pepper),
                        context.getString(R.string.rosemary),
                        context.getString(R.string.thyme)
                    ),
                    recipe = context.getString(R.string.recipe3_1),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._280_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.spicy_bbq_wings),
                    desc = context.getString(R.string.desc3_2),
                    img = R.drawable.bbq_wings,
                    netCarbs = 5,
                    fat = 14,
                    protein = 18,
                    ingredients = listOf(
                        context.getString(R.string.chicken_wings),
                        context.getString(R.string.bbq_sauce),
                        context.getString(R.string.paprika),
                        context.getString(R.string.garlic),
                        context.getString(R.string.salt)
                    ),
                    recipe = context.getString(R.string.recipe3_2),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._250_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.pork_with_honey_and_mustard),
                    desc = context.getString(R.string.desc3_3),
                    img = R.drawable.pork_mustard_honey,
                    netCarbs = 10,
                    fat = 20,
                    protein = 22,
                    ingredients = listOf(
                        context.getString(R.string.pork_cutlet),
                        context.getString(R.string.honey),
                        context.getString(R.string.mustard),
                        context.getString(R.string.garlic),
                        context.getString(R.string.salt)
                    ),
                    recipe = context.getString(R.string.recipe3_3),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._330_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.carbonara),
                    desc = context.getString(R.string.desc3_4),
                    img = R.drawable.carbonara,
                    netCarbs = 12,
                    fat = 22,
                    protein = 14,
                    ingredients = listOf(
                        context.getString(R.string.spaghetti),
                        context.getString(R.string.salmon),
                        context.getString(R.string.cream),
                        context.getString(R.string.parmesan),
                        context.getString(R.string.egg),
                        context.getString(R.string.garlic)
                    ),
                    recipe = context.getString(R.string.recipe3_5),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._380_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.cheese_stuffed_burgers),
                    desc = context.getString(R.string.desc3_5),
                    img = R.drawable.cheese_stuffed_burgers,
                    netCarbs = 8,
                    fat = 16,
                    protein = 20,
                    ingredients = listOf(
                        context.getString(R.string.ground_meat),
                        context.getString(R.string.cheese),
                        context.getString(R.string.onion),
                        context.getString(R.string.spices),
                        context.getString(R.string.breadcrumbs)
                    ),
                    recipe = context.getString(R.string.recipe3_4),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._320_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.chicken_nuggets),
                    desc = context.getString(R.string.desc3_6),
                    img = R.drawable.chicken_nuggets,
                    netCarbs = 10,
                    fat = 12,
                    protein = 16,
                    ingredients = listOf(
                        context.getString(R.string.chicken_pieces),
                        context.getString(R.string.egg),
                        context.getString(R.string.breadcrumbs),
                        context.getString(R.string.spices),
                        context.getString(R.string.sauce_of_your_choice)
                    ),
                    recipe = context.getString(R.string.recipe3_6),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._280_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.bbq_ribs),
                    desc = context.getString(R.string.desc3_7),
                    img = R.drawable.bbq_ribs,
                    netCarbs = 15,
                    fat = 20,
                    protein = 24,
                    ingredients = listOf(
                        context.getString(R.string.pork_ribs),
                        context.getString(R.string.bbq_sauce),
                        context.getString(R.string.spices),
                        context.getString(R.string.garlic),
                        context.getString(R.string.salt)
                    ),
                    recipe = context.getString(R.string.recipe3_7),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._2_hours),
                    servings = 4,
                    kcal = context.getString(R.string._360_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.beef_meatballs),
                    desc = context.getString(R.string.desc3_8),
                    img = R.drawable.meatballs,
                    netCarbs = 7,
                    fat = 14,
                    protein = 18,
                    ingredients = listOf(
                        context.getString(R.string.ground_beef),
                        context.getString(R.string.tomato_sauce),
                        context.getString(R.string.onion),
                        context.getString(R.string.spices),
                        context.getString(R.string.salt)
                    ),
                    recipe = context.getString(R.string.recipe3_8),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._35_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._320_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.turkey_with_cranberry_sauce),
                    desc = context.getString(R.string.desc3_9),
                    img = R.drawable.turkey_cranberry_sauce,
                    netCarbs = 10,
                    fat = 18,
                    protein = 22,
                    ingredients = listOf(
                        context.getString(R.string.turkey),
                        context.getString(R.string.cranberry_sauce),
                        context.getString(R.string.rosemary),
                        context.getString(R.string.garlic),
                        context.getString(R.string.salt)
                    ),
                    recipe = context.getString(R.string.recipe3_9),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._2_hours),
                    servings = 6,
                    kcal = context.getString(R.string._350_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.chicken_and_vegetable_noodles),
                    desc = context.getString(R.string.desc3_10),
                    img = R.drawable.chicken_veggie_noodles,
                    netCarbs = 15,
                    fat = 10,
                    protein = 16,
                    ingredients = listOf(
                        context.getString(R.string.chicken_breast),
                        context.getString(R.string.noodles),
                        context.getString(R.string.broccoli),
                        context.getString(R.string.carrots),
                        context.getString(R.string.soy_sauce)
                    ),
                    recipe = context.getString(R.string.recipe3_10),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._320_kcal)
                )
            )
        ),
        FoodCategoryModel(
            categoryName = context.getString(R.string.dinner),
            categoryImg = R.drawable.food_dinner,
            listOfCategories = listOf(
                FoodModel(
                    title = context.getString(R.string.carbonara),
                    desc = context.getString(R.string.desc4_1),
                    img = R.drawable.carbonara,
                    netCarbs = 12,
                    fat = 22,
                    protein = 14,
                    ingredients = listOf(
                        context.getString(R.string.spaghetti),
                        context.getString(R.string.salmon),
                        context.getString(R.string.cream),
                        context.getString(R.string.parmesan),
                        context.getString(R.string.egg),
                        context.getString(R.string.garlic)
                    ),
                    recipe = context.getString(R.string.recipe4_1),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._380_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.steak_with_mushroom_sauce),
                    desc = context.getString(R.string.desc4_2),
                    img = R.drawable.steak_mushroom_sauce,
                    netCarbs = 5,
                    fat = 30,
                    protein = 35,
                    ingredients = listOf(
                        context.getString(R.string.steak),
                        context.getString(R.string.mushrooms),
                        context.getString(R.string.cream),
                        context.getString(R.string.onion),
                        context.getString(R.string.garlic),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe4_2),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._450_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.chicken_with_vegetables),
                    desc = context.getString(R.string.desc4_3),
                    img = R.drawable.chicken_vegetables,
                    netCarbs = 10,
                    fat = 12,
                    protein = 28,
                    ingredients = listOf(
                        context.getString(R.string.chicken_breast),
                        context.getString(R.string.potatoes),
                        context.getString(R.string.broccoli),
                        context.getString(R.string.carrots),
                        context.getString(R.string.onion),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe4_3),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._35_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._320_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.pork_with_apples),
                    desc = context.getString(R.string.desc4_4),
                    img = R.drawable.pork_apples,
                    netCarbs = 15,
                    fat = 18,
                    protein = 24,
                    ingredients = listOf(
                        context.getString(R.string.pork),
                        context.getString(R.string.apples),
                        context.getString(R.string.caramel_sauce),
                        context.getString(R.string.garlic),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe4_4),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._40_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._380_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.beef_teriyaki),
                    desc = context.getString(R.string.desc4_5),
                    img = R.drawable.beef_teriyaki,
                    netCarbs = 8,
                    fat = 14,
                    protein = 30,
                    ingredients = listOf(
                        context.getString(R.string.beef),
                        context.getString(R.string.teriyaki_sauce),
                        context.getString(R.string.garlic),
                        context.getString(R.string.ginger),
                        context.getString(R.string.greens)
                    ),
                    recipe = context.getString(R.string.recipe4_5),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 3,
                    kcal = context.getString(R.string._340_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.fish_fillet_with_lemon),
                    desc = context.getString(R.string.desc4_6),
                    img = R.drawable.fish_lemon,
                    netCarbs = 3,
                    fat = 6,
                    protein = 25,
                    ingredients = listOf(
                        context.getString(R.string.fish_fillet),
                        context.getString(R.string.lemon),
                        context.getString(R.string.herbs),
                        context.getString(R.string.garlic),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe4_6),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._230_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.chicken_kiev_cutlets),
                    desc = context.getString(R.string.desc4_7),
                    img = R.drawable.kiev_cutlets,
                    netCarbs = 10,
                    fat = 20,
                    protein = 28,
                    ingredients = listOf(
                        context.getString(R.string.chicken_mince),
                        context.getString(R.string.butter),
                        context.getString(R.string.spices),
                        context.getString(R.string.breadcrumbs)
                    ),
                    recipe = context.getString(R.string.recipe4_7),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._360_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.bbq_pork_ribs),
                    desc = context.getString(R.string.desc4_8),
                    img = R.drawable.bbq_ribs,
                    netCarbs = 15,
                    fat = 25,
                    protein = 30,
                    ingredients = listOf(
                        context.getString(R.string.pork_ribs),
                        context.getString(R.string.barbecue_sauce),
                        context.getString(R.string.spices),
                        context.getString(R.string.garlic)
                    ),
                    recipe = context.getString(R.string.recipe4_8),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._60_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._420_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.pasta_with_meat_sauce),
                    desc = context.getString(R.string.desc4_9),
                    img = R.drawable.pasta_meat_sauce,
                    netCarbs = 40,
                    fat = 15,
                    protein = 20,
                    ingredients = listOf(
                        context.getString(R.string.spaghetti),
                        context.getString(R.string.minced_meat),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.onion),
                        context.getString(R.string.garlic),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe4_9),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._420_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.pork_cutlets),
                    desc = context.getString(R.string.desc4_10),
                    img = R.drawable.pork_cutlets,
                    netCarbs = 8,
                    fat = 15,
                    protein = 22,
                    ingredients = listOf(
                        context.getString(R.string.pork),
                        context.getString(R.string.spices),
                        context.getString(
                            R.string.breadcrumbs
                        )
                    ),
                    recipe = context.getString(R.string.recipe4_10),
                    categoryOfFood = context.getString(R.string.meat),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._340_kcal)
                )
            )
        ),
        FoodCategoryModel(
            categoryName = context.getString(R.string.lunch),
            categoryImg = R.drawable.food_lunch,
            listOfCategories = listOf(
                FoodModel(
                    title = context.getString(R.string.greek_pita_light),
                    desc = context.getString(R.string.desc5_1),
                    img = R.drawable.greek_pita_light,
                    netCarbs = 10,
                    fat = 8,
                    protein = 6,
                    ingredients = listOf(
                        context.getString(R.string.pita_bread),
                        context.getString(R.string.cucumbers),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.feta),
                        context.getString(R.string.olive_oil),
                        context.getString(R.string.herbs)
                    ),
                    recipe = context.getString(R.string.recipe5_1),
                    categoryOfFood = context.getString(R.string.salads),
                    cookingTime = context.getString(R.string._10_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._280_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.tuna_salad),
                    desc = context.getString(R.string.desc5_2),
                    img = R.drawable.tuna_salad,
                    netCarbs = 5,
                    fat = 10,
                    protein = 25,
                    ingredients = listOf(
                        context.getString(R.string.tuna),
                        context.getString(R.string.mixed_greens),
                        context.getString(R.string.olive_oil),
                        context.getString(R.string.lemon_juice),
                        context.getString(R.string.pepper),
                        context.getString(R.string.salt)
                    ),
                    recipe = context.getString(R.string.recipe5_2),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._15_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._320_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.chicken_sandwich),
                    desc = context.getString(R.string.desc5_3),
                    img = R.drawable.chicken_sandwich,
                    netCarbs = 20,
                    fat = 12,
                    protein = 28,
                    ingredients = listOf(
                        context.getString(R.string.chicken_fillet),
                        context.getString(R.string.avocado),
                        context.getString(R.string.lettuce_leaves),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.mayonnaise),
                        context.getString(R.string.mustard),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe5_3),
                    categoryOfFood = context.getString(R.string.sandwiches),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._360_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.vegetable_omelette),
                    desc = context.getString(R.string.desc5_4),
                    img = R.drawable.vegetable_omelette,
                    netCarbs = 7,
                    fat = 14,
                    protein = 12,
                    ingredients = listOf(
                        context.getString(R.string.eggs),
                        context.getString(R.string.broccoli),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.cheese),
                        context.getString(R.string.herbs),
                        context.getString(R.string.milk)
                    ),
                    recipe = context.getString(R.string.recipe5_4),
                    categoryOfFood = context.getString(R.string.egg_dishes),
                    cookingTime = context.getString(R.string._15_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._250_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.shrimp_salad),
                    desc = context.getString(R.string.desc5_5),
                    img = R.drawable.shrimp_salad,
                    netCarbs = 8,
                    fat = 12,
                    protein = 20,
                    ingredients = listOf(
                        context.getString(R.string.shrimp),
                        context.getString(R.string.avocado),
                        context.getString(R.string.lettuce),
                        context.getString(R.string.olive_oil),
                        context.getString(R.string.lemon_juice),
                        context.getString(R.string.pepper),
                        context.getString(R.string.salt)
                    ),
                    recipe = context.getString(R.string.recipe5_5),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._10_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._300_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.quinoa_with_vegetables),
                    desc = context.getString(R.string.desc5_6),
                    img = R.drawable.quinoa_vegetables,
                    netCarbs = 35,
                    fat = 10,
                    protein = 10,
                    ingredients = listOf(
                        context.getString(R.string.quinoa),
                        context.getString(R.string.broccoli),
                        context.getString(R.string.carrots),
                        context.getString(R.string.peas),
                        context.getString(R.string.onion),
                        context.getString(R.string.herbs),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe5_6),
                    categoryOfFood = context.getString(R.string.vegetables),
                    cookingTime = context.getString(R.string._20_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._320_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.turkey_sandwich),
                    desc = context.getString(R.string.desc5_7),
                    img = R.drawable.turkey_sandwich,
                    netCarbs = 25,
                    fat = 6,
                    protein = 18,
                    ingredients = listOf(
                        context.getString(R.string.turkey),
                        context.getString(R.string.red_onion),
                        context.getString(R.string.lettuce),
                        context.getString(R.string.mustard),
                        context.getString(R.string.lemon_juice),
                        context.getString(R.string.pepper),
                        context.getString(R.string.salt)
                    ),
                    recipe = context.getString(R.string.recipe5_7),
                    categoryOfFood = context.getString(R.string.sandwiches),
                    cookingTime = context.getString(R.string._15_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._280_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.pasta_with_mushrooms),
                    desc = context.getString(R.string.desc5_8),
                    img = R.drawable.pasta_mushrooms,
                    netCarbs = 40,
                    fat = 18,
                    protein = 14,
                    ingredients = listOf(
                        context.getString(R.string.pasta),
                        context.getString(R.string.mushrooms),
                        context.getString(R.string.cream),
                        context.getString(R.string.cheese),
                        context.getString(R.string.garlic),
                        context.getString(R.string.parsley)
                    ),
                    recipe = context.getString(R.string.recipe5_8),
                    categoryOfFood = context.getString(R.string.pasta),
                    cookingTime = context.getString(R.string._25_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._380_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.goulash_soup),
                    desc = context.getString(R.string.desc5_9),
                    img = R.drawable.goulash_soup,
                    netCarbs = 15,
                    fat = 12,
                    protein = 20,
                    ingredients = listOf(
                        context.getString(R.string.beef),
                        context.getString(R.string.potatoes),
                        context.getString(R.string.paprika),
                        context.getString(R.string.onion),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.spices)
                    ),
                    recipe = context.getString(R.string.recipe5_9),
                    categoryOfFood = context.getString(R.string.soups),
                    cookingTime = context.getString(R.string._30_minutes),
                    servings = 4,
                    kcal = context.getString(R.string._350_kcal)
                ),
                FoodModel(
                    title = context.getString(R.string.tuna_vegetable_salad),
                    desc = context.getString(R.string.desc5_10),
                    img = R.drawable.tuna_vegetable_salad,
                    netCarbs = 10,
                    fat = 6,
                    protein = 24,
                    ingredients = listOf(
                        context.getString(R.string.tuna),
                        context.getString(R.string.mixed_greens),
                        context.getString(R.string.tomatoes),
                        context.getString(R.string.cucumbers),
                        context.getString(R.string.olives),
                        context.getString(R.string.olive_oil)
                    ),
                    recipe = context.getString(R.string.recipe5_10),
                    categoryOfFood = context.getString(R.string.seafood),
                    cookingTime = context.getString(R.string._10_minutes),
                    servings = 2,
                    kcal = context.getString(R.string._280_kcal)
                )
            )
        )
    )
}
