package classobject;

public class ProductMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductService ps= new ProductService();
		//ps.findMaxPriceProduct("study");
		System.out.println(ps.findNameByCode(1));
		System.out.println(ps.findMaxPriceProduct("Study"));
		//System.out.println(ps.findMaxPriceProduct("Medical"));
		Product [] pro=ps.getProductByCategory("Medical");
		for(Product p: pro) {
			System.out.println(p);
		}
		

	}

}
