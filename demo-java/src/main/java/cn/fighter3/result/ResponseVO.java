package cn.fighter3.result;

import lombok.Data;

import java.io.Serializable;

/**
 * @Description: 统一请求返回结果
 **/

@Data
public class ResponseVO implements Serializable {
    //响应码
    private Integer code;
    //信息
    private String message;
    //返回数据
    private Object data;

    public ResponseVO(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
