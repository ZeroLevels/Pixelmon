// Date: 4/1/2013 8:21:32 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package pixelmon.client.models.pokemon;

import net.minecraft.entity.Entity;
import pixelmon.client.models.PixelmonModelBase;
import pixelmon.client.models.PixelmonModelRenderer;
import pixelmon.client.models.animations.ModuleHead;
import pixelmon.client.models.animations.biped.SkeletonBiped;

public class ModelGrimer extends PixelmonModelBase {
	// fields

	PixelmonModelRenderer Body;

	public ModelGrimer() {
		textureWidth = 64;
		textureHeight = 32;

		Body = new PixelmonModelRenderer(this, "Body");
		Body.setRotationPoint(0, 20, 0);
		PixelmonModelRenderer Body_Base = new PixelmonModelRenderer(this, 0, 0);
		Body_Base.addBox(0F, 0F, 0F, 8, 2, 8);
		Body_Base.setRotationPoint(-4F, 2F, -4F);
		Body_Base.setTextureSize(64, 32);
		Body_Base.mirror = true;
		setRotation(Body_Base, 0F, 0F, 0F);
		PixelmonModelRenderer Body_Base_Front_Right = new PixelmonModelRenderer(this, 0, 17);
		Body_Base_Front_Right.addBox(0F, 0F, 0F, 4, 1, 3);
		Body_Base_Front_Right.setRotationPoint(-5F, 3F, -3.5F);
		Body_Base_Front_Right.setTextureSize(64, 32);
		Body_Base_Front_Right.mirror = true;
		setRotation(Body_Base_Front_Right, 0F, 0.5235988F, 0F);
		PixelmonModelRenderer Body_Base_Front_Left = new PixelmonModelRenderer(this, 0, 25);
		Body_Base_Front_Left.addBox(0F, 0F, 0F, 3, 1, 3);
		Body_Base_Front_Left.setRotationPoint(1F, 3F, -5.5F);
		Body_Base_Front_Left.setTextureSize(64, 32);
		Body_Base_Front_Left.mirror = true;
		setRotation(Body_Base_Front_Left, 0F, -0.2617994F, 0F);
		PixelmonModelRenderer Body_Base_Left = new PixelmonModelRenderer(this, 0, 10);
		Body_Base_Left.addBox(0F, 0F, 0F, 3, 1, 6);
		Body_Base_Left.setRotationPoint(1.5F, 3F, -3F);
		Body_Base_Left.setTextureSize(64, 32);
		Body_Base_Left.mirror = true;
		setRotation(Body_Base_Left, 0F, 0.2617994F, 0F);
		PixelmonModelRenderer Body_Base_Right = new PixelmonModelRenderer(this, 18, 10);
		Body_Base_Right.addBox(0F, 0F, 0F, 3, 1, 5);
		Body_Base_Right.setRotationPoint(-4.5F, 3F, -2.5F);
		Body_Base_Right.setTextureSize(64, 32);
		Body_Base_Right.mirror = true;
		setRotation(Body_Base_Right, 0F, -0.2617994F, 0F);
		PixelmonModelRenderer Body_Base_Back_Left = new PixelmonModelRenderer(this, 32, 0);
		Body_Base_Back_Left.addBox(0F, 0F, 0F, 5, 1, 3);
		Body_Base_Back_Left.setRotationPoint(-0.5F, 3F, 3.5F);
		Body_Base_Back_Left.setTextureSize(64, 32);
		Body_Base_Back_Left.mirror = true;
		setRotation(Body_Base_Back_Left, 0F, 0.5235988F, 0F);
		PixelmonModelRenderer Body_Base_Back_Right = new PixelmonModelRenderer(this, 0, 21);
		Body_Base_Back_Right.addBox(0F, 0F, 0F, 4, 1, 3);
		Body_Base_Back_Right.setRotationPoint(-4F, 3F, 1.5F);
		Body_Base_Back_Right.setTextureSize(64, 32);
		Body_Base_Back_Right.mirror = true;
		setRotation(Body_Base_Back_Right, 0F, -0.2230717F, 0F);
		PixelmonModelRenderer Body_Middle = new PixelmonModelRenderer(this, 36, 23);
		Body_Middle.addBox(0F, 0F, 0F, 7, 2, 7);
		Body_Middle.setRotationPoint(-3.5F, 0F, -3.5F);
		Body_Middle.setTextureSize(64, 32);
		Body_Middle.mirror = true;
		setRotation(Body_Middle, 0F, 0F, 0F);
		PixelmonModelRenderer Body_Top = new PixelmonModelRenderer(this, 42, 16);
		Body_Top.addBox(0F, 0F, 0F, 6, 2, 5);
		Body_Top.setRotationPoint(-3F, -2F, -2.5F);
		Body_Top.setTextureSize(64, 32);
		Body_Top.mirror = true;
		setRotation(Body_Top, 0F, 0F, 0F);

		PixelmonModelRenderer Head = new PixelmonModelRenderer(this, "Head");
		Head.setRotationPoint(0, -3, 0);
		PixelmonModelRenderer Head_Bottom = new PixelmonModelRenderer(this, 46, 9);
		Head_Bottom.addBox(0F, 0F, 0F, 4, 2, 5);
		Head_Bottom.setRotationPoint(-2F, 1F, -4F);
		Head_Bottom.setTextureSize(64, 32);
		Head_Bottom.mirror = true;
		setRotation(Head_Bottom, 0.2617994F, 0F, 0F);
		PixelmonModelRenderer Head_Middle = new PixelmonModelRenderer(this, 48, 3);
		Head_Middle.addBox(0F, 0F, 0F, 5, 2, 3);
		Head_Middle.setRotationPoint(-2.5F, -1F, -2F);
		Head_Middle.setTextureSize(64, 32);
		Head_Middle.mirror = true;
		setRotation(Head_Middle, 0F, 0F, 0F);
		PixelmonModelRenderer Head_Bottom_Tip = new PixelmonModelRenderer(this, 54, 1);
		Head_Bottom_Tip.addBox(0F, 0F, 0F, 4, 1, 1);
		Head_Bottom_Tip.setRotationPoint(-2F, 1.2F, -4.5F);
		Head_Bottom_Tip.setTextureSize(64, 32);
		Head_Bottom_Tip.mirror = true;
		setRotation(Head_Bottom_Tip, 0.2617994F, 0F, 0F);
		PixelmonModelRenderer Head_Top = new PixelmonModelRenderer(this, 16, 25);
		Head_Top.addBox(0F, 0F, 0F, 5, 2, 5);
		Head_Top.setRotationPoint(-2.5F, -3F, -4F);
		Head_Top.setTextureSize(64, 32);
		Head_Top.mirror = true;
		setRotation(Head_Top, -0.1308997F, 0F, 0F);
		PixelmonModelRenderer Head_Top_Tip = new PixelmonModelRenderer(this, 34, 4);
		Head_Top_Tip.addBox(0F, 0F, 0F, 3, 1, 4);
		Head_Top_Tip.setRotationPoint(-1.5F, -3.5F, -3.5F);
		Head_Top_Tip.setTextureSize(64, 32);
		Head_Top_Tip.mirror = true;
		setRotation(Head_Top_Tip, -0.1308997F, 0F, 0F);
		PixelmonModelRenderer Head_Back = new PixelmonModelRenderer(this, 36, 9);
		Head_Back.addBox(0F, 0F, 0F, 4, 3, 1);
		Head_Back.setRotationPoint(-2F, -1F, 0F);
		Head_Back.setTextureSize(64, 32);
		Head_Back.mirror = true;
		setRotation(Head_Back, 0.5235988F, 0F, 0F);

		PixelmonModelRenderer LeftArm = new PixelmonModelRenderer(this, "Left Arm");
		LeftArm.setRotationPoint(3, -1, 0);
		PixelmonModelRenderer Hand_Left_Base = new PixelmonModelRenderer(this, 18, 16);
		Hand_Left_Base.addBox(0F, 0F, 0F, 2, 3, 2);
		Hand_Left_Base.setRotationPoint(1F, 1F, -2F);
		Hand_Left_Base.setTextureSize(64, 32);
		Hand_Left_Base.mirror = true;
		setRotation(Hand_Left_Base, 1.570796F, -0.7853982F, 0F);
		PixelmonModelRenderer Hand_Left_Tip = new PixelmonModelRenderer(this, 26, 16);
		Hand_Left_Tip.addBox(0F, 0F, 0F, 2, 3, 2);
		Hand_Left_Tip.setRotationPoint(2.5F, -0.2F, -3.5F);
		Hand_Left_Tip.setTextureSize(64, 32);
		Hand_Left_Tip.mirror = true;
		setRotation(Hand_Left_Tip, 1.047198F, -0.7853982F, 0F);
		PixelmonModelRenderer Hand_Left_Finger_Top = new PixelmonModelRenderer(this, 0, 29);
		Hand_Left_Finger_Top.addBox(0F, 0F, 0F, 1, 2, 1);
		Hand_Left_Finger_Top.setRotationPoint(3F, -2.5F, -4F);
		Hand_Left_Finger_Top.setTextureSize(64, 32);
		Hand_Left_Finger_Top.mirror = true;
		setRotation(Hand_Left_Finger_Top, 0.7853982F, -0.4363323F, 0.1308997F);
		PixelmonModelRenderer Hand_Left_Finger_Right = new PixelmonModelRenderer(this, 0, 29);
		Hand_Left_Finger_Right.addBox(0F, 0F, 0F, 1, 2, 1);
		Hand_Left_Finger_Right.setRotationPoint(1.5F, -1.1F, -4.5F);
		Hand_Left_Finger_Right.setTextureSize(64, 32);
		Hand_Left_Finger_Right.mirror = true;
		setRotation(Hand_Left_Finger_Right, 1.047198F, 0.1308997F, 0F);
		PixelmonModelRenderer Hand_Left_Finger_Left = new PixelmonModelRenderer(this, 0, 29);
		Hand_Left_Finger_Left.addBox(0F, 0F, 0F, 1, 2, 1);
		Hand_Left_Finger_Left.setRotationPoint(4F, -1F, -4F);
		Hand_Left_Finger_Left.setTextureSize(64, 32);
		Hand_Left_Finger_Left.mirror = true;
		setRotation(Hand_Left_Finger_Left, 1.047198F, -0.5235988F, 0F);

		PixelmonModelRenderer RightArm = new PixelmonModelRenderer(this, "Right Arm");
		RightArm.setRotationPoint(-3, -1, 0);
		PixelmonModelRenderer Hand_Right_Base = new PixelmonModelRenderer(this, 18, 16);
		Hand_Right_Base.addBox(0F, 0F, 0F, 2, 3, 2);
		Hand_Right_Base.setRotationPoint(-2.4F, 1F, -0.5F);
		Hand_Right_Base.setTextureSize(64, 32);
		Hand_Right_Base.mirror = true;
		setRotation(Hand_Right_Base, 1.570796F, 0.7853982F, 0F);
		PixelmonModelRenderer Hand_Right_Tip = new PixelmonModelRenderer(this, 26, 16);
		Hand_Right_Tip.addBox(0F, 0F, 0F, 2, 3, 2);
		Hand_Right_Tip.setRotationPoint(-4F, -0.2F, -2.1F);
		Hand_Right_Tip.setTextureSize(64, 32);
		Hand_Right_Tip.mirror = true;
		setRotation(Hand_Right_Tip, 1.047198F, 0.7853982F, 0F);
		PixelmonModelRenderer Hand_Right_Finger_Top = new PixelmonModelRenderer(this, 0, 29);
		Hand_Right_Finger_Top.addBox(0F, 0F, 0F, 1, 2, 1);
		Hand_Right_Finger_Top.setRotationPoint(-3.8F, -2.6F, -3.6F);
		Hand_Right_Finger_Top.setTextureSize(64, 32);
		Hand_Right_Finger_Top.mirror = true;
		setRotation(Hand_Right_Finger_Top, 0.7853982F, 0.4363323F, 0.1308997F);
		PixelmonModelRenderer Hand_Right_Finger_Right = new PixelmonModelRenderer(this, 0, 29);
		Hand_Right_Finger_Right.addBox(0F, 0F, 0F, 1, 2, 1);
		Hand_Right_Finger_Right.setRotationPoint(-5F, -1.1F, -3.3F);
		Hand_Right_Finger_Right.setTextureSize(64, 32);
		Hand_Right_Finger_Right.mirror = true;
		setRotation(Hand_Right_Finger_Right, 1.047198F, 0.5235988F, 0F);
		PixelmonModelRenderer Hand_right_Finger_Left = new PixelmonModelRenderer(this, 0, 29);
		Hand_right_Finger_Left.addBox(0F, 0F, 0F, 1, 2, 1);
		Hand_right_Finger_Left.setRotationPoint(-3F, -1F, -4F);
		Hand_right_Finger_Left.setTextureSize(64, 32);
		Hand_right_Finger_Left.mirror = true;
		setRotation(Hand_right_Finger_Left, 1.047198F, 0.1308997F, 0F);
		Body.addChild(Body_Base);
		Body.addChild(Body_Base_Front_Right);
		Body.addChild(Body_Base_Front_Left);
		Body.addChild(Body_Base_Left);
		Body.addChild(Body_Base_Right);
		Body.addChild(Body_Base_Back_Left);
		Body.addChild(Body_Base_Back_Right);
		Body.addChild(Body_Middle);
		Body.addChild(Body_Top);
		Head.addChild(Head_Bottom);
		Head.addChild(Head_Middle);
		Head.addChild(Head_Bottom_Tip);
		Head.addChild(Head_Top);
		Head.addChild(Head_Top_Tip);
		Head.addChild(Head_Back);
		LeftArm.addChild(Hand_Left_Base);
		LeftArm.addChild(Hand_Left_Tip);
		LeftArm.addChild(Hand_Left_Finger_Top);
		LeftArm.addChild(Hand_Left_Finger_Right);
		LeftArm.addChild(Hand_Left_Finger_Left);
		RightArm.addChild(Hand_Right_Base);
		RightArm.addChild(Hand_Right_Tip);
		RightArm.addChild(Hand_Right_Finger_Top);
		RightArm.addChild(Hand_Right_Finger_Right);
		RightArm.addChild(Hand_right_Finger_Left);
		Body.addChild(LeftArm);
		Body.addChild(RightArm);
		Body.addChild(Head);

		ModuleHead headModule = new ModuleHead(Head);
		skeleton = new SkeletonBiped(Body, headModule, null, null, null, null, null);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		Body.render(f5);
	}

	private void setRotation(PixelmonModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5) {
	}

}