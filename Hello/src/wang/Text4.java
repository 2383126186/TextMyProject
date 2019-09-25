package wang;

public class Text4 {
	
	private static class Inner{
		private static final Text4 INSTANCE = new Text4();
	}
	
	public static Text4 getInstance() {
		return Inner.INSTANCE;
	}
	
}
