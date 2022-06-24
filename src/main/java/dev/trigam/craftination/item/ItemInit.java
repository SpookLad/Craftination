package dev.trigam.craftination.item;

import dev.trigam.craftination.Craftination;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ItemInit {
	
	// Items
	public static final Item OAK_STICK = registerItem("oak_stick", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	public static final Item SPRUCE_STICK = registerItem("spruce_stick", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	public static final Item BIRCH_STICK = registerItem("birch_stick", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	public static final Item JUNGLE_STICK = registerItem("jungle_stick", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	public static final Item ACACIA_STICK = registerItem("acacia_stick", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	public static final Item DARK_OAK_STICK = registerItem("dark_oak_stick", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	public static final Item MANGROVE_STICK = registerItem("mangrove_stick", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	public static final Item CRIMSON_STICK = registerItem("crimson_stick", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	public static final Item WARPED_STICK = registerItem("warped_stick", new Item(new FabricItemSettings().group(ItemGroup.MISC)));
	
	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(Craftination.modID, name), item);
	}
	
	public static void registerModItems() {
		
	}
}