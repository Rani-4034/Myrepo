package packagesample;

public class BuilderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer fv=new StringBuffer("welcome");
System.out.println(fv);
//append add the new string at last
fv.append("Buffer");
System.out.println(fv);
//insert
fv.insert(13,"Good morning");
System.out.println(fv);
//replace
fv.replace(0,7, "hello");
System.out.println(fv);
//reverse
fv.reverse();
System.out.println(fv);
//delete
fv.delete(0, 7);
System.out.println(fv);
fv.reverse();
System.out.println(fv);
}

}
