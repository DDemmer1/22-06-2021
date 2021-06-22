
public class Grid {
	
	
	private Block[][] blockGrid;
	
	private int size;
	
	
	public Grid(int size) {
		this.setSize(size);
		
		blockGrid = new Block[size][size];
		
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				blockGrid[i][j] = new Block(j,i);
				System.out.print(blockGrid[i][j]+ "  ");
			}
			System.out.println();
		}
		
		
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}
	

}
