package wang;

import java.util.HashMap;

public enum Text{
	
	INSTANCE;
	
	public void print() {
		System.out.println("这是");
		System.out.println("HUngryEnumSingletion.pring()");
	}
	
	public static void main(String[] args) {
		Text t = Text.INSTANCE;
		t.print();
	}
}
