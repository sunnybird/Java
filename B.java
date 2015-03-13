/*interface C {
	int x = 0;
}
class B {
	int x = 1;
}
public class A extends B implements C {
	public void  px(){
		System.out.println(x); //该行出错 x是模糊类型值
	}
	public static void main(String[] args){
		
		new A().px();
	}
}*/

abstract class Anaimal {
	public void saySomething() {
		System.out.println("你想说什么就说吧！");
	}

}

public class A extends Anaimal {

	public void saySomething() {
		System.out.println("我现在有了第二职业：捉耗");
	}

	public static void main(String[] args) {

		Anaimal a = new A();
		Anaimal b = (Anaimal)a;

		a.saySomething();
		b.saySomething();
	}
}


==========================================================================
===============================================================================
我现在有了第二职业：捉耗
我现在有了第二职业：捉耗

