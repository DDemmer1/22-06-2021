
public class Block {
	
	private int blockX;
	
	private int blockY;
	

	public int getBlockX() {
		return blockX;
	}

	public void setBlockX(int blockX) {
		this.blockX = blockX;
	}

	public int getBlockY() {
		return blockY;
	}

	public void setBlockY(int blockY) {
		this.blockY = blockY;
	}
	
	

	public Block(int blockX, int blockY) {
		super();
		this.blockX = blockX;
		this.blockY = blockY;
	}

	@Override
	public String toString() {
		return "Block [blockX=" + blockX + ", blockY=" + blockY + "]";
	}
	
	
	
	
	
	
}
