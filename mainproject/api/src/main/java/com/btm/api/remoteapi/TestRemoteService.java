package com.btm.api.remoteapi;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "commonapi" ,fallback = TestRemoteServiceCallback.class)
public interface TestRemoteService {


    @RequestMapping(value="/test",method= RequestMethod.POST)
    public String test();

}
