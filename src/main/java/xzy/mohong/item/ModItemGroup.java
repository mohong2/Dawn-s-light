package xzy.mohong.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import xzy.mohong.TheDawnOfDawn;


public class ModItemGroup {
    public static final ItemGroup TUTORIAL_GROUP = Registry.register(Registries.ITEM_GROUP,
        new Identifier(TheDawnOfDawn.MOD_ID, "tutorial_group"),
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.tutorial_group"))
               .icon(() -> new ItemStack(ModItems.dollar_bill)).entries(((displayContext, entries) -> {
                    entries.add(ModItems.dollar_bill);
                    entries.add(ModItems.five_dollar_bill);
                    entries.add(ModItems.ten_dollar_bill);
                    entries.add(ModItems.twenty_dollar_bill);
                    entries.add(ModItems.fifty_dollar_bill);
                    entries.add(ModItems.hundred_dollar_bill);
                    entries.add(ModItems.nickel);
                    entries.add(ModItems.penny);
                    entries.add(ModItems.quarter);
                    })).build());

    public static void registerModItemGroups(){

    }
}
