package net.divineray.biotech.Items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import java.util.List;
public class itemDummy extends Item {

    public itemDummy()
    {
    }
    @Override
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean bool) {
        list.add("hello world");
    }

}
