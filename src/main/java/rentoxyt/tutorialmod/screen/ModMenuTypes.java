package rentoxyt.tutorialmod.screen;

import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.network.IContainerFactory;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rentoxyt.tutorialmod.TutorialMod;

public class ModMenuTypes {

    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(ForgeRegistries.MENU_TYPES, TutorialMod.MOD_ID);

    public static final RegistryObject<MenuType<GemInfusionStationMenu>> GEM_INFUSING_STATION_MENU =
            registerMenuType(GemInfusionStationMenu::new, "gem_infusing_station_menu");
    public static final RegistryObject<MenuType<CustomChestMenu>> CUSTOM_CHEST_MENU =
            registerMenuType(CustomChestMenu::new, "custom_chest_menu");

    public static final RegistryObject<MenuType<CustomChestLargeMenu>> CUSTOM_CHEST_LARGE_MENU =
            registerMenuType(CustomChestLargeMenu::new, "custom_chest_large_menu");

    public static final RegistryObject<MenuType<CustomFurnaceMenu>> CUSTOM_FURNACE_MENU =
            registerMenuType(CustomFurnaceMenu::new, "custom_furnace_menu");

    private static <T extends AbstractContainerMenu> RegistryObject<MenuType<T>> registerMenuType(IContainerFactory<T> factory,
                                                                                                  String name) {
        return MENUS.register(name, () -> IForgeMenuType.create(factory));
    }

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
