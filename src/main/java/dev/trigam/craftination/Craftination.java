package dev.trigam.craftination;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dev.trigam.craftination.block.BlockInit;
import dev.trigam.craftination.item.ItemInit;

public class Craftination implements ModInitializer {
	public static String modID = "craftination";
	public static final Logger LOGGER = LoggerFactory.getLogger(modID);

	@Override
	public void onInitialize() {
		ItemInit.registerModItems();
		BlockInit.registerModBlocks();
	}
}
