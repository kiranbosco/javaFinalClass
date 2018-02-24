
public class TestCode {
	
	public static final String Name_Var="PURINI";
	public  String NAME_CH="We can change Name";
	
	public void test1(){
		System.out.println("Test1"+Name_Var);
	}
	
	public final void test2(){
		System.out.println("Test2 method"+Name_Var);
	}
	
	public final void test2(String name){
		NAME_CH="I Can Do this";
		System.out.println(NAME_CH);
		System.out.println("Test 2 :"+name +": "+Name_Var);
	}

	public static void main(String[] args) {
		TestCode testCode=new TestCode();
		testCode.test1();
		testCode.test2();
		testCode.test2("Hi How are you");

	}

}
