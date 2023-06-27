package net.sashiro.justbetterrecipes.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static net.minecraft.world.level.block.Blocks.*;

@SuppressWarnings("DuplicatedCode")
public class GenWoolRecipes extends RecipeProvider {
    public GenWoolRecipes(PackOutput packOutput) {
        super(packOutput);
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        generateRecipes(consumer);
    }
    
    public static void generateRecipes(Consumer<FinishedRecipe> consumer) {
        Utils.generate(consumer, WHITE_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, WHITE_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_GRAY_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, GRAY_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, GRAY_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, BLACK_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, BLACK_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, BROWN_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, BROWN_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, RED_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, RED_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, ORANGE_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, ORANGE_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, YELLOW_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, YELLOW_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, LIME_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, LIME_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, GREEN_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, GREEN_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, CYAN_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, CYAN_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, LIGHT_BLUE_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, BLUE_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, BLUE_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, PURPLE_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
        Utils.generate(consumer, PURPLE_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, MAGENTA_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, MAGENTA_WOOL, Items.PINK_DYE, PINK_WOOL, "WOOL");
        
        Utils.generate(consumer, PINK_WOOL, Items.WHITE_DYE, WHITE_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.GRAY_DYE, GRAY_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.BLACK_DYE, BLACK_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.BROWN_DYE, BROWN_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.RED_DYE, RED_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.ORANGE_DYE, ORANGE_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.YELLOW_DYE, YELLOW_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.LIME_DYE, LIME_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.GREEN_DYE, GREEN_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.CYAN_DYE, CYAN_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.BLUE_DYE, BLUE_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.PURPLE_DYE, PURPLE_WOOL, "WOOL");
        Utils.generate(consumer, PINK_WOOL, Items.MAGENTA_DYE, MAGENTA_WOOL, "WOOL");
    }
}
