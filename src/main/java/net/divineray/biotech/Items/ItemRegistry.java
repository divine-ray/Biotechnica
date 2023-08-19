package net.divineray.biotech.Items;

import net.divineray.biotech.MainRegistry;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemRegistry {

    public static void mainRegistry()
    {
        initializeItem();
        registerItem();
    }
        public static Item itemDummy;


        public static void initializeItem()
        {
            itemDummy = new Item().setUnlocalizedName("itemDummy").setCreativeTab(MainRegistry.testTab);
        }

        private static void registerItem(){
            GameRegistry.registerItem(itemDummy, itemDummy.getUnlocalizedName());
        }

}
