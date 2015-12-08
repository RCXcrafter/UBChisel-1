package pl.asie.ubchisel;

import com.cricketcraft.chisel.api.carving.CarvingUtils;

import net.minecraft.block.Block;
import team.chisel.block.BlockCarvable;
import team.chisel.item.ItemCarvable;

import java.util.HashMap;

public class AwesomeRegistry {
    private static HashMap<String, Block> r = new HashMap<String, Block>();
    private AwesomeRegistry() {

    }

    public static Block get(String s) {
        return r.get(s);
    }

    public static void put(String s, Block b) {
        r.put(s, b);
    }

    public static void register(BlockCarvable b, String s) {
        b.carverHelper.registerAll(b, s, ItemUBCarvable.class);
        r.put(s, b);
    }

    public static void register(BlockCarvable b, String s, Class<? extends ItemCarvable> itemClass) {
        b.carverHelper.registerAll(b, s, itemClass);
        r.put(s, b);
    }
}
