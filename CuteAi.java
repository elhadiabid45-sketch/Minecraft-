package com.lovablemods.cute_ai;

import net.minecraftforge.bus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;

/**
 * تم توليد هذا الملف تلقائيًا. يسجّل المحتوى الذي وصفه المستخدم.
 */
@Mod(CuteAi.MOD_ID)
public class CuteAi {
    public static final String MOD_ID = "cute_ai";

    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(Registries.BLOCK, MOD_ID);
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(Registries.ITEM, MOD_ID);

    public static final RegistryObject<Block> CUTE_AI_BLOCK = BLOCKS.register("cute_ai_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(11.5F, 6F)
                    .lightLevel(state -> 12)));

    public static final RegistryObject<Item> CUTE_AI_BLOCK_ITEM = ITEMS.register("cute_ai_block",
            () -> new BlockItem(CUTE_AI_BLOCK.get(), new Item.Properties()));

    public CuteAi(IEventBus modEventBus) {
        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
    }
}
