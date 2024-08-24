package cn.fighter3.service;

import cn.fighter3.dto.LoginDTO;
import cn.fighter3.result.ResponseVO;

/**
 * @Description: 登录服务接口
 **/

public interface LoginService {
    ResponseVO login(LoginDTO loginDTO);
}
