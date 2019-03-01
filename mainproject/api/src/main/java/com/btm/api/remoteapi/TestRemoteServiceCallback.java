package com.btm.api.remoteapi;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author wenzhenyu
 * @description 远程调用失败回调接口
 * @date 2018/11/28
 */
@Component
public class TestRemoteServiceCallback implements  TestRemoteService {

    public String test(){
        return "fail--调用失败 回调处理";
    }


}
