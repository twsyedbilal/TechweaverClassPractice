package WrapperClasses;

public class Wrapper1 {
	@SuppressWarnings("removal")
	public static void main(String[] args) {

		//Auto boxing
		//Primitive data type to wrapper classes PDT->WC
		int a=10;
		Integer i1=new Integer(a);
		System.out.println(i1);
		Integer i2=Integer.valueOf(a);
		System.out.println(i2);
		Byte b1=new Byte((byte) a);
		Byte b2=Byte.valueOf((byte) a);
		System.out.println(b1+" "+b2);
		Double d1=new Double(a);
		Double d2=Double.valueOf(a);
		System.out.println(d1+" "+d2);
		Long l1=new Long(a);
		Long l2=Long.valueOf(a);
		System.out.println(l1+" "+l2);

		//Auto unboxing
		//Wrapper classes to PD
		Integer i3=new Integer(20);
		int a2=i1.intValue();
		a2=l2.intValue();
		a2=d2.intValue();
		byte b3=i3.byteValue();
		//b3=l2.byteValue();
		long l3=l2.longValue();
		System.out.println(a2+" "+b3+" "+l3);
		Boolean bo1=new Boolean(true);
		boolean bo2=bo1.booleanValue();
		System.out.println(bo2);
		
		//String object to Wrapper classes
		//String str="10s";
		//Exception in thread "main" java.lang.NumberFormatException: For input string: "10s"
		String str="10";
		Integer i4=new Integer(str);
		Integer i5=Integer.valueOf(str);
		System.out.println(i4+" "+i5);
		String str2="true";
		Boolean bo3=new Boolean(str2);
		System.out.println(bo3);
		Boolean bo4=Boolean.valueOf("taufeeq");
		System.out.println(bo4);
		
		//String object -> Primitive Data type
		String str3="100";
		int a5=Integer.parseInt(str3);
		byte b5=Byte.parseByte(str3);
		short s1=Short.parseShort(str3);
		System.out.println(a5+" "+b5+" "+s1);
		boolean bo5=Boolean.parseBoolean(str3);
		System.out.println(bo5);
		
		//Wrapper classes to String object
		Integer i10=new Integer(10);
		String str4=i10.toString();
		System.out.println(str4);
		Double d10=new Double(10.0);
		String str5=d10.toString(); //"10.0"
		System.out.println(str5);
		
		//primitive data type -> string object
		int a11=100;
		String str6=Integer.toString(a11);
		System.out.println(str6); //"100"
		boolean bo11=false;
		String str7=Boolean.toString(bo11);
		System.out.println(str7);
		
	}
}
