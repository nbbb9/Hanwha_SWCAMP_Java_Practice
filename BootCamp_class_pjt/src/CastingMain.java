
public class CastingMain {
	public static void main(String[] args) {
		
		byte x, y;//변수 선언
		byte sum;
		
		x = 10;	
		y = 10;
		sum = (byte)(x + y);
		
		System.out.println("sum = " + sum);
		System.out.println("x + y = " + (x + y));
		
		char charValue = 'A';
		char charValue2 = 'B';
		
		System.out.println(charValue);
		System.out.println(charValue + charValue2);
		//문자는 아스키코드값으로 더하기가 가능하다.
		System.out.println((char)(97));
		//97을 a로 다운캐스팅

	}
}
