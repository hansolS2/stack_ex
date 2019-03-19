package kr.co.springboot.test;

import kr.co.springboot.test.sample.StackEx_1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringboottestApplication {
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(SpringboottestApplication.class);
        app.run(args);

        StackEx_1 ex = new StackEx_1();
        int[] result =  ex.solution(new int[]{3,9,9,3,5,7,2});

    }
}

