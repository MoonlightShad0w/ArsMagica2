package am2.entity.render;

import am2.entity.EntityBroom;
import am2.entity.models.ModelBroom;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

/**
 * Created by Growlith1223 on 10/25/2016.
 */
public class RenderBroom extends RenderLiving<EntityBroom> {

    private static final ResourceLocation rLoc = new ResourceLocation("arsmagica2", "textures/mobs/Broom.png");

    public RenderBroom(RenderManager rendermanagerIn) {
        super(rendermanagerIn, new ModelBroom(), 0.5f);
    }

    @Override
    public void doRender(EntityBroom entity, double x, double y, double z, float entityYaw, float partialTicks) {
        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    @Override
    protected ResourceLocation getEntityTexture(EntityBroom entity) {
        return rLoc;
    }
}