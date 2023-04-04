package com.bananus.fabricstory.utils;

import com.bananus.fabricstory.entity.ModEntities;
import com.bananus.fabricstory.entity.custom.NPCEntity;
import com.bananus.fabricstory.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;

public class ModRegistries {
    public static void registerModStuffs() {
        registerCustomTrades();
        registerAttributes();
    }

    private static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(((entity, random) -> new TradeOffer(
                    new ItemStack(Items.EMERALD, 2),
                    new ItemStack(ModItems.NPC_CREATOR, 1),
                    6, 2, 0.02f)));
            });
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.NPC, NPCEntity.setAttributes());
    }
}
