package com.lf.yapin.ums;

import com.lf.yapin.ums.entity.Member;
import com.lf.yapin.ums.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YapinUmsApplicationTests {

    @Autowired
    MemberService memberService;

    @Test
    public void contextLoads() {
        Member byId = memberService.getById(1);
        System.out.println(byId.getUsername());
    }

}
