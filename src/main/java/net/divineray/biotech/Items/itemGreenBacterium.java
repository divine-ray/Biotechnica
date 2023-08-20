package net.divineray.biotech.Items;


import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

import java.util.List;


public class itemGreenBacterium extends Item {
    public itemGreenBacterium(){}
    @Override
    public void addInformation(ItemStack itemstack, EntityPlayer player, List tooltip, boolean bool) {
        tooltip.add(EnumChatFormatting.GREEN + "A green-coloured bacterium. Lethal.");
    }
}
