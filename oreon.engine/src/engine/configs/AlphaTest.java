package engine.configs;

import static org.lwjgl.opengl.GL11.GL_ALPHA_TEST;
import static org.lwjgl.opengl.GL11.GL_GREATER;
import static org.lwjgl.opengl.GL11.glAlphaFunc;
import static org.lwjgl.opengl.GL11.glDisable;
import static org.lwjgl.opengl.GL11.glEnable;

public class AlphaTest implements RenderConfig{

private float alpha;
	
	public AlphaTest(float alpha){
		this.setAlpha(alpha);
	}
	
	public void enable(){
		glEnable(GL_ALPHA_TEST);
		glAlphaFunc(GL_GREATER, alpha);
	}
	
	public void disable(){
		glDisable(GL_ALPHA_TEST);
	}

	public float getAlpha() {
		return alpha;
	}

	public void setAlpha(float alpha) {
		this.alpha = alpha;
	}
}
