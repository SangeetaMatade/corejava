package com.xworkz.scammer3;

import com.xworkz.DAO.ProductDAO;
import com.xworkz.DTO.ProductDTO;

public class ProductScammer2 {

	public static void main(String[] args) {

		ProductDAO dao = new ProductDAO();

		ProductDTO dtoCompare = new ProductDTO("sunsilk", "maneesha", 132456, 120);

		ProductDTO found = dao.find((a, b) -> {
			if (a.getName().equals(b.getName())) {
				return a;
			}
			return null;
		}, dtoCompare);

		System.out.println(found);

	}
}
