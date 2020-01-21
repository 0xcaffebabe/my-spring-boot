package wang.ismy.spring.boot.service;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @author MY
 * @date 2020/1/21 16:21
 */
@Service
public class HelloService {

    public String run(){
        return LocalDateTime.now().toString();
    }
}
