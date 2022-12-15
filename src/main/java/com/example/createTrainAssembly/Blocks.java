package com.example.createTrainAssembly;

import com.tterrag.registrate.util.entry.BlockEntry;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.Contract;

import static com.example.createTrainAssembly.CreateTrainAssembly.REGISTRATE;

public class Blocks {
    public static final BlockEntry<Block> EXAMPLE_BLOCK = REGISTRATE.block("example_block", Block::new)
            .initialProperties(Material.METAL)
            .blockstate((ctx, prov) -> prov.simpleBlock(ctx.get(), prov.models().getExistingFile(prov.mcLoc("block/cube_all"))))
            .simpleItem()
            .lang("Fucking Fucking Fuckwit Fucker")
            .register();

    public static void register() {
    }
}
