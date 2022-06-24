package dev.trigam.craftination;

import net.fabricmc.api.ClientModInitializer;

public class CraftinationClient implements ClientModInitializer {
	
	@Override
	public void onInitializeClient() {
		// this is stupid
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.OAK_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BIRCH_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.SPRUCE_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.JUNGLE_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.ACACIA_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.DARK_OAK_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MANGROVE_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.CRIMSON_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.WARPED_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.BAMBOO_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.FLUTEWOOD_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.GRIMEWOOD_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.MAHOGANY_LADDER, RenderLayer.getCutout());
		BlockRenderLayerMap.INSTANCE.putBlock(BlockInit.FAUX_SPRUCE_LADDER, RenderLayer.getCutout());
	}
}
