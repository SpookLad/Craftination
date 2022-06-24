package dev.trigam.craftination.block;

import dev.trigam.craftination.Craftination;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MagmaBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {
	
	// Blocks
	public static Block ANDESITE_BRICKS = registerBlock("andesite_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block CAST_IRON_BLOCK = registerBlock("cast_iron_block", new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)), ItemGroup.BUILDING_BLOCKS);
	public static Block CAST_IRON_BRICKS = registerBlock("cast_iron_bricks", new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)), ItemGroup.BUILDING_BLOCKS);
	public static Block CHARRED_NETHERRACK_BRICKS = registerBlock("charred_netherrack_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.DARK_RED).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    	public static Block COPPER_BRICKS = registerBlock("copper_bricks", new OxidizableBlock(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.of(Material.METAL, MapColor.ORANGE).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.COPPER)), ItemGroup.BUILDING_BLOCKS);
	public static Block CRIMSON_NETHERRACK_BRICKS = registerBlock("crimson_netherrack_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.DARK_CRIMSON).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
    	public static Block DARK_PRISMARINE_BRICKS = registerBlock("dark_prismarine_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.DIAMOND_BLUE).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
    	public static Block DIAMOND_BRICKS = registerBlock("diamond_bricks", new Block(FabricBlockSettings.of(Material.METAL, MapColor.DIAMOND_BLUE).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
	public static Block DIORITE_BRICKS = registerBlock("diorite_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.OFF_WHITE).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block EMERALD_BRICKS = registerBlock("emerald_bricks", new Block(FabricBlockSettings.of(Material.METAL, MapColor.EMERALD_GREEN).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
	public static Block GOLD_BRICKS = registerBlock("gold_bricks", new Block(FabricBlockSettings.of(Material.METAL, MapColor.GOLD).requiresTool().strength(3.0f, 6.0f).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
	public static Block GRANITE_BRICKS = registerBlock("granite_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.DIRT_BROWN).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block IRON_BRICKS = registerBlock("iron_bricks", new Block(FabricBlockSettings.of(Material.METAL, MapColor.IRON_GRAY).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
	public static Block LAPIS_LAZULI_BRICKS = registerBlock("lapis_lazuli_bricks", new Block(FabricBlockSettings.of(Material.METAL, MapColor.LAPIS_BLUE).requiresTool().strength(3.0f, 3.0f).sounds(BlockSoundGroup.METAL)), ItemGroup.BUILDING_BLOCKS);
	public static Block NETHERITE_BRICKS = registerBlock("netherite_bricks", new Block(FabricBlockSettings.of(Material.METAL, MapColor.BLACK).requiresTool().strength(50.0f, 1200.0f).sounds(BlockSoundGroup.NETHERITE)), ItemGroup.BUILDING_BLOCKS);
	public static Block NETHERRACK_BRICKS = registerBlock("netherrack_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.DARK_RED).requiresTool().strength(0.4f).sounds(BlockSoundGroup.NETHERRACK)), ItemGroup.BUILDING_BLOCKS);
	public static Block PURPUR_BRICKS = registerBlock("purpur_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.MAGENTA).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block POLISHED_STONE = registerBlock("polished_stone", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block POLISHED_STONE_SLAB = registerBlock("polished_stone_slab", new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block SMALL_STONE_BRICKS = registerBlock("small_stone_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block CRACKED_SMALL_STONE_BRICKS = registerBlock("cracked_small_stone_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block SMALL_STONE_TILES = registerBlock("small_stone_tiles", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block STEPPED_STONE_TILES = registerBlock("stepped_stone_tiles", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block CRACKED_STEPPED_STONE_TILES = registerBlock("cracked_stepped_stone_tiles", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
    	public static Block STONE_MAGMA = registerBlock("stone_magma", new MagmaBlock(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().luminance(state -> 3).ticksRandomly().strength(0.5f).allowsSpawning((state, world, pos, entityType) -> entityType.isFireImmune())), ItemGroup.BUILDING_BLOCKS);
    	public static Block STONE_SOUL_MAGMA = registerBlock("stone_soul_magma", new SoulMagmaBlock(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().luminance(state -> 2).ticksRandomly().strength(0.5f).allowsSpawning((state, world, pos, entityType) -> entityType.isFireImmune())), ItemGroup.BUILDING_BLOCKS);
	public static Block STONE_PILLAR = registerBlock("stone_pillar", new PillarBlock(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block STONE_TILES = registerBlock("stone_tiles", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(1.5f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block SANDSTONE_BRICKS = registerBlock("sandstone_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).requiresTool().strength(0.8f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block RED_SANDSTONE_BRICKS = registerBlock("red_sandstone_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.ORANGE).requiresTool().strength(0.8f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block SMOOTH_STONE_BRICKS = registerBlock("smooth_stone_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.STONE_GRAY).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block TERRACOTTA_BRICKS = registerBlock("terracotta_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.RED).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.STONE)), ItemGroup.BUILDING_BLOCKS);
	public static Block WARPED_NETHERRACK_BRICKS = registerBlock("warped_netherrack_bricks", new Block(FabricBlockSettings.of(Material.STONE, MapColor.DIAMOND_BLUE).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ItemGroup.BUILDING_BLOCKS);
	
	private static Block registerBlock(String name, Block block, ItemGroup tab) {
		registerBlockItem(name, block, tab);
		return Registry.register(Registry.BLOCK, new Identifier(Craftination.modID, name), block);
	}
	@SuppressWarnings("unused")
	private static Block registerBlock(String name, Block block) {
		return Registry.register(Registry.BLOCK, new Identifier(Craftination.modID, name), block);
	}
	private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
		return Registry.register(Registry.ITEM, new Identifier(Craftination.modID, name),
				new BlockItem(block, new FabricItemSettings().group(tab)));
	}
	
	public static void registerModBlocks() {
		
	}
	
}
