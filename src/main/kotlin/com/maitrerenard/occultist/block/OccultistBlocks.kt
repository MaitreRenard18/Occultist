package com.maitrerenard.occultist.block

import com.maitrerenard.occultist.Occultist
import net.minecraft.block.AbstractBlock
import net.minecraft.block.Block
import net.minecraft.item.BlockItem
import net.minecraft.item.Item
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier


object OccultistBlocks {
    private val block = registerBlock(
        "test_block",
        Block(AbstractBlock.Settings.create().strength(4.0f))
    )

    private fun registerBlock(id: String, block: Block): Block {
        val identifier = Identifier.of(Occultist.MOD_ID, id)
        Registry.register(Registries.BLOCK, identifier, block)

        Registry.register(Registries.ITEM, identifier, BlockItem(block, Item.Settings()))

        return block
    }

    fun registerAll() {}
}