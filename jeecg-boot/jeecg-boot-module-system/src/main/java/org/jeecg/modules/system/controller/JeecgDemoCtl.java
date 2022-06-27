package org.jeecg.modules.system.controller;

import org.jeecg.common.api.vo.Result;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class JeecgDemoCtl {
    @PostMapping("/hello")
    public Result<String> hello(){
        return Result.OK("hello jeecg boot");
    }
}
