package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category {

	private int CATE_ID;
	private String CATE_NAME;
	private int CATE_PARENT_ID;
	
}
