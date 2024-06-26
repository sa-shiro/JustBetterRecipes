package net.sashiro.justbetterrecipes.data.generators;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.world.level.block.Blocks.*;

@SuppressWarnings({"DuplicatedCode", "unused", "NullableProblems"})
public class GenCarpetRecipes extends RecipeProvider {

    public GenCarpetRecipes(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
        super(packOutput, provider);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        generateRecipes(consumer);
    }

    public static void generateRecipes(RecipeOutput consumer) {
        Utils.generateColor(consumer, WHITE_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, WHITE_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_GRAY_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, GRAY_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, GRAY_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, BLACK_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, BLACK_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, BROWN_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, BROWN_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, RED_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, RED_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, ORANGE_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, ORANGE_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, YELLOW_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, YELLOW_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, LIME_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, LIME_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, GREEN_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, GREEN_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, CYAN_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, CYAN_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, LIGHT_BLUE_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, BLUE_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, BLUE_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, PURPLE_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
        Utils.generateColor(consumer, PURPLE_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, MAGENTA_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, MAGENTA_CARPET, Items.PINK_DYE, PINK_CARPET, "CARPET");

        Utils.generateColor(consumer, PINK_CARPET, Items.WHITE_DYE, WHITE_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.GRAY_DYE, GRAY_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.BLACK_DYE, BLACK_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.BROWN_DYE, BROWN_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.RED_DYE, RED_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.ORANGE_DYE, ORANGE_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.YELLOW_DYE, YELLOW_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.LIME_DYE, LIME_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.GREEN_DYE, GREEN_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.CYAN_DYE, CYAN_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.BLUE_DYE, BLUE_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.PURPLE_DYE, PURPLE_CARPET, "CARPET");
        Utils.generateColor(consumer, PINK_CARPET, Items.MAGENTA_DYE, MAGENTA_CARPET, "CARPET");
    }
}
