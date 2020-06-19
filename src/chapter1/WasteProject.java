package chapter1;

public class WasteProject {
	public static void main(String[] args) {
		getCat();
		//（1）：方法出栈导致的垃圾对象。执行完第5行后方法出栈，失去了堆区的地址，没有方法引用。所以getCat中的对象成为垃圾对象。
		Cat cat = new Cat();
		cat.name = "小黑猫";
		cat.info();
		//（2）：无人引用导致的垃圾对象。
		cat = null;
		
	}

	private static void getCat() {
		Cat cat = new Cat();
		cat.name = "小黄猫";
		
		
	}

}
