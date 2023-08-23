package net.divineray.biotech.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class itemDummy extends Item {

    public itemDummy() {}

    @SuppressWarnings("rawtypes")
    @Override
    public void addInformation(ItemStack itemstack, EntityPlayer player, List tooltip, boolean bool) {
        tooltip.add(EnumChatFormatting.GOLD + "Thingy");
    }

}
