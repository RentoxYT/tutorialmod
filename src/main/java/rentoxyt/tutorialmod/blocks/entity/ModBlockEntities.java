package rentoxyt.tutorialmod.blocks.entity;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rentoxyt.tutorialmod.TutorialMod;
import rentoxyt.tutorialmod.blocks.ModBlocks;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, TutorialMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<GemInfusionStationBlockEntity>> GEM_INFUSION_STATION =
            BLOCK_ENTITIES.register("gem_infusion_station", () ->
                    BlockEntityType.Builder.of(GemInfusionStationBlockEntity::new,
                            ModBlocks.GEM_INFUSION_STATION.get()).build(null));

    public static final RegistryObject<BlockEntityType<CustomChestBlockEntity>> CUSTOM_CHEST =
            BLOCK_ENTITIES.register("custom_chest", () ->
                    BlockEntityType.Builder.of(CustomChestBlockEntity::new,
                            ModBlocks.CUSTOM_CHEST.get()).build(null));

    public static final RegistryObject<BlockEntityType<CustomChestLargeBlockEntity>> CUSTOM_CHEST_LARGE =
            BLOCK_ENTITIES.register("custom_chest_large", () ->
                    BlockEntityType.Builder.of(CustomChestLargeBlockEntity::new,
                            ModBlocks.CUSTOM_CHEST_LARGE.get()).build(null));

    public static final RegistryObject<BlockEntityType<CustomFurnaceBlockEntity>> CUSTOM_FURNACE =
            BLOCK_ENTITIES.register("custom_furnace", () ->
                    BlockEntityType.Builder.of(CustomFurnaceBlockEntity::new,
                            ModBlocks.CUSTOM_FURNACE.get()).build(null));





    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}
