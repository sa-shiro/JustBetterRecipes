package net.sashiro.justbetterrecipes.data;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.sashiro.justbetterrecipes.JustBetterRecipes;
import net.sashiro.justbetterrecipes.data.generators.GenRecipeProvider;

@Mod.EventBusSubscriber(modid = JustBetterRecipes.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGen {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent e) {
        DataGenerator gen = e.getGenerator();
        PackOutput packOutput = gen.getPackOutput();
        
        gen.addProvider(true, new GenRecipeProvider(packOutput));
    }
}
