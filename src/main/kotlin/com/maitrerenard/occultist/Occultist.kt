package com.maitrerenard.occultist

import net.fabricmc.api.ModInitializer
import net.fabricmc.fabric.api.`object`.builder.v1.block.FabricBlockSettings
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory

object Occultist : ModInitializer {
    private val logger = LoggerFactory.getLogger("occultist")

	private val block = Block(AbstractBlock.Settings.create().strength(4.0f))
	val blockItem = BlockItem(block, Item.Settings())

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registries.ITEM, Identifier.of("occultist", "test_block"), blockItem)
		Registry.register(Registries.BLOCK, Identifier.of("occultist", "test_block"), block)
		logger.info("Hello Fabric world!")
	}
}