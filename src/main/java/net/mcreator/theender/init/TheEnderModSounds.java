
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theender.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.theender.TheEnderMod;

public class TheEnderModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, TheEnderMod.MODID);
	public static final RegistryObject<SoundEvent> SWEDEN_EPIC = REGISTRY.register("sweden_epic", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("the_ender", "sweden_epic")));
}
