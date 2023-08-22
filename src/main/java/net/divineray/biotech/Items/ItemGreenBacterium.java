package net.divineray.biotech.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemGreenBacterium extends Item {

    public ItemGreenBacterium() {}

    @Override
    @SuppressWarnings("rawtypes")
    public void addInformation(ItemStack itemstack, EntityPlayer player, List tooltip, boolean bool) {
        tooltip.add(EnumChatFormatting.GREEN + "A green-coloured bacterium. Lethal.");
    }
}
