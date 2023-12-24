package xyz.mindcool;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.mindcool.registry.RegisterItems;
import xyz.mindcool.registry.items.MagicSugar;

public class CandyShopMod implements ModInitializer {
	// Logger
	public static final Logger LOGGER = LogManager.getLogger("candyshopmod");

	// Mod ID
	public static final String MOD_ID = "candyshopmod";

	// Item Group for the mod
	public static final ItemGroup CANDY_SHOP_GROUP = FabricItemGroupBuilder.create(new Identifier("candyshopmod", "candy_shop_group"))
			.icon(() -> new ItemStack(RegisterItems.MAGIC_SUGAR))
			.build();
	@Override
	public void onInitialize() {
		LOGGER.info("Candy Shop Mod Initializing");
		new RegisterItems().init();
	}
}