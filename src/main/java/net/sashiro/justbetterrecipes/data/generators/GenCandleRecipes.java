package net.sashiro.justbetterrecipes.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static net.minecraft.world.level.block.Blocks.*;

@SuppressWarnings("DuplicatedCode")
public class GenCandleRecipes extends RecipeProvider {
    public GenCandleRecipes(PackOutput packOutput) {
        super(packOutput);
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        generateRecipes(consumer);
    }
    
    public static void generateRecipes(Consumer<FinishedRecipe> consumer) {
        Utils.generate(consumer, WHITE_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, WHITE_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_GRAY_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, GRAY_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, GRAY_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, BLACK_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, BLACK_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, BROWN_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, BROWN_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, RED_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, RED_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, ORANGE_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, ORANGE_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, YELLOW_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, YELLOW_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, LIME_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, LIME_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, GREEN_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, GREEN_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, CYAN_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, CYAN_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, LIGHT_BLUE_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, BLUE_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, BLUE_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, PURPLE_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
        Utils.generate(consumer, PURPLE_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, MAGENTA_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, MAGENTA_CANDLE, Items.PINK_DYE, PINK_CANDLE, "CANDLE");
        
        Utils.generate(consumer, PINK_CANDLE, Items.WHITE_DYE, WHITE_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.GRAY_DYE, GRAY_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.BLACK_DYE, BLACK_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.BROWN_DYE, BROWN_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.RED_DYE, RED_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.ORANGE_DYE, ORANGE_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.YELLOW_DYE, YELLOW_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.LIME_DYE, LIME_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.GREEN_DYE, GREEN_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.CYAN_DYE, CYAN_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.BLUE_DYE, BLUE_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.PURPLE_DYE, PURPLE_CANDLE, "CANDLE");
        Utils.generate(consumer, PINK_CANDLE, Items.MAGENTA_DYE, MAGENTA_CANDLE, "CANDLE");
    }
}
