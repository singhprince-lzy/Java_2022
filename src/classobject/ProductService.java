package classobject;

public class ProductService {
	
	Product [] ProductRepo= {
			new Product(1,"Pen",10,"Study"),
			new Product(2,"Soap",10,"Medical"),
			new Product(3,"Pen",10,"Study"),
			new Product(4,"Pen",10,"Study"),
			new Product(5,"Pen",10,"Study"),
			new Product(6,"Pen",10,"Study"),
			new Product(7,"Pen",10,"Study"),
			new Product(8,"Medicine",10,"Medical"),
			new Product(9,"Pensil",101,"Study"),
			new Product(10,"Dettol",100,"Medical"),};

	public String findNameByCode(int code) {
		for(Product product: ProductRepo) {
			if(product.getProductCode()==code) {
				return product.getName();
			}
		}
		return null;

	}

	public Product findMaxPriceProduct(String category) {
		double max=-1;
		Product result=new Product() ;
		
		for(Product product:ProductRepo) {
			if(product.getCategory().equals(category)) {
				if(product.getPrice()>result.getPrice()) {
					result=product;
				}
			}
		}
		return result;

	}

	public Product[] getProductByCategory(String category) {
		Product [] res = new Product[3];
		int i=0;
		for(Product product:ProductRepo) {
			if(product.getCategory().equals(category)) {
				res[i++]=product;	
			}
		}
		return res;
		

	}
}
