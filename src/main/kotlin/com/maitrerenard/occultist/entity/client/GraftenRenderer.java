package com.maitrerenard.occultist.entity.client;

import com.maitrerenard.occultist.Occultist;
import com.maitrerenard.occultist.entity.custom.GraftenEntity;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.util.Identifier;

public class GraftenRenderer extends MobEntityRenderer<GraftenEntity, GraftenModel<GraftenEntity>> {
    public GraftenRenderer(EntityRendererFactory.Context context) {
        super(context, new GraftenModel<>(context.getPart(GraftenModel.GRAFTEN)), 0.75f);
    }

    @Override
    public Identifier getTexture(GraftenEntity entity) {
        return Identifier.of(Occultist.MOD_ID, "textures/entity/graften/graften.png");
    }
}
