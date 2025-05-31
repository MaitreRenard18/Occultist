package com.maitrerenard.occultist

import com.maitrerenard.occultist.entity.ModEntities
import com.maitrerenard.occultist.entity.client.GraftenModel
import com.maitrerenard.occultist.entity.client.GraftenRenderer
import com.maitrerenard.occultist.entity.custom.GraftenEntity
import net.fabricmc.api.ClientModInitializer
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry

object OccultistClient : ClientModInitializer {
    override fun onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(GraftenModel.GRAFTEN, { GraftenModel.texturedModelData })
        EntityRendererRegistry.register(ModEntities.GRAFTEN, ::GraftenRenderer)
    }
}