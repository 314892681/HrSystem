package cn.newer.hr;

import cn.newer.hr.controller.HrController;
import cn.newer.hr.pojo.Department;
import cn.newer.hr.pojo.Employ;
import cn.newer.hr.service.HrService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HrApplicationTests {

    @Autowired
    HrController hrController;

    @Test
    public void contextLoads() {
        /*Employ employ = new Employ();
        employ.setEname("zhangsan");
        hrService.insertEmploy(employ);*/
    }
}
