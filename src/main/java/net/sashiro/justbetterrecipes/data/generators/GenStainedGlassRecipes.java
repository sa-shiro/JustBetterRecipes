package net.sashiro.justbetterrecipes.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.function.Consumer;

import static net.minecraft.world.level.block.Blocks.*;

@SuppressWarnings("DuplicatedCode")
public class GenStainedGlassRecipes extends RecipeProvider {
    public GenStainedGlassRecipes(PackOutput packOutput) {
        super(packOutput);
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        generateRecipes(consumer);
    }
    
    public static void generateRecipes(Consumer<FinishedRecipe> consumer) {
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, WHITE_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_GRAY_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GRAY_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLACK_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BROWN_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, RED_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, RED_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, ORANGE_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, YELLOW_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIME_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, GREEN_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, CYAN_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, LIGHT_BLUE_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, BLUE_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PURPLE_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, MAGENTA_STAINED_GLASS, Items.PINK_DYE, PINK_STAINED_GLASS, "STAINED_GLASS");
        
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.WHITE_DYE, WHITE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.GRAY_DYE, GRAY_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.BLACK_DYE, BLACK_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.BROWN_DYE, BROWN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.RED_DYE, RED_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.ORANGE_DYE, ORANGE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.YELLOW_DYE, YELLOW_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.LIME_DYE, LIME_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.GREEN_DYE, GREEN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.CYAN_DYE, CYAN_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.BLUE_DYE, BLUE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.PURPLE_DYE, PURPLE_STAINED_GLASS, "STAINED_GLASS");
        Utils.generate(consumer, PINK_STAINED_GLASS, Items.MAGENTA_DYE, MAGENTA_STAINED_GLASS, "STAINED_GLASS");
    }
}