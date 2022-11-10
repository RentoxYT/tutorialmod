package rentoxyt.tutorialmod.items;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rentoxyt.tutorialmod.items.CreativeTab.ModCreativeModeTab;
import rentoxyt.tutorialmod.TutorialMod;
import rentoxyt.tutorialmod.items.custom.EightBallItem;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, TutorialMod.MOD_ID);

    public static final RegistryObject<Item> CUSTOM_ITEM = ITEMS.register("custom_item",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.CUSTOM_TAB)));
    public static final RegistryObject<Item> EIGHTBALL_ITEM = ITEMS.register("eightball_item",
            () -> new EightBallItem(new Item.Properties().tab(ModCreativeModeTab.CUSTOM_TAB).stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
