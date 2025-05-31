package com.maitrerenard.occultist.entity

import com.maitrerenard.occultist.Occultist
import com.maitrerenard.occultist.entity.custom.GraftenEntity
import net.minecraft.entity.EntityType
import net.minecraft.entity.SpawnGroup
import net.minecraft.registry.Registries
import net.minecraft.registry.Registry
import net.minecraft.util.Identifier

object ModEntities {
    val GRAFTEN: EntityType<GraftenEntity> = Registry.register(
        Registries.ENTITY_TYPE,
        Identifier.of(Occultist.MOD_ID, "graften"),
        EntityType.Builder.create(::GraftenEntity, SpawnGroup.CREATURE)
            .dimensions(1F, 2F).build()
        )

    fun registerModEntities() {
        Occultist.LOGGER.info("Registering entities for " + Occultist.MOD_ID)
    }
}