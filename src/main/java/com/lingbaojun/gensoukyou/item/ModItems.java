package com.lingbaojun.gensoukyou.item;

import com.lingbaojun.gensoukyou.Gensoukyou;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

import static com.lingbaojun.gensoukyou.Gensoukyou.MOD_ID;


public class ModItems {
    public static final Item ICED_TURTLE_SCUTE = registerItems("iced_turtle_scute",new Item(new Item.Settings()));

    private static Item registerItems(String id, Item item) {
        return Registry.register(Registries.ITEM, RegistryKey.of(Registries.ITEM.getKey(), Identifier.of(MOD_ID,id)),item);
    }
    public static void registerModItems() {
        Gensoukyou.LOGGER.info("Registering Mod Items");
    }
}
