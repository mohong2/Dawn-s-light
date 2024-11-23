package xzy.mohong.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item dollar_bill = registerItem("dollar_bill", new Item(new Item.Settings()));

    public static final Item fifty_dollar_bill = registerItem("fifty_dollar_bill", new Item(new Item.Settings()));

    public static final Item five_dollar_bill = registerItem("five_dollar_bill", new Item(new Item.Settings()));

    public static final Item hundred_dollar_bill = registerItem("hundred_dollar_bill", new Item(new Item.Settings()));

    public static final Item ten_dollar_bill = registerItem("ten_dollar_bill", new Item(new Item.Settings()));

    public static final Item twenty_dollar_bill = registerItem("twenty_dollar_bill", new Item(new Item.Settings()));

    public static final Item dime = registerItem("dime", new Item(new Item.Settings()));

    public static final Item nickel = registerItem("nickel", new Item(new Item.Settings()));

    public static final Item penny = registerItem("penny", new Item(new Item.Settings()));

    public static final Item quarter = registerItem("quarter", new Item(new Item.Settings()));

    public static final Item aurorean_crystal_ore_ingot = registerItem("aurorean_crystal_ore_ingot", new Item(new Item.Settings()));

    public static final Item cold_ice_ore_ingot = registerItem("cold_ice_ore_ingot", new Item(new Item.Settings()));

    public static final Item crimson_ore_ingot = registerItem("crimson_ore_ingot", new Item(new Item.Settings()));

    private static void addItemstoIG(FabricItemGroupEntries fabricItemGroupEntries) {
        fabricItemGroupEntries.add(dollar_bill);
        fabricItemGroupEntries.add(fifty_dollar_bill);
        fabricItemGroupEntries.add(five_dollar_bill);
        fabricItemGroupEntries.add(hundred_dollar_bill);
        fabricItemGroupEntries.add(ten_dollar_bill);
        fabricItemGroupEntries.add(twenty_dollar_bill);
        fabricItemGroupEntries.add(dime);
        fabricItemGroupEntries.add(nickel);
        fabricItemGroupEntries.add(penny);
        fabricItemGroupEntries.add(quarter);
        fabricItemGroupEntries.add(aurorean_crystal_ore_ingot);
        fabricItemGroupEntries.add(cold_ice_ore_ingot);
        fabricItemGroupEntries.add(crimson_ore_ingot);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier("mohong", name), item);
    }

    public static void registerModitems() {
    }
}