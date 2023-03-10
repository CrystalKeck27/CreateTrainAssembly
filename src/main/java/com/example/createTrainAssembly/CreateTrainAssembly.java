package com.example.createTrainAssembly;

import com.tterrag.registrate.Registrate;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.Material;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateTrainAssembly implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger("create-train-assembly");

//	public static final Registrate REGISTRATE = Registrate.create("create-train-assembly");

	public static final Block EXAMPLE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).strength(5.0F, 6.0F));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");

		Registry.register(Registry.BLOCK, "create-train-assembly:example_block", EXAMPLE_BLOCK);

		Blocks.register();

//		REGISTRATE.register();
	}
}
