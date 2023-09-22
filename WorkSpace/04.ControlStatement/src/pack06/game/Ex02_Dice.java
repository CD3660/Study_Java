package pack06.game;

import java.util.Random;
import java.util.Scanner;

public class Ex02_Dice {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();

		int gameOn = 1;
		int gameMode = 0;
		int teamNumber = 0;

		while (true) {// 게임 시작 종료 체크
			System.out.println("다이스 게임!");
			System.out.println("1. 게임 시작, -1. 게임 종료");
			{
				String str = scan.nextLine();
				int num = Integer.parseInt(str);
				if (num == 1) {

				} else if (num == -1) {
					gameOn = 0;
				} else {
					System.out.println("잘못 된 입력!");
					continue;
				}
			}

			while (true) {
				if (gameOn == 0) {// 게임 종료
					System.out.println("게임 종료");
					break;
				}
				if (gameOn == 1) { // 게임 진행
					System.out.println("원하는 메뉴를를 고르세요!");
					System.out.println("1. 빠른대전");
					System.out.println("2. 야추 다이스");
					System.out.println("3. n dice battle");

					String str = scan.nextLine();
					int a = Integer.parseInt(str);
					if (a == 1) {
						gameMode = 1;
						break;
					} else if (a == 2) {
						gameMode = 2;
						break;
					} else if (a == 3) {
						gameMode = 3;
						break;
					} else {
						System.out.println("잘못된 입력");
					}

				}
			} // 게임모드 설정 종료
			game1: while (true) {// 게임 내용물
				if (gameMode == 0) {
					break;
				}
				if (gameMode == 1) {// 게임모드 1 퀵 매치
					while (true) {// 팀 수 설정 세션
						System.out.println("빠른 대전");
						System.out.println("팀 수를 입력하세요.(2 ~ 100)");
						System.out.println("-1. 시작 화면으로 돌아가기");

						String str = scan.nextLine();
						teamNumber = Integer.parseInt(str);
						if (teamNumber == -1) {
							break game1;
						} else if (teamNumber > 100 || teamNumber < 1) {
							System.out.println("잘못된 입력!");
						} else {
							System.out.println(teamNumber + "팀으로 시작합니다.");
							break;
						}
					}
					int[] score = new int[teamNumber];
					for (int i = 0; i < teamNumber; i++) {// 주사위 굴리기 세션
						System.out.println((i + 1) + "팀의 차례!");
						System.out.println("아무 키로 주사위 굴리기");

						String str = scan.nextLine();
						int dice = ran.nextInt(6) + 1;
						System.out.println(dice + "!");
						System.out.println("");
						score[i] = dice;
					}
					for (int i = 0; i < teamNumber; i++) {// 결과 표시
						System.out.println((i + 1) + "팀 : " + score[i]);
					}
					int max = 0;
					int maxTeam = 0;
					int winner = -1;
					for (int i = 0; i < teamNumber; i++) {// 최고 눈금 판별
						if (score[i] > max) {
							max = score[i];
						}
					}
					for (int i = 0; i < teamNumber; i++) {// 최고 눈금 팀 수
						if (score[i] == max) {
							maxTeam++;
							winner = i + 1;
						}
					}
					while (true) {
						if (maxTeam > 1) { // 최고 눈금이 중복된 경우
							if (maxTeam == teamNumber) {
								System.out.println("무승부!");
							} else {

								for (int i = 0; i < teamNumber; i++) {// 패배팀 출력
									if (score[i] < max && score[i] != 0) {
										System.out.print(i + 1);
										System.out.print("팀 ");
									}
								}
								System.out.println("패배");
							}
							for (int i = 0; i < teamNumber; i++) {// 승리 팀 출력
								if (score[i] == max) {
									System.out.print(i + 1);
									System.out.print("팀 ");
								} else {// 패배팀의 플레이는 진행하지 않기 위해 0으로 설정함
									score[i] = 0;
								}
							}

							System.out.println("으로 다시 진행합니다.");
							for (int i = 0; i < teamNumber; i++) {
								if (score[i] > 0) {// 주사위 눈금이 남은 팀만 산정
									System.out.println((i + 1) + "팀의 차례!");
									System.out.println("아무 키로 주사위 굴리기");

									String str = scan.nextLine();
									int dice = ran.nextInt(6) + 1;
									System.out.println(dice + "!");
									System.out.println("");
									score[i] = dice;
								}
							}
							for (int i = 0; i < teamNumber; i++) {// 결과 표시
								if (score[i] > 0) {
									System.out.println((i + 1) + "팀 : " + score[i]);
								}
							}
							max = 0;
							maxTeam = 0;
							winner = -1;
							for (int i = 0; i < teamNumber; i++) {// 최고 눈금 판별
								if (score[i] > max) {
									max = score[i];

								}
							}
							for (int i = 0; i < teamNumber; i++) {// 최고 눈금 팀 수
								if (score[i] == max) {
									maxTeam++;
									winner = i + 1;
								}
							}
						}
						if (maxTeam == 1) {// 승리 출력
							System.out.println(winner + "팀 승리!");
							System.out.println();
							break;
						}
					}
				} // 게임모드1 종료자
				if (gameMode == 2) {
					while (true) {
						System.out.println("야추 다이스");

						int[] intArr1 = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
						int[] intArr2 = { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };
						int sum1 = 0;
						int add1 = 0;
						int total1 = 0;
						for (int i = 0; i < 13; i++) {

							System.out.println("플레이어 1의 턴!");
							int[] dice1 = new int[5];
							for (int j = 0; j < 5; j++) {// 주사위 생성
								dice1[j] = ran.nextInt(6) + 1;
							}
							System.out.println(
									dice1[0] + " " + dice1[1] + " " + dice1[2] + " " + dice1[3] + " " + dice1[4]);
							System.out.println("리롤 기회 2번");
							System.out.println("다시 굴릴 주사위를 고르세요");
							System.out.println("예시) 1,3,5번을 다시 굴리려면 10101");

							String str = scan.nextLine();
							int reroll = Integer.parseInt(str);
							{// 리롤 과정 묶음
								if (reroll / 10000 == 1) {
									dice1[0] = ran.nextInt(6) + 1;
									reroll -= 10000;
								}
								if (reroll / 1000 == 1) {
									dice1[1] = ran.nextInt(6) + 1;
									reroll -= 1000;
								}
								if (reroll / 100 == 1) {
									dice1[2] = ran.nextInt(6) + 1;
									reroll -= 100;
								}
								if (reroll / 10 == 1) {
									dice1[3] = ran.nextInt(6) + 1;
									reroll -= 10;
								}
								if (reroll == 1) {
									dice1[4] = ran.nextInt(6) + 1;
								}
							} // 리롤 묶음 종료
							System.out.println(
									dice1[0] + " " + dice1[1] + " " + dice1[2] + " " + dice1[3] + " " + dice1[4]);
							System.out.println("리롤 기회 1번");
							System.out.println("다시 굴릴 주사위를 고르세요");
							System.out.println("예시) 1,3,5번을 다시 굴리려면 10101");
							str = scan.nextLine();
							reroll = Integer.parseInt(str);
							{// 리롤 과정 묶음
								if (reroll / 10000 == 1) {
									dice1[0] = ran.nextInt(6) + 1;
									reroll -= 10000;
								}
								if (reroll / 1000 == 1) {
									dice1[1] = ran.nextInt(6) + 1;
									reroll -= 1000;
								}
								if (reroll / 100 == 1) {
									dice1[2] = ran.nextInt(6) + 1;
									reroll -= 100;
								}
								if (reroll / 10 == 1) {
									dice1[3] = ran.nextInt(6) + 1;
									reroll -= 10;
								}
								if (reroll == 1) {
									dice1[4] = ran.nextInt(6) + 1;
								}
							} // 리롤 묶음 종료
							System.out.println(
									dice1[0] + " " + dice1[1] + " " + dice1[2] + " " + dice1[3] + " " + dice1[4]);
							System.out.println("주사위 굴리기 종료!");
							System.out.println("");
							System.out.println("현재 점수 표시 (아직 채우지 않은 점수는 -1)");
							System.out.println("상단(63점 이상면 추가점수)");
							System.out.println("1단   2단   3단  4단   5단   6단   합  추가점수");
							sum1 = intArr1[0] + intArr1[1] + intArr1[2] + intArr1[3] + intArr1[4] + intArr1[5];
							if (sum1 >= 65) {
								add1 = 35;
							}
							total1 = intArr1[0] + intArr1[1] + intArr1[2] + intArr1[3] + intArr1[4] + intArr1[5]
									+ intArr1[6] + intArr1[7] + intArr1[8] + intArr1[9] + intArr1[10] + intArr1[11]
									+ intArr1[12];
							System.out.println(intArr1[0] + "   " + intArr1[1] + "   " + intArr1[2] + "   " + intArr1[3]
									+ "   " + intArr1[4] + "   " + intArr1[5] + "   " + sum1 + "   " + add1);
							System.out.println("트리플 4카드 풀하우스 s스트 l스트 찬스 야추  총 합");
							System.out.println(intArr1[6] + "   " + intArr1[7] + "   " + intArr1[8] + "   " + intArr1[9]
									+ "   " + intArr1[10] + "   " + intArr1[11] + "   " + intArr1[12] + "   " + total1);
							System.out.println("현재 주사위 결과를 입력 할 위치를 고르세요");
							System.out.println("1~6.1~6 주사위 점수 7.트리플 8.포카드 9.풀하우스 10.s스트 11.l스트 12.찬스 13.야추");
							String score = scan.nextLine();
							int inputScoreType = Integer.parseInt(score);// 점수 입력 세션
							int input = 0;
							if (inputScoreType == 1) {
								input = 0;
								for (int j = 0; j < 5; j++) {
									if (dice1[j] == 1) {
										input++;
									}
								}
								intArr1[0] = input;
							} else if (inputScoreType == 2) {
								input = 0;
								for (int j = 0; j < 5; j++) {
									if (dice1[j] == 2) {
										input += 2;
									}
								}
								intArr1[1] = input;
							} else if (inputScoreType == 3) {
								input = 0;
								for (int j = 0; j < 5; j++) {
									if (dice1[j] == 3) {
										input += 3;
									}
								}
								intArr1[2] = input;
							} else if (inputScoreType == 4) {
								input = 0;
								for (int j = 0; j < 5; j++) {
									if (dice1[j] == 4) {
										input += 4;
									}
								}
								intArr1[3] = input;
							} else if (inputScoreType == 5) {
								input = 0;
								for (int j = 0; j < 5; j++) {
									if (dice1[j] == 5) {
										input += 5;
									}
								}
								intArr1[4] = input;
							} else if (inputScoreType == 6) {
								input = 0;
								for (int j = 0; j < 5; j++) {
									if (dice1[j] == 6) {
										input += 6;
									}
								}
								intArr1[5] = input;
							} else if (inputScoreType == 7) {// 트리플 결과 값 넣기
								input = 0;
								int check = 0;
								for (int j = 1; j < 5; j++) {
									if (dice1[0] == dice1[j]) {
										check++;
									}
								}
								if (check > 1) {
									input = dice1[0] + dice1[1] + dice1[2] + dice1[3] + dice1[4];
								}
								check = 0;
								for (int j = 2; j < 5; j++) {
									if (dice1[1] == dice1[j]) {
										check++;
									}
								}
								if (check > 1) {
									input = dice1[0] + dice1[1] + dice1[2] + dice1[3] + dice1[4];
								}
								if (dice1[2] == dice1[3] && dice1[2] == dice1[4]) {
									input = dice1[0] + dice1[1] + dice1[2] + dice1[3] + dice1[4];
								}
								intArr1[6] = input;
							} else if (inputScoreType == 8) {// 포카드 결과 값 넣기
								input = 0;
								int check = 0;
								for (int j = 1; j < 5; j++) {
									if (dice1[0] == dice1[j]) {
										check++;
									}
								}
								if (check > 2) {
									input = dice1[0] + dice1[1] + dice1[2] + dice1[3] + dice1[4];
								}
								if (dice1[1] == dice1[2] && dice1[1] == dice1[3] && dice1[1] == dice1[4]) {
									input = dice1[0] + dice1[1] + dice1[2] + dice1[3] + dice1[4];
								}

								intArr1[7] = input;
							} else if (inputScoreType == 9) {// 풀하우스
								input = 0;
								int check = 0;
								for (int j = 1; j < 7; j++) {// 주사위의 눈 종류를 체크하는 반복문
									for (int k = 0; k < 5; k++) {
										if (dice1[k] == j) {
											check++;
											break;
										}
									}
								}
								if (check == 2) {// 주사위 눈이 2종류인 경우
									int check2 = 0;
									for (int j = 1; j < 5; j++) {// 1번 눈과 같은 경우의 발생을 체크
										if (dice1[0] == dice1[j]) {
											check2++;
										}
									}
									if (check2 == 1 || check2 == 2) {// 1번 눈과 같은 눈이 1개, 2개인 경우만 풀하우스
										input = 25;
									}
								}
								intArr1[8] = input;
							} else if (inputScoreType == 10) {// 스몰 스트레이트 점수
								input = 0;
								int[] diceArr = new int[6];
								for (int j = 1; j < 7; j++) { // 주사위 눈을 체크하는 것
									for (int k = 0; k < 5; k++) {
										if (dice1[k] == j) {
											diceArr[j]++;
										}
									}
								}
								for (int j = 0; j < 3; j++) {// 4 연속으로 1 이상인 부분이 있는지 체크
									if (diceArr[j] > 0 && diceArr[j + 1] > 0 && diceArr[j + 2] > 0
											&& diceArr[j + 3] > 0) {
										input = 30;
									}
								}
								intArr1[9] = input;
							} else if (inputScoreType == 11) {// 라지 스트레이트 점수
								input = 0;
								int[] diceArr = new int[6];
								for (int j = 1; j < 7; j++) { // 주사위 눈을 체크하는 것
									for (int k = 0; k < 5; k++) {
										if (dice1[k] == j) {
											diceArr[j]++;
										}
									}
								}
								for (int j = 0; j < 2; j++) {// 5 연속으로 1 이상인 부분이 있는지 체크
									if (diceArr[j] > 0 && diceArr[j + 1] > 0 && diceArr[j + 2] > 0 && diceArr[j + 3] > 0
											&& diceArr[j + 4] > 0) {
										input = 40;
									}
								}
								intArr1[10] = input;
							} else if (inputScoreType == 12) {// 찬스 점수
								input = 0;
								for (int j = 0; j < 5; j++) {
									input += dice1[j];
								}
								intArr1[11] = input;
							} else if (inputScoreType == 13) {// 찬스 점수
								input = 0;
								if (dice1[0] == dice1[1] && dice1[0] == dice1[2] && dice1[0] == dice1[3]
										&& dice1[0] == dice1[4]) {
									input=50;
								}
								intArr1[12] = input;
							}
							
							System.out.println(inputScoreType+"선택");
							System.out.println(input+"점!");
							sum1 = intArr1[0] + intArr1[1] + intArr1[2] + intArr1[3] + intArr1[4] + intArr1[5];
							if (sum1 >= 65) {
								add1 = 35;
							}
							total1 = intArr1[0] + intArr1[1] + intArr1[2] + intArr1[3] + intArr1[4] + intArr1[5]
									+ intArr1[6] + intArr1[7] + intArr1[8] + intArr1[9] + intArr1[10] + intArr1[11]
									+ intArr1[12];
							System.out.println("결과");
							System.out.println("1단   2단   3단  4단   5단   6단   합  추가점수");
							System.out.println(intArr1[0] + "   " + intArr1[1] + "   " + intArr1[2] + "   " + intArr1[3]
									+ "   " + intArr1[4] + "   " + intArr1[5] + "   " + sum1 + "   " + add1);
							System.out.println("트리플 4카드 풀하우스 s스트 l스트 찬스 야추  총 합");
							System.out.println(intArr1[6] + "   " + intArr1[7] + "   " + intArr1[8] + "   " + intArr1[9]
									+ "   " + intArr1[10] + "   " + intArr1[11] + "   " + intArr1[12] + "   " + total1);
							System.out.println("");
							System.out.println("");
						} // 13번 주사위 굴리는 과정
					} // 야추 다이스 무한 사이클
				} // 게임모드 2 종료자
			}

		}
	}
}
