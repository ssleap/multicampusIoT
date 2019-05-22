package day_05;
import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArrayRecovery {

	public static void main(String[] args) {

		String data = JOptionPane.showInputDialog("이름을 입력 해주세요");
		System.out.println(data);
		
		String url = JOptionPane.showInputDialog("국영수 점수를 입력"
				+ "해주세요 (입력 예 ) 50 78 90)");
		
		System.out.println(url);
		int sum = 0;
		for(int i = 0; i < url.split(" ").length; i++){
			sum += Integer.parseInt(url.split(" ")[i]);
		}
		System.out.println(sum);
		
	}

}
