import com.encore.test.StudentVO;

public class ReferenceMain {
	
	public static void main(String[] args) {
		
		StudentVO studentVO = new StudentVO();
		//생성자 호출을 통한 객체 생성
		//studentVO.setName("LYW");
		//객체 생성을 마치고 Set 실행
//		System.out.println("인스턴스 소유의 변수 호출 : " + studentVO.);
			
		System.out.println("인스턴스 소유의 메서드 호출 : " );
		studentVO.setName("SSSSSSSSSSSS");
		
		
		String returnValue = studentVO.getName();
		System.out.println( "" );
		
		
		
		
	}

}
