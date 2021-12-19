package com.xworkz.DAO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.DTO.ProductDTO;
import com.xworkz.marker.Find;
import com.xworkz.marker.ProductDTOFinder;

public class ProductDAO {

	Collection<ProductDTO> collectionproductdto = new ArrayList<ProductDTO>();

	ProductDTO product = new ProductDTO("Sunsilk", "maneesha", 132456, 120);
	ProductDTO product1 = new ProductDTO("santoor", "kavita", 876543, 30);
	ProductDTO product2 = new ProductDTO("Lipstic", "aishwarrya", 2627836, 100);
	ProductDTO product3 = new ProductDTO("eyeshadow", "prakash", 5879578, 200);
	ProductDTO product4 = new ProductDTO("blush", "akshara", 87464, 400);
	ProductDTO product5 = new ProductDTO("foundation", "vinay", 785647, 300);
	ProductDTO product6 = new ProductDTO("concealer", "manju", 23425, 490);
	ProductDTO product7 = new ProductDTO("maybelline", "teju", 3435, 500);
	ProductDTO product8 = new ProductDTO("nailpaint", "sahana", 12349, 50);
	ProductDTO product9 = new ProductDTO("perfumes", "hrithik", 3542, 500);

	public ProductDAO() {

		collectionproductdto.add(product);
		collectionproductdto.add(product1);
		collectionproductdto.add(product2);
		collectionproductdto.add(product3);
		collectionproductdto.add(product4);
		collectionproductdto.add(product5);
		collectionproductdto.add(product6);
		collectionproductdto.add(product7);
		collectionproductdto.add(product8);
		collectionproductdto.add(product9);

		for (ProductDTO pro : collectionproductdto) {
			System.out.println(pro);
		}

	}

	public ProductDTO find(ProductDTOFinder finder, ProductDTO dtoCompare) {
		System.out.println("Invoked find method");
		Iterator<ProductDTO> itr = collectionproductdto.iterator();
		while (itr.hasNext()) {
			ProductDTO point = itr.next();
			if (finder.expression(point, dtoCompare) != null) {
				return point;
			}
		}
		return null;

	}

}
