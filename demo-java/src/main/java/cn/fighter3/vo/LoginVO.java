package cn.fighter3.vo;

import cn.fighter3.entity.User;
import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * @Description: 登录VO
 **/

@Data
public class LoginVO implements Serializable {
    private Integer id;
    private String token;
    private User user;

}
