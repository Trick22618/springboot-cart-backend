package com.example.demo.test.proudct;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.cart.model.entity.Product;
import com.example.demo.cart.model.entity.ProductImage;
import com.example.demo.cart.repository.ProductRepository;

@SpringBootTest
public class AddProduct {

	@Autowired
	ProductRepository productRepository;
	
	@Test
	void add() {
		ProductImage appleImage = new ProductImage();
		// 請透過 AI 生成 "蘋果" base64 小圖字串
		String appleImageBase64 = "";
		appleImage.setImageBase64(appleImageBase64);
		
		// 請透過 AI 生成 "香蕉" base64 小圖字串
		ProductImage bananaImage = new ProductImage();
		String bananaImageBase64 = "";
		bananaImage.setImageBase64(bananaImageBase64);
		
		// 建立商品
		Product apple = new Product();
		apple.setName("蘋果");
		apple.setPrice(100);
		apple.setProductImage(appleImage);
		
		Product banana = new Product();
		banana.setName("香蕉");
		banana.setPrice(80);
		banana.setProductImage(bananaImage);
		
		// 儲存商品
		productRepository.save(apple);
		productRepository.save(banana);
		
		System.out.println("儲存完畢");
	}
	
}
