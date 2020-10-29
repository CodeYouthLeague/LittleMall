package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

	private String USER_ID;
	private String USER_NAME;
	private String USER_PASSWORD;
	private String USER_SEX;
	private String USER_BIRTHDAY;
	private String USER_IDENITY_CODE;
	private String USER_EMAIL;
	private String USER_MOBILE;
	private String USER_ADDRESS;
	private int USER_STATUS;

}
