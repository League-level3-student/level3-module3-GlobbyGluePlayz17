package Checkpoint;

public class Animation2D extends Animation implements Drawable {
	
	public static void main(String[] args) {
		Animation2D a2d = new Animation2D();
		System.out.println(a2d.getFrameRate());
		a2d.draw();
	}

	@Override
	public void draw() {
		System.out.println("draw");
	}

	@Override
	int getFrameRate() {
		return 24;
	}

}
