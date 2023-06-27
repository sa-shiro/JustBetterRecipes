package net.sashiro.justbetterrecipes.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.block.Block;

import javax.annotation.Nullable;
import java.util.function.Consumer;

@SuppressWarnings({"DuplicatedCode", "unused", "NullableProblems"})
public class Utils extends RecipeProvider {
    Utils(PackOutput p_248933_) {
        super(p_248933_);
    }
    
    public static void generateColor(Consumer<FinishedRecipe> consumer, Block ingredient, Item dye, Block result, String group) {
        String dyeName = dye.getDescriptionId().replace("item.minecraft.", "").replace("_dye", "");
        String groupName = dyeName + "_colored_" + group.toLowerCase();
        RecipeCategory recipeCategory = RecipeCategory.MISC;
        
        String modName = "JBR";
        
        if (ingredient.getDescriptionId().contains("wool") || ingredient.getDescriptionId().contains("carpet") || ingredient.getDescriptionId().contains("bed"))
            modName = "JRB_OLD";
        
        if (ingredient.getDescriptionId().contains("concrete")
                || ingredient.getDescriptionId().contains("terracotta")
                || (ingredient.getDescriptionId().contains("stained_glass") && !ingredient.getDescriptionId().contains("pane"))
        ) {
            recipeCategory = RecipeCategory.BUILDING_BLOCKS;
            ShapedRecipeBuilder.shaped(recipeCategory, result) // result
                    .define('#', ingredient) // ingredient 1
                    .define('X', dye) // ingredient 2
                    .pattern("XXX")
                    .pattern("X#X")
                    .pattern("XXX")
                    .group(groupName)
                    .unlockedBy("has_item", RecipeProvider.has(ingredient))
                    .save(consumer, new ResourceLocation(modName.toLowerCase(), RecipeProvider.getConversionRecipeName(result, ingredient)));
            
        } else {
            if (ingredient.getDescriptionId().contains("banner")
                    || ingredient.getDescriptionId().contains("carpet")
                    || ingredient.getDescriptionId().contains("candle"))
                recipeCategory = RecipeCategory.DECORATIONS;
            ShapelessRecipeBuilder.shapeless(recipeCategory, result) // result
                    .requires(ingredient) // ingredient 1
                    .requires(dye) // ingredient 2
                    .group(groupName)
                    .unlockedBy("has_item", has(ingredient))
                    .save(consumer, new ResourceLocation(modName.toLowerCase(), getConversionRecipeName(result, ingredient)));
        }
    }
    
    public static void generate(Consumer<FinishedRecipe> consumer, Block ingredient, Block result, String group) {
        if (ingredient.getDescriptionId().contains("slab")) {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result) // result
                    .define('A', ingredient) // ingredient 1
                    .define('B', Items.SLIME_BALL) // ingredient 2
                    .pattern("ABA")
                    .group(group)
                    .unlockedBy("has_item", RecipeProvider.has(ingredient))
                    .save(consumer, new ResourceLocation("JBR".toLowerCase(), RecipeProvider.getConversionRecipeName(result, ingredient) + "_horizontal"));
            
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, result) // result
                    .define('A', ingredient) // ingredient 1
                    .define('B', Items.SLIME_BALL) // ingredient 2
                    .pattern("A")
                    .pattern("B")
                    .pattern("A")
                    .group(group)
                    .unlockedBy("has_item", RecipeProvider.has(ingredient))
                    .save(consumer, new ResourceLocation("JBR".toLowerCase(), RecipeProvider.getConversionRecipeName(result, ingredient) + "_vertical"));
        } else {
            ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, result) // result
                    .define('A', ingredient) // ingredient 1
                    .define('B', Items.SLIME_BALL) // ingredient 2
                    .pattern(" A ")
                    .pattern("ABA")
                    .pattern(" A ")
                    .group(group)
                    .unlockedBy("has_item", RecipeProvider.has(ingredient))
                    .save(consumer, new ResourceLocation("JBR".toLowerCase(), RecipeProvider.getConversionRecipeName(result, ingredient)));
        }
    }
    
    public static void generateSmelting(Consumer<FinishedRecipe> consumer, @Nullable String group, Item ingredient, Item result, RecipeSerializer<? extends AbstractCookingRecipe> recipeType, float xp) {
        int cookingTime = recipeType == RecipeSerializer.SMELTING_RECIPE ? 200 : 100;
        generateSmelting(consumer, group, ingredient, result, recipeType, xp, cookingTime);
    }
    
    public static void generateSmelting(Consumer<FinishedRecipe> consumer, @Nullable String group, Item ingredient, Item result, RecipeSerializer<? extends AbstractCookingRecipe> recipeType, float xp, int cookingTime) {
        String recipeName;
        
        if (recipeType == RecipeSerializer.BLASTING_RECIPE) recipeName = "_from_blasting";
        else if (recipeType == RecipeSerializer.SMOKING_RECIPE) recipeName = "_from_smoking";
        else recipeName = "_from_smelting";
        
        if (group != null) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(ingredient), RecipeCategory.MISC, result, xp, cookingTime, recipeType)
                    .group(group.toLowerCase())
                    .unlockedBy(getHasName(ingredient), has(ingredient))
                    .save(consumer, new ResourceLocation("JBR".toLowerCase(), getItemName(result) + recipeName + "_" + getItemName(ingredient)));
        } else {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(ingredient), RecipeCategory.MISC, result, xp, cookingTime, recipeType)
                    .unlockedBy(getHasName(ingredient), has(ingredient))
                    .save(consumer, new ResourceLocation("JBR".toLowerCase(), getItemName(result) + recipeName + "_" + getItemName(ingredient)));
        }
    }
    
    public static void generateStonecutting(Consumer<FinishedRecipe> consumer, Item ingredient, Item Result, int count) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), RecipeCategory.BUILDING_BLOCKS, Result, count)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer, new ResourceLocation("JBR".toLowerCase(), getConversionRecipeName(Result, ingredient) + "_stonecutting"));
    }
    
    public static void generateStonecutting(Consumer<FinishedRecipe> consumer, Item ingredient, Item Result, int count, RecipeCategory recipeCategory) {
        SingleItemRecipeBuilder.stonecutting(Ingredient.of(ingredient), recipeCategory, Result, count)
                .unlockedBy(getHasName(ingredient), has(ingredient))
                .save(consumer, new ResourceLocation("JBR".toLowerCase(), getConversionRecipeName(Result, ingredient) + "_stonecutting"));
    }
    
    public static void generate(Consumer<FinishedRecipe> consumer, Item ingredient, Item result, String groupName) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, result) // result
                .requires(ingredient) // ingredient 1
                .requires(Items.BONE_MEAL) // ingredient 2
                .requires(Items.WATER_BUCKET) // ingredient 3
                .group(groupName)
                .unlockedBy("has_item", has(ingredient))
                .save(consumer, new ResourceLocation("JBR".toLowerCase(), getConversionRecipeName(result, ingredient)));
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> p_251297_) {
    }
}
