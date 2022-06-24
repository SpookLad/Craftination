package dev.trigam.craftination.block;

import dev.trigam.craftination.Craftination;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {
	
	// Blocks
	public static Block ANDESITE_BRICKS = registerBlock("andesite_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f)), ItemGroup.BUILDING_BLOCKS);
	public static Block CAST_IRON_BLOCK = registerBlock("cast_iron_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)), ItemGroup.BUILDING_BLOCKS);
	public static Block CAST_IRON_BRICKS = registerBlock("cast_iron_bricks", new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)), ItemGroup.BUILDING_BLOCKS);
	public static Block CHARRED_NETHERRACK_BRICKS = registerBlock("charred_netherrack_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.DARK_RED).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    public static Block COPPER_BRICKS = registerBlock("copper_bricks", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), ItemGroup.BUILDING_BLOCKS);
	public static Block CRIMSON_NETHERRACK_BRICKS = registerBlock("crimson_netherrack_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.DARK_CRIMSON).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	public static Block DIORITE_BRICKS = registerBlock("diorite_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.OFF_WHITE).requiresTool().strength(1.5f, 6.0f)), ItemGroup.BUILDING_BLOCKS);
	public static Block GRANITE_BRICKS = registerBlock("granite_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.DIRT_BROWN).requiresTool().strength(1.5f, 6.0f)), ItemGroup.BUILDING_BLOCKS);
	public static Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().strength(0.8f)), ItemGroup.BUILDING_BLOCKS);
	public static Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.ORANGE).requiresTool().strength(0.8f)), ItemGroup.BUILDING_BLOCKS);
	
	private static Block registerBlock(String name, Block block, ItemGroup tab) {
		registerBlockItem(name, block, tab);
		return Registry.register(Registry.BLOCK, new Identifier(Craftination.modID, name), block);
	}
	
	private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
		return Registry.register(Registry.ITEM, new Identifier(Craftination.modID, name),
				new BlockItem(block, new FabricItemSettings().group(tab)));
	}
	
	public static void registerModBlocks() {
		
	}
	
}
