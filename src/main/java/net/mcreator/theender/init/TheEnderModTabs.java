
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.theender.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class TheEnderModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("the_ender", "the_ender_tab"),
				builder -> builder.title(Component.translatable("item_group.the_ender.the_ender_tab")).icon(() -> new ItemStack(Items.ENDER_EYE)).displayItems((parameters, tabData) -> {
					tabData.accept(TheEnderModBlocks.ENDER_PORTAL.get().asItem());
				})

		);
	}
}
