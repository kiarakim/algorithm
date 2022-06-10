import java.io.IOException;
 
public class Main {	
	public static void main(String[] args) throws IOException {
		boolean[] self = new boolean[10001];//생성자 유무 구분 위한 boolean
		
		for(int i = 1; i < 10001; i++) { 	//1부터 10000까지 검사
			int n = d(i);					//리턴이 된 수는 생성자가 있는 수
			
			if(n < 10001)				
				self[n] = true;				//생성자가 있는 수는 true
		}	
		
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i < 10001; i++) {
			if(!self[i])					//생성자가 없는 숫자는
				sb.append(i).append('\n');	//sb에 추가
		}
		System.out.println(sb);
	}
	
	public static int d(int number) {
		int sum = number;					//number는 생성자 n
		
		while(number != 0) {				//number가 0이 아닐때까지
			sum = sum + (number % 10);		//1)1의자리     3)10의자리
			number = number / 10;			//2)자리수감소 4)자리수감소
		}
		return sum;							//sum은 생성자로 만든 d(n)
	}
}