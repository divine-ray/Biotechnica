package net.divineray.biotech.items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class greenBacterium extends Item {

    public greenBacterium() {}

    @Override
    @SuppressWarnings("rawtypes")
    public void addInformation(ItemStack itemstack, EntityPlayer player, List tooltip, boolean bool) {
        tooltip.add(net.minecraft.util.EnumChatFormatting.GREEN + "A green-coloured bacterium. Lethal.");
    }
}
