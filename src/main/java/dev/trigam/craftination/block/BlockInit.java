package dev.trigam.craftination.block;

import dev.trigam.craftination.Craftination;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.MagmaBlock;
import net.minecraft.block.Oxidizable;
import net.minecraft.block.OxidizableBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.CraftingTableBlock;
import net.minecraft.block.JukeboxBlock;
import net.minecraft.block.LadderBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BlockInit {
	
	// Stone Blocks
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
	
	// Wood Blocks
	public static Block WOODEN_PLANKS = registerBlock("wooden_planks", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).requiresTool().strength(2.0f, 3.0f)), ItemGroup.BUILDING_BLOCKS);
	public static Block BAMBOO_PLANKS = registerBlock("bamboo_planks", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).requiresTool().strength(2.0f, 3.0f)), ItemGroup.BUILDING_BLOCKS);
	public static Block MAHOGANY_PLANKS = registerBlock("mahogany_planks", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).requiresTool().strength(2.0f, 3.0f)), ItemGroup.BUILDING_BLOCKS);
	public static Block FAUX_SPRUCE_PLANKS = registerBlock("faux_spruce_planks", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).requiresTool().strength(2.0f, 3.0f)), ItemGroup.BUILDING_BLOCKS);
	public static Block FLUTEWOOD_PLANKS = registerBlock("flutewood_planks", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).requiresTool().strength(2.0f, 3.0f)), ItemGroup.BUILDING_BLOCKS);
	public static Block GRIMEWOOD_PLANKS = registerBlock("grimewood_planks", new Block(FabricBlockSettings.of(Material.WOOD, MapColor.OAK_TAN).requiresTool().strength(2.0f, 3.0f)), ItemGroup.BUILDING_BLOCKS);
	public static Block WOODEN_CRAFTING_TABLE = registerBlock("wooden_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block BIRCH_CRAFTING_TABLE = registerBlock("birch_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block SPRUCE_CRAFTING_TABLE = registerBlock("spruce_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block JUNGLE_CRAFTING_TABLE = registerBlock("jungle_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block ACACIA_CRAFTING_TABLE = registerBlock("acacia_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block DARK_OAK_CRAFTING_TABLE = registerBlock("dark_oak_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block MANGROVE_CRAFTING_TABLE = registerBlock("mangrove_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block CRIMSON_CRAFTING_TABLE = registerBlock("crimson_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block WARPED_CRAFTING_TABLE = registerBlock("warped_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block BAMBOO_CRAFTING_TABLE = registerBlock("bamboo_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block FLUTEWOOD_CRAFTING_TABLE = registerBlock("flutewood_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block GRIMEWOOD_CRAFTING_TABLE = registerBlock("grimewood_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block MAHOGANY_CRAFTING_TABLE = registerBlock("mahogany_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
	public static Block FAUX_SPRUCE_CRAFTING_TABLE = registerBlock("faux_spruce_crafting_table", new CraftingTableBlock(FabricBlockSettings.of(Material.WOOD).strength(2.5f).sounds(BlockSoundGroup.WOOD)), ItemGroup.DECORATIONS);
    	public static Block OAK_LADDER = registerBlock("oak_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block BIRCH_LADDER = registerBlock("birch_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
   	public static Block SPRUCE_LADDER = registerBlock("spruce_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block JUNGLE_LADDER = registerBlock("jungle_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block ACACIA_LADDER = registerBlock("acacia_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block DARK_OAK_LADDER = registerBlock("dark_oak_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block MANGROVE_LADDER = registerBlock("mangrove_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block CRIMSON_LADDER = registerBlock("crimson_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block WARPED_LADDER = registerBlock("warped_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block BAMBOO_LADDER = registerBlock("bamboo_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block FLUTEWOOD_LADDER = registerBlock("flutewood_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block GRIMEWOOD_LADDER = registerBlock("grimewood_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block MAHOGANY_LADDER = registerBlock("mahogany_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block FAUX_SPRUCE_LADDER = registerBlock("faux_spruce_ladder", new LadderBlock(FabricBlockSettings.of(Material.DECORATION).strength(0.4f).sounds(BlockSoundGroup.LADDER).nonOpaque()), ItemGroup.DECORATIONS);
    	public static Block OAK_JUKEBOX = registerBlock("oak_jukebox", new JukeboxBlock(FabricBlockSettings.of(Material.WOOD, MapColor.DIRT_BROWN).strength(2.0f, 6.0f)), ItemGroup.DECORATIONS);
	
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
