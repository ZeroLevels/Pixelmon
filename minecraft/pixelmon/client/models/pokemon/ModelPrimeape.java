// Date: 8/4/2012 11:04:10 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX
package pixelmon.client.models.pokemon;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPrimeape extends ModelBase {
	// fields
	ModelRenderer Main_body_middle;
	ModelRenderer MBVM;
	ModelRenderer MBFM;
	ModelRenderer MBHM;
	ModelRenderer nose;
	ModelRenderer Right_eyebrow;
	ModelRenderer Left_eyebrow;
	ModelRenderer le_right_edge;
	ModelRenderer le_left_edge;
	ModelRenderer Lec_1;
	ModelRenderer Lec_2;
	ModelRenderer Lec_3;
	ModelRenderer RightEar2;
	ModelRenderer RightEar1;
	ModelRenderer RightEar3;
	ModelRenderer Rec_2;
	ModelRenderer Rec_3;
	ModelRenderer Lamm;
	ModelRenderer Lavm;
	ModelRenderer Lahm;
	ModelRenderer lf_1;
	ModelRenderer lf_2;
	ModelRenderer lf_3;
	ModelRenderer lf_4;
	ModelRenderer lf_5;
	ModelRenderer Lawmm;
	ModelRenderer Lawvm;
	ModelRenderer Lawhm;
	ModelRenderer Left_Shackle;
	ModelRenderer Ramm;
	ModelRenderer Ravm;
	ModelRenderer Rahm;
	ModelRenderer rf_5;
	ModelRenderer rf_4;
	ModelRenderer rf_3;
	ModelRenderer rf_2;
	ModelRenderer rf_1;
	ModelRenderer Rawfm;
	ModelRenderer Rawvm;
	ModelRenderer Rawhm;
	ModelRenderer Right_shackle;
	ModelRenderer Llb1;
	ModelRenderer Llb3;
	ModelRenderer lc1;
	ModelRenderer lc2;
	ModelRenderer Left_shackle;
	ModelRenderer lf1;
	ModelRenderer lf2;
	ModelRenderer lf3;
	ModelRenderer Rlb_1;
	ModelRenderer Rlb_3;
	ModelRenderer rc1;
	ModelRenderer rc2;
	ModelRenderer rls;
	ModelRenderer rf1;
	ModelRenderer rf2;
	ModelRenderer rf3;

	public ModelPrimeape() {
		textureWidth = 512;
		textureHeight = 256;

		Main_body_middle = new ModelRenderer(this, 250, 0);
		Main_body_middle.addBox(-11F, -11F, -11F, 22, 22, 22);
		Main_body_middle.setRotationPoint(0F, 0F, 0F);
		Main_body_middle.setTextureSize(512, 256);
		Main_body_middle.mirror = true;
		setRotation(Main_body_middle, 0F, 0F, 0F);
		MBVM = new ModelRenderer(this, 250, 0);
		MBVM.addBox(-10F, -12F, -10F, 20, 24, 20);
		MBVM.setRotationPoint(0F, 0F, 0F);
		MBVM.setTextureSize(512, 256);
		MBVM.mirror = true;
		setRotation(MBVM, 0F, 0F, 0F);
		MBFM = new ModelRenderer(this, 250, 100);
		MBFM.addBox(-10F, -10F, -12F, 20, 20, 24);
		MBFM.setRotationPoint(0F, 0F, 0F);
		MBFM.setTextureSize(512, 256);
		MBFM.mirror = true;
		setRotation(MBFM, 0F, 0F, 0F);
		MBHM = new ModelRenderer(this, 250, 0);
		MBHM.addBox(-12F, -10F, -10F, 24, 20, 20);
		MBHM.setRotationPoint(0F, 0F, 0F);
		MBHM.setTextureSize(512, 256);
		MBHM.mirror = true;
		setRotation(MBHM, 0F, 0F, 0F);
		nose = new ModelRenderer(this, 0, 125);
		nose.addBox(-3F, -1F, -13F, 6, 3, 1);
		nose.setRotationPoint(0F, 0F, 0F);
		nose.setTextureSize(512, 256);
		nose.mirror = true;
		setRotation(nose, 0F, 0F, 0F);
		Right_eyebrow = new ModelRenderer(this, 290, 16);
		Right_eyebrow.addBox(-9.5F, -4.5F, -12.5F, 7, 2, 1);
		Right_eyebrow.setRotationPoint(0F, 0F, 0F);
		Right_eyebrow.setTextureSize(512, 256);
		Right_eyebrow.mirror = true;
		setRotation(Right_eyebrow, 0F, 0F, 0.4363323F);
		Left_eyebrow = new ModelRenderer(this, 304, 12);
		Left_eyebrow.addBox(2.5F, -4.5F, -12.5F, 7, 2, 1);
		Left_eyebrow.setRotationPoint(0F, 0F, 0F);
		Left_eyebrow.setTextureSize(512, 256);
		Left_eyebrow.mirror = true;
		setRotation(Left_eyebrow, 0F, 0F, -0.4363323F);
		le_right_edge = new ModelRenderer(this, 250, 0);
		le_right_edge.addBox(-1F, -4.6F, -0.5F, 1, 6, 1);
		le_right_edge.setRotationPoint(4F, -12F, 0F);
		le_right_edge.setTextureSize(512, 256);
		le_right_edge.mirror = true;
		setRotation(le_right_edge, 0F, 0F, 0.3490659F);
		le_left_edge = new ModelRenderer(this, 250, 0);
		le_left_edge.addBox(0F, -4.5F, -0.5F, 1, 6, 1);
		le_left_edge.setRotationPoint(7F, -12F, 0F);
		le_left_edge.setTextureSize(512, 256);
		le_left_edge.mirror = true;
		setRotation(le_left_edge, 0F, 0F, -0.3490659F);
		Lec_1 = new ModelRenderer(this, 0, 200);
		Lec_1.addBox(-1F, -4F, 0F, 1, 6, 0);
		Lec_1.setRotationPoint(6F, -12F, 0F);
		Lec_1.setTextureSize(512, 256);
		Lec_1.mirror = true;
		setRotation(Lec_1, 0F, 0F, 0F);
		Lec_2 = new ModelRenderer(this, 0, 200);
		Lec_2.addBox(-2F, 0F, 0F, 3, 2, 0);
		Lec_2.setRotationPoint(6F, -14F, 0F);
		Lec_2.setTextureSize(512, 256);
		Lec_2.mirror = true;
		setRotation(Lec_2, 0F, 0F, 0F);
		Lec_3 = new ModelRenderer(this, 0, 200);
		Lec_3.addBox(-1F, -5F, 0F, 2, 1, 0);
		Lec_3.setRotationPoint(5.5F, -10F, 0F);
		Lec_3.setTextureSize(512, 256);
		Lec_3.mirror = true;
		setRotation(Lec_3, 0F, 0F, 0F);
		RightEar2 = new ModelRenderer(this, 250, 0);
		RightEar2.addBox(-1F, -5.066667F, -0.5F, 1, 6, 1);
		RightEar2.setRotationPoint(-8F, -12F, 0F);
		RightEar2.setTextureSize(512, 256);
		RightEar2.mirror = true;
		setRotation(RightEar2, 0F, 0F, 0.3490659F);
		RightEar1 = new ModelRenderer(this, 250, 0);
		RightEar1.addBox(0F, -5F, -0.5F, 1, 6, 1);
		RightEar1.setRotationPoint(-5F, -12F, 0F);
		RightEar1.setTextureSize(512, 256);
		RightEar1.mirror = true;
		setRotation(RightEar1, 0F, 0F, -0.3490659F);
		RightEar3 = new ModelRenderer(this, 0, 200);
		RightEar3.addBox(-1F, -4F, 0F, 1, 6, 0);
		RightEar3.setRotationPoint(-6F, -12F, 0F);
		RightEar3.setTextureSize(512, 256);
		RightEar3.mirror = true;
		setRotation(RightEar3, 0F, 0F, 0F);
		Rec_2 = new ModelRenderer(this, 0, 200);
		Rec_2.addBox(-2F, 0F, 0F, 3, 2, 0);
		Rec_2.setRotationPoint(-6F, -14F, 0F);
		Rec_2.setTextureSize(512, 256);
		Rec_2.mirror = true;
		setRotation(Rec_2, 0F, 0F, 0F);
		Rec_3 = new ModelRenderer(this, 0, 200);
		Rec_3.addBox(-1F, -3F, 0F, 2, 1, 0);
		Rec_3.setRotationPoint(-6.5F, -12F, 0F);
		Rec_3.setTextureSize(512, 256);
		Rec_3.mirror = true;
		setRotation(Rec_3, 0F, 0F, 0F);
		Lamm = new ModelRenderer(this, 0, 100);
		Lamm.addBox(13F, -20F, -2F, 14, 4, 4);
		Lamm.setRotationPoint(-12F, 2F, 0F);
		Lamm.setTextureSize(512, 256);
		Lamm.mirror = true;
		setRotation(Lamm, 0F, 0F, 0.7679449F);
		Lavm = new ModelRenderer(this, 0, 100);
		Lavm.addBox(13.5F, -20.5F, -1.5F, 14, 5, 3);
		Lavm.setRotationPoint(-12F, 2F, 0F);
		Lavm.setTextureSize(512, 256);
		Lavm.mirror = true;
		setRotation(Lavm, 0F, 0F, 0.7679449F);
		Lahm = new ModelRenderer(this, 0, 100);
		Lahm.addBox(13.5F, -19.5F, -2.5F, 13, 3, 5);
		Lahm.setRotationPoint(-12F, 2F, 0F);
		Lahm.setTextureSize(512, 256);
		Lahm.mirror = true;
		setRotation(Lahm, 0F, 0F, 0.7679449F);
		lf_1 = new ModelRenderer(this, 0, 100);
		lf_1.addBox(0F, 0F, -17F, 4, 4, 5);
		lf_1.setRotationPoint(19F, 4F, 0F);
		lf_1.setTextureSize(512, 256);
		lf_1.mirror = true;
		setRotation(lf_1, 0F, 0F, 0.7679449F);
		lf_2 = new ModelRenderer(this, 0, 100);
		lf_2.addBox(-1F, 0F, -20F, 6, 2, 6);
		lf_2.setRotationPoint(19F, 4F, 0F);
		lf_2.setTextureSize(512, 256);
		lf_2.mirror = true;
		setRotation(lf_2, 0F, 0F, 0.7679449F);
		lf_3 = new ModelRenderer(this, 0, 100);
		lf_3.addBox(-1F, -15F, -15F, 6, 2, 2);
		lf_3.setRotationPoint(19F, 4F, 0F);
		lf_3.setTextureSize(512, 256);
		lf_3.mirror = true;
		setRotation(lf_3, 0.8726646F, 0F, 0.7679449F);
		lf_4 = new ModelRenderer(this, 0, 100);
		lf_4.addBox(-1F, 1.8F, -21F, 6, 3, 2);
		lf_4.setRotationPoint(19F, 4F, 0F);
		lf_4.setTextureSize(512, 256);
		lf_4.mirror = true;
		setRotation(lf_4, 0F, 0F, 0.7679449F);
		lf_5 = new ModelRenderer(this, 0, 100);
		lf_5.addBox(0F, -13F, -16F, 4, 2, 5);
		lf_5.setRotationPoint(19F, 4F, 0F);
		lf_5.setTextureSize(512, 256);
		lf_5.mirror = true;
		setRotation(lf_5, 0.8726646F, 0F, 0.7679449F);
		Lawmm = new ModelRenderer(this, 0, 100);
		Lawmm.addBox(0F, 0F, -12F, 4, 4, 14);
		Lawmm.setRotationPoint(19F, 4F, 0F);
		Lawmm.setTextureSize(512, 256);
		Lawmm.mirror = true;
		setRotation(Lawmm, 0F, 0F, 0.7679449F);
		Lawvm = new ModelRenderer(this, 0, 100);
		Lawvm.addBox(0F, 0F, -12F, 3, 5, 13);
		Lawvm.setRotationPoint(20F, 4F, 0F);
		Lawvm.setTextureSize(512, 256);
		Lawvm.mirror = true;
		setRotation(Lawvm, 0F, 0F, 0.7679449F);
		Lawhm = new ModelRenderer(this, 0, 100);
		Lawhm.addBox(0F, 0F, -11.5F, 5, 3, 13);
		Lawhm.setRotationPoint(18F, 4F, 0F);
		Lawhm.setTextureSize(512, 256);
		Lawhm.mirror = true;
		setRotation(Lawhm, 0F, 0F, 0.7679449F);
		Left_Shackle = new ModelRenderer(this, 0, 150);
		Left_Shackle.addBox(-1.5F, -1F, -13.01F, 6, 6, 3);
		Left_Shackle.setRotationPoint(19.5F, 4F, 0F);
		Left_Shackle.setTextureSize(512, 256);
		Left_Shackle.mirror = true;
		setRotation(Left_Shackle, 0F, 0F, 0.7679449F);
		Ramm = new ModelRenderer(this, 0, 100);
		Ramm.addBox(-9.5F, -3F, -2F, 14, 4, 4);
		Ramm.setRotationPoint(-12F, 2F, 0F);
		Ramm.setTextureSize(512, 256);
		Ramm.mirror = true;
		setRotation(Ramm, 0F, 0F, -0.7679449F);
		Ravm = new ModelRenderer(this, 0, 100);
		Ravm.addBox(-9.5F, -3.5F, -1.5F, 14, 5, 3);
		Ravm.setRotationPoint(-12F, 2F, 0F);
		Ravm.setTextureSize(512, 256);
		Ravm.mirror = true;
		setRotation(Ravm, 0F, 0F, -0.7679449F);
		Rahm = new ModelRenderer(this, 0, 100);
		Rahm.addBox(-9.5F, -2.5F, -2.5F, 13, 3, 5);
		Rahm.setRotationPoint(-12F, 2F, 0F);
		Rahm.setTextureSize(512, 256);
		Rahm.mirror = true;
		setRotation(Rahm, 0F, 0F, -0.7679449F);
		rf_5 = new ModelRenderer(this, 0, 100);
		rf_5.addBox(-1F, -13.5F, -16.5F, 4, 2, 5);
		rf_5.setRotationPoint(-21F, 6F, 0F);
		rf_5.setTextureSize(512, 256);
		rf_5.mirror = true;
		setRotation(rf_5, 0.8726646F, 0F, -0.7679449F);
		rf_4 = new ModelRenderer(this, 0, 100);
		rf_4.addBox(-3F, 1.5F, -21F, 6, 3, 2);
		rf_4.setRotationPoint(-21F, 6F, 0F);
		rf_4.setTextureSize(512, 256);
		rf_4.mirror = true;
		setRotation(rf_4, 0F, 0F, -0.7679449F);
		rf_3 = new ModelRenderer(this, 0, 100);
		rf_3.addBox(-3F, -15.5F, -14.7F, 6, 2, 2);
		rf_3.setRotationPoint(-21F, 6F, 0F);
		rf_3.setTextureSize(512, 256);
		rf_3.mirror = true;
		setRotation(rf_3, 0.8726646F, 0F, -0.7679449F);
		rf_2 = new ModelRenderer(this, 0, 100);
		rf_2.addBox(-3F, -0.5F, -20F, 6, 2, 6);
		rf_2.setRotationPoint(-21F, 6F, 0F);
		rf_2.setTextureSize(512, 256);
		rf_2.mirror = true;
		setRotation(rf_2, 0F, 0F, -0.7679449F);
		rf_1 = new ModelRenderer(this, 0, 100);
		rf_1.addBox(-2F, 0F, -18F, 4, 4, 5);
		rf_1.setRotationPoint(-21F, 6F, 0F);
		rf_1.setTextureSize(512, 256);
		rf_1.mirror = true;
		setRotation(rf_1, 0F, 0F, -0.7679449F);
		Rawfm = new ModelRenderer(this, 0, 100);
		Rawfm.addBox(-2F, 0.5F, -12F, 4, 4, 14);
		Rawfm.setRotationPoint(-21F, 6F, 0F);
		Rawfm.setTextureSize(512, 256);
		Rawfm.mirror = true;
		setRotation(Rawfm, 0F, 0F, -0.7679449F);
		Rawvm = new ModelRenderer(this, 0, 100);
		Rawvm.addBox(-1.5F, 0F, -11.5F, 3, 5, 13);
		Rawvm.setRotationPoint(-21F, 6F, 0F);
		Rawvm.setTextureSize(512, 256);
		Rawvm.mirror = true;
		setRotation(Rawvm, 0F, 0F, -0.7679449F);
		Rawhm = new ModelRenderer(this, 0, 100);
		Rawhm.addBox(-2.5F, 1F, -10.5F, 5, 3, 13);
		Rawhm.setRotationPoint(-21F, 6F, 0F);
		Rawhm.setTextureSize(512, 256);
		Rawhm.mirror = true;
		setRotation(Rawhm, 0F, 0F, -0.7679449F);
		Right_shackle = new ModelRenderer(this, 0, 150);
		Right_shackle.addBox(-3F, -1F, -13.01F, 6, 6, 3);
		Right_shackle.setRotationPoint(-21F, 6F, 0F);
		Right_shackle.setTextureSize(512, 256);
		Right_shackle.mirror = true;
		setRotation(Right_shackle, 0F, 0F, -0.7679449F);
		Llb1 = new ModelRenderer(this, 0, 100);
		Llb1.addBox(-1.5F, -4F, 0.5F, 4, 8, 4);
		Llb1.setRotationPoint(6F, 12F, 0F);
		Llb1.setTextureSize(512, 256);
		Llb1.mirror = true;
		setRotation(Llb1, -0.6108652F, -0.8726646F, 0F);
		Llb3 = new ModelRenderer(this, 0, 100);
		Llb3.addBox(-1F, -4F, 0F, 3, 8, 5);
		Llb3.setRotationPoint(6F, 12F, 0F);
		Llb3.setTextureSize(512, 256);
		Llb3.mirror = true;
		setRotation(Llb3, -0.6108652F, -0.8726646F, 0F);
		lc1 = new ModelRenderer(this, 0, 100);
		lc1.addBox(0F, -1F, -5F, 3, 8, 3);
		lc1.setRotationPoint(2.5F, 16F, 1.5F);
		lc1.setTextureSize(512, 256);
		lc1.mirror = true;
		setRotation(lc1, 0F, -0.8726646F, 0F);
		lc2 = new ModelRenderer(this, 0, 100);
		lc2.addBox(0.5F, -0.5F, -6F, 2, 7, 4);
		lc2.setRotationPoint(2.5F, 16F, 1.5F);
		lc2.setTextureSize(512, 256);
		lc2.mirror = true;
		setRotation(lc2, 0F, -0.8726646F, 0F);
		Left_shackle = new ModelRenderer(this, 0, 150);
		Left_shackle.addBox(-2F, 4.01F, -6F, 5, 2, 5);
		Left_shackle.setRotationPoint(3.5F, 14.3F, 2F);
		Left_shackle.setTextureSize(512, 256);
		Left_shackle.mirror = true;
		setRotation(Left_shackle, 0F, -0.8726646F, 0F);
		lf1 = new ModelRenderer(this, 0, 100);
		lf1.addBox(0.2F, 6F, -4F, 2, 2, 2);
		lf1.setRotationPoint(2.5F, 16F, 1.5F);
		lf1.setTextureSize(512, 256);
		lf1.mirror = true;
		setRotation(lf1, 0F, -0.8726646F, 0F);
		lf2 = new ModelRenderer(this, 0, 100);
		lf2.addBox(-0.5F, 6F, -6.5F, 4, 2, 3);
		lf2.setRotationPoint(2.5F, 16F, 1.5F);
		lf2.setTextureSize(512, 256);
		lf2.mirror = true;
		setRotation(lf2, 0F, -0.8726646F, 0F);
		lf3 = new ModelRenderer(this, 0, 100);
		lf3.addBox(0F, 5F, -8F, 3, 3, 3);
		lf3.setRotationPoint(2.5F, 16F, 1.5F);
		lf3.setTextureSize(512, 256);
		lf3.mirror = true;
		setRotation(lf3, 0F, -0.8726646F, 0F);
		Rlb_1 = new ModelRenderer(this, 0, 100);
		Rlb_1.addBox(-2F, -3F, 0F, 4, 8, 4);
		Rlb_1.setRotationPoint(-6F, 12F, 0F);
		Rlb_1.setTextureSize(512, 256);
		Rlb_1.mirror = true;
		setRotation(Rlb_1, -0.6108652F, 0.8726646F, 0F);
		Rlb_3 = new ModelRenderer(this, 0, 100);
		Rlb_3.addBox(-1.5F, -2.5F, -0.5F, 3, 8, 5);
		Rlb_3.setRotationPoint(-6F, 12F, 0F);
		Rlb_3.setTextureSize(512, 256);
		Rlb_3.mirror = true;
		setRotation(Rlb_3, -0.6108652F, 0.8726646F, 0F);
		rc1 = new ModelRenderer(this, 0, 100);
		rc1.addBox(-2.3F, -2F, -6.5F, 3, 8, 3);
		rc1.setRotationPoint(-2.5F, 17F, 2F);
		rc1.setTextureSize(512, 256);
		rc1.mirror = true;
		setRotation(rc1, 0F, 0.8726646F, 0F);
		rc2 = new ModelRenderer(this, 0, 100);
		rc2.addBox(-1.7F, -0.5F, -7F, 2, 7, 4);
		rc2.setRotationPoint(-2.5F, 16F, 2F);
		rc2.setTextureSize(512, 256);
		rc2.mirror = true;
		setRotation(rc2, 0F, 0.8726646F, 0F);
		rls = new ModelRenderer(this, 0, 150);
		rls.addBox(-3F, 3.5F, -7.5F, 5, 2, 5);
		rls.setRotationPoint(-2.5F, 15F, 2F);
		rls.setTextureSize(512, 256);
		rls.mirror = true;
		setRotation(rls, 0F, 0.8726646F, 0F);
		rf1 = new ModelRenderer(this, 0, 100);
		rf1.addBox(-1.3F, 6F, -5.5F, 2, 2, 2);
		rf1.setRotationPoint(-2.5F, 16F, 2F);
		rf1.setTextureSize(512, 256);
		rf1.mirror = true;
		setRotation(rf1, 0F, 0.8726646F, 0F);
		rf2 = new ModelRenderer(this, 0, 100);
		rf2.addBox(-2.8F, 6F, -8F, 4, 2, 3);
		rf2.setRotationPoint(-2.5F, 16F, 2F);
		rf2.setTextureSize(512, 256);
		rf2.mirror = true;
		setRotation(rf2, 0F, 0.8726646F, 0F);
		rf3 = new ModelRenderer(this, 0, 100);
		rf3.addBox(-2.3F, 5F, -9.5F, 3, 3, 3);
		rf3.setRotationPoint(-2.5F, 16F, 2F);
		rf3.setTextureSize(512, 256);
		rf3.mirror = true;
		setRotation(rf3, 0F, 0.8726646F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		Main_body_middle.render(f5);
		MBVM.render(f5);
		MBFM.render(f5);
		MBHM.render(f5);
		nose.render(f5);
		Right_eyebrow.render(f5);
		Left_eyebrow.render(f5);
		le_right_edge.render(f5);
		le_left_edge.render(f5);
		Lec_1.render(f5);
		Lec_2.render(f5);
		Lec_3.render(f5);
		RightEar2.render(f5);
		RightEar1.render(f5);
		RightEar3.render(f5);
		Rec_2.render(f5);
		Rec_3.render(f5);
		Lamm.render(f5);
		Lavm.render(f5);
		Lahm.render(f5);
		lf_1.render(f5);
		lf_2.render(f5);
		lf_3.render(f5);
		lf_4.render(f5);
		lf_5.render(f5);
		Lawmm.render(f5);
		Lawvm.render(f5);
		Lawhm.render(f5);
		Left_Shackle.render(f5);
		Ramm.render(f5);
		Ravm.render(f5);
		Rahm.render(f5);
		rf_5.render(f5);
		rf_4.render(f5);
		rf_3.render(f5);
		rf_2.render(f5);
		rf_1.render(f5);
		Rawfm.render(f5);
		Rawvm.render(f5);
		Rawhm.render(f5);
		Right_shackle.render(f5);
		Llb1.render(f5);
		Llb3.render(f5);
		lc1.render(f5);
		lc2.render(f5);
		Left_shackle.render(f5);
		lf1.render(f5);
		lf2.render(f5);
		lf3.render(f5);
		Rlb_1.render(f5);
		Rlb_3.render(f5);
		rc1.render(f5);
		rc2.render(f5);
		rls.render(f5);
		rf1.render(f5);
		rf2.render(f5);
		rf3.render(f5);
	}

	private void setRotation(ModelRenderer model, float x, float y, float z) {
		model.rotateAngleX = x;
		model.rotateAngleY = y;
		model.rotateAngleZ = z;
	}

	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
	}

}
