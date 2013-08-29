
public class Position {
	private double posX;
	private double posY;
	public Position(double posX, double posY) {
		this.posX = posX;
		this.posY = posY;
	}
	@Override
	public String toString() {
		return "Position [posX=" + posX + ", posY=" + posY + "]";
	}
	public boolean isInCircle() {
		double distance = Math.sqrt(posX*posX+posY*posY);
		if (distance <= 1) return true;
		else return false;
	}
	
}
