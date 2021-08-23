package mvc.controller;

/**
 * 팩토리 패턴(Factory pattern)
 * 	= 프로그래밍 디자인 패턴 중 하나
 *	= 생성과 관련된 코드만 묶어서 보관
 *	= 생성시 필요한 내용들을 쉽게 추가하거나 제거할 수 있도록 만든다 
 */
public class ControllerFactory {
	
	public static Controller create(String uri) {
		switch(uri) {
		case "/product/productList.it": return new ProductListController();
		case "/product/productDetail.it": return new ProductDetailController();
		case "/product/productInsert.it": return new ProductInsertController();
		case "/product/productEdit.it": return new ProductEditController();
		
		case "/member/memberList.it": return new MemberListController();
		case "/member/memberJoin.it": return new MemberJoinController();
		
		default : return null;
		}
		
	}
	
}