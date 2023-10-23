package pack02.testinterface;

public interface ProductInterface {
	
	public String COMPANY_NAME = "인터페이스 회사";
	
	/**초기 데이터 5건을 리턴받는 메소드*/
	public ProductDTO[] initDtos();
	
	/**배열을 입력받아 내부의 내용을 출력하는 메소드*/
	public void display(ProductDTO[] dtos);
}
