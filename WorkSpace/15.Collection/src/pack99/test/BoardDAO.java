package pack99.test;

import java.util.*;

public class BoardDAO {
	List<BoardDTO> list;
	Scanner sc;

	public void initBoard() {
		List<BoardDTO> list = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			list.add(new BoardDTO("임시" + i, "임시" + i + "의 내용입니다.", "CD", i));
		}
		this.list = list;
	}

	public BoardDAO() {
		sc = new Scanner(System.in);
		initBoard();
	}

	public void displayBody(BoardDTO dto) {
		System.out.println("제목 : " + dto.getTitle());
		System.out.println("작성자 : " + dto.getAuthor());
		System.out.println("본문");
		System.out.println(dto.getBody());
		System.out.println("아무키나 눌러진행 .");
		sc.nextLine();
	}

	public boolean indexCheck(int i) {
		for (BoardDTO dto : list) {
			if (dto.getIndex() == i) {
				System.out.println("해당하는 번호의 게시물이 없습니다.");
				return false;
			}
		}
		return true;
	}

	public void createPost() {
		System.out.println("새로운 게시글을 작성합니다");
		System.out.println("제목을 입력하세요.");
		String title = sc.nextLine();
		StringBuilder sb = new StringBuilder();
		String temp;
		while (true) {
			System.out.println("본문을 작성합니다. 0 입력시 종료됩니다.");
			temp = sc.nextLine();
			if (temp.equals("0")) {
				break;
			}
			sb.append(temp + "\n");
		}
		System.out.println("작성자를 입력하세요.");
		String author = sc.nextLine();
		System.out.println("게시글 번호를 부여합니다.");
		int index = createIndex();
		System.out.println("게시글 번호 : "+index);
		BoardDTO dto = new BoardDTO(title, sb.toString(), author, index);
		displayBody(dto);
		point: while (true) {
			System.out.println("현재 내용으로 게시하겠습니까? 1. 게시 아무키. 취소");
			switch (getInt()) {
			case 1:
				list.add(dto);
				break point;
			default:
				System.out.println("입력 범위 초과 다시 입력하세요.");
				break;
			}
		}
	}

	public void deletePost() {
		while (true) {
			System.out.println("삭제하려는 게시글의 번호를 입력하세요. -1. 돌아가기");
			int temp = getInt();
			if (temp == -1) {
				break;
			}
			boolean check = true;
			for (BoardDTO dto : list) {
				if (dto.getIndex() == temp) {
					displayBody(dto);
					System.out.println("해당 게시글을 삭제하겠습니까? 1. 삭제 0. 취소");
					int temp2 = getInt();
					if (temp2 == 1) {
						list.remove(list.indexOf(dto));
					}
					check = false;
					break;
				}
			}
			if (check) {
				System.out.println("해당하는 게시물이 없습니다.");
			}
		}
	}

	public int createIndex() {
		int index = 0;
		while (true) {
			boolean success = true;
			for (BoardDTO dto : list) {
				if (dto.getIndex() == index) {
					success = false;
					break;
				}
			}
			if (success) {
				return index;
			}
			index++;
		}
	}

	public int getInt() {
		while (true) {
			try {
				int temp = Integer.parseInt(sc.nextLine());
				return temp;
			} catch (Exception e) {
				System.out.println("잘못된 입력");
			}
		}
	}

	public void displayTitle() {
		while (true) {
			for (BoardDTO dto : list) {
				System.out.println(dto.getIndex() + ". 제목 : " + dto.getTitle() + " 작성자 : " + dto.getAuthor());
			}
			System.out.println("0. 게시물 보기 아무키. 돌아가기");
			int button = getInt();
			if (button == 0) {
				searchByIndex();
			} else {
				break;
			}

		}
	}

	public void searchByIndex() {
		while (true) {
			System.out.println("원하는 게시물 번호를 입력하세요. -1. 돌아가기");
			int temp = getInt();
			if (temp == -1) {
				break;
			}
			boolean check = true;
			for (BoardDTO dto : list) {
				if (temp == dto.getIndex()) {
					displayBody(dto);
					check = false;
				}
			}
			if (check) {
				System.out.println("해당하는 게시물이 없습니다.");
			}
		}
	}

	public void menu() {
		point: while (true) {
			System.out.println("1. 게시글 쓰기 2. 게시글 삭제 3. 게시글 보기 4. 게시글 검색 0. 종료");
			switch (getInt()) {
			case 0:
				break point;
			case 1:
				createPost();
				break;
			case 2:
				deletePost();
				break;
			case 3:
				displayTitle();
				break;
			case 4:
				searchByIndex();
				break;
			default:
				System.out.println("입력 범위 초과! 다시 입력하세요.");
				break;
			}

		}
	}
}
