package com.southwind.entity.feign;

import com.southwind.entity.Student;
import com.southwind.entity.feign.Impl.FeignError;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
//创建声明式接口
//声明式接口只需要添加注解就行了，不用写实现类
//feign只需要声明接口
//创建实现类，处理错误信息,定义处理逻辑，通过@Component注解将FeignError注入实例

@FeignClient(value = "provider",fallback = FeignError.class)//这样就是接口会找到这个服务去,如果调不通就去Error了，fallBack降级处理
public interface FeignProviderClient {
    @GetMapping("/student/findAll")
    public Collection<Student>findAll();
    @GetMapping("/student/index")
    public String index();

}
