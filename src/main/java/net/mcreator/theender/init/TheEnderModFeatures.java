
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theender.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.theender.world.features.AmethystTreeFeature;
import net.mcreator.theender.TheEnderMod;

@Mod.EventBusSubscriber
public class TheEnderModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, TheEnderMod.MODID);
	public static final RegistryObject<Feature<?>> AMETHYST_TREE = REGISTRY.register("amethyst_tree", AmethystTreeFeature::new);
}
