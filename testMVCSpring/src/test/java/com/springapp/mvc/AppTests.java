package com.springapp.mvc;

import com.springapp.bo.UserBoI;
import com.springapp.model.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
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
@ContextConfiguration("file:../../../../../main/resources/config/mvc-dispatcher-servlet.xml")
public class AppTests {
    private MockMvc mockMvc;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    protected WebApplicationContext wac;

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
       ApplicationContext appContext =
                new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");


        UserBoI userBo = (UserBoI)appContext.getBean("userBo");

        /** insert **/
        User user = new User();
        user.setFirstName("léo");
        user.setLastName("gaudez");
        user.setEmail("leo@gmail.com");
        userBo.save(user);

        /** select **/
        User user2 = userBo.findByName("gaudez");
        System.out.println(user2);
        Assert.assertTrue(user.equals(user2));

        /** update **/
        user2.setEmail("ll@bip");
        userBo.update(user2);

        /** delete **/
        userBo.delete(user2);

        System.out.println("Done");
    }
}

