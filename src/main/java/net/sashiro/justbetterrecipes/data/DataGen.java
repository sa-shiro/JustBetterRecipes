package net.sashiro.justbetterrecipes.data;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.sashiro.justbetterrecipes.JustBetterRecipes;
import net.sashiro.justbetterrecipes.data.generators.GenRecipeProvider;

import java.util.concurrent.CompletableFuture;

@EventBusSubscriber(modid = JustBetterRecipes.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        CompletableFuture<HolderLookup.Provider> lookupProvider = e.getLookupProvider();

        gen.addProvider(true, new GenRecipeProvider(packOutput, lookupProvider));
    }
}
