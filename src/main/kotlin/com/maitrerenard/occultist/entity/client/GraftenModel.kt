package com.maitrerenard.occultist.entity.client

import com.maitrerenard.occultist.Occultist
import com.maitrerenard.occultist.entity.custom.GraftenEntity
import net.minecraft.client.model.*
import net.minecraft.client.render.VertexConsumer
import net.minecraft.client.render.entity.model.EntityModelLayer
import net.minecraft.client.render.entity.model.SinglePartEntityModel
import net.minecraft.client.util.math.MatrixStack
import net.minecraft.util.Identifier

class GraftenModel<T : GraftenEntity?>(root: ModelPart) : SinglePartEntityModel<T?>() {
    private val graften: ModelPart
    private val head: ModelPart


    init {
        this.graften = root.getChild("graften")
        this.head = this.graften.getChild("head")
    }

    override fun render(matrices: MatrixStack?, vertexConsumer: VertexConsumer?, light: Int, overlay: Int, color: Int) {
        graften.render(matrices, vertexConsumer, light, overlay, color)
    }

    override fun getPart(): ModelPart {
        return graften
    }

    override fun setAngles(
        entity: T?,
        limbAngle: Float,
        limbDistance: Float,
        animationProgress: Float,
        headYaw: Float,
        headPitch: Float
    ) {}

    companion object {
        val GRAFTEN: EntityModelLayer = EntityModelLayer(Identifier.of(Occultist.MOD_ID, "graften"), "main")

        val texturedModelData: TexturedModelData
            get() {
                val modelData = ModelData()
                val modelPartData = modelData.getRoot()
                val graften = modelPartData.addChild(
                    "graften",
                    ModelPartBuilder.create(),
                    ModelTransform.pivot(-2.0f, 14.0f, 0.0f)
                )

                val right_leg = graften.addChild(
                    "right_leg",
                    ModelPartBuilder.create().uv(40, 36)
                        .cuboid(-2.25f, -2.25f, -2.25f, 4.5f, 12.5f, 4.5f, Dilation(0.0f))
                        .uv(0, 16).cuboid(-2.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, Dilation(0.0f))
                        .uv(3, 18).mirrored().cuboid(-1.0f, -1.0f, -1.0f, 2.0f, 10.0f, 2.0f, Dilation(0.0f))
                        .mirrored(false),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val Flower =
                    right_leg.addChild("Flower", ModelPartBuilder.create(), ModelTransform.pivot(-0.5f, 5.5f, -2.275f))

                val bone5 = Flower.addChild(
                    "bone5",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone2 = Flower.addChild(
                    "bone2",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone3 = Flower.addChild(
                    "bone3",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone4 = Flower.addChild(
                    "bone4",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone = Flower.addChild(
                    "bone",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val head = graften.addChild(
                    "head",
                    ModelPartBuilder.create().uv(0, 0).cuboid(-4.0f, -8.0f, -4.0f, 8.0f, 8.0f, 8.0f, Dilation(0.0f))
                        .uv(3, 2).cuboid(-3.0f, -7.0f, -3.0f, 6.0f, 6.0f, 6.0f, Dilation(0.0f))
                        .uv(32, 0).cuboid(-4.25f, -8.25f, -4.25f, 8.5f, 8.5f, 8.5f, Dilation(0.0f)),
                    ModelTransform.pivot(2.0f, -14.0f, 0.0f)
                )

                val Headflower =
                    head.addChild("Headflower", ModelPartBuilder.create(), ModelTransform.pivot(-1.5f, -10.5f, -1.0f))

                val Side1 = Headflower.addChild(
                    "Side1",
                    ModelPartBuilder.create().uv(32, 1).cuboid(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.0f, 0.0f, 0.0f, -2.3562f, 0.0f)
                )

                val Side2 = Headflower.addChild(
                    "Side2",
                    ModelPartBuilder.create().uv(32, 1).cuboid(-1.5f, -2.5f, 0.0f, 3.0f, 5.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.0f, 0.0f, 0.0f, -0.7854f, 0.0f)
                )

                val Flower8 = head.addChild(
                    "Flower8",
                    ModelPartBuilder.create(),
                    ModelTransform.of(4.275f, -3.5f, 1.5f, 0.0f, -1.5708f, 0.0f)
                )

                val bone36 = Flower8.addChild(
                    "bone36",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone37 = Flower8.addChild(
                    "bone37",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone38 = Flower8.addChild(
                    "bone38",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone39 = Flower8.addChild(
                    "bone39",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone40 = Flower8.addChild(
                    "bone40",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val Flower7 =
                    head.addChild("Flower7", ModelPartBuilder.create(), ModelTransform.pivot(1.5f, -4.5f, -4.25f))

                val bone31 = Flower7.addChild(
                    "bone31",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone32 = Flower7.addChild(
                    "bone32",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone33 = Flower7.addChild(
                    "bone33",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone34 = Flower7.addChild(
                    "bone34",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone35 = Flower7.addChild(
                    "bone35",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val right_arm = graften.addChild(
                    "right_arm",
                    ModelPartBuilder.create().uv(24, 36)
                        .cuboid(-2.125f, -2.25f, -2.25f, 4.5f, 12.5f, 4.5f, Dilation(0.0f))
                        .uv(2, 2).cuboid(-1.875f, 10.0f, 0.0f, 3.0f, 5.0f, 0.0f, Dilation(0.0f))
                        .uv(43, 18).mirrored().cuboid(-0.875f, -1.0f, -1.0f, 2.0f, 10.0f, 2.0f, Dilation(0.0f))
                        .mirrored(false)
                        .uv(40, 16).cuboid(-1.875f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, Dilation(0.0f)),
                    ModelTransform.pivot(-4.125f, -12.0f, 0.0f)
                )

                val Flower5 = right_arm.addChild(
                    "Flower5",
                    ModelPartBuilder.create(),
                    ModelTransform.pivot(-1.625f, 5.5f, -2.275f)
                )

                val bone21 = Flower5.addChild(
                    "bone21",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone22 = Flower5.addChild(
                    "bone22",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone23 = Flower5.addChild(
                    "bone23",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone24 = Flower5.addChild(
                    "bone24",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone25 = Flower5.addChild(
                    "bone25",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val Flower11 = right_arm.addChild(
                    "Flower11",
                    ModelPartBuilder.create(),
                    ModelTransform.of(-0.375f, 8.5f, 2.25f, 0.0f, 3.1416f, 0.0f)
                )

                val bone51 = Flower11.addChild(
                    "bone51",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone52 = Flower11.addChild(
                    "bone52",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone53 = Flower11.addChild(
                    "bone53",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone54 = Flower11.addChild(
                    "bone54",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone55 = Flower11.addChild(
                    "bone55",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val left_arm = graften.addChild(
                    "left_arm",
                    ModelPartBuilder.create().uv(40, 16).mirrored()
                        .cuboid(-2.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, Dilation(0.0f)).mirrored(false)
                        .uv(43, 18).mirrored().cuboid(-1.0f, -1.0f, -1.0f, 2.0f, 10.0f, 2.0f, Dilation(0.0f))
                        .mirrored(false)
                        .uv(33, 45).cuboid(-2.25f, -2.25f, 2.25f, 4.5f, 12.5f, -4.5f, Dilation(0.0f)),
                    ModelTransform.pivot(8.0f, -12.0f, 0.0f)
                )

                val Flower4 =
                    left_arm.addChild("Flower4", ModelPartBuilder.create(), ModelTransform.pivot(1.5f, 5.5f, -2.275f))

                val bone16 = Flower4.addChild(
                    "bone16",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone17 = Flower4.addChild(
                    "bone17",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone18 = Flower4.addChild(
                    "bone18",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone19 = Flower4.addChild(
                    "bone19",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone20 = Flower4.addChild(
                    "bone20",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val Flower9 = left_arm.addChild(
                    "Flower9",
                    ModelPartBuilder.create(),
                    ModelTransform.of(2.3f, 3.5f, 0.5f, 0.0f, -1.5708f, 0.0f)
                )

                val bone41 = Flower9.addChild(
                    "bone41",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone42 = Flower9.addChild(
                    "bone42",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone43 = Flower9.addChild(
                    "bone43",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone44 = Flower9.addChild(
                    "bone44",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone45 = Flower9.addChild(
                    "bone45",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val left_leg = graften.addChild(
                    "left_leg",
                    ModelPartBuilder.create().uv(0, 16).mirrored()
                        .cuboid(-2.0f, -2.0f, -2.0f, 4.0f, 12.0f, 4.0f, Dilation(0.0f)).mirrored(false)
                        .uv(3, 18).mirrored().cuboid(-1.0f, -1.0f, -1.0f, 2.0f, 10.0f, 2.0f, Dilation(0.0f))
                        .mirrored(false),
                    ModelTransform.pivot(4.0f, 0.0f, 0.0f)
                )

                val left_leg_overlay_r1 = left_leg.addChild(
                    "left_leg_overlay_r1",
                    ModelPartBuilder.create().uv(40, 36)
                        .cuboid(-2.25f, -2.25f, -2.25f, 4.5f, 12.5f, 4.5f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.0f, 0.0f, 0.0f, 3.1416f, 0.0f)
                )

                val Flower2 =
                    left_leg.addChild("Flower2", ModelPartBuilder.create(), ModelTransform.pivot(1.5f, 1.5f, -2.25f))

                val bone6 = Flower2.addChild(
                    "bone6",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone7 = Flower2.addChild(
                    "bone7",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone8 = Flower2.addChild(
                    "bone8",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone9 = Flower2.addChild(
                    "bone9",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone10 = Flower2.addChild(
                    "bone10",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val Flower12 = left_leg.addChild(
                    "Flower12",
                    ModelPartBuilder.create(),
                    ModelTransform.of(0.5f, 4.5f, 2.275f, 0.0f, 3.1416f, 0.0f)
                )

                val bone56 = Flower12.addChild(
                    "bone56",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone57 = Flower12.addChild(
                    "bone57",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone58 = Flower12.addChild(
                    "bone58",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone59 = Flower12.addChild(
                    "bone59",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone60 = Flower12.addChild(
                    "bone60",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val body = graften.addChild(
                    "body",
                    ModelPartBuilder.create().uv(0, 36)
                        .cuboid(-4.0833f, -6.25f, -2.4167f, 8.5f, 12.5f, 4.5f, Dilation(0.0f))
                        .uv(16, 16).cuboid(-3.8333f, -6.0f, -2.1667f, 8.0f, 12.0f, 4.0f, Dilation(0.0f))
                        .uv(19, 19).cuboid(-3.8333f, -5.0f, -0.1667f, 7.0f, 10.0f, 1.0f, Dilation(0.0f)),
                    ModelTransform.pivot(1.8333f, -8.0f, 0.1667f)
                )

                val Flower3 =
                    body.addChild("Flower3", ModelPartBuilder.create(), ModelTransform.pivot(-2.3333f, -0.5f, -2.4167f))

                val bone11 = Flower3.addChild(
                    "bone11",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone12 = Flower3.addChild(
                    "bone12",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone13 = Flower3.addChild(
                    "bone13",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone14 = Flower3.addChild(
                    "bone14",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone15 = Flower3.addChild(
                    "bone15",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )

                val Flower10 = body.addChild(
                    "Flower10",
                    ModelPartBuilder.create(),
                    ModelTransform.of(0.6667f, 0.5f, 2.3333f, 0.0f, 3.1416f, 0.0f)
                )

                val bone46 = Flower10.addChild(
                    "bone46",
                    ModelPartBuilder.create().uv(2, 36).cuboid(-0.5f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.pivot(0.0f, 0.0f, 0.0f)
                )

                val bone47 = Flower10.addChild(
                    "bone47",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, 0.5f, 0.0f, -0.3927f, 0.0f, 0.0f)
                )

                val bone48 = Flower10.addChild(
                    "bone48",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-1.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(-0.5f, 0.0f, 0.0f, 0.0f, -0.3927f, 0.0f)
                )

                val bone49 = Flower10.addChild(
                    "bone49",
                    ModelPartBuilder.create().uv(2, 35).cuboid(0.0f, -0.5f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.5f, 0.0f, 0.0f, 0.0f, 0.6109f, 0.0f)
                )

                val bone50 = Flower10.addChild(
                    "bone50",
                    ModelPartBuilder.create().uv(2, 35).cuboid(-0.5f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f, Dilation(0.0f)),
                    ModelTransform.of(0.0f, -0.5f, 0.0f, 0.1745f, 0.0f, 0.0f)
                )
                return TexturedModelData.of(modelData, 64, 64)
            }
    }
}