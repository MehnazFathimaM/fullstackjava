package knightingale;

public class castingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//from lowest to highest
		byte b=120;
		short s=b;
		int i=s;
		long l=i;
		System.out.println(l);
		
		//doing highest value to lowest...
		long ll=300;
		System.out.println("long value is ..:"+ll);
		int ii=(int)ll;
		System.out.println("int value is ...L"+ii);
		short ss=(short)ii;
		System.out.println("short value is ..."+ss);
		byte bb=(byte)ss;
		System.out.println("byte value is ..."+bb);
		
		//FLOATING NUMBERS
				//float f=12.45f;//32 bit
				double d=23.45;//64 bit
				System.out.println("double value..:"+d);
				float f=(float)d;
				System.out.println("float value..:"+f);
				
				int myint=(int)f;
				System.out.println(myint);//decimals are lossed
				
				int myascii=169;
				char mychar=(char)myascii;
				System.out.println((char)169);
				System.out.println(mychar);
				
				int mmm=0;
				System.out.println(mmm);		
		
		


	}


}



