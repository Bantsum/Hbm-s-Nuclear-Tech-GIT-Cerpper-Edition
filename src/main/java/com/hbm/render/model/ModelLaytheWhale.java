/*package com.hbm.render.model;

import com.hbm.main.ResourceManager;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;

public class ModelLaytheWhale extends ModelBase {

	@Override
	public void render(Entity entity, float limbSwing, float limbSwingAmount, float rotationYaw, float rotationHeadYaw, float rotationPitch, float scale) {
		super.render(entity, limbSwing, limbSwingAmount, rotationYaw, rotationHeadYaw, rotationPitch, scale);

		GL11.glPushMatrix();
		{
			double cy0 = Math.sin(limbSwing % (Math.PI * 2));
			double cy1 = Math.sin(limbSwing % (Math.PI * 2) - Math.PI * 0.2);
			double cy2 = Math.sin(limbSwing % (Math.PI * 2) - Math.PI * 0.4);
			double cy3 = Math.sin(limbSwing % (Math.PI * 2) - Math.PI * 0.6);

			GL11.glRotatef(180.0F, 0, 0, 1);
			GL11.glTranslatef(0, -1.5F, 0);

			ResourceManager.laythewhale.renderPart("Body");
			ResourceManager.laythewhale.renderPart("Body1");
			ResourceManager.laythewhale.renderPart("Body2");


			// Head
			GL11.glPushMatrix();
			{
				GL11.glRotatef(rotationPitch, 0, 0, 1);
				GL11.glRotatef(rotationHeadYaw, 0, 1, 0);
				ResourceManager.laythewhale.renderPart("Head");
			}
			GL11.glPopMatrix();

			// Side fins
			GL11.glPushMatrix();
			{
				GL11.glRotated(cy0 * 20, 0, 0, 1);
				ResourceManager.laythewhale.renderPart("FinL");
			}
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			{
				GL11.glRotated(cy0 * -20, 0, 0, 1);
				ResourceManager.laythewhale.renderPart("FinR");
			}
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			{
				GL11.glRotated(cy1 * 20, 0, 0, 1);
				ResourceManager.laythewhale.renderPart("FinL1");
			}
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			{
				GL11.glRotated(cy1 * -20, 0, 0, 1);
				ResourceManager.laythewhale.renderPart("FinR1");
			}
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			{
				GL11.glRotated(cy2 * 20, 0, 0, 1);
				ResourceManager.laythewhale.renderPart("FinL2");
			}
			GL11.glPopMatrix();
			GL11.glPushMatrix();
			{
				GL11.glRotated(cy2 * -20, 0, 0, 1);
				ResourceManager.laythewhale.renderPart("FinR2");
			}
			GL11.glPopMatrix();

			// Tail fin
			GL11.glPushMatrix();
			{
				GL11.glRotated(cy1 * 10, 0, 0, 1);
				GL11.glRotated(cy2 * -5, 1, 0, 0);
				ResourceManager.laythewhale.renderPart("Tail");
				GL11.glRotated(cy3 * -5, 1, 0, 0);
				ResourceManager.laythewhale.renderPart("TailFin");
			}
			GL11.glPopMatrix();

		}
		GL11.glPopMatrix();
	}

}
*/
