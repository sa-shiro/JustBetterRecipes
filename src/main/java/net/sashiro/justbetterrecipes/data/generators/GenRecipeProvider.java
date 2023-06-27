package net.sashiro.justbetterrecipes.data.generators;

import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.RecipeSerializer;

import java.util.function.Consumer;

import static net.minecraft.world.level.block.Blocks.*;

@SuppressWarnings({"DuplicatedCode", "unused", "NullableProblems"})
public class GenRecipeProvider extends RecipeProvider {
    public GenRecipeProvider(PackOutput packOutput) {
        super(packOutput);
    }
    
    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        GenBannerRecipes.generateRecipes(consumer);
        GenCandleRecipes.generateRecipes(consumer);
        GenConcreteRecipes.generateRecipes(consumer);
        GenStainedGlassRecipes.generateRecipes(consumer);
        GenStainedGlassPaneRecipes.generateRecipes(consumer);
        GenTerracottaRecipes.generateRecipes(consumer);
        GenWoodRecipes.generateRecipes(consumer);
        
        GenWoolRecipes.generateRecipes(consumer);
        GenCarpetRecipes.generateRecipes(consumer);
        GenBedRecipes.generateRecipes(consumer);
        
        // Warped Wart Block
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, WARPED_WART_BLOCK) // result
                .define('X', NETHER_WART) // ingredient 1
                .define('#', WARPED_NYLIUM) // ingredient 2
                .pattern("XXX")
                .pattern("X#X")
                .pattern("XXX")
                .group("nether_wart")
                .unlockedBy("has_item", has(NETHER_WART))
                .save(consumer, new ResourceLocation("JBR".toLowerCase(), getConversionRecipeName(WARPED_WART_BLOCK, WARPED_NYLIUM)));
        
        
        // Raw Ore Blocks to Block [SMELTING]
        Utils.generateSmelting(consumer, "iron_block", RAW_IRON_BLOCK.asItem(), IRON_BLOCK.asItem(), RecipeSerializer.SMELTING_RECIPE, 0.5f, 2000);
        Utils.generateSmelting(consumer, "copper_block", RAW_COPPER_BLOCK.asItem(), COPPER_BLOCK.asItem(), RecipeSerializer.SMELTING_RECIPE, 0.5f, 2000);
        Utils.generateSmelting(consumer, "gold_block", RAW_GOLD_BLOCK.asItem(), GOLD_BLOCK.asItem(), RecipeSerializer.SMELTING_RECIPE, 0.5f, 2000);
        
        // Raw Ore Blocks to Block [BLASTING]
        Utils.generateSmelting(consumer, "iron_block", RAW_IRON_BLOCK.asItem(), IRON_BLOCK.asItem(), RecipeSerializer.BLASTING_RECIPE, 0.5f, 1000);
        Utils.generateSmelting(consumer, "copper_block", RAW_COPPER_BLOCK.asItem(), COPPER_BLOCK.asItem(), RecipeSerializer.BLASTING_RECIPE, 0.5f, 1000);
        Utils.generateSmelting(consumer, "gold_block", RAW_GOLD_BLOCK.asItem(), GOLD_BLOCK.asItem(), RecipeSerializer.BLASTING_RECIPE, 0.5f, 1000);
        
        // =============================================================================================================
        // =============================================================================================================
        
        // [SMELTING] Recycle
        Utils.generateSmelting(consumer, "iron_nugget", Items.IRON_BARS, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.IRON_TRAPDOOR, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.IRON_DOOR, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.HEAVY_WEIGHTED_PRESSURE_PLATE, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.SHEARS, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.FLINT_AND_STEEL, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.BUCKET, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.CHAIN, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.LANTERN, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.SOUL_LANTERN, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.CAULDRON, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.HOPPER, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.MINECART, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.CHEST_MINECART, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.HOPPER_MINECART, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.TNT_MINECART, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.FURNACE_MINECART, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.RAIL, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.ACTIVATOR_RAIL, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.DETECTOR_RAIL, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.COMPASS, Items.IRON_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_ingot", Items.ANVIL, Items.IRON_INGOT, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_ingot", Items.CHIPPED_ANVIL, Items.IRON_INGOT, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_ingot", Items.DAMAGED_ANVIL, Items.IRON_INGOT, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_ingot", Items.IRON_HORSE_ARMOR, Items.IRON_INGOT, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_nugget", Items.POWERED_RAIL, Items.GOLD_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_nugget", Items.BELL, Items.GOLD_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_nugget", Items.LIGHT_WEIGHTED_PRESSURE_PLATE, Items.GOLD_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_nugget", Items.CLOCK, Items.GOLD_NUGGET, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_ingot", Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "copper_ingot", Items.LIGHTNING_ROD, Items.COPPER_INGOT, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "copper_ingot", Items.SPYGLASS, Items.COPPER_INGOT, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "diamond", Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "leather", Items.ROTTEN_FLESH, Items.LEATHER, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "leather", Items.LEATHER_HORSE_ARMOR, Items.LEATHER, RecipeSerializer.SMELTING_RECIPE, 0.5f);
        
        // =============================================================================================================
        // [BLASTING] Recycle
        // =============================================================================================================
        
        Utils.generateSmelting(consumer, "iron_nugget", Items.IRON_BARS, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.IRON_TRAPDOOR, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.IRON_DOOR, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.HEAVY_WEIGHTED_PRESSURE_PLATE, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.SHEARS, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.FLINT_AND_STEEL, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.BUCKET, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.CHAIN, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.LANTERN, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.SOUL_LANTERN, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.CAULDRON, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.HOPPER, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.MINECART, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.CHEST_MINECART, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.HOPPER_MINECART, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.TNT_MINECART, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.FURNACE_MINECART, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.RAIL, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.ACTIVATOR_RAIL, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.DETECTOR_RAIL, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_nugget", Items.COMPASS, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_ingot", Items.ANVIL, Items.IRON_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_ingot", Items.CHIPPED_ANVIL, Items.IRON_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_ingot", Items.DAMAGED_ANVIL, Items.IRON_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "iron_ingot", Items.IRON_HORSE_ARMOR, Items.IRON_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_nugget", Items.POWERED_RAIL, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_nugget", Items.BELL, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_nugget", Items.LIGHT_WEIGHTED_PRESSURE_PLATE, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_nugget", Items.CLOCK, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "gold_ingot", Items.GOLDEN_HORSE_ARMOR, Items.GOLD_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "copper_ingot", Items.LIGHTNING_ROD, Items.COPPER_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "copper_ingot", Items.SPYGLASS, Items.COPPER_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "diamond", Items.DIAMOND_HORSE_ARMOR, Items.DIAMOND, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "leather", Items.ROTTEN_FLESH, Items.LEATHER, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, "leather", Items.LEATHER_HORSE_ARMOR, Items.LEATHER, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        
        // =============================================================================================================
        // Flower Smelting Recipes
        // =============================================================================================================
        
        Utils.generateSmelting(consumer, "dyes", Items.WITHER_ROSE, Items.BLACK_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.CORNFLOWER, Items.BLUE_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.BLUE_ORCHID, Items.LIGHT_BLUE_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.AZURE_BLUET, Items.LIGHT_GRAY_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.OXEYE_DAISY, Items.LIGHT_GRAY_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.WHITE_TULIP, Items.LIGHT_GRAY_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.ALLIUM, Items.MAGENTA_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.LILAC, Items.MAGENTA_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.ORANGE_TULIP, Items.ORANGE_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.TORCHFLOWER, Items.ORANGE_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.PEONY, Items.PINK_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.PINK_TULIP, Items.PINK_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.ROSE_BUSH, Items.RED_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.POPPY, Items.RED_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.RED_TULIP, Items.RED_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.LILY_OF_THE_VALLEY, Items.WHITE_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.DANDELION, Items.YELLOW_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.SUNFLOWER, Items.YELLOW_DYE, RecipeSerializer.SMOKING_RECIPE, 0.01f);
        
        Utils.generateSmelting(consumer, "dyes", Items.WITHER_ROSE, Items.BLACK_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.CORNFLOWER, Items.BLUE_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.BLUE_ORCHID, Items.LIGHT_BLUE_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.AZURE_BLUET, Items.LIGHT_GRAY_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.OXEYE_DAISY, Items.LIGHT_GRAY_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.WHITE_TULIP, Items.LIGHT_GRAY_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.ALLIUM, Items.MAGENTA_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.LILAC, Items.MAGENTA_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.ORANGE_TULIP, Items.ORANGE_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.TORCHFLOWER, Items.ORANGE_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.PEONY, Items.PINK_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.PINK_TULIP, Items.PINK_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.ROSE_BUSH, Items.RED_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.POPPY, Items.RED_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.RED_TULIP, Items.RED_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.LILY_OF_THE_VALLEY, Items.WHITE_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.DANDELION, Items.YELLOW_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        Utils.generateSmelting(consumer, "dyes", Items.SUNFLOWER, Items.YELLOW_DYE, RecipeSerializer.SMELTING_RECIPE, 0.01f);
        
        // =============================================================================================================
        // Missing Blasting Recipes
        // =============================================================================================================
        
        Utils.generateSmelting(consumer, null, Items.CACTUS, Items.GREEN_DYE, RecipeSerializer.BLASTING_RECIPE, 0.5f);
        Utils.generateSmelting(consumer, null, Items.WET_SPONGE, Items.SPONGE, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, null, Items.SEA_PICKLE, Items.LIME_DYE, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, null, Items.CHORUS_FRUIT, Items.POPPED_CHORUS_FRUIT, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "cobblestone", Items.COBBLESTONE, Items.STONE, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "cobblestone", Items.COBBLESTONE_STAIRS, Items.STONE_STAIRS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "cobblestone", Items.COBBLESTONE_STAIRS, Items.STONE_STAIRS, RecipeSerializer.SMELTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "cobblestone", Items.COBBLESTONE_SLAB, Items.STONE_SLAB, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "cobblestone", Items.COBBLESTONE_SLAB, Items.STONE_SLAB, RecipeSerializer.SMELTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "cobblestone", Items.COBBLED_DEEPSLATE, Items.DEEPSLATE, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "stone", Items.STONE, Items.SMOOTH_STONE, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "stone", Items.STONE_SLAB, Items.SMOOTH_STONE_SLAB, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "stone", Items.STONE_SLAB, Items.SMOOTH_STONE_SLAB, RecipeSerializer.SMELTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "stone", Items.STONE_BRICKS, Items.CRACKED_STONE_BRICKS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "deepslate", Items.DEEPSLATE_BRICKS, Items.CRACKED_DEEPSLATE_BRICKS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "deepslate", Items.DEEPSLATE_TILES, Items.CRACKED_DEEPSLATE_TILES, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, null, Items.NETHER_BRICKS, Items.CRACKED_NETHER_BRICKS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "basalt", Items.BASALT, Items.SMOOTH_BASALT, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "basalt", Items.POLISHED_BLACKSTONE_BRICKS, Items.CRACKED_POLISHED_BLACKSTONE_BRICKS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, null, Items.NETHERRACK, Items.NETHER_BRICK, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, null, Items.CLAY_BALL, Items.BRICK, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, null, Items.CLAY, Items.TERRACOTTA, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "glass", Items.SAND, Items.GLASS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "glass", Items.RED_SAND, Items.GLASS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.SANDSTONE, Items.SMOOTH_SANDSTONE, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.SANDSTONE_STAIRS, Items.SMOOTH_SANDSTONE_STAIRS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.SANDSTONE_STAIRS, Items.SMOOTH_SANDSTONE_STAIRS, RecipeSerializer.SMELTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.SANDSTONE_SLAB, Items.SMOOTH_SANDSTONE_SLAB, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.SANDSTONE_SLAB, Items.SMOOTH_SANDSTONE_SLAB, RecipeSerializer.SMELTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.RED_SANDSTONE, Items.SMOOTH_RED_SANDSTONE, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.RED_SANDSTONE_STAIRS, Items.SMOOTH_RED_SANDSTONE_STAIRS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.RED_SANDSTONE_STAIRS, Items.SMOOTH_RED_SANDSTONE_STAIRS, RecipeSerializer.SMELTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.RED_SANDSTONE_SLAB, Items.SMOOTH_RED_SANDSTONE_SLAB, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "sand", Items.RED_SANDSTONE_SLAB, Items.SMOOTH_RED_SANDSTONE_SLAB, RecipeSerializer.SMELTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "quartz", Items.QUARTZ, Items.SMOOTH_QUARTZ, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "quartz", Items.QUARTZ_STAIRS, Items.SMOOTH_QUARTZ_STAIRS, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "quartz", Items.QUARTZ_STAIRS, Items.SMOOTH_QUARTZ_STAIRS, RecipeSerializer.SMELTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "quartz", Items.QUARTZ_SLAB, Items.SMOOTH_QUARTZ_SLAB, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "quartz", Items.QUARTZ_SLAB, Items.SMOOTH_QUARTZ_SLAB, RecipeSerializer.SMELTING_RECIPE, 0.1f);
        
        Utils.generateSmelting(consumer, "charcoal", Items.OAK_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.DARK_OAK_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.SPRUCE_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.BIRCH_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.JUNGLE_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.ACACIA_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.MANGROVE_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.CHERRY_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.BAMBOO_BLOCK, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.CRIMSON_STEM, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.WARPED_STEM, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_OAK_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_DARK_OAK_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_SPRUCE_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_BIRCH_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_JUNGLE_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_ACACIA_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_MANGROVE_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_CHERRY_LOG, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_BAMBOO_BLOCK, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_CRIMSON_STEM, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_WARPED_STEM, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        
        Utils.generateSmelting(consumer, "charcoal", Items.OAK_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.DARK_OAK_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.SPRUCE_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.BIRCH_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.JUNGLE_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.ACACIA_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.MANGROVE_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.CHERRY_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.CRIMSON_HYPHAE, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.WARPED_HYPHAE, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_OAK_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_DARK_OAK_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_SPRUCE_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_BIRCH_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_JUNGLE_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_ACACIA_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_MANGROVE_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_CHERRY_WOOD, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_CRIMSON_HYPHAE, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        Utils.generateSmelting(consumer, "charcoal", Items.STRIPPED_WARPED_HYPHAE, Items.CHARCOAL, RecipeSerializer.BLASTING_RECIPE, 0.15f);
        
        
        // =============================================================================================================
        // Armor & Tool Blasting Recipes
        // =============================================================================================================
        
        Utils.generateSmelting(consumer, "chainmail_equipment", Items.CHAINMAIL_HELMET, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "chainmail_equipment", Items.CHAINMAIL_CHESTPLATE, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "chainmail_equipment", Items.CHAINMAIL_LEGGINGS, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "chainmail_equipment", Items.CHAINMAIL_BOOTS, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        
        Utils.generateSmelting(consumer, "leather_equipment", Items.LEATHER_HELMET, Items.LEATHER, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "leather_equipment", Items.LEATHER_CHESTPLATE, Items.LEATHER, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "leather_equipment", Items.LEATHER_LEGGINGS, Items.LEATHER, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "leather_equipment", Items.LEATHER_BOOTS, Items.LEATHER, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        
        Utils.generateSmelting(consumer, "iron_equipment", Items.IRON_HELMET, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "iron_equipment", Items.IRON_CHESTPLATE, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "iron_equipment", Items.IRON_LEGGINGS, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "iron_equipment", Items.IRON_BOOTS, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "iron_equipment", Items.IRON_SWORD, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "iron_equipment", Items.IRON_PICKAXE, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "iron_equipment", Items.IRON_AXE, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "iron_equipment", Items.IRON_HOE, Items.IRON_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        
        Utils.generateSmelting(consumer, "gold_equipment", Items.GOLDEN_HELMET, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "gold_equipment", Items.GOLDEN_CHESTPLATE, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "gold_equipment", Items.GOLDEN_LEGGINGS, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "gold_equipment", Items.GOLDEN_BOOTS, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "gold_equipment", Items.GOLDEN_SWORD, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "gold_equipment", Items.GOLDEN_PICKAXE, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "gold_equipment", Items.GOLDEN_AXE, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        Utils.generateSmelting(consumer, "gold_equipment", Items.GOLDEN_HOE, Items.GOLD_NUGGET, RecipeSerializer.BLASTING_RECIPE, 0.1f);
        
        Utils.generateSmelting(consumer, "diamond_equipment", Items.DIAMOND_HELMET, Items.DIAMOND, RecipeSerializer.BLASTING_RECIPE, 0.5f, 2500);
        Utils.generateSmelting(consumer, "diamond_equipment", Items.DIAMOND_CHESTPLATE, Items.DIAMOND, RecipeSerializer.BLASTING_RECIPE, 0.5f, 2500);
        Utils.generateSmelting(consumer, "diamond_equipment", Items.DIAMOND_LEGGINGS, Items.DIAMOND, RecipeSerializer.BLASTING_RECIPE, 0.5f, 2500);
        Utils.generateSmelting(consumer, "diamond_equipment", Items.DIAMOND_BOOTS, Items.DIAMOND, RecipeSerializer.BLASTING_RECIPE, 0.5f, 2500);
        Utils.generateSmelting(consumer, "diamond_equipment", Items.DIAMOND_SWORD, Items.DIAMOND, RecipeSerializer.BLASTING_RECIPE, 0.5f, 2500);
        Utils.generateSmelting(consumer, "diamond_equipment", Items.DIAMOND_PICKAXE, Items.DIAMOND, RecipeSerializer.BLASTING_RECIPE, 0.5f, 2500);
        Utils.generateSmelting(consumer, "diamond_equipment", Items.DIAMOND_AXE, Items.DIAMOND, RecipeSerializer.BLASTING_RECIPE, 0.5f, 2500);
        Utils.generateSmelting(consumer, "diamond_equipment", Items.DIAMOND_HOE, Items.DIAMOND, RecipeSerializer.BLASTING_RECIPE, 0.5f, 2500);
        
        Utils.generateSmelting(consumer, "netherite_equipment", Items.NETHERITE_HELMET, Items.NETHERITE_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f, 4000);
        Utils.generateSmelting(consumer, "netherite_equipment", Items.NETHERITE_CHESTPLATE, Items.NETHERITE_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f, 4000);
        Utils.generateSmelting(consumer, "netherite_equipment", Items.NETHERITE_LEGGINGS, Items.NETHERITE_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f, 4000);
        Utils.generateSmelting(consumer, "netherite_equipment", Items.NETHERITE_BOOTS, Items.NETHERITE_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f, 4000);
        Utils.generateSmelting(consumer, "netherite_equipment", Items.NETHERITE_SWORD, Items.NETHERITE_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f, 4000);
        Utils.generateSmelting(consumer, "netherite_equipment", Items.NETHERITE_PICKAXE, Items.NETHERITE_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f, 4000);
        Utils.generateSmelting(consumer, "netherite_equipment", Items.NETHERITE_AXE, Items.NETHERITE_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f, 4000);
        Utils.generateSmelting(consumer, "netherite_equipment", Items.NETHERITE_HOE, Items.NETHERITE_INGOT, RecipeSerializer.BLASTING_RECIPE, 0.5f, 4000);
        
        // =============================================================================================================
        // Better Coral Recipes
        // =============================================================================================================
        
        Utils.generate(consumer, Items.DEAD_TUBE_CORAL_BLOCK, Items.TUBE_CORAL_BLOCK, "dead_coral_block");
        Utils.generate(consumer, Items.DEAD_BRAIN_CORAL_BLOCK, Items.BRAIN_CORAL_BLOCK, "dead_coral_block");
        Utils.generate(consumer, Items.DEAD_BUBBLE_CORAL_BLOCK, Items.BUBBLE_CORAL_BLOCK, "dead_coral_block");
        Utils.generate(consumer, Items.DEAD_FIRE_CORAL_BLOCK, Items.FIRE_CORAL_BLOCK, "dead_coral_block");
        Utils.generate(consumer, Items.DEAD_HORN_CORAL_BLOCK, Items.HORN_CORAL_BLOCK, "dead_coral_block");
        Utils.generate(consumer, Items.DEAD_TUBE_CORAL, Items.TUBE_CORAL, "dead_coral");
        Utils.generate(consumer, Items.DEAD_BRAIN_CORAL, Items.BRAIN_CORAL, "dead_coral");
        Utils.generate(consumer, Items.DEAD_BUBBLE_CORAL, Items.BUBBLE_CORAL, "dead_coral");
        Utils.generate(consumer, Items.DEAD_FIRE_CORAL, Items.FIRE_CORAL, "dead_coral");
        Utils.generate(consumer, Items.DEAD_HORN_CORAL, Items.HORN_CORAL, "dead_coral");
        Utils.generate(consumer, Items.DEAD_TUBE_CORAL_FAN, Items.TUBE_CORAL_FAN, "dead_coral_fan");
        Utils.generate(consumer, Items.DEAD_BRAIN_CORAL_FAN, Items.BRAIN_CORAL_FAN, "dead_coral_fan");
        Utils.generate(consumer, Items.DEAD_BUBBLE_CORAL_FAN, Items.BUBBLE_CORAL_FAN, "dead_coral_fan");
        Utils.generate(consumer, Items.DEAD_FIRE_CORAL_FAN, Items.FIRE_CORAL_FAN, "dead_coral_fan");
        Utils.generate(consumer, Items.DEAD_HORN_CORAL_FAN, Items.HORN_CORAL_FAN, "dead_coral_fan");
        
        // =============================================================================================================
        // Better Amethyst Recipe
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, AMETHYST_BLOCK.asItem(), Items.AMETHYST_SHARD, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, AMETHYST_CLUSTER.asItem(), Items.LARGE_AMETHYST_BUD, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, AMETHYST_CLUSTER.asItem(), Items.MEDIUM_AMETHYST_BUD, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, AMETHYST_CLUSTER.asItem(), Items.SMALL_AMETHYST_BUD, 4, RecipeCategory.MISC);
        
        // =============================================================================================================
        // Better Slab Recipe
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, TUFF.asItem(), COBBLESTONE.asItem(), 1, RecipeCategory.MISC);
        
        Utils.generate(consumer, ANDESITE_SLAB, ANDESITE, "STONE_SLAB");
        Utils.generate(consumer, POLISHED_ANDESITE_SLAB, POLISHED_ANDESITE, "STONE_SLAB");
        Utils.generate(consumer, DIORITE_SLAB, DIORITE, "STONE_SLAB");
        Utils.generate(consumer, POLISHED_DIORITE_SLAB, POLISHED_DIORITE, "STONE_SLAB");
        Utils.generate(consumer, GRANITE_SLAB, GRANITE, "STONE_SLAB");
        Utils.generate(consumer, POLISHED_GRANITE_SLAB, POLISHED_GRANITE, "STONE_SLAB");
        Utils.generate(consumer, STONE_SLAB, STONE, "STONE_SLAB");
        Utils.generate(consumer, SMOOTH_STONE_SLAB, SMOOTH_STONE, "STONE_SLAB");
        Utils.generate(consumer, COBBLESTONE_SLAB, COBBLESTONE, "STONE_SLAB");
        Utils.generate(consumer, MOSSY_COBBLESTONE_SLAB, MOSSY_COBBLESTONE, "STONE_SLAB");
        Utils.generate(consumer, STONE_BRICK_SLAB, STONE_BRICKS, "STONE_SLAB");
        Utils.generate(consumer, MOSSY_STONE_BRICK_SLAB, MOSSY_STONE_BRICKS, "STONE_SLAB");
        Utils.generate(consumer, COBBLED_DEEPSLATE_SLAB, COBBLED_DEEPSLATE, "DEEPSLATE_SLAB");
        Utils.generate(consumer, POLISHED_DEEPSLATE_SLAB, POLISHED_DEEPSLATE, "DEEPSLATE_SLAB");
        Utils.generate(consumer, DEEPSLATE_BRICK_SLAB, DEEPSLATE_BRICKS, "DEEPSLATE_SLAB");
        Utils.generate(consumer, DEEPSLATE_TILE_SLAB, DEEPSLATE_TILES, "DEEPSLATE_SLAB");
        Utils.generate(consumer, BRICK_SLAB, BRICKS, "BRICK_SLAB");
        Utils.generate(consumer, MUD_BRICK_SLAB, MUD_BRICKS, "MUD_SLAB");
        Utils.generate(consumer, SANDSTONE_SLAB, SANDSTONE, "SANDSTONE_SLAB");
        Utils.generate(consumer, SMOOTH_SANDSTONE_SLAB, SMOOTH_SANDSTONE, "SANDSTONE_SLAB");
        Utils.generate(consumer, CUT_SANDSTONE_SLAB, CUT_SANDSTONE, "SANDSTONE_SLAB");
        Utils.generate(consumer, RED_SANDSTONE_SLAB, RED_SANDSTONE, "SANDSTONE_SLAB");
        Utils.generate(consumer, SMOOTH_RED_SANDSTONE_SLAB, SMOOTH_RED_SANDSTONE, "SANDSTONE_SLAB");
        Utils.generate(consumer, CUT_RED_SANDSTONE_SLAB, CUT_RED_SANDSTONE, "SANDSTONE_SLAB");
        Utils.generate(consumer, PRISMARINE_SLAB, PRISMARINE, "PRISMARINE_SLAB");
        Utils.generate(consumer, PRISMARINE_BRICK_SLAB, PRISMARINE_BRICKS, "PRISMARINE_SLAB");
        Utils.generate(consumer, DARK_PRISMARINE_SLAB, DARK_PRISMARINE, "PRISMARINE_SLAB");
        Utils.generate(consumer, NETHER_BRICK_SLAB, NETHER_BRICKS, "NETHER_SLAB");
        Utils.generate(consumer, RED_NETHER_BRICK_SLAB, RED_NETHER_BRICKS, "NETHER_SLAB");
        Utils.generate(consumer, BLACKSTONE_SLAB, BLACKSTONE, "BLACKSTONE_SLAB");
        Utils.generate(consumer, POLISHED_BLACKSTONE_SLAB, POLISHED_BLACKSTONE, "BLACKSTONE_SLAB");
        Utils.generate(consumer, POLISHED_BLACKSTONE_BRICK_SLAB, POLISHED_BLACKSTONE_BRICKS, "BLACKSTONE_SLAB");
        Utils.generate(consumer, END_STONE_BRICK_SLAB, END_STONE_BRICKS, "END_SLAB");
        Utils.generate(consumer, PURPUR_SLAB, PURPUR_BLOCK, "PURPUR_SLAB");
        Utils.generate(consumer, QUARTZ_SLAB, QUARTZ_BLOCK, "QUARTZ_SLAB");
        Utils.generate(consumer, SMOOTH_QUARTZ_SLAB, SMOOTH_QUARTZ, "QUARTZ_SLAB");
        Utils.generate(consumer, CUT_COPPER_SLAB, CUT_COPPER, "COPPER_SLAB");
        Utils.generate(consumer, EXPOSED_CUT_COPPER_SLAB, EXPOSED_CUT_COPPER, "COPPER_SLAB");
        Utils.generate(consumer, WEATHERED_CUT_COPPER_SLAB, WEATHERED_CUT_COPPER, "COPPER_SLAB");
        Utils.generate(consumer, OXIDIZED_CUT_COPPER_SLAB, OXIDIZED_CUT_COPPER, "COPPER_SLAB");
        Utils.generate(consumer, WAXED_CUT_COPPER_SLAB, WAXED_CUT_COPPER, "COPPER_SLAB");
        Utils.generate(consumer, WAXED_EXPOSED_CUT_COPPER_SLAB, WAXED_EXPOSED_CUT_COPPER, "COPPER_SLAB");
        Utils.generate(consumer, WAXED_WEATHERED_CUT_COPPER_SLAB, WAXED_WEATHERED_CUT_COPPER, "COPPER_SLAB");
        Utils.generate(consumer, WAXED_OXIDIZED_CUT_COPPER_SLAB, WAXED_OXIDIZED_CUT_COPPER, "COPPER_SLAB");
        Utils.generate(consumer, OAK_SLAB, OAK_PLANKS, "WOOD_SLAB");
        Utils.generate(consumer, SPRUCE_SLAB, SPRUCE_PLANKS, "WOOD_SLAB");
        Utils.generate(consumer, BIRCH_SLAB, BIRCH_PLANKS, "WOOD_SLAB");
        Utils.generate(consumer, JUNGLE_SLAB, JUNGLE_PLANKS, "WOOD_SLAB");
        Utils.generate(consumer, ACACIA_SLAB, ACACIA_PLANKS, "WOOD_SLAB");
        Utils.generate(consumer, DARK_OAK_SLAB, DARK_OAK_PLANKS, "WOOD_SLAB");
        Utils.generate(consumer, MANGROVE_SLAB, MANGROVE_PLANKS, "WOOD_SLAB");
        Utils.generate(consumer, CHERRY_SLAB, CHERRY_PLANKS, "WOOD_SLAB");
        Utils.generate(consumer, CRIMSON_SLAB, CRIMSON_PLANKS, "NETHER_WOOD_SLAB");
        Utils.generate(consumer, WARPED_SLAB, WARPED_PLANKS, "NETHER_WOOD_SLAB");
        Utils.generate(consumer, BAMBOO_SLAB, BAMBOO_BLOCK, "BAMBOO_SLAB");
        Utils.generate(consumer, BAMBOO_MOSAIC_SLAB, BAMBOO_MOSAIC, "BAMBOO_SLAB");
        
        // =============================================================================================================
        // Better Carpet Recipe
        // =============================================================================================================
        
        Utils.generate(consumer, WHITE_CARPET, WHITE_WOOL, "CARPET");
        Utils.generate(consumer, LIGHT_GRAY_CARPET, LIGHT_GRAY_WOOL, "CARPET");
        Utils.generate(consumer, GRAY_CARPET, GRAY_WOOL, "CARPET");
        Utils.generate(consumer, BLACK_CARPET, BLACK_WOOL, "CARPET");
        Utils.generate(consumer, BROWN_CARPET, BROWN_WOOL, "CARPET");
        Utils.generate(consumer, RED_CARPET, RED_WOOL, "CARPET");
        Utils.generate(consumer, ORANGE_CARPET, ORANGE_WOOL, "CARPET");
        Utils.generate(consumer, YELLOW_CARPET, YELLOW_WOOL, "CARPET");
        Utils.generate(consumer, LIME_CARPET, LIME_WOOL, "CARPET");
        Utils.generate(consumer, GREEN_CARPET, GREEN_WOOL, "CARPET");
        Utils.generate(consumer, CYAN_CARPET, CYAN_WOOL, "CARPET");
        Utils.generate(consumer, LIGHT_BLUE_CARPET, LIGHT_BLUE_WOOL, "CARPET");
        Utils.generate(consumer, BLUE_CARPET, BLUE_WOOL, "CARPET");
        Utils.generate(consumer, PURPLE_CARPET, PURPLE_WOOL, "CARPET");
        Utils.generate(consumer, MAGENTA_CARPET, MAGENTA_WOOL, "CARPET");
        Utils.generate(consumer, PINK_CARPET, PINK_WOOL, "CARPET");
        
        // =============================================================================================================
        // Better Wool Recipe
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, WHITE_WOOL.asItem(), WHITE_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, LIGHT_GRAY_WOOL.asItem(), LIGHT_GRAY_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, GRAY_WOOL.asItem(), GRAY_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, BLACK_WOOL.asItem(), BLACK_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, BROWN_WOOL.asItem(), BROWN_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, RED_WOOL.asItem(), RED_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, ORANGE_WOOL.asItem(), ORANGE_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, YELLOW_WOOL.asItem(), YELLOW_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, LIME_WOOL.asItem(), LIME_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, GREEN_WOOL.asItem(), GREEN_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, CYAN_WOOL.asItem(), CYAN_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, LIGHT_BLUE_WOOL.asItem(), LIGHT_BLUE_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, BLUE_WOOL.asItem(), BLUE_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, PURPLE_WOOL.asItem(), PURPLE_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, MAGENTA_WOOL.asItem(), MAGENTA_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, PINK_WOOL.asItem(), PINK_CARPET.asItem(), 2, RecipeCategory.DECORATIONS);
        
        // =============================================================================================================
        // Better Stone Recipes
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, STONE.asItem(), COBBLESTONE.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE.asItem(), COBBLESTONE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, STONE.asItem(), COBBLESTONE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE.asItem(), COBBLESTONE_WALL.asItem(), 1);
        
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), COBBLED_DEEPSLATE.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), CHISELED_DEEPSLATE.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), COBBLED_DEEPSLATE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), COBBLED_DEEPSLATE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), COBBLED_DEEPSLATE_WALL.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), DEEPSLATE_BRICK_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), DEEPSLATE_BRICK_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), DEEPSLATE_BRICK_WALL.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), DEEPSLATE_BRICKS.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), DEEPSLATE_TILE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), DEEPSLATE_TILE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), DEEPSLATE_TILE_WALL.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), DEEPSLATE_TILES.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), POLISHED_DEEPSLATE.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), POLISHED_DEEPSLATE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), POLISHED_DEEPSLATE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, DEEPSLATE.asItem(), POLISHED_DEEPSLATE_WALL.asItem(), 1);
        
        Utils.generateStonecutting(consumer, STONE_SLAB.asItem(), COBBLESTONE_SLAB.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE_STAIRS.asItem(), COBBLESTONE_STAIRS.asItem(), 1);
        
        Utils.generateStonecutting(consumer, STONE_BRICKS.asItem(), COBBLESTONE.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE_BRICKS.asItem(), STONE_BUTTON.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE_BRICKS.asItem(), STONE_PRESSURE_PLATE.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE_BRICKS.asItem(), COBBLESTONE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, STONE_BRICKS.asItem(), COBBLESTONE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE_BRICKS.asItem(), COBBLESTONE_WALL.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE_BRICK_SLAB.asItem(), COBBLESTONE_SLAB.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE_BRICK_STAIRS.asItem(), COBBLESTONE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, STONE_BRICK_WALL.asItem(), COBBLESTONE_WALL.asItem(), 1);
        
        Utils.generateStonecutting(consumer, CHISELED_STONE_BRICKS.asItem(), COBBLESTONE.asItem(), 1);
        Utils.generateStonecutting(consumer, CHISELED_STONE_BRICKS.asItem(), STONE_BUTTON.asItem(), 1);
        Utils.generateStonecutting(consumer, CHISELED_STONE_BRICKS.asItem(), STONE_PRESSURE_PLATE.asItem(), 1);
        Utils.generateStonecutting(consumer, CHISELED_STONE_BRICKS.asItem(), COBBLESTONE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, CHISELED_STONE_BRICKS.asItem(), COBBLESTONE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, CHISELED_STONE_BRICKS.asItem(), COBBLESTONE_WALL.asItem(), 1);
        
        Utils.generateStonecutting(consumer, SMOOTH_STONE.asItem(), COBBLESTONE.asItem(), 1);
        Utils.generateStonecutting(consumer, SMOOTH_STONE.asItem(), STONE_BUTTON.asItem(), 1);
        Utils.generateStonecutting(consumer, SMOOTH_STONE.asItem(), STONE_PRESSURE_PLATE.asItem(), 1);
        Utils.generateStonecutting(consumer, SMOOTH_STONE.asItem(), COBBLESTONE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, SMOOTH_STONE.asItem(), COBBLESTONE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, SMOOTH_STONE.asItem(), COBBLESTONE_WALL.asItem(), 1);
        Utils.generateStonecutting(consumer, SMOOTH_STONE_SLAB.asItem(), COBBLESTONE_SLAB.asItem(), 1);
        
        Utils.generateStonecutting(consumer, MOSSY_COBBLESTONE.asItem(), COBBLESTONE.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_COBBLESTONE_SLAB.asItem(), COBBLESTONE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, MOSSY_COBBLESTONE_STAIRS.asItem(), COBBLESTONE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_COBBLESTONE_WALL.asItem(), COBBLESTONE_WALL.asItem(), 1);
        
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), STONE_BRICKS.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), STONE_BUTTON.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), STONE_PRESSURE_PLATE.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), STONE_BRICK_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), STONE_BRICK_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), STONE_BRICK_WALL.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICK_SLAB.asItem(), STONE_BRICK_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICK_STAIRS.asItem(), STONE_BRICK_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICK_WALL.asItem(), STONE_BRICK_WALL.asItem(), 1);
        
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), COBBLESTONE.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), COBBLESTONE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), COBBLESTONE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), COBBLESTONE_WALL.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICK_SLAB.asItem(), COBBLESTONE_SLAB.asItem(), 2);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICK_STAIRS.asItem(), COBBLESTONE_STAIRS.asItem(), 1);
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICK_WALL.asItem(), COBBLESTONE_WALL.asItem(), 1);
        
        Utils.generateStonecutting(consumer, MOSSY_STONE_BRICKS.asItem(), CHISELED_STONE_BRICKS.asItem(), 1);
        
        Utils.generateStonecutting(consumer, BRICKS.asItem(), Items.BRICK, 4);
        Utils.generateStonecutting(consumer, BRICK_SLAB.asItem(), Items.BRICK, 2);
        Utils.generateStonecutting(consumer, BRICK_STAIRS.asItem(), Items.BRICK, 4);
        Utils.generateStonecutting(consumer, BRICK_WALL.asItem(), Items.BRICK, 4);
        
        Utils.generateStonecutting(consumer, NETHER_BRICKS.asItem(), Items.NETHER_BRICK, 4);
        Utils.generateStonecutting(consumer, CRACKED_NETHER_BRICKS.asItem(), Items.NETHER_BRICK, 4);
        Utils.generateStonecutting(consumer, CHISELED_NETHER_BRICKS.asItem(), Items.NETHER_BRICK, 4);
        Utils.generateStonecutting(consumer, NETHER_BRICK_SLAB.asItem(), Items.NETHER_BRICK, 2);
        Utils.generateStonecutting(consumer, NETHER_BRICK_STAIRS.asItem(), Items.NETHER_BRICK, 4);
        Utils.generateStonecutting(consumer, NETHER_BRICK_WALL.asItem(), Items.NETHER_BRICK, 4);
        Utils.generateStonecutting(consumer, NETHER_BRICK_FENCE.asItem(), Items.NETHER_BRICK, 3);
        
        Utils.generateStonecutting(consumer, RED_NETHER_BRICKS.asItem(), Items.NETHER_BRICK, 4);
        Utils.generateStonecutting(consumer, RED_NETHER_BRICK_SLAB.asItem(), Items.NETHER_BRICK, 2);
        Utils.generateStonecutting(consumer, RED_NETHER_BRICK_STAIRS.asItem(), Items.NETHER_BRICK, 4);
        Utils.generateStonecutting(consumer, RED_NETHER_BRICK_WALL.asItem(), Items.NETHER_BRICK, 4);
        
        // =============================================================================================================
        // PRISMARINE Recycle
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, PRISMARINE.asItem(), Items.PRISMARINE_SHARD, 4);
        Utils.generateStonecutting(consumer, PRISMARINE_STAIRS.asItem(), Items.PRISMARINE_SHARD, 4);
        Utils.generateStonecutting(consumer, PRISMARINE_SLAB.asItem(), Items.PRISMARINE_SHARD, 2);
        Utils.generateStonecutting(consumer, PRISMARINE_WALL.asItem(), Items.PRISMARINE_SHARD, 2);
        
        Utils.generateStonecutting(consumer, PRISMARINE_BRICKS.asItem(), Items.PRISMARINE_SHARD, 9);
        Utils.generateStonecutting(consumer, PRISMARINE_BRICK_STAIRS.asItem(), Items.PRISMARINE_SHARD, 9);
        Utils.generateStonecutting(consumer, PRISMARINE_BRICK_SLAB.asItem(), Items.PRISMARINE_SHARD, 4);
        
        Utils.generateStonecutting(consumer, DARK_PRISMARINE.asItem(), Items.PRISMARINE_SHARD, 8);
        Utils.generateStonecutting(consumer, DARK_PRISMARINE_STAIRS.asItem(), Items.PRISMARINE_SHARD, 8);
        Utils.generateStonecutting(consumer, DARK_PRISMARINE_SLAB.asItem(), Items.PRISMARINE_SHARD, 4);
        
        // =============================================================================================================
        // Shulker Recycle
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, WHITE_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, LIGHT_GRAY_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, GRAY_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, BLACK_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, BROWN_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, RED_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, ORANGE_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, YELLOW_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, LIME_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, GREEN_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, CYAN_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, LIGHT_BLUE_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, BLUE_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, PURPLE_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, MAGENTA_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, PINK_SHULKER_BOX.asItem(), Items.SHULKER_SHELL, 2, RecipeCategory.MISC);
        
        // =============================================================================================================
        // Bed Recycle
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, WHITE_BED.asItem(), Items.WHITE_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, LIGHT_GRAY_BED.asItem(), Items.LIGHT_GRAY_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, GRAY_BED.asItem(), Items.GRAY_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, BLACK_BED.asItem(), Items.BLACK_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, BROWN_BED.asItem(), Items.BROWN_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, RED_BED.asItem(), Items.RED_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, ORANGE_BED.asItem(), Items.ORANGE_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, YELLOW_BED.asItem(), Items.YELLOW_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, LIME_BED.asItem(), Items.LIME_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, GREEN_BED.asItem(), Items.GREEN_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, CYAN_BED.asItem(), Items.CYAN_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, LIGHT_BLUE_BED.asItem(), Items.LIGHT_BLUE_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, BLUE_BED.asItem(), Items.BLUE_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, PURPLE_BED.asItem(), Items.PURPLE_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, MAGENTA_BED.asItem(), Items.MAGENTA_WOOL, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, PINK_BED.asItem(), Items.PINK_WOOL, 3, RecipeCategory.MISC);
        
        Utils.generateStonecutting(consumer, WHITE_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, LIGHT_GRAY_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, GRAY_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, BLACK_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, BROWN_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, RED_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, ORANGE_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, YELLOW_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, LIME_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, GREEN_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, CYAN_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, LIGHT_BLUE_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, BLUE_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, PURPLE_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, MAGENTA_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, PINK_BED.asItem(), Items.STRING, 12, RecipeCategory.MISC);
        
        // =============================================================================================================
        // Banner Recycle
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, WHITE_BANNER.asItem(), Items.WHITE_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, LIGHT_GRAY_BANNER.asItem(), Items.LIGHT_GRAY_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, GRAY_BANNER.asItem(), Items.GRAY_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, BLACK_BANNER.asItem(), Items.BLACK_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, BROWN_BANNER.asItem(), Items.BROWN_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, RED_BANNER.asItem(), Items.RED_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, ORANGE_BANNER.asItem(), Items.ORANGE_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, YELLOW_BANNER.asItem(), Items.YELLOW_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, LIME_BANNER.asItem(), Items.LIME_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, GREEN_BANNER.asItem(), Items.GREEN_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, CYAN_BANNER.asItem(), Items.CYAN_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, LIGHT_BLUE_BANNER.asItem(), Items.LIGHT_BLUE_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, BLUE_BANNER.asItem(), Items.BLUE_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, PURPLE_BANNER.asItem(), Items.PURPLE_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, MAGENTA_BANNER.asItem(), Items.MAGENTA_WOOL, 6, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, PINK_BANNER.asItem(), Items.PINK_WOOL, 6, RecipeCategory.DECORATIONS);
        
        Utils.generateStonecutting(consumer, Items.WHITE_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.LIGHT_GRAY_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.GRAY_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.BLACK_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.BROWN_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.RED_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.ORANGE_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.YELLOW_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.LIME_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.GREEN_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.CYAN_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.LIGHT_BLUE_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.BLUE_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.PURPLE_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.MAGENTA_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.PINK_BANNER, Items.STICK, 1, RecipeCategory.DECORATIONS);
        
        Utils.generateStonecutting(consumer, Items.WHITE_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.LIGHT_GRAY_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.GRAY_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.BLACK_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.BROWN_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.RED_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.ORANGE_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.YELLOW_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.LIME_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.GREEN_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.CYAN_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.LIGHT_BLUE_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.BLUE_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.PURPLE_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.MAGENTA_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.PINK_BANNER, Items.STRING, 24, RecipeCategory.DECORATIONS);
        
        // =============================================================================================================
        // Misc Recycle
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, Items.CRAFTING_TABLE, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHEST, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BARREL, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.COMPOSTER, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.NOTE_BLOCK, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SMITHING_TABLE, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CARTOGRAPHY_TABLE, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ITEM_FRAME, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.GLOW_ITEM_FRAME, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.PAINTING, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BOWL, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CAMPFIRE, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SOUL_CAMPFIRE, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SCAFFOLDING, Items.BAMBOO, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SCAFFOLDING, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.GRINDSTONE, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SMOKER, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.LOOM, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ARMOR_STAND, Items.STICK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.FLETCHING_TABLE, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.FISHING_ROD, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.FISHING_ROD, Items.STRING, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CARROT_ON_A_STICK, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CARROT_ON_A_STICK, Items.STRING, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_FUNGUS_ON_A_STICK, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_FUNGUS_ON_A_STICK, Items.STRING, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.TORCH, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.REDSTONE_TORCH, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.REPEATER, Items.REDSTONE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.COMPARATOR, Items.REDSTONE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.COMPARATOR, Items.QUARTZ, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DISPENSER, Items.REDSTONE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DROPPER, Items.REDSTONE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OBSERVER, Items.REDSTONE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.OBSERVER, Items.QUARTZ, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.LEVER, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.LECTERN, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.TRAPPED_CHEST, Items.STICK, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DAYLIGHT_DETECTOR, Items.QUARTZ, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.REDSTONE_LAMP, Items.GLOWSTONE_DUST, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.REDSTONE_LAMP, Items.REDSTONE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BOW, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BOW, Items.STRING, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CROSSBOW, Items.STICK, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CROSSBOW, Items.STRING, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CROSSBOW, Items.IRON_NUGGET, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ARROW, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ARROW, Items.FLINT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ARROW, Items.FEATHER, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.TIPPED_ARROW, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.TIPPED_ARROW, Items.FLINT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.TIPPED_ARROW, Items.FEATHER, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPECTRAL_ARROW, Items.GLOWSTONE, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPECTRAL_ARROW, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPECTRAL_ARROW, Items.FLINT, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPECTRAL_ARROW, Items.FEATHER, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.NETHER_WART_BLOCK, Items.NETHER_WART, 9, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WARPED_WART_BLOCK, Items.NETHER_WART, 9, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.DRIPSTONE_BLOCK, Items.POINTED_DRIPSTONE, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BONE_BLOCK, Items.BONE, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BONE_BLOCK, Items.BONE_MEAL, 9, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BAMBOO, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BOOKSHELF, Items.BOOK, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BOOKSHELF, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CHISELED_BOOKSHELF, Items.STICK, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BOOK, Items.PAPER, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ENCHANTED_BOOK, Items.PAPER, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.WRITABLE_BOOK, Items.PAPER, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.LEATHER_HORSE_ARMOR, Items.LEATHER, 3, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MAP, Items.PAPER, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.FILLED_MAP, Items.PAPER, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.END_CRYSTAL, Items.ENDER_EYE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.END_CRYSTAL, Items.GHAST_TEAR, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ENDER_EYE, Items.ENDER_PEARL, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ENDER_EYE, Items.BLAZE_POWDER, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ENDER_CHEST, Items.OBSIDIAN, 8, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ENDER_CHEST, Items.ENDER_EYE, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.SPYGLASS, Items.AMETHYST_SHARD, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.TRIPWIRE_HOOK, Items.STICK, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.TNT, Items.GUNPOWDER, 5, RecipeCategory.MISC);
        
        // =============================================================================================================
        // Wool & Carpet Recycle
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, Items.WHITE_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.LIGHT_GRAY_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.GRAY_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BLACK_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BROWN_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.RED_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.ORANGE_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.YELLOW_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.LIME_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.GREEN_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.CYAN_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.LIGHT_BLUE_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.BLUE_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.PURPLE_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.MAGENTA_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.PINK_WOOL, Items.STRING, 4, RecipeCategory.MISC);
        
        Utils.generateStonecutting(consumer, Items.WHITE_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.LIGHT_GRAY_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.GRAY_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.BLACK_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.BROWN_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.RED_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.ORANGE_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.YELLOW_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.LIME_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.GREEN_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.CYAN_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.LIGHT_BLUE_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.BLUE_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.PURPLE_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.MAGENTA_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        Utils.generateStonecutting(consumer, Items.PINK_CARPET, Items.STRING, 1, RecipeCategory.DECORATIONS);
        
        // =============================================================================================================
        // Better Quartz
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, Items.QUARTZ_BLOCK, Items.QUARTZ, 4);
        Utils.generateStonecutting(consumer, Items.QUARTZ_SLAB, Items.QUARTZ, 2);
        Utils.generateStonecutting(consumer, Items.QUARTZ_STAIRS, Items.QUARTZ, 4);
        
        Utils.generateStonecutting(consumer, Items.SMOOTH_QUARTZ, Items.QUARTZ_BLOCK, 1);
        Utils.generateStonecutting(consumer, Items.SMOOTH_QUARTZ, Items.QUARTZ, 4);
        Utils.generateStonecutting(consumer, Items.SMOOTH_QUARTZ, Items.QUARTZ_STAIRS, 1);
        Utils.generateStonecutting(consumer, Items.SMOOTH_QUARTZ, Items.QUARTZ_SLAB, 2);
        Utils.generateStonecutting(consumer, Items.SMOOTH_QUARTZ, Items.CHISELED_QUARTZ_BLOCK, 1);
        Utils.generateStonecutting(consumer, Items.SMOOTH_QUARTZ, Items.QUARTZ_BRICKS, 1);
        Utils.generateStonecutting(consumer, Items.SMOOTH_QUARTZ, Items.QUARTZ_PILLAR, 1);
        Utils.generateStonecutting(consumer, Items.SMOOTH_QUARTZ_SLAB, Items.QUARTZ, 2);
        Utils.generateStonecutting(consumer, Items.SMOOTH_QUARTZ_STAIRS, Items.QUARTZ, 4);
        
        Utils.generateStonecutting(consumer, Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ_SLAB, 2);
        Utils.generateStonecutting(consumer, Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ_STAIRS, 1);
        Utils.generateStonecutting(consumer, Items.CHISELED_QUARTZ_BLOCK, Items.QUARTZ, 4);
        
        Utils.generateStonecutting(consumer, Items.QUARTZ_BRICKS, Items.QUARTZ_SLAB, 2);
        Utils.generateStonecutting(consumer, Items.QUARTZ_BRICKS, Items.QUARTZ_STAIRS, 1);
        Utils.generateStonecutting(consumer, Items.QUARTZ_BRICKS, Items.QUARTZ, 4);
        
        Utils.generateStonecutting(consumer, Items.QUARTZ_PILLAR, Items.QUARTZ_SLAB, 2);
        Utils.generateStonecutting(consumer, Items.QUARTZ_PILLAR, Items.QUARTZ_STAIRS, 1);
        Utils.generateStonecutting(consumer, Items.QUARTZ_PILLAR, Items.QUARTZ, 4);
        
        // =============================================================================================================
        // Misc Recipe
        // =============================================================================================================
        
        Utils.generateStonecutting(consumer, Items.BIG_DRIPLEAF, Items.SMALL_DRIPLEAF, 1, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.COBWEB, Items.STRING, 2, RecipeCategory.MISC);
        Utils.generateStonecutting(consumer, Items.GLASS, Items.GLASS_PANE, 3, RecipeCategory.MISC);
    }
}