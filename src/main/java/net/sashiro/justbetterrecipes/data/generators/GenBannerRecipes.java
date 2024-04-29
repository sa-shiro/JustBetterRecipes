package net.sashiro.justbetterrecipes.data.generators;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.RecipeOutput;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.world.item.Items;

import java.util.concurrent.CompletableFuture;

import static net.minecraft.world.level.block.Blocks.*;

@SuppressWarnings({"DuplicatedCode", "unused", "NullableProblems"})
public class GenBannerRecipes extends RecipeProvider {


    public GenBannerRecipes(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> provider) {
        super(packOutput, provider);
    }

    @Override
    protected void buildRecipes(RecipeOutput consumer) {
        generateRecipes(consumer);
    }

    public static void generateRecipes(RecipeOutput consumer) {
        Utils.generateColor(consumer, WHITE_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, WHITE_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_GRAY_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, GRAY_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, GRAY_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, BLACK_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, BLACK_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, BROWN_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, BROWN_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, RED_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, RED_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, ORANGE_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, ORANGE_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, YELLOW_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, YELLOW_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, LIME_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, LIME_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, GREEN_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, GREEN_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, CYAN_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, CYAN_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, LIGHT_BLUE_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, BLUE_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, BLUE_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, PURPLE_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
        Utils.generateColor(consumer, PURPLE_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, MAGENTA_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, MAGENTA_BANNER, Items.PINK_DYE, PINK_BANNER, "BANNER");

        Utils.generateColor(consumer, PINK_BANNER, Items.WHITE_DYE, WHITE_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.LIGHT_GRAY_DYE, LIGHT_GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.GRAY_DYE, GRAY_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.BLACK_DYE, BLACK_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.BROWN_DYE, BROWN_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.RED_DYE, RED_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.ORANGE_DYE, ORANGE_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.YELLOW_DYE, YELLOW_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.LIME_DYE, LIME_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.GREEN_DYE, GREEN_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.CYAN_DYE, CYAN_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.LIGHT_BLUE_DYE, LIGHT_BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.BLUE_DYE, BLUE_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.PURPLE_DYE, PURPLE_BANNER, "BANNER");
        Utils.generateColor(consumer, PINK_BANNER, Items.MAGENTA_DYE, MAGENTA_BANNER, "BANNER");
    }
}
