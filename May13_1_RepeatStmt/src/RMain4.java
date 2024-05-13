import java.util.Scanner;

public class RMain4 {

	// 누구:
	// 매니저
	// 시스템관리
	// 학생 관리
	// 수업관련 업무
	// 강사
	// 학생 관리
	// 수업관련 업무
	// 학생
	// 수업관련 업무
	// 를 반복하다가 "끝"이라고 입력하면 프로그램 종료

	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		String role = null;
		a: while (true) {

			// 반복문에 이름 붙이기
			System.out.print("입력:");
			role = k.next();

			switch (role) {
			case "매니저":
				System.out.println("시스템 관리");
			case "강사":
				System.out.println("학생 관리");
			case "학생":
				System.out.println("수업관련 업무");
				break;
			case "끝":
				System.out.println("프로그램 종료");
				break a;

			}
		}
	}
}
