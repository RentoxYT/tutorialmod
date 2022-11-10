package rentoxyt.tutorialmod.items.CreativeTab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import rentoxyt.tutorialmod.items.ModItems;

public class ModCreativeModeTab {
    public static final CreativeModeTab CUSTOM_TAB = new CreativeModeTab("customtab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.CUSTOM_ITEM.get());
        }
    };



}
