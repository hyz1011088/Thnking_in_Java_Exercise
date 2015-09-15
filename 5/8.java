// initialization/PassingThisEx.java
// TIJ4 Chapter Initialization, Exercise 8, page 170
/* Create a class with two methods. Within the first method, call the
* second method twice: the first time without using this, and the second time
* using this - just to see it working; you should not use this form in 
* practice.
*/

class Doc {	
	void intubate() {
		System.out.println("prepare patient");
		laryngoscopy();
		this.laryngoscopy();	 //this 关键字只能在方法内部使用，表示对“调用方法到那个对象的”引用
	}
	void laryngoscopy() {
		System.out.println("use laryngoscope");
	}	
}	
public class PassingThisEx{	
	public static void main(String[] args) {
		new Doc().intubate();		
	}		
}
