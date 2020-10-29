package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cart {

	public int cart_id;
	public String cart_p_filename;
	public String cart_p_name;
	public int cart_p_price;
	public int cart_quantity;
	public int cart_p_stock;
	public int cart_p_id;
	public String cart_u_id;
	public int cart_valid;
	
}
