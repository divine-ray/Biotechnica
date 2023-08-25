package net.divineray.biotech.items;

import net.divineray.biotech.MainRegistry;
import net.divineray.biotech.Tags;
import net.minecraft.item.Item;

import cpw.mods.fml.common.registry.GameRegistry;

public class ItemRegistry {

    public static void mainRegistry() {
        initializeItem();
        registerItem();
    }

    public static Item itemDummy;

    public static Item greenBacterium;

    public static void initializeItem() {

        itemDummy = new Item().setUnlocalizedName("itemDummy")
            .setCreativeTab(MainRegistry.testTab);

        greenBacterium = new Item().setUnlocalizedName("green_bacterium")
            .setCreativeTab(MainRegistry.testTab)
            .setTextureName(Tags.MODID + ":green_bacterium"); // TODO: FIX THIS
    }

    private static void registerItem() {
        GameRegistry.registerItem(itemDummy, itemDummy.getUnlocalizedName());
        GameRegistry.registerItem(greenBacterium, greenBacterium.getUnlocalizedName());
    }

}
