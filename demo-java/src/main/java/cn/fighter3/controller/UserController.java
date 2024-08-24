package cn.fighter3.controller;

import cn.fighter3.dto.QueryDTO;
import cn.fighter3.entity.User;
import cn.fighter3.result.ResponseVO;
import cn.fighter3.service.UserService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 用户管理控制器
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 分页查询
     * @param queryDTO
     * @return
     */
    @PostMapping("/api/user/list")
    public ResponseVO userList(@RequestBody QueryDTO queryDTO){
        // System.out.println(queryDTO);
        // 经检查DTO传输无误
        String keyword = queryDTO.getKeyword();
        QueryWrapper<User> queryWrapper =new QueryWrapper<>();
        queryWrapper.like("login_name", keyword)
                .or()
                .like("user_name", keyword)
                .or()
                .like("email", keyword)
                .or()
                .like("address", keyword);

        Page<User> page = new Page<>(queryDTO.getPageNo(), queryDTO.getPageSize());
        IPage<User> result = userService.page(page, queryWrapper);
        List<User> content = result.getRecords();
        result.setTotal(content.size());
        result.setPages(content.size()/queryDTO.getPageSize());

        List<User> newList = new ArrayList<>();
        // 自己实现分页数据转换
        Integer start_index = (queryDTO.getPageNo() - 1) * queryDTO.getPageSize();
        if (queryDTO.getPageNo() == result.getPages()) {
            // 是最后一页
            newList = content.subList(start_index, content.size());
        } else {
            Integer end_index = queryDTO.getPageNo() * queryDTO.getPageSize();
            newList = content.subList(start_index, end_index);
        }
        result.setRecords(newList);
        // System.out.println(content);
        return new ResponseVO(200,"", result);
    }

    /**
     * 添加
     * @param user
     * @return
     */
    @PostMapping("/api/user/add")
    public ResponseVO addUser(@RequestBody User user){
        return new ResponseVO(200,"",userService.addUser(user));
    }

    /**
     * 更新
     * @param user
     * @return
     */
    @PostMapping("/api/user/update")
    public ResponseVO updateUser(@RequestBody User user){
        return new ResponseVO(200,"",userService.updateUser(user));
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @PostMapping("/api/user/delete")
    public ResponseVO deleteUser(Integer id){
        return new ResponseVO(200,"",userService.deleteUser(id));
    }

    /**
     * 批量删除
     * @param ids
     * @return
     */
    @PostMapping("/api/user/delete/batch")
    public ResponseVO batchDeleteUser(@RequestBody List<Integer> ids){
        userService.batchDelete(ids);
        return new ResponseVO(200,"","");
    }
}
