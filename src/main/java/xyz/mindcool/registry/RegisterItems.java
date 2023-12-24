package xyz.mindcool.registry;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import xyz.mindcool.CandyShopMod;
import xyz.mindcool.registry.items.MagicSugar;

public class RegisterItems {
    public static final MagicSugar MAGIC_SUGAR = new MagicSugar(new FabricItemSettings().group(CandyShopMod.CANDY_SHOP_GROUP));
    public void init() {
        Registry.register(Registry.ITEM, new Identifier(CandyShopMod.MOD_ID, "magic_sugar"), MAGIC_SUGAR);
    }
}
