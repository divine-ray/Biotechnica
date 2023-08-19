package net.divineray.biotech.items;

import cpw.mods.fml.common.registry.GameRegistry;
import net.divineray.biotech.MainRegistry;
import net.minecraft.client.main.Main;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemSoup;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fluids.FluidContainerRegistry;
import net.minecraftforge.fluids.FluidStack;

public class ItemRegistry {

    public static void mainRegistry()
    {
        initializeItem();
        registerItem();
    }
        public static Item item_dummy;


        public static void initializeItem()
        {
            item_dummy = new Item().setUnlocalizedName("item_dummy").setCreativeTab(MainRegistry.testTab);
        }

        private static void registerItem(){
            GameRegistry.registerItem(item_dummy, item_dummy.getUnlocalizedName());
        }

}