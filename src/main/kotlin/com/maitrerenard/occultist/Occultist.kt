package com.maitrerenard.occultist

import com.maitrerenard.occultist.block.OccultistBlocks
import com.maitrerenard.occultist.entity.ModEntities
import com.maitrerenard.occultist.entity.custom.GraftenEntity
import net.fabricmc.api.ModInitializer
import org.slf4j.Logger
import net.fabricmc.fabric.api.`object`.builder.v1.entity.FabricDefaultAttributeRegistry
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier
import org.slf4j.LoggerFactory

object Occultist : ModInitializer {
	const val MOD_ID: String = "occultist"
    val logger: Logger = LoggerFactory.getLogger(MOD_ID)
    val LOGGER: Logger = LoggerFactory.getLogger("occultist")

	private val block = Block(AbstractBlock.Settings.create().strength(4.0f))
	val blockItem = BlockItem(block, Item.Settings())

	override fun onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		OccultistBlocks.registerAll()
		logger.info("Hello Fabric world!")
		Registry.register(Registries.ITEM, Identifier.of(MOD_ID, "test_block"), blockItem)
		Registry.register(Registries.BLOCK, Identifier.of(MOD_ID, "test_block"), block)

		FabricDefaultAttributeRegistry.register(ModEntities.GRAFTEN, GraftenEntity.createAttributes())

		LOGGER.info("Hello Fabric world!")
	}
}