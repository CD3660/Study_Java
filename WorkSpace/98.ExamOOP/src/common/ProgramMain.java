package common;

import member.MemberDAO;
import product.ProductDAO;

public class ProgramMain {
	public static void main(String[] args) {
		Common common = new Common();
		member.MemberDAO dao = new MemberDAO(common);
		common.setItems(new ProductDAO(common).initItems());
		dao.startUserLogin();

		common.endProgram();
	}
}
