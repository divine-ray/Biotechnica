package net.divineray.biotech.creativeTabs;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class TestTab extends CreativeTabs {

    public TestTab(int p_i1853_1_, String p_i1853_2_) {
        super(p_i1853_1_, p_i1853_2_);
    }

    @Override
    public Item getTabIconItem() {
        return Items.diamond;
    }
}
