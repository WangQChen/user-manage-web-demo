package cn.fighter3.controller;

import cn.fighter3.dto.LoginDTO;
import cn.fighter3.result.ResponseVO;
import cn.fighter3.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 登录控制器
 **/
@RestController()
public class LoginController {
    @Autowired
    LoginService loginService;

    @PostMapping(value = "/api/login")
    public ResponseVO login(@RequestBody LoginDTO loginDTO){
      return loginService.login(loginDTO);
    }

    @PostMapping(value = "/api/hello")
    public ResponseVO hello(){
        return new ResponseVO(200,"hello","world");
    }
}
