package xzy.mohong.datagen;


import xzy.mohong.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelsProvider extends FabricModelProvider {
    public ModModelsProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.dollar_bill, Models.GENERATED);
        itemModelGenerator.register(ModItems.fifty_dollar_bill,Models.GENERATED);
        itemModelGenerator.register(ModItems.five_dollar_bill,Models.GENERATED);
        itemModelGenerator.register(ModItems.hundred_dollar_bill,Models.GENERATED);
        itemModelGenerator.register(ModItems.ten_dollar_bill,Models.GENERATED);
        itemModelGenerator.register(ModItems.twenty_dollar_bill,Models.GENERATED);
        itemModelGenerator.register(ModItems.dime,Models.GENERATED);
        itemModelGenerator.register(ModItems.nickel,Models.GENERATED);
        itemModelGenerator.register(ModItems.penny,Models.GENERATED);
        itemModelGenerator.register(ModItems.quarter,Models.GENERATED);


    }
}
