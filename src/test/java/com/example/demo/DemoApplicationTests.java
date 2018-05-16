package com.example.demo;

import com.example.po.UserPo;
import com.example.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
/*    @Autowired
    private EntRepository entRepository;
    @Test
    public void contextLoads() {
        entRepository.save(new CFGENTPO("成立"));
        List<CFGENTPO> all = entRepository.findAll();
        System.out.println(all.size());
    }*/

    @Autowired
    private UserRepository userRepository;

    @Test
    public void contextLoads() {
        List<UserPo> list =   userRepository.findAll();
        System.out.println(list.size());
    }


/*    @Resource(name = "oneJdbcTemplate")
    protected JdbcTemplate jdbcTemplate1;
    @Resource(name = "twoJdbcTemplate")
    protected JdbcTemplate jdbcTemplate2;

    @Test
    public void test() throws Exception {
        List<UserPo> list = jdbcTemplate1.query("select * from HL_USER", new UserRowMapper());
        System.out.println(list.size());


        List<CFGENTPO> cfgentpos = jdbcTemplate2.query("select * from cfg_ent", new Object[]{}, new BeanPropertyRowMapper<CFGENTPO>(CFGENTPO.class));
        System.out.println(cfgentpos.size());
    }*/
}
