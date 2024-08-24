package cn.fighter3.mapper;

import cn.fighter3.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description: 用户组件Mapper层
 **/

public interface UserMapper extends BaseMapper<User> {

}
