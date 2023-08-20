package net.divineray.biotech.Items;

import net.divineray.biotech.Tags;
import net.divineray.biotech.mainRegistry;
import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegistry {

    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }

    public static Item itemDummy;

    public static Item itemGreenBacterium;

    public static void initializeItem() {
        itemDummy = new Item().setUnlocalizedName("itemDummy")
            .setCreativeTab(mainRegistry.testTab);
        itemGreenBacterium = new Item().setUnlocalizedName("itemGreenBacterium")
            .setCreativeTab(mainRegistry.testTab)
            .setTextureName(Tags.MODID + ":greenBacterium");
    }

    private static void registerItem() {
        GameRegistry.registerItem(itemDummy, itemDummy.getUnlocalizedName());
        GameRegistry.registerItem(itemGreenBacterium, itemGreenBacterium.getUnlocalizedName());
    }

}
