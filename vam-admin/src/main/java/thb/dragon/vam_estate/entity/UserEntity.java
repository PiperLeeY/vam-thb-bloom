package thb.dragon.vam_estate.entity;

import lombok.Data;
import lombok.ToString;

/**
 * 
 * @ClassName: UserEntity
 * @Description: TODO(用户实体)
 * @author Piper@Lee
 * @date 2018年7月17日
 *
 */
@Data
@ToString
public class UserEntity {

	/**
	 * 唯一id
	 */
	private String id;
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 角色
	 */
	private String role;
	/**
	 * 状态
	 */
	private String status;
	
}
