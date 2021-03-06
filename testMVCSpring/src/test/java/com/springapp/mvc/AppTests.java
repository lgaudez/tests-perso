package com.springapp.mvc;

import com.springapp.dao.UserDao;
import com.springapp.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration("classpath:WEB-INF/spring/mvc-dispatcher-servlet.xml")
public class AppTests {
    private MockMvc mockMvc;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    protected WebApplicationContext wac;

    @Autowired
    UserDao userDao;
    //articlesDao = (IArticlesDao) (new XmlBeanFactory(new ClassPathResource("/spring-config-test-dao"))).getBean("articlesDao");

    @Before
    public void setup() {
        this.mockMvc = webAppContextSetup(this.wac).build();
    }

    @Test
    public void simple() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk())
                .andExpect(view().name("hello"));
    }

    public void testHibernate( )
    {


        /** insert **/
        User user = new User();
        user.setFirstName("léo");
        user.setLastName("gaudez");
        user.setEmail("leo@gmail.com");
        userDao.save(user);

        /** select **/
        User user2 = userDao.findByName("gaudez");
        System.out.println(user2);
        Assert.assertTrue(user.equals(user2));

        /** update **/
        user2.setEmail("ll@bip");
        userDao.update(user2);

        /** delete **/
        userDao.delete(user2);

        System.out.println("Done");
    }
}

