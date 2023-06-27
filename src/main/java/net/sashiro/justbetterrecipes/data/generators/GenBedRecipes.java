package net.sashiro.justbetterrecipes.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static net.minecraft.world.level.block.Blocks.*;

@SuppressWarnings("DuplicatedCode")
public class GenBedRecipes extends RecipeProvider {
    public GenBedRecipes(PackOutput packOutput) {
        super(packOutput);
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        generateRecipes(consumer);
    }
    
    public static void generateRecipes(Consumer<FinishedRecipe> consumer) {
        Utils.generate(consumer, WHITE_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, WHITE_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, LIGHT_GRAY_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, GRAY_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, GRAY_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, BLACK_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, BLACK_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, BROWN_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, BROWN_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, RED_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, RED_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, ORANGE_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, ORANGE_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, YELLOW_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, YELLOW_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, LIME_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, LIME_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, GREEN_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, GREEN_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, CYAN_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, CYAN_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, LIGHT_BLUE_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, BLUE_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, BLUE_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, PURPLE_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
        Utils.generate(consumer, PURPLE_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, MAGENTA_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, MAGENTA_BED, Items.PINK_DYE, PINK_BED, "BED");
        
        Utils.generate(consumer, PINK_BED, Items.WHITE_DYE, WHITE_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.GRAY_DYE, GRAY_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.BLACK_DYE, BLACK_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.BROWN_DYE, BROWN_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.RED_DYE, RED_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.ORANGE_DYE, ORANGE_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.YELLOW_DYE, YELLOW_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.LIME_DYE, LIME_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.GREEN_DYE, GREEN_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.CYAN_DYE, CYAN_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.BLUE_DYE, BLUE_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.PURPLE_DYE, PURPLE_BED, "BED");
        Utils.generate(consumer, PINK_BED, Items.MAGENTA_DYE, MAGENTA_BED, "BED");
    }
}
