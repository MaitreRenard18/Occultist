package com.maitrerenard.occultist.entity.client

import com.maitrerenard.occultist.Occultist
import com.maitrerenard.occultist.entity.custom.GraftenEntity
import net.minecraft.client.render.entity.EntityRendererFactory
import net.minecraft.client.render.entity.MobEntityRenderer
import net.minecraft.util.Identifier

class GraftenRenderer(context: EntityRendererFactory.Context) :
    MobEntityRenderer<GraftenEntity?, GraftenModel<GraftenEntity?>?>(
        context,
        GraftenModel<GraftenEntity?>(context.getPart(GraftenModel.GRAFTEN)),
        0.5f
    ) {
    override fun getTexture(entity: GraftenEntity?): Identifier {
        return Identifier.of(Occultist.MOD_ID, "textures/entity/graften/graften.png")
    }
}