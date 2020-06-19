package java_Computer;

public class Use_phone {
	public static void main(String[] args) {
		//1.Phone p1:定义引用类型变量p1
		//2.new Phone():实例化对象（申请内存空间）
		phone p1 = new phone();
		//打印成员变量
		System.out.println(p1.brand);
		System.out.println(p1.price);
		//给成员变量赋值
		p1.brand = "华为p40pro";
		p1.price = 4999;
		//再次打印成员变量
		System.out.println(p1.brand);
		System.out.println(p1.price);
		p1.info();
		//调用成员方法
		phone p2 = new phone();
		p2.brand = "iphone 11 pro";
		p2.price = 7999;
		p2.info();
		
	}

}
