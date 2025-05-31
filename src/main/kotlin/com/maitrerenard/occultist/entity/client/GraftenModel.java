package com.maitrerenard.occultist.entity.client;

import com.maitrerenard.occultist.Occultist;
import com.maitrerenard.occultist.entity.custom.GraftenEntity;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class GraftenModel<T extends GraftenEntity> extends SinglePartEntityModel<T> {
    public static final EntityModelLayer GRAFTEN = new EntityModelLayer(Identifier.of(Occultist.MOD_ID, "graften"), "main");

    private final ModelPart graften;
    private final ModelPart head;


    public GraftenModel(ModelPart root) {
        this.graften = root.getChild("graften");
        this.head = this.graften.getChild("head");
    }

    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
        ModelPartData graften = modelPartData.addChild("graften", ModelPartBuilder.create(), ModelTransform.pivot(-2.0F, 14.0F, 0.0F));

        ModelPartData right_leg = graften.addChild("right_leg", ModelPartBuilder.create().uv(40, 36).cuboid(-2.25F, -2.25F, -2.25F, 4.5F, 12.5F, 4.5F, new Dilation(0.0F))
                .uv(0, 16).cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(3, 18).mirrored().cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData Flower = right_leg.addChild("Flower", ModelPartBuilder.create(), ModelTransform.pivot(-0.5F, 5.5F, -2.275F));

        ModelPartData bone5 = Flower.addChild("bone5", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone2 = Flower.addChild("bone2", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone3 = Flower.addChild("bone3", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone4 = Flower.addChild("bone4", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone = Flower.addChild("bone", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData head = graften.addChild("head", ModelPartBuilder.create().uv(0, 0).cuboid(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F))
                .uv(3, 2).cuboid(-3.0F, -7.0F, -3.0F, 6.0F, 6.0F, 6.0F, new Dilation(0.0F))
                .uv(32, 0).cuboid(-4.25F, -8.25F, -4.25F, 8.5F, 8.5F, 8.5F, new Dilation(0.0F)), ModelTransform.pivot(2.0F, -14.0F, 0.0F));

        ModelPartData Headflower = head.addChild("Headflower", ModelPartBuilder.create(), ModelTransform.pivot(-1.5F, -10.5F, -1.0F));

        ModelPartData Side1 = Headflower.addChild("Side1", ModelPartBuilder.create().uv(32, 1).cuboid(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));

        ModelPartData Side2 = Headflower.addChild("Side2", ModelPartBuilder.create().uv(32, 1).cuboid(-1.5F, -2.5F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));

        ModelPartData Flower8 = head.addChild("Flower8", ModelPartBuilder.create(), ModelTransform.of(4.275F, -3.5F, 1.5F, 0.0F, -1.5708F, 0.0F));

        ModelPartData bone36 = Flower8.addChild("bone36", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone37 = Flower8.addChild("bone37", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone38 = Flower8.addChild("bone38", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone39 = Flower8.addChild("bone39", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone40 = Flower8.addChild("bone40", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData Flower7 = head.addChild("Flower7", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, -4.5F, -4.25F));

        ModelPartData bone31 = Flower7.addChild("bone31", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone32 = Flower7.addChild("bone32", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone33 = Flower7.addChild("bone33", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone34 = Flower7.addChild("bone34", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone35 = Flower7.addChild("bone35", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData right_arm = graften.addChild("right_arm", ModelPartBuilder.create().uv(24, 36).cuboid(-2.125F, -2.25F, -2.25F, 4.5F, 12.5F, 4.5F, new Dilation(0.0F))
                .uv(2, 2).cuboid(-1.875F, 10.0F, 0.0F, 3.0F, 5.0F, 0.0F, new Dilation(0.0F))
                .uv(43, 18).mirrored().cuboid(-0.875F, -1.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
                .uv(40, 16).cuboid(-1.875F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.125F, -12.0F, 0.0F));

        ModelPartData Flower5 = right_arm.addChild("Flower5", ModelPartBuilder.create(), ModelTransform.pivot(-1.625F, 5.5F, -2.275F));

        ModelPartData bone21 = Flower5.addChild("bone21", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone22 = Flower5.addChild("bone22", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone23 = Flower5.addChild("bone23", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone24 = Flower5.addChild("bone24", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone25 = Flower5.addChild("bone25", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData Flower11 = right_arm.addChild("Flower11", ModelPartBuilder.create(), ModelTransform.of(-0.375F, 8.5F, 2.25F, 0.0F, 3.1416F, 0.0F));

        ModelPartData bone51 = Flower11.addChild("bone51", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone52 = Flower11.addChild("bone52", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone53 = Flower11.addChild("bone53", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone54 = Flower11.addChild("bone54", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone55 = Flower11.addChild("bone55", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData left_arm = graften.addChild("left_arm", ModelPartBuilder.create().uv(40, 16).mirrored().cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false)
                .uv(43, 18).mirrored().cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)).mirrored(false)
                .uv(33, 45).cuboid(-2.25F, -2.25F, 2.25F, 4.5F, 12.5F, -4.5F, new Dilation(0.0F)), ModelTransform.pivot(8.0F, -12.0F, 0.0F));

        ModelPartData Flower4 = left_arm.addChild("Flower4", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, 5.5F, -2.275F));

        ModelPartData bone16 = Flower4.addChild("bone16", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone17 = Flower4.addChild("bone17", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone18 = Flower4.addChild("bone18", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone19 = Flower4.addChild("bone19", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone20 = Flower4.addChild("bone20", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData Flower9 = left_arm.addChild("Flower9", ModelPartBuilder.create(), ModelTransform.of(2.3F, 3.5F, 0.5F, 0.0F, -1.5708F, 0.0F));

        ModelPartData bone41 = Flower9.addChild("bone41", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone42 = Flower9.addChild("bone42", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone43 = Flower9.addChild("bone43", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone44 = Flower9.addChild("bone44", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone45 = Flower9.addChild("bone45", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData left_leg = graften.addChild("left_leg", ModelPartBuilder.create().uv(0, 16).mirrored().cuboid(-2.0F, -2.0F, -2.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)).mirrored(false)
                .uv(3, 18).mirrored().cuboid(-1.0F, -1.0F, -1.0F, 2.0F, 10.0F, 2.0F, new Dilation(0.0F)).mirrored(false), ModelTransform.pivot(4.0F, 0.0F, 0.0F));

        ModelPartData left_leg_overlay_r1 = left_leg.addChild("left_leg_overlay_r1", ModelPartBuilder.create().uv(40, 36).cuboid(-2.25F, -2.25F, -2.25F, 4.5F, 12.5F, 4.5F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));

        ModelPartData Flower2 = left_leg.addChild("Flower2", ModelPartBuilder.create(), ModelTransform.pivot(1.5F, 1.5F, -2.25F));

        ModelPartData bone6 = Flower2.addChild("bone6", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone7 = Flower2.addChild("bone7", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone8 = Flower2.addChild("bone8", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone9 = Flower2.addChild("bone9", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone10 = Flower2.addChild("bone10", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData Flower12 = left_leg.addChild("Flower12", ModelPartBuilder.create(), ModelTransform.of(0.5F, 4.5F, 2.275F, 0.0F, 3.1416F, 0.0F));

        ModelPartData bone56 = Flower12.addChild("bone56", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone57 = Flower12.addChild("bone57", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone58 = Flower12.addChild("bone58", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone59 = Flower12.addChild("bone59", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone60 = Flower12.addChild("bone60", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData body = graften.addChild("body", ModelPartBuilder.create().uv(0, 36).cuboid(-4.0833F, -6.25F, -2.4167F, 8.5F, 12.5F, 4.5F, new Dilation(0.0F))
                .uv(16, 16).cuboid(-3.8333F, -6.0F, -2.1667F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F))
                .uv(19, 19).cuboid(-3.8333F, -5.0F, -0.1667F, 7.0F, 10.0F, 1.0F, new Dilation(0.0F)), ModelTransform.pivot(1.8333F, -8.0F, 0.1667F));

        ModelPartData Flower3 = body.addChild("Flower3", ModelPartBuilder.create(), ModelTransform.pivot(-2.3333F, -0.5F, -2.4167F));

        ModelPartData bone11 = Flower3.addChild("bone11", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone12 = Flower3.addChild("bone12", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone13 = Flower3.addChild("bone13", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone14 = Flower3.addChild("bone14", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone15 = Flower3.addChild("bone15", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));

        ModelPartData Flower10 = body.addChild("Flower10", ModelPartBuilder.create(), ModelTransform.of(0.6667F, 0.5F, 2.3333F, 0.0F, 3.1416F, 0.0F));

        ModelPartData bone46 = Flower10.addChild("bone46", ModelPartBuilder.create().uv(2, 36).cuboid(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

        ModelPartData bone47 = Flower10.addChild("bone47", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, 0.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, 0.5F, 0.0F, -0.3927F, 0.0F, 0.0F));

        ModelPartData bone48 = Flower10.addChild("bone48", ModelPartBuilder.create().uv(2, 35).cuboid(-1.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(-0.5F, 0.0F, 0.0F, 0.0F, -0.3927F, 0.0F));

        ModelPartData bone49 = Flower10.addChild("bone49", ModelPartBuilder.create().uv(2, 35).cuboid(0.0F, -0.5F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.5F, 0.0F, 0.0F, 0.0F, 0.6109F, 0.0F));

        ModelPartData bone50 = Flower10.addChild("bone50", ModelPartBuilder.create().uv(2, 35).cuboid(-0.5F, -1.0F, 0.0F, 1.0F, 1.0F, 0.0F, new Dilation(0.0F)), ModelTransform.of(0.0F, -0.5F, 0.0F, 0.1745F, 0.0F, 0.0F));
        return TexturedModelData.of(modelData, 64, 64);
    }
    @Override
    public void setAngles(GraftenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
    }
    @Override
    public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, int color) {
        graften.render(matrices, vertexConsumer, light, overlay, color);
    }

    @Override
    public ModelPart getPart() {
        return graften;
    }
}
