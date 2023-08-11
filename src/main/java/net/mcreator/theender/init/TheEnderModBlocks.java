
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theender.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.theender.block.EnderPortalBlock;
import net.mcreator.theender.TheEnderMod;

public class TheEnderModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, TheEnderMod.MODID);
	public static final RegistryObject<Block> ENDER_PORTAL = REGISTRY.register("ender_portal", () -> new EnderPortalBlock());
}
