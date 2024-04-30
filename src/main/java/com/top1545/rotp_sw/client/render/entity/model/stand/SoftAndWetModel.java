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
		head.texOffs(29, 55).addBox(-2.0F, -5.0F, -4.4F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(39, 8).addBox(-3.0F, -5.0F, -4.4F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(31, 60).addBox(-3.0F, -5.0F, -4.2F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(49, 52).addBox(2.0F, -5.0F, -4.4F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(0, 38).addBox(1.0F, -5.0F, -4.4F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(12, 59).addBox(1.0F, -5.0F, -4.2F, 2.0F, 2.0F, 1.0F, -0.1F, false);
		head.texOffs(43, 52).addBox(-4.5F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.2F, false);
		head.texOffs(52, 22).addBox(3.5F, -6.0F, -2.0F, 1.0F, 4.0F, 4.0F, -0.2F, false);

		head_r1 = new ModelRenderer(this);
		head_r1.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(head_r1);
		setRotationAngle(head_r1, 0.0F, 0.0F, -0.0436F);
		head_r1.texOffs(54, 30).addBox(5.0F, -29.0F, -1.0F, 4.0F, 2.0F, 2.0F, -0.2F, false);

		head_r2 = new ModelRenderer(this);
		head_r2.setPos(0.0F, 24.0F, 0.0F);
		head.addChild(head_r2);
		setRotationAngle(head_r2, 0.0F, 0.0F, 0.0436F);
		head_r2.texOffs(10, 55).addBox(-9.0F, -29.0F, -1.0F, 4.0F, 2.0F, 2.0F, -0.2F, false);

		torso.texOffs(0, 32).addBox(4.0F, 3.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(24, 16).addBox(-5.0F, 3.0F, -2.0F, 1.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(33, 50).addBox(-5.0F, 0.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		torso.texOffs(22, 51).addBox(1.0F, 0.0F, -2.0F, 4.0F, 1.0F, 3.0F, 0.0F, false);
		torso.texOffs(44, 33).addBox(-3.0F, 3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(22, 43).addBox(1.0F, 3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(42, 26).addBox(-2.0F, 3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(37, 43).addBox(2.0F, 3.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(24, 0).addBox(-5.0F, 0.02F, -1.0F, 10.0F, 6.0F, 2.0F, -0.01F, false);
		torso.texOffs(0, 54).addBox(1.0F, 0.0F, 1.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		torso.texOffs(53, 52).addBox(-5.0F, 0.0F, 1.0F, 4.0F, 6.0F, 1.0F, 0.0F, false);
		torso.texOffs(0, 32).addBox(-3.0F, 11.0F, -2.0F, 6.0F, 2.0F, 4.0F, 0.0F, false);
		torso.texOffs(36, 43).addBox(-1.0F, 11.0F, -3.0F, 2.0F, 2.0F, 5.2F, 0.1F, false);
		torso.texOffs(59, 2).addBox(-3.9F, 11.1F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1F, false);
		torso.texOffs(58, 19).addBox(2.9F, 11.1F, -1.5F, 1.0F, 2.0F, 3.0F, -0.1F, false);
		torso.texOffs(14, 41).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 12.0F, 2.0F, -0.1F, false);
		torso.texOffs(53, 10).addBox(-1.5F, 9.9F, -1.5F, 3.0F, 1.0F, 3.0F, -0.3F, false);
		torso.texOffs(60, 14).addBox(1.5F, 6.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(0, 48).addBox(0.5F, 7.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(45, 45).addBox(-1.5F, 7.0F, -2.0F, 1.0F, 2.0F, 1.0F, 0.0F, false);
		torso.texOffs(32, 12).addBox(-3.5F, 6.0F, -2.0F, 2.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(57, 20).addBox(-4.0F, 5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(20, 55).addBox(-5.0F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(40, 54).addBox(-3.0F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(48, 37).addBox(-2.5F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(48, 2).addBox(1.5F, 2.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(39, 18).addBox(-0.5F, 1.5F, -1.9F, 1.0F, 2.0F, 1.0F, 0.1F, false);
		torso.texOffs(54, 34).addBox(2.0F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(49, 10).addBox(4.0F, 1.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(56, 48).addBox(3.0F, 5.0F, -2.0F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		torso.texOffs(52, 59).addBox(0.5F, 6.0F, 1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(16, 32).addBox(-3.5F, 6.0F, 1.0F, 3.0F, 3.0F, 1.0F, 0.0F, false);
		torso.texOffs(10, 38).addBox(-2.0F, 7.2F, -0.5F, 4.0F, 1.0F, 1.0F, -0.2F, false);
		torso.texOffs(24, 22).addBox(-2.0F, 8.4F, -0.5F, 4.0F, 1.0F, 1.0F, -0.2F, false);
		torso.texOffs(45, 60).addBox(1.0F, 7.8F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		torso.texOffs(41, 60).addBox(-2.0F, 7.8F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);

		torso_r1 = new ModelRenderer(this);
		torso_r1.setPos(0.0F, 24.0F, 0.0F);
		torso.addChild(torso_r1);
		setRotationAngle(torso_r1, 0.0F, 0.0F, -0.0873F);
		torso_r1.texOffs(0, 0).addBox(4.7F, -12.54F, -1.5F, 1.0F, 4.0F, 3.0F, -0.1F, false);

		torso_r2 = new ModelRenderer(this);
		torso_r2.setPos(0.0F, 24.0F, 0.0F);
		torso.addChild(torso_r2);
		setRotationAngle(torso_r2, 0.0F, 0.0F, 0.0873F);
		torso_r2.texOffs(0, 16).addBox(-5.7F, -12.54F, -1.5F, 1.0F, 4.0F, 3.0F, -0.1F, false);

		leftArm.texOffs(39, 8).addBox(-1.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		leftArm.texOffs(10, 40).addBox(1.5F, 2.2F, -0.5F, 2.0F, 1.0F, 1.0F, -0.1F, false);
		leftArm.texOffs(58, 0).addBox(2.5F, 3.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);
		leftArm.texOffs(50, 19).addBox(0.5F, 4.8F, -0.5F, 3.0F, 1.0F, 1.0F, -0.1F, false);

		leftArm_r1 = new ModelRenderer(this);
		leftArm_r1.setPos(-6.0F, 22.0F, 0.0F);
		leftArm.addChild(leftArm_r1);
		setRotationAngle(leftArm_r1, 0.0F, 0.0F, 0.0873F);
		leftArm_r1.texOffs(24, 16).addBox(3.0F, -25.0F, -2.5F, 5.0F, 1.0F, 5.0F, -0.3F, false);

		leftArmJoint.texOffs(56, 42).addBox(-0.5F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, -0.1F, false);

		leftForeArm.texOffs(0, 48).addBox(-1.0F, 4.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		leftForeArm.texOffs(42, 26).addBox(-1.0F, 1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		leftForeArm.texOffs(60, 61).addBox(1.3F, 4.4F, 1.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		leftForeArm.texOffs(48, 61).addBox(1.3F, 4.4F, -1.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		leftForeArm.texOffs(27, 61).addBox(1.3F, 4.4F, 0.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		leftForeArm.texOffs(23, 61).addBox(1.3F, 4.4F, -2.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		leftForeArm.texOffs(32, 8).addBox(-0.5F, 3.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		rightArm.texOffs(0, 38).addBox(-2.0F, -2.0F, -2.0F, 3.0F, 6.0F, 4.0F, 0.0F, false);
		rightArm.texOffs(46, 0).addBox(-3.5F, 2.2F, -0.5F, 2.0F, 1.0F, 1.0F, -0.1F, false);
		rightArm.texOffs(55, 40).addBox(-3.5F, 4.8F, -0.5F, 3.0F, 1.0F, 1.0F, -0.1F, false);
		rightArm.texOffs(37, 60).addBox(-3.5F, 3.0F, -0.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		rightArm_r1 = new ModelRenderer(this);
		rightArm_r1.setPos(6.0F, 22.0F, 0.0F);
		rightArm.addChild(rightArm_r1);
		setRotationAngle(rightArm_r1, 0.0F, 0.0F, -0.0873F);
		rightArm_r1.texOffs(27, 27).addBox(-8.0F, -25.0F, -2.5F, 5.0F, 1.0F, 5.0F, -0.3F, false);

		rightArmJoint.texOffs(55, 34).addBox(-1.5F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, -0.1F, false);

		rightForeArm.texOffs(46, 46).addBox(-2.0F, 4.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		rightForeArm.texOffs(45, 39).addBox(-2.0F, 1.0F, -2.0F, 3.0F, 2.0F, 4.0F, 0.0F, false);
		rightForeArm.texOffs(62, 11).addBox(-2.3F, 4.4F, 1.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		rightForeArm.texOffs(62, 9).addBox(-2.3F, 4.4F, 0.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		rightForeArm.texOffs(3, 62).addBox(-2.3F, 4.4F, -2.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		rightForeArm.texOffs(62, 0).addBox(-2.3F, 4.4F, -1.0F, 1.0F, 1.0F, 1.0F, -0.1F, false);
		rightForeArm.texOffs(32, 23).addBox(-1.5F, 3.0F, -1.5F, 2.0F, 1.0F, 3.0F, 0.0F, false);

		leftLeg.texOffs(22, 43).addBox(-1.0F, 1.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		leftLeg.texOffs(44, 32).addBox(-1.0F, 4.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.1F, false);

		leftLegJoint.texOffs(22, 55).addBox(-0.5F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, -0.1F, false);

		leftLowerLeg.texOffs(34, 33).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, -0.001F, false);
		leftLowerLeg.texOffs(49, 5).addBox(-1.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.08F, false);
		leftLowerLeg.texOffs(60, 59).addBox(1.9F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		leftLowerLeg.texOffs(58, 24).addBox(2.7F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		leftLowerLeg.texOffs(60, 48).addBox(0.1F, 3.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		leftLowerLeg.texOffs(30, 33).addBox(0.1F, 0.6F, 0.5F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		leftLowerLeg.texOffs(15, 59).addBox(0.1F, -2.0F, 0.5F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		leftLowerLeg.texOffs(48, 5).addBox(0.1F, -1.2F, 2.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);

		rightLeg.texOffs(40, 18).addBox(-2.0F, 1.0F, -2.0F, 3.0F, 4.0F, 4.0F, 0.0F, false);
		rightLeg.texOffs(48, 0).addBox(-2.0F, 4.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.1F, false);

		rightLegJoint.texOffs(33, 54).addBox(-1.5F, -1.5F, -1.5F, 2.0F, 3.0F, 3.0F, -0.1F, false);

		rightLowerLeg.texOffs(20, 33).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 6.0F, 4.0F, -0.001F, false);
		rightLowerLeg.texOffs(50, 14).addBox(-2.0F, 0.0F, -2.0F, 3.0F, 1.0F, 4.0F, 0.08F, false);
		rightLowerLeg.texOffs(0, 61).addBox(-3.7F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, -0.2F, false);
		rightLowerLeg.texOffs(59, 7).addBox(-2.9F, 3.0F, -0.5F, 1.0F, 1.0F, 1.0F, 0.0F, false);
		rightLowerLeg.texOffs(60, 50).addBox(-1.1F, 3.0F, -2.5F, 1.0F, 1.0F, 1.0F, 0.1F, false);
		rightLowerLeg.texOffs(7, 59).addBox(-1.1F, 0.6F, 0.5F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		rightLowerLeg.texOffs(32, 43).addBox(-1.1F, -2.0F, 0.5F, 1.0F, 1.0F, 3.0F, -0.1F, false);
		rightLowerLeg.texOffs(10, 48).addBox(-1.1F, -1.2F, 2.5F, 1.0F, 2.0F, 1.0F, -0.1F, false);
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
				RotationAngle.fromDegrees(leftArm, 12.5F, -30F, -15F),
				RotationAngle.fromDegrees(leftForeArm, -12.5F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightArm, 10F, 30F, 15F),
				RotationAngle.fromDegrees(rightForeArm, -15F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(leftLeg, 20F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(leftLowerLeg, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightLeg, 0.0F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightLowerLeg, 5F, 0.0F, 0.0F)
		});
	}

	@Override
	protected ModelPose<SoftAndWetEntity> initIdlePose2Loop() {
		return new ModelPose<>(new RotationAngle[] {
				RotationAngle.fromDegrees(leftArm, 7.5F, -30F, -15F),
				RotationAngle.fromDegrees(leftForeArm, -17.5F, 0.0F, 0.0F),
				RotationAngle.fromDegrees(rightArm, 12.5F, 30F, 15F),
				RotationAngle.fromDegrees(rightForeArm, -17.5F, 0.0F, 0.0F)
		});
	}
}