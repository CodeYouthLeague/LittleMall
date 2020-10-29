package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

	private int PRODUCT_ID;
	private String PRODUCT_NAME;
	private String PRODUCT_DESCRIPTION;
	private int PRODUCT_PRICE;
	private int PRODUCT_STOCK;
	private int PRODUCT_FID;
	private int PRODUCT_CID;
	private String PRODUCT_FILENAME;

}
