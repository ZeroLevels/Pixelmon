// Date: 7/18/2012 11:58:51 AM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelTentacool extends ModelBase {
	// fields
	ModelRenderer Right_Tentecal;
	ModelRenderer Left_Tentecal;
	ModelRenderer Head;
	ModelRenderer Piece1;
	ModelRenderer Piece2;
	ModelRenderer Piece3;
	ModelRenderer Piece4;
	ModelRenderer Piece5;
	ModelRenderer Piece6;
	ModelRenderer Piece11;
	ModelRenderer Piece22;
	ModelRenderer Piece33;
	ModelRenderer Piece44;
	ModelRenderer Piece55;
	ModelRenderer Piece66;
	ModelRenderer Left;
	ModelRenderer Right;
	ModelRenderer Back;
	ModelRenderer Red_Dot_Mound;
	ModelRenderer Red_Dot1;
	ModelRenderer Red_Thing_Mound;
	ModelRenderer Red_Thing_;
	ModelRenderer Red_Thing_2;
	ModelRenderer Nose;
	ModelRenderer extension;
	ModelRenderer Body;
	ModelRenderer Eyebrow;
	ModelRenderer Eyebrow_1;
	ModelRenderer Eyebrow_2;
	ModelRenderer Eyebrow_3;
	ModelRenderer Red_Thing_2_Mound;
	ModelRenderer Red_Dot;

	public ModelTentacool() {
		textureWidth = 64;
		textureHeight = 32;
		setTextureOffset("Right_Tentecal.a1", 58, 24);
		setTextureOffset("Piece1.a2", 58, 24);
		setTextureOffset("Piece2.a3", 58, 24);
		setTextureOffset("Piece3.a4", 58, 24);
		setTextureOffset("Piece4.a5", 58, 24);
		setTextureOffset("Piece5.a6", 58, 24);
		setTextureOffset("Piece6.a7", 58, 24);
		setTextureOffset("Left_Tentecal.a11", 58, 24);
		setTextureOffset("Piece11.a22", 58, 24);
		setTextureOffset("Piece22.a33", 58, 24);
		setTextureOffset("Piece33.a44", 58, 24);
		setTextureOffset("Piece44.a55", 58, 24);
		setTextureOffset("Piece55.a66", 58, 24);
		setTextureOffset("Piece66.a77", 58, 24);
		setTextureOffset("Head.Flaps", 0, 0);
		setTextureOffset("Head.Body", 0, 0);

		Right_Tentecal = new ModelRenderer(this, "Right_Tentecal");
		Right_Tentecal.setRotationPoint(-2F, -5F, 1F);
		setRotation(Right_Tentecal, 0F, 0F, 0F);
		Right_Tentecal.mirror = true;
		Right_Tentecal.addBox("a1", -0.5F, 0F, -0.5F, 1, 3, 1);
		Piece1 = new ModelRenderer(this, "Piece1");
		Piece1.setRotationPoint(0F, 3F, 0F);
		setRotation(Piece1, 0F, 0F, 0F);
		Piece1.mirror = true;
		Piece1.addBox("a2", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece2 = new ModelRenderer(this, "Piece2");
		Piece2.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece2, 0F, 0F, 0F);
		Piece2.mirror = true;
		Piece2.addBox("a3", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece3 = new ModelRenderer(this, "Piece3");
		Piece3.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece3, 0F, 0F, 0F);
		Piece3.mirror = true;
		Piece3.addBox("a4", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece4 = new ModelRenderer(this, "Piece4");
		Piece4.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece4, 0F, 0F, 0F);
		Piece4.mirror = true;
		Piece4.addBox("a5", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece5 = new ModelRenderer(this, "Piece5");
		Piece5.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece5, 0F, 0F, 0F);
		Piece5.mirror = true;
		Piece5.addBox("a6", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece6 = new ModelRenderer(this, "Piece6");
		Piece6.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece6, 0F, 0F, 0F);
		Piece6.mirror = true;
		Piece6.addBox("a7", -0.5F, 0F, -1F, 1, 3, 2);
		Piece5.addChild(Piece6);
		Piece4.addChild(Piece5);
		Piece3.addChild(Piece4);
		Piece2.addChild(Piece3);
		Piece1.addChild(Piece2);
		Right_Tentecal.addChild(Piece1);
		Left_Tentecal = new ModelRenderer(this, "Left_Tentecal");
		Left_Tentecal.setRotationPoint(2F, -5F, 1F);
		setRotation(Left_Tentecal, 0F, 0F, 0F);
		Left_Tentecal.mirror = true;
		Left_Tentecal.addBox("a11", -0.5F, 0F, -0.5F, 1, 3, 1);
		Piece11 = new ModelRenderer(this, "Piece11");
		Piece11.setRotationPoint(0F, 3F, 0F);
		setRotation(Piece11, 0F, 0F, 0F);
		Piece11.mirror = true;
		Piece11.addBox("a22", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece22 = new ModelRenderer(this, "Piece22");
		Piece22.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece22, 0F, 0F, 0F);
		Piece22.mirror = true;
		Piece22.addBox("a33", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece33 = new ModelRenderer(this, "Piece33");
		Piece33.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece33, 0F, 0F, 0F);
		Piece33.mirror = true;
		Piece33.addBox("a44", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece44 = new ModelRenderer(this, "Piece44");
		Piece44.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece44, 0F, 0F, 0F);
		Piece44.mirror = true;
		Piece44.addBox("a55", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece55 = new ModelRenderer(this, "Piece55");
		Piece55.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece55, 0F, 0F, 0F);
		Piece55.mirror = true;
		Piece55.addBox("a66", -0.5F, 0F, -0.5F, 1, 2, 1);
		Piece66 = new ModelRenderer(this, "Piece66");
		Piece66.setRotationPoint(0F, 2F, 0F);
		setRotation(Piece66, 0F, 0F, 0F);
		Piece66.mirror = true;
		Piece66.addBox("a77", -0.5F, 0F, -1F, 1, 3, 2);
		Piece55.addChild(Piece66);
		Piece44.addChild(Piece55);
		Piece33.addChild(Piece44);
		Piece22.addChild(Piece33);
		Piece11.addChild(Piece22);
		Left_Tentecal.addChild(Piece11);
		Head = new ModelRenderer(this, "Head");
		Head.setRotationPoint(0F, 0F, 0F);
		setRotation(Head, 0F, 0F, 0F);
		Head.mirror = true;
		Red_Dot = new ModelRenderer(this, 0, 0);
		Red_Dot.addBox(-3F, 0F, 0F, 6, 1, 1);
		Red_Dot.setRotationPoint(0F, -5F, -2F);
		Red_Dot.setTextureSize(64, 32);
		Red_Dot.mirror = true;
		setRotation(Red_Dot, -0.1858931F, 0F, 0F);
		Back = new ModelRenderer(this, 0, 0);
		Back.addBox(-3F, 0F, -1F, 6, 3, 1);
		Back.setRotationPoint(0F, -5F, 4F);
		Back.setTextureSize(64, 32);
		Back.mirror = true;
		setRotation(Back, 0.3717861F, 0F, 0F);
		Right = new ModelRenderer(this, 0, 0);
		Right.addBox(0F, 0F, -3F, 1, 3, 6);
		Right.setRotationPoint(-3F, -5F, 1F);
		Right.setTextureSize(64, 32);
		Right.mirror = true;
		setRotation(Right, 0F, 0F, 0.5576792F);
		Left = new ModelRenderer(this, 0, 0);
		Left.addBox(-1F, 0F, -3F, 1, 3, 6);
		Left.setRotationPoint(3F, -5F, 1F);
		Left.setTextureSize(64, 32);
		Left.mirror = true;
		setRotation(Left, 0F, 0F, -0.5576792F);
		Red_Dot_Mound = new ModelRenderer(this, 0, 0);
		Red_Dot_Mound.addBox(-1F, -3.5F, -3.2F, 2, 2, 1);
		Red_Dot_Mound.setRotationPoint(0F, -5F, 1F);
		Red_Dot_Mound.setTextureSize(64, 32);
		Red_Dot_Mound.mirror = true;
		setRotation(Red_Dot_Mound, 0F, 0F, 0F);
		Red_Dot1 = new ModelRenderer(this, 60, 0);
		Red_Dot1.addBox(-0.5F, -3F, -3.5F, 1, 1, 1);
		Red_Dot1.setRotationPoint(0F, -5F, 1F);
		Red_Dot1.setTextureSize(64, 32);
		Red_Dot1.mirror = true;
		setRotation(Red_Dot1, 0F, 0F, 0F);
		Red_Thing_Mound = new ModelRenderer(this, 0, 0);
		Red_Thing_Mound.addBox(-3.25F, -8.25F, -2.5F, 2, 4, 5);
		Red_Thing_Mound.setRotationPoint(0F, -5F, 1F);
		Red_Thing_Mound.setTextureSize(64, 32);
		Red_Thing_Mound.mirror = true;
		setRotation(Red_Thing_Mound, 0F, 0F, 0F);
		Red_Thing_ = new ModelRenderer(this, 43, 6);
		Red_Thing_.addBox(-3.5F, -8.5F, -2F, 2, 4, 4);
		Red_Thing_.setRotationPoint(0F, -5F, 1F);
		Red_Thing_.setTextureSize(64, 32);
		Red_Thing_.mirror = true;
		setRotation(Red_Thing_, 0F, 0F, 0F);
		Red_Thing_2 = new ModelRenderer(this, 39, 0);
		Red_Thing_2.addBox(2.5F, -8.5F, -2F, 2, 4, 4);
		Red_Thing_2.setRotationPoint(-1F, -5F, 1F);
		Red_Thing_2.setTextureSize(64, 32);
		Red_Thing_2.mirror = true;
		setRotation(Red_Thing_2, 0F, 0F, 0F);
		Nose = new ModelRenderer(this, 0, 0);
		Nose.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		Nose.setRotationPoint(0F, -7.5F, -1.7F);
		Nose.setTextureSize(64, 32);
		Nose.mirror = true;
		setRotation(Nose, 0.0371786F, 0F, 0F);
		extension = new ModelRenderer(this, 0, 0);
		extension.addBox(-0.5F, 0.5F, 0F, 1, 1, 1);
		extension.setRotationPoint(0F, -5F, -2F);
		extension.setTextureSize(64, 32);
		extension.mirror = true;
		setRotation(extension, -0.1858931F, 0F, 0F);
		Red_Thing_2_Mound = new ModelRenderer(this, 0, 0);
		Red_Thing_2_Mound.addBox(1.3F, -8.25F, -2.5F, 2, 4, 5);
		Red_Thing_2_Mound.setRotationPoint(0F, -5F, 1F);
		Red_Thing_2_Mound.setTextureSize(64, 32);
		Red_Thing_2_Mound.mirror = true;
		setRotation(Red_Thing_2_Mound, 0F, 0F, 0F);
		Eyebrow = new ModelRenderer(this, 0, 0);
		Eyebrow.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		Eyebrow.setRotationPoint(-2.5F, -6.5F, -1.6F);
		Eyebrow.setTextureSize(64, 32);
		Eyebrow.mirror = true;
		setRotation(Eyebrow, 0F, 0F, -1.396263F);
		Eyebrow_1 = new ModelRenderer(this, 0, 0);
		Eyebrow_1.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
		Eyebrow_1.setRotationPoint(-2.5F, -7F, -1.6F);
		Eyebrow_1.setTextureSize(64, 32);
		Eyebrow_1.mirror = true;
		setRotation(Eyebrow_1, 0F, 0F, 0F);
		Eyebrow_3 = new ModelRenderer(this, 0, 0);
		Eyebrow_3.addBox(-0.5F, 0F, -0.5F, 1, 1, 1);
		Eyebrow_3.setRotationPoint(2.5F, -7F, -1.6F);
		Eyebrow_3.setTextureSize(64, 32);
		Eyebrow_3.mirror = true;
		setRotation(Eyebrow_3, 0F, 0F, 0F);
		Eyebrow_2 = new ModelRenderer(this, 0, 0);
		Eyebrow_2.addBox(-0.5F, 0F, -0.5F, 1, 3, 1);
		Eyebrow_2.setRotationPoint(2.5F, -6.5F, -1.6F);
		Eyebrow_2.setTextureSize(64, 32);
		Eyebrow_2.mirror = true;
		setRotation(Eyebrow_2, 0F, 0F, 1.396263F);
		Body = new ModelRenderer(this, 0, 18);
		Body.addBox(-3F, -8F, -3F, 6, 8, 6);
		Body.setRotationPoint(0F, -5F, 1F);
		Body.setTextureSize(64, 32);
		Body.mirror = true;
		setRotation(Body, 0F, 0F, 0F);
		Head.addChild(Red_Dot);
		Head.addChild(Back);
		Head.addChild(Left);
		Head.addChild(Right);
		Head.addChild(Red_Dot_Mound);
		Head.addChild(Red_Dot1);
		Head.addChild(Red_Thing_Mound);
		Head.addChild(Red_Thing_);
		Head.addChild(Red_Thing_2);
		Head.addChild(Nose);
		Head.addChild(extension);
		Head.addChild(Body);
		Head.addChild(Eyebrow);
		Head.addChild(Eyebrow_1);
		Head.addChild(Eyebrow_2);
		Head.addChild(Eyebrow_3);
		Head.addChild(Red_Thing_2_Mound);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Right_Tentecal.render(f5);
		Left_Tentecal.render(f5);
		Head.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
	}

}
