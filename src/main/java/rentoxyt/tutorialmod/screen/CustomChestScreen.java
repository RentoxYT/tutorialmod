package rentoxyt.tutorialmod.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.renderer.GameRenderer;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.minecraftforge.client.gui.widget.ExtendedButton;
import rentoxyt.tutorialmod.TutorialMod;

import java.awt.*;

public class CustomChestScreen extends AbstractContainerScreen<CustomChestMenu> {

    private static final ResourceLocation TEXTURE =
            new ResourceLocation(TutorialMod.MOD_ID,"textures/gui/custom_chest.png");
    private ExtendedButton beanButton;
    public CustomChestScreen(CustomChestMenu menu, Inventory inventory, Component component) {
        super(menu, inventory, component);
        this.leftPos = 0;
        this.topPos = 0;
    }


    @Override
    public void render(PoseStack stack, int mouseX, int mouseY, float partialTicks) {
        super.render(stack, mouseX, mouseY, partialTicks);
        this.font.draw(stack, this.title, this.leftPos + 20, this.topPos + 5, 0x404040);
        this.font.draw(stack, this.playerInventoryTitle, this.leftPos + 8, this.topPos + 75, 0x404040);
    }

    @Override
    protected void init() {
        super.init();
        this.beanButton = addRenderableWidget(
                new ExtendedButton(this.leftPos, this.topPos, 16, 16, Component.literal("beans"),
                        btn -> Minecraft.getInstance().player.displayClientMessage(Component.literal("beans"), false)));
    }

    @Override
    protected void renderBg(PoseStack stack, float mouseX, int mouseY, int partialTicks) {
        renderBackground(stack);
        RenderSystem.setShader(GameRenderer::getPositionTexShader);
        RenderSystem.setShaderColor(1.0f, 1.0f, 1.0f, 1.0f);
        RenderSystem.setShaderTexture(0, TEXTURE);
        blit(stack, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight);
    }

    @Override
    protected void renderLabels(PoseStack stack, int mouseX, int mouseY) {
    }
}
