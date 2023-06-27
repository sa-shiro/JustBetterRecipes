package net.sashiro.justbetterrecipes.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

@SuppressWarnings({"DuplicatedCode", "unused", "NullableProblems"})
public class GenWoodRecipes extends RecipeProvider {
    public GenWoodRecipes(PackOutput packOutput) {
        super(packOutput);
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        generateRecipes(consumer);
    }
    
    public static void generateRecipes(Consumer<FinishedRecipe> consumer) {
        // =============================================================================================================
        // [ Oak ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.STRIPPED_OAK_LOG, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.OAK_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_LOG, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.STRIPPED_OAK_WOOD, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.OAK_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_WOOD, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.OAK_PLANKS, Items.OAK_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_PLANKS, Items.OAK_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_PLANKS, Items.OAK_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_PLANKS, Items.OAK_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_PLANKS, Items.OAK_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_PLANKS, Items.OAK_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.OAK_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OAK_BOAT, Items.STICK, 8, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Dark Oak ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.STRIPPED_DARK_OAK_LOG, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.DARK_OAK_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_LOG, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.STRIPPED_DARK_OAK_WOOD, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.DARK_OAK_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_WOOD, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_PLANKS, Items.DARK_OAK_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.DARK_OAK_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DARK_OAK_BOAT, Items.STICK, 8, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Spruce ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.STRIPPED_SPRUCE_LOG, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.SPRUCE_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_LOG, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.STRIPPED_SPRUCE_WOOD, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.SPRUCE_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_WOOD, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_PLANKS, Items.SPRUCE_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.SPRUCE_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPRUCE_BOAT, Items.STICK, 8, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Birch ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.STRIPPED_BIRCH_LOG, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.BIRCH_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_LOG, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.STRIPPED_BIRCH_WOOD, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.BIRCH_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_WOOD, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.BIRCH_PLANKS, Items.BIRCH_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_PLANKS, Items.BIRCH_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_PLANKS, Items.BIRCH_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_PLANKS, Items.BIRCH_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_PLANKS, Items.BIRCH_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_PLANKS, Items.BIRCH_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.BIRCH_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BIRCH_BOAT, Items.STICK, 8, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Jungle ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.STRIPPED_JUNGLE_LOG, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.JUNGLE_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_LOG, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.STRIPPED_JUNGLE_WOOD, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.JUNGLE_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_WOOD, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_PLANKS, Items.JUNGLE_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.JUNGLE_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.JUNGLE_BOAT, Items.STICK, 8, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Acacia ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.STRIPPED_ACACIA_LOG, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.ACACIA_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_LOG, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.STRIPPED_ACACIA_WOOD, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.ACACIA_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_WOOD, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.ACACIA_PLANKS, Items.ACACIA_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_PLANKS, Items.ACACIA_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_PLANKS, Items.ACACIA_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_PLANKS, Items.ACACIA_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_PLANKS, Items.ACACIA_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_PLANKS, Items.ACACIA_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.ACACIA_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ACACIA_BOAT, Items.STICK, 8, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Mangrove ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.STRIPPED_MANGROVE_LOG, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.MANGROVE_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_LOG, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.STRIPPED_MANGROVE_WOOD, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.MANGROVE_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_WOOD, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.MANGROVE_PLANKS, Items.MANGROVE_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_PLANKS, Items.MANGROVE_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_PLANKS, Items.MANGROVE_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_PLANKS, Items.MANGROVE_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_PLANKS, Items.MANGROVE_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_PLANKS, Items.MANGROVE_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.MANGROVE_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MANGROVE_BOAT, Items.STICK, 8, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Cherry ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.STRIPPED_CHERRY_LOG, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.CHERRY_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_LOG, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.STRIPPED_CHERRY_WOOD, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.CHERRY_BOAT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_WOOD, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.CHERRY_PLANKS, Items.CHERRY_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_PLANKS, Items.CHERRY_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_PLANKS, Items.CHERRY_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_PLANKS, Items.CHERRY_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_PLANKS, Items.CHERRY_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_PLANKS, Items.CHERRY_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.CHERRY_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHERRY_BOAT, Items.STICK, 8, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Bamboo ] Wood Types
        // =============================================================================================================
        
        // Block VARIANT
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.STRIPPED_BAMBOO_BLOCK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_MOSAIC, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_MOSAIC_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_MOSAIC_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.BAMBOO_RAFT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BLOCK, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_MOSAIC, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_MOSAIC_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_MOSAIC_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.BAMBOO_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // MOSAIC
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.BAMBOO_MOSAIC_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.BAMBOO_MOSAIC_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.BAMBOO_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.BAMBOO_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.BAMBOO_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.BAMBOO_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.BAMBOO_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.BAMBOO_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_MOSAIC_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO_RAFT, Items.STICK, 8, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Crimson ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.STRIPPED_CRIMSON_STEM, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.CRIMSON_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_STEM, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.STRIPPED_CRIMSON_HYPHAE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.CRIMSON_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HYPHAE, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_PLANKS, Items.CRIMSON_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.CRIMSON_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CRIMSON_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        
        // =============================================================================================================
        // [ Warped ] Wood Types
        // =============================================================================================================
        
        // LOG VARIANT
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.STRIPPED_WARPED_STEM, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.WARPED_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_STEM, Items.LADDER, 4, RecipeCategory.MISC);
        // WOOD VARIANT
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.STRIPPED_WARPED_HYPHAE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_PLANKS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_STAIRS, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_SLAB, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_FENCE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_DOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_TRAPDOOR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_PRESSURE_PLATE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_BUTTON, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.WARPED_SIGN, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HYPHAE, Items.LADDER, 4, RecipeCategory.MISC);
        // PLANKS
        Utils.generateStonecutting(consumer, Items.WARPED_PLANKS, Items.WARPED_STAIRS, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_PLANKS, Items.WARPED_SLAB, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_PLANKS, Items.WARPED_FENCE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_PLANKS, Items.WARPED_FENCE_GATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_PLANKS, Items.WARPED_PRESSURE_PLATE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_PLANKS, Items.WARPED_BUTTON, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_PLANKS, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_PLANKS, Items.LADDER, 2, RecipeCategory.MISC);
        // ITEM RECYCLE
        Utils.generateStonecutting(consumer, Items.WARPED_STAIRS, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_SLAB, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_FENCE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_FENCE_GATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_DOOR, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_TRAPDOOR, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_PRESSURE_PLATE, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_BUTTON, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_SIGN, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_HANGING_SIGN, Items.STICK, 3, RecipeCategory.MISC);
    }
}
