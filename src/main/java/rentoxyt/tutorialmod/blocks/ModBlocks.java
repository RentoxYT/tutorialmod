package rentoxyt.tutorialmod.blocks;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rentoxyt.tutorialmod.blocks.custom.CustomChestBlock;
import rentoxyt.tutorialmod.blocks.custom.CustomChestLargeBlock;
import rentoxyt.tutorialmod.blocks.custom.CustomFurnaceBlock;
import rentoxyt.tutorialmod.blocks.custom.GemInfusionStationBlock;
import rentoxyt.tutorialmod.items.CreativeTab.ModCreativeModeTab;
import rentoxyt.tutorialmod.TutorialMod;
import rentoxyt.tutorialmod.items.ModItems;


import java.util.function.Supplier;


public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, TutorialMod.MOD_ID);



    public static final RegistryObject<Block> CUSTOM_BLOCK = registerBlock("custom_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).strength(2.0F).sound(SoundType.METAL).noOcclusion()), ModCreativeModeTab.CUSTOM_TAB);

    public static final RegistryObject<Block> GEM_INFUSION_STATION = registerBlock("gem_infusion_station",
            () -> new GemInfusionStationBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2.0F).sound(SoundType.METAL).noOcclusion()), ModCreativeModeTab.CUSTOM_TAB);

    public static final RegistryObject<Block> CUSTOM_CHEST = registerBlock("custom_chest",
            () -> new CustomChestBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2.0F).sound(SoundType.METAL).noOcclusion()), ModCreativeModeTab.CUSTOM_TAB);

    public static final RegistryObject<Block> CUSTOM_CHEST_LARGE = registerBlock("custom_chest_large",
            () -> new CustomChestLargeBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2.0F).sound(SoundType.METAL).noOcclusion()), ModCreativeModeTab.CUSTOM_TAB);

    public static final RegistryObject<Block> CUSTOM_FURNACE = registerBlock("custom_furnace",
            () -> new CustomFurnaceBlock(BlockBehaviour.Properties.of(Material.METAL).strength(2.0F).sound(SoundType.METAL).noOcclusion()), ModCreativeModeTab.CUSTOM_TAB);




    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }




    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }



}
