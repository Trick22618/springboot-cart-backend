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
		String appleImageBase64 = "iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAAXNSR0IArs4c6QAAATRJREFUOE+tkzFLw1AUhd/vCylEca02NRe3cEgQ/AMu/gUXB0FBCIjo4CCCi6fguji4+AFcBH9A8OggJk4u6vBOUkQoDvLg3ls/l8u955x78/wA5/1p4U1p2QyvppN5Tqc9AMFnqg2bV2L3aJ/8A4jeoPzMviyEwz4kWC/fA24cg1+ZpswG2yYg/kDsO4e0y55f+k/xWSsoz+D4P/D0/vIuYj5g3qE/2+C7/Rj32/cJyHYyTthzVv0j7zPyH4H55iA3N1n9F1tqHOz2w0v56g/wB5i3YB6vW8K+h6sVdK+e7vVWtY5e29j2qA/h+B5YJ9/aA/g9z9p+136b85H+F1zX+/A8Qv3v9sf2f8L+A8sO/BPAfBdj3/uX/D3/F/yP+A9sM/Ab8N2PXwMv9/A8gPzE/wDlj34FzH9g3oH3I/4D1yH8D0x/YPwH/A+uQ/gfmM/AfgPvAfsb8B8Y/8D8B94D+xvwHzD/gfkPPAfsb8B/YN4D8x/wHlgO4P/A/AfeA/sZ8B8w/4H5DzwH7G/Af8D8B54D+BvwH5j/gP/A/Af+A/MfeA/sZ8B/wP4HngP2N+A/MP+B+Q/8B+xvwH/gP3C/AfmP/Afsb8B/4H5D3gP7G/A/8D8B54D9jfgPzD/gfkPPAfMfwD+A/MfeA/sZ8B/wP4HngP2N+A/MP+B+Q/8B+xvwH/g/gPPgf0N+A/Mf8D8B54D9jfgP/AfWP+A/AfMfwD+A/MfeA/sZ8B/wP4HngP2N+A/MP+B+Q88B+xvYH8D+h/g/wH7G/Afsf8B+Q/MfwD+A/MfeA/sZ8B/4H5DzwH7G/Afsf8B+Q88B+xvwH/g/gPPgf0N+A/Mf2B+A/MfeA/sZ8B/4D5j/gPzH3gP7G/A/+A8gf0N+A8sP/A/AfeA/Yb8B+Y/8D8B54D9jfgP2D/A/MfeA/sZ8B/YN4D8x/wH5j/gPkPPAfsb8B/wP4HngP2N+A/MP+B+Q/8B+xvwH/g/gPPgf0N+A/Mf8D8B54D9jfgP/AfWP+A/AfMfwD+A/MfeA/sZ8B/4P6HngP2N+A/MP+B+Q/8B+xvwH/g/gPPgf0N+A/Mf8D8B54D9jfgP3B/A/gf/Afs/gMAB+o/AAAAAElFTkSuQmCC";
		appleImage.setImageBase64(appleImageBase64);
		
		// 請透過 AI 生成 "香蕉" base64 小圖字串
		ProductImage bananaImage = new ProductImage();
		String bananaImageBase64 = "iVBORw0KGgoAAAANSUhEUgAAABAAAAAQCAYAAAAf8/9hAAAAAXNSR0IArs4c6QAAARFJREFUOE+dkrFLw1AUho/vf+vKII41pNbG+oQg+A9cPAQHBUEBBBEBBBAXR0HBXlBwfAfCg4eCmAixcHUcR4dBUXhwN9LgyXnv3Hv3wQ/wf16vH9iGjE0G81E0nMrjc74B4WjQhK83Yt/oHP4FiN6g/My+LITDQyRYr98Dbg4hn8umzAa7JCD+QOw7h7TLnl/6T/FZKijP4Pg/8PTu2YJ+jJg3qH/2wXf6MW7f4DuA7GQcYc0Z9Z+4z8h/BOafgNzNJfVfbajRws1u/sJfPQD7iXoB6vS8K+h6sFtB+e7tTWtZ5e29j2qA/h+B5YJ9/aA/g9z9p+136b85H+F1zX+/A8Qv3v9sf2f8L+A8sO/BPAfBdj3/uX/D3/F/yP+A9sM/Ab8N2PXwMv9/A8gPzE/wDlj34FzH9g3oH3I/4D1yH8D0x/YPwH/A+uQ/gfmM/AfgPvAfsb8B8Y/8D8B94D+xvwHzD/gfkPPAfsb8B/wP4HngP2N+A/MP+B+Q/8B+xvwH/g/gPPgf0N+A/Mf8D8B54D9jfgP/AfWP+A/AfMfwD+A/MfeA/sZ8B/wP4HngP2N+A/MP+B+Q/8B+xvwH/g/gPPgf0N+A/Mf8D8B54D9jfgP3B/A/gf/Afs/gMAB+o/AAAAAElFTkSuQmCC";
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
