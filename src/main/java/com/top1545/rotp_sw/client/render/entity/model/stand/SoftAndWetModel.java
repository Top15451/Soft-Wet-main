package com.top1545.rotp_sw.client.render.entity.model.stand;

import com.github.standobyte.jojo.client.render.entity.pose.*;
import com.top1545.rotp_sw.entity.stand.stands.SoftAndWetEntity;
import com.github.standobyte.jojo.action.stand.StandEntityAction;
import com.github.standobyte.jojo.client.render.entity.model.stand.HumanoidStandModel;
import com.github.standobyte.jojo.client.render.entity.pose.anim.PosedActionAnimation;
import com.github.standobyte.jojo.entity.stand.StandPose;

import net.minecraft.client.renderer.model.ModelRenderer;

// Made with Blockbench 4.9.4
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class SoftAndWetModel extends HumanoidStandModel<SoftAndWetEntity> {
	private final ModelRenderer head_r1;
	private final ModelRenderer head_r2;
	private final ModelRenderer torso_r1;
	private final ModelRenderer torso_r2;
	private final ModelRenderer leftArm_r1;
	private final ModelRenderer rightArm_r1;

	public SoftAndWetModel() {
		super();

		addHumanoidBaseBoxes(null);
		texWidth = 128;
		texHeight = 128;

		head.texOffs(0, 0).addBox(-4.0F, -7.8F, -4.0F, 8.0F, 8.0F, 8.0F, -0.2F, false);
		head.texOffs(0, 16).addBox(-4.0F, -7.62F, -4.0F, 8.0F, 8.0F, 8.0F, -0.4F, false);
		head.texOffs(53, 15).addBox(-2.0F, -5.0F, -4.4F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(0, 38).addBox(-3.0F, -5.0F, -4.4F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(46, 10).addBox(-3.0F, -5.0F, -4.2F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(6, 52).addBox(2.0F, -5.0F, -4.4F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(24, 16).addBox(1.0F, -5.0F, -4.4F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(20, 43).addBox(1.0F, -5.0F, -4.2F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(54, 51).addBox(-4.5F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.2F, false);
		head.texOffs(34, 54).addBox(3.5F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.2F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.0436F);
		head_r1.texOffs(58, 33).addBox(5.0F, -29.0F, -1.0F, 4.0F, 2.0F, 2.0F, -0.2F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.0436F);
		head_r2.texOffs(58, 40).addBox(-9.0F, -29.0F, -1.0F, 4.0F, 2.0F, 2.0F, -0.2F, false);

		torso.texOffs(20, 62).addBox(4.0F, 1.0F, -2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		torso.texOffs(10, 62).addBox(-5.0F, 1.0F, -2.0F, 1.0F, 5.0F, 1.0F, 0.0F, false);
		torso.texOffs(32, 22).addBox(-5.0F, 0.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		torso.texOffs(52, 0).addBox(1.0F, 0.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		torso.texOffs(0, 46).addBox(-3.0F, 3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(43, 22).addBox(1.0F, 3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(41, 2).addBox(-2.0F, 3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(44, 28).addBox(2.0F, 3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(29, 13).addBox(-4.5F, 0.02F, -1.5F, 9.0F, 6.0F, 3.0F, 0.0F, false);
		torso.texOffs(20, 55).addBox(1.0F, 0.0F, 1.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		torso.texOffs(10, 55).addBox(-5.0F, 0.0F, 1.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		torso.texOffs(0, 32).addBox(-3.0F, 11.0F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		torso.texOffs(0, 38).addBox(-1.0F, 10.2F, -2.8F, 2.0F, 3.0F, 5.0F, 0.1F, false);
		torso.texOffs(24, 19).addBox(-4.1F, 11.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.1F, false);
		torso.texOffs(0, 16).addBox(3.1F, 11.0F, -1.5F, 1.0F, 2.0F, 3.0F, 0.1F, false);
		torso.texOffs(0, 0).addBox(-1.0F, 5.8F, -1.0F, 2.0F, 4.0F, 2.0F, 0.0F, false);
		torso.texOffs(14, 62).addBox(1.5F, 6.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(44, 49).addBox(0.5F, 7.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(48, 40).addBox(-1.5F, 7.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(62, 4).addBox(-3.5F, 6.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(52, 4).addBox(-4.0F, 5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(48, 45).addBox(-3.0F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(47, 0).addBox(-2.5F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(0, 41).addBox(1.5F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(16, 38).addBox(-0.5F, 1.5F, -1.9F, 1.0F, 2.0F, 1.0F, 0.1F, false);
		torso.texOffs(48, 37).addBox(2.0F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(51, 0).addBox(3.0F, 5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(43, 61).addBox(0.5F, 6.0F, 1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(16, 32).addBox(-3.5F, 6.0F, 1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(24, 6).addBox(-2.5F, 8.2F, -0.5F, 5.0F, 1.0F, 1.0F, -0.2F, false);
		torso.texOffs(0, 32).addBox(1.5F, 8.8F, -0.5F, 1.0F, 3.0F, 1.0F, -0.2F, false);
		torso.texOffs(24, 0).addBox(-2.5F, 8.8F, -0.5F, 1.0F, 3.0F, 1.0F, -0.2F, false);

		torso_r1 = new ModelRenderer(this);
		torso_r1.setPos(0.0F, 24.0F, 0.0F);
		torso.addChild(torso_r1);
		setRotationAngle(torso_r1, 0.0F, 0.0F, -0.1745F);
		torso_r1.texOffs(0, 52).addBox(5.7F, -12.3F, -2.0F, 1.0F, 4.0F, 4.0F, -0.2F, false);

		torso_r2 = new ModelRenderer(this);
		torso_r2.setPos(0.0F, 24.0F, 0.0F);
		torso.addChild(torso_r2);
		setRotationAngle(torso_r2, 0.0F, 0.0F, 0.1745F);
		torso_r2.texOffs(54, 15).addBox(-7.0F, -12.3F, -2.0F, 1.0F, 4.0F, 4.0F, -0.2F, false);

		leftArm.texOffs(34, 33).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		leftArm.texOffs(41, 0).addBox(1.5F, 2.2F, -0.5F, 2.0F, 1.0F, 1.0F, -0.1F, false);
		leftArm.texOffs(54, 23).addBox(2.5F, 3.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		leftArm.texOffs(0, 6).addBox(0.5F, 4.8F, -0.5F, 3.0F, 1.0F, 1.0F, -0.1F, false);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setPos(-6.0F, 22.0F, 0.0F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, 0.0F, 0.0F, 0.0873F);
		leftArm_r1.texOffs(24, 0).addBox(2.0F, -25.0F, -2.5F, 6.0F, 1.0F, 5.0F, -0.3F, false);

		leftArmJoint.texOffs(60, 49).addBox(-0.5F, -0.5F, -1.5F, 2.0F, 2.0F, 3.0F, -0.1F, false);

		leftForeArm.texOffs(0, 46).addBox(-1.0F, 4.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		leftForeArm.texOffs(38, 43).addBox(-1.0F, 1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		leftForeArm.texOffs(50, 55).addBox(1.3F, 4.4F, 1.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		leftForeArm.texOffs(44, 55).addBox(1.3F, 4.4F, -1.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		leftForeArm.texOffs(34, 55).addBox(1.3F, 4.4F, 0.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		leftForeArm.texOffs(30, 55).addBox(1.3F, 4.4F, -2.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		leftForeArm.texOffs(60, 15).addBox(-0.5F, 3.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		rightArm.texOffs(20, 33).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		rightArm.texOffs(44, 35).addBox(-3.5F, 2.2F, -0.5F, 2.0F, 1.0F, 1.0F, -0.1F, false);
		rightArm.texOffs(0, 21).addBox(-3.5F, 4.8F, -0.5F, 3.0F, 1.0F, 1.0F, -0.1F, false);
		rightArm.texOffs(40, 54).addBox(-3.5F, 3.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setPos(6.0F, 22.0F, 0.0F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, 0.0F, 0.0F, -0.0873F);
		rightArm_r1.texOffs(27, 27).addBox(-8.0F, -25.0F, -2.5F, 6.0F, 1.0F, 5.0F, -0.3F, false);

		rightArmJoint.texOffs(0, 60).addBox(-1.5F, -0.5F, -1.5F, 2.0F, 2.0F, 3.0F, -0.1F, false);

		rightForeArm.texOffs(45, 29).addBox(-2.0F, 4.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		rightForeArm.texOffs(44, 22).addBox(-2.0F, 1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		rightForeArm.texOffs(50, 57).addBox(-2.3F, 4.4F, 1.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		rightForeArm.texOffs(44, 57).addBox(-2.3F, 4.4F, 0.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		rightForeArm.texOffs(56, 6).addBox(-2.3F, 4.4F, -2.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		rightForeArm.texOffs(56, 4).addBox(-2.3F, 4.4F, -1.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		rightForeArm.texOffs(61, 20).addBox(-1.5F, 3.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		leftLeg.texOffs(10, 42).addBox(-0.9F, 1.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		leftLeg.texOffs(10, 50).addBox(-0.9F, 4.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.1F, false);

		leftLegJoint.texOffs(51, 59).addBox(-0.4F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.2F, false);

		leftLowerLeg.texOffs(24, 43).addBox(-0.9F, 1.0F, -2.0F, 3.0F, 3.0F, 4.0F, -0.001F, false);
		leftLowerLeg.texOffs(26, 58).addBox(1.6F, 4.4F, -1.6F, 1.0F, 2.0F, 4.0F, -0.4F, false);
		leftLowerLeg.texOffs(58, 59).addBox(-1.4F, 4.4F, 1.4F, 4.0F, 2.0F, 1.0F, -0.4F, false);
		leftLowerLeg.texOffs(55, 24).addBox(-1.4F, 4.4F, -1.6F, 1.0F, 2.0F, 4.0F, -0.4F, false);
		leftLowerLeg.texOffs(48, 45).addBox(-0.9F, 5.0F, -2.0F, 3.0F, 1.0F, 4.0F, -0.001F, false);
		leftLowerLeg.texOffs(9, 38).addBox(-0.4F, 4.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		leftLowerLeg.texOffs(24, 50).addBox(-0.9F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.08F, false);
		leftLowerLeg.texOffs(48, 35).addBox(-0.9F, 3.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.08F, false);
		leftLowerLeg.texOffs(54, 50).addBox(1.9F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftLowerLeg.texOffs(10, 52).addBox(2.7F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		leftLowerLeg.texOffs(30, 33).addBox(0.1F, 0.6F, 0.5F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		leftLowerLeg.texOffs(61, 24).addBox(0.1F, -2.0F, 0.5F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		leftLowerLeg.texOffs(34, 50).addBox(0.1F, -1.2F, 2.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		rightLeg.texOffs(42, 2).addBox(-2.1F, 1.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		rightLeg.texOffs(50, 10).addBox(-2.1F, 4.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.1F, false);

		rightLegJoint.texOffs(59, 44).addBox(-1.6F, -1.0F, -1.5F, 2.0F, 2.0F, 3.0F, 0.2F, false);

		rightLowerLeg.texOffs(32, 6).addBox(-2.1F, 1.0F, -2.0F, 3.0F, 3.0F, 4.0F, -0.001F, false);
		rightLowerLeg.texOffs(34, 49).addBox(-2.1F, 5.0F, -2.0F, 3.0F, 1.0F, 4.0F, -0.001F, false);
		rightLowerLeg.texOffs(56, 4).addBox(-2.6F, 4.4F, -1.6F, 1.0F, 2.0F, 4.0F, -0.4F, false);
		rightLowerLeg.texOffs(55, 30).addBox(-2.6F, 4.4F, 1.4F, 4.0F, 2.0F, 1.0F, -0.4F, false);
		rightLowerLeg.texOffs(44, 55).addBox(0.4F, 4.4F, -1.6F, 1.0F, 2.0F, 4.0F, -0.4F, false);
		rightLowerLeg.texOffs(60, 10).addBox(-1.6F, 4.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);
		rightLowerLeg.texOffs(44, 50).addBox(-2.1F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.08F, false);
		rightLowerLeg.texOffs(48, 40).addBox(-2.1F, 3.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.08F, false);
		rightLowerLeg.texOffs(54, 52).addBox(-3.7F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		rightLowerLeg.texOffs(32, 8).addBox(-3.0F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightLowerLeg.texOffs(20, 50).addBox(-1.1F, 0.6F, 0.5F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		rightLowerLeg.texOffs(34, 43).addBox(-1.1F, -2.0F, 0.5F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		rightLowerLeg.texOffs(0, 52).addBox(-1.1F, -1.2F, 2.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);
	}

	@Override
	protected RotationAngle[][] initSummonPoseRotations() {
		return new RotationAngle[][] {
				new RotationAngle[] {
						new RotationAngle(head, 0.0F, -0.3491F, -0.0873F),
						new RotationAngle(body, 0.2618F, 0.0F, 0.0F),
						new RotationAngle(leftArm, -0.2618F, -0.7854F, -1.8326F),
						new RotationAngle(leftForeArm, 0.0F, 0.0F, 0.0F),
						new RotationAngle(rightArm, 0.5236F, 0.0F, 0.0F),
						new RotationAngle(rightForeArm, 0.0F, 3.1416F, 2.1817F),
						new RotationAngle(leftLeg, -1.5708F, 0.0F, 0.0F),
						new RotationAngle(leftLowerLeg, 2.0944F, 0.0F, 0.0F),
						new RotationAngle(rightLeg, -1.1345F, 0.2618F, 0.0F),
						new RotationAngle(rightLowerLeg, 0.5236F, 0.0F, 0.0F)
				},
				new RotationAngle[] {
						new RotationAngle(head, 0.0F, 0.0F, 0.0F),
						new RotationAngle(body, 0.0F, 1.2F, 0.0F),
						new RotationAngle(leftArm, 0.0F, 0.0F, -0.6981F),
						new RotationAngle(leftForeArm, 0.0F, 0.0F, 1.3963F),
						new RotationAngle(rightArm, -1.8326F, -0.3491F, 0.0F),
						new RotationAngle(rightForeArm, -0.5236F, 0.7854F, -0.7854F),
						new RotationAngle(leftLeg, 0.2182F, 0.0F, 0.0F),
						new RotationAngle(rightLeg, -0.2182F, 0.0F, 0.0F),
						new RotationAngle(rightLowerLeg, 0.4363F, 0.0F, 0.0F)
				}
		};
	}

	@Override
	protected void initActionPoses() {
		actionAnim.put(StandPose.RANGED_ATTACK, new PosedActionAnimation.Builder<SoftAndWetEntity>()
				.addPose(StandEntityAction.Phase.BUTTON_HOLD, new ModelPose<>(new RotationAngle[] {
						new RotationAngle(body, 0.0F, -0.48F, 0.0F),
						new RotationAngle(leftArm, 0.0F, 0.0F, 0.0F),
						new RotationAngle(leftForeArm, 0.0F, 0.0F, 0.0F),
						new RotationAngle(rightArm, -1.0908F, 0.0F, 1.5708F),
						new RotationAngle(rightForeArm, 0.0F, 0.0F, 0.0F)
				}))
				.build(idlePose));

		IModelPose<SoftAndWetEntity> heavyFinisherPose1 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head, 5, 0, 6.36F),
				RotationAngle.fromDegrees(body, 4.2341F, 39.7845F, 6.5861F),
				RotationAngle.fromDegrees(upperPart, 0F, 5F, 0F),
				RotationAngle.fromDegrees(leftArm, 15F, -10F, -52.5F),
				RotationAngle.fromDegrees(leftForeArm, -88.6703F, -3.8472F, 87.0901F),
				RotationAngle.fromDegrees(rightArm, 10.1762F, 16.6443F, 93.1445F),
				RotationAngle.fromDegrees(rightForeArm, -77.4892F, -4.7192F, -74.0538F),
				RotationAngle.fromDegrees(leftLeg, -52.5F, -37.5F, 0),
				RotationAngle.fromDegrees(leftLowerLeg, 97.447F, -7.3536F, -2.2681F),
				RotationAngle.fromDegrees(rightLeg, 8.2781F, -2.4033F, -0.0432F),
				RotationAngle.fromDegrees(rightLowerLeg, 10, -5, 0)
		});
		IModelPose<SoftAndWetEntity> heavyFinisherPose2 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(head, -6.9176F, 15.7939F, 16.6495F),
				RotationAngle.fromDegrees(body, 16.7396F, 58.5251F, 19.4254F),
				RotationAngle.fromDegrees(upperPart, 0F, 15F, 0F),
				RotationAngle.fromDegrees(leftArm, -11.0864F, -27.2098F, -49.134F),
				RotationAngle.fromDegrees(leftForeArm, -98.9572F, -21.4891F, 114.4737F),
				RotationAngle.fromDegrees(rightArm, 37.9264F, 14.6364F, 103.3191F),
				RotationAngle.fromDegrees(rightForeArm, -89.3397F, -34.9867F, -92.8194F),
				RotationAngle.fromDegrees(leftLeg, -36.5212F, -38.7805F, -7.0481F),
				RotationAngle.fromDegrees(leftLowerLeg, 111.7619F, 4.0651F, 10.1255F),
				RotationAngle.fromDegrees(rightLeg, 24.8305F, -0.7714F, 0),
				RotationAngle.fromDegrees(rightLowerLeg, 0.7594F, -5, 0)
		});
		IModelPose<SoftAndWetEntity> heavyFinisherPose3 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(rightArm, -38.3F, 20.47F, 63.55F),
				RotationAngle.fromDegrees(rightForeArm, -67.5782F, 1.503F, -72.9104F),
		});
		IModelPose<SoftAndWetEntity> heavyFinisherPose4 = new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 0, -30, 0),
				RotationAngle.fromDegrees(upperPart, 0F, -15F, 0F),
				RotationAngle.fromDegrees(leftArm, 17.8981F, 11.9128F, -21.186F),
				RotationAngle.fromDegrees(leftForeArm, -83.3352F, 3.9942F, 28.1685F),
				RotationAngle.fromDegrees(rightArm, -72.6819F, 35.6647F, 53.5229F),
				RotationAngle.fromDegrees(rightForeArm, 0, 0, -12.5F),
				RotationAngle.fromDegrees(leftLeg, -48.4357F, 19.6329F, 0.1075F),
				RotationAngle.fromDegrees(leftLowerLeg, 71.8824F, 15.9537F, 11.2591F),
				RotationAngle.fromDegrees(rightLeg, 33.6661F, 23.9013F, 7.2025F),
				RotationAngle.fromDegrees(rightLowerLeg, 22.5F, -5, 0)
		});

		actionAnim.put(StandPose.HEAVY_ATTACK_FINISHER, new PosedActionAnimation.Builder<SoftAndWetEntity>()
				.addPose(StandEntityAction.Phase.WINDUP, new ModelPoseTransition<>(heavyFinisherPose1, heavyFinisherPose2))
				.addPose(StandEntityAction.Phase.PERFORM, new ModelPoseTransitionMultiple.Builder<>(heavyFinisherPose2)
						.addPose(0.5F, heavyFinisherPose3)
						.build(heavyFinisherPose4))
				.addPose(StandEntityAction.Phase.RECOVERY, new ModelPoseTransitionMultiple.Builder<>(heavyFinisherPose4)
						.addPose(0.5F, heavyFinisherPose4)
						.build(idlePose))
				.build(idlePose));
		super.initActionPoses();
	}

	@Override
	protected ModelPose<SoftAndWetEntity> initIdlePose() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(body, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(upperPart, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(torso, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(leftArm, 0.0F, -30F, -10F),
				RotationAngle.fromDegrees(leftForeArm, -20F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightArm, 0.00F, 30F, 10F),
				RotationAngle.fromDegrees(rightForeArm, -20F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(leftLeg, 0.0F, 0.0F, -5F),
				RotationAngle.fromDegrees(leftLowerLeg, 0.0F, 0.0F, -5F),
				RotationAngle.fromDegrees(rightLeg, -15F, 0.0F, 10F),
				RotationAngle.fromDegrees(rightLowerLeg, 40F, 0.0F, 0.0F)
		});
	}

	@Override
	protected ModelPose<SoftAndWetEntity> initIdlePose2Loop() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(leftArm, 0.0F, -30F, -10F),
				RotationAngle.fromDegrees(leftForeArm, -20F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightArm, 0.00F, 30F, 10F),
				RotationAngle.fromDegrees(rightForeArm, -20F, 0.0F, 0.0F)
		});
	}
}