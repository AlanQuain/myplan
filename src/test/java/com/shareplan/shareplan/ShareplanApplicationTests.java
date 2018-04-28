package com.shareplan.shareplan;

import com.shareplan.shareplan.utils.Commons;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShareplanApplicationTests {

    @Test
    public void contextLoads() {
        String random = Commons.random(5, ".png");
        System.out.println(random);
    }

}
