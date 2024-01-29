
public class StringDemoMain {
	
	public static void main(String[] args) {
		
//		String str01 = "임섭순";
//		String str02 = "임섭순12";
		// 위처럼 선언하는 것과 아래처럼 선언하는것의 결과가 다르다.
		String str01 = new String("임섭순");
		String str02 = new String("임섭순12");
		
		if(str01 == str02) {
			System.out.println("주소값이 동일합니다.");
		}else {
			System.out.println("주소값이 다릅니다.");
		}
		
		if(str01.equals(str02)){
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		
	}

}
