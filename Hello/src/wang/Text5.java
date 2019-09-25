package wang;
//(单例模式)
public class Text5 {
	
	public static void main(String[] args) {
		
		Text6 t = Text6.Dame();
		Text6 t2 = Text6.Dame();
		//System.out.println(t == t2);
		Text7 t3 = Text7.Demo2();
		Text7 t4 = Text7.Demo2();
		System.out.println(t2 == t);
	}
}


class Text6{
	
	
	
	//饿汉
	private Text6() {
	}


	private static Text6 t = new Text6();
	
	
	public static Text6 Dame() {
		
		
		return t;
	}
}

class Text7{
	//懒汉
	//私有化构造器
	private Text7() {
	}
	private static Text7 t = null;
	
	public static Text7 Demo2() {
		if(t == null) {
			t = new Text7();
		}
		return t;
	}
	
}