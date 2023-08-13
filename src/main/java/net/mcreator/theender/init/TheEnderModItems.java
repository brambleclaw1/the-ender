
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theender.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.theender.TheEnderMod;

public class TheEnderModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TheEnderMod.MODID);
	public static final RegistryObject<Item> ENDER_PORTAL = block(TheEnderModBlocks.ENDER_PORTAL);
	public static final RegistryObject<Item> BLOCK_OF_AMBER = block(TheEnderModBlocks.BLOCK_OF_AMBER);

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
