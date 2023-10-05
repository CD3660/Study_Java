package pack02.trycatch;

import java.util.Random;
import java.util.Scanner;

public class Test02_TryCatch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		while (true) {
			System.out.println("로또 시뮬레이션");
			System.out.println("1. 수동 로또    2. 자동 로또    -1. 프로그램 종료");
			String st = scan.nextLine();
			int mode;
			try {
				mode = Integer.parseInt(st);
			} catch (Exception e) {
				System.out.println("잘못 된 입력");
				continue;
			}
			if (mode == -1) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			if (mode == 1) {
				System.out.println("1. 수동 로또");
				exit_point: while (true) {
					int[] lotto = new int[6];
					int count = 0;
					exit_point1: while (count < 6) {// 내 로또 번호 저장 부분
						System.out.print("번호를 입력해주세요");
						System.out.print(lottoNumShow(lotto));
						System.out.println("");
						String str = scan.nextLine();
						int num=0;
						try {
							num = Integer.parseInt(str);
						} catch (Exception e) {
							System.out.println("잘못 된 입력");
							continue;
						}
						if (num == -1) {
							System.out.println("시작 화면으로");
							break exit_point;
						}
						if (num < 1 || num > 45) {
							System.out.println("로또 범위 밖");
							continue;
						}
						for (int i = 0; i < 6; i++) {
							if (lotto[i] == num) {
								System.out.println("중복 된 입력");
								continue exit_point1;
							}
						}
						lotto[count] = num;
						count++;
					}

					int[] lotto2 = new int[7];
					lotto2 = ranNumCreate(7);
					lotto = lottoNumSort(lotto);
					lotto2 = lottoNumSort(lotto2);

					System.out.println(lottoNumShow(lotto));
					System.out.println(lottoNumShow(lotto2));
					int correct = 0;
					int bonus = 0;
					for (int i = 0; i < 6; i++) {// 배열의 비교
						for (int j = 0; j < 6; j++) {
							if (lotto[i] == lotto2[j]) {
								correct++;
							}
							if (lotto[i] == lotto2[6]) {
								bonus = 1;
							}
						}
					}
					System.out.println(correct + " 개 맞음");
					if (bonus == 1) {
						System.out.println("보너스 일치");
					}
					System.out.println(lottoPrice(correct, bonus) + "\n\n");
				}
			}
			if (mode == 2) {
				while (true) {
					System.out.println("자동 로또를 생성합니다.  -1 입력시 종료");
					String str = scan.nextLine();
					if (str.equals("-1")) {
						System.out.println("초기 화면으로 돌아갑니다.");
						break;
					}
					int[] lotto = new int[6];
					lotto = ranNumCreate(6);
					int[] lotto2 = new int[7];
					lotto2 = ranNumCreate(7);
					lotto = lottoNumSort(lotto);
					lotto2 = lottoNumSort(lotto2);

					System.out.println(lottoNumShow(lotto));
					System.out.println(lottoNumShow(lotto2));
					int correct = 0;
					int bonus = 0;
					for (int i = 0; i < 6; i++) {// 배열의 비교
						for (int j = 0; j < 6; j++) {
							if (lotto[i] == lotto2[j]) {
								correct++;
							}
							if (lotto[i] == lotto2[6]) {
								bonus = 1;
							}
						}
					}
					System.out.println(correct + " 개 맞음");
					if (bonus == 1) {
						System.out.println("보너스 일치");
					}
					System.out.println(lottoPrice(correct, bonus) + "\n\n");
				}
			}
		}
	}

	public static int[] ranNumCreate(int n) {
		Random ran = new Random();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {// 정답 로또 생성 부분
			while (true) {
				int a = ran.nextInt(45) + 1;
				int b = 0;
				for (int j = 0; j < n; j++) {
					if (a != arr[j]) {
						b++;
					}
				}
				if (b == n) {
					arr[i] = a;
					break;
				}
			}
		}
		return arr;
	}

	public static int[] lottoNumSort(int[] arr) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}

	public static String lottoNumShow(int[] arr) {
		String str = "[";
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				str += arr[i] + "]";
			} else {
				str += arr[i] + ", ";
			}
		}
		return str;
	}

	public static String lottoPrice(int a, int b) {
		String str = "";
		if (a == 6) {
			str = "1등";
		} else if (a == 5 && b == 1) {
			str = "2등";
		} else if (a == 5) {
			str = "3등";
		} else if (a == 4) {
			str = "4등";
		} else if (a == 3) {
			str = "5등";
		} else {
			str = "꽝";
		}
		return str;
	}
}
