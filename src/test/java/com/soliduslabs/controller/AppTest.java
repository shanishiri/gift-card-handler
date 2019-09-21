package com.soliduslabs.controller;

import com.soliduslabs.App;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(MockitoJUnitRunner.class)
public class AppTest {

    @InjectMocks
    private App app = new App();

//    @Before
//    public void setup() {
//        mockMvc = MockMvcBuilders.standaloneSetup(new HashController(dynamoDbClient))
//                .build();
//    }

//    @Test(expected = IllegalArgumentException.class)
//    public void testNoArgs() throws Exception {
//        app.run();
//    }

    @Test
    public void testWithArgs() throws Exception {
//        List list = new ArrayList();
//        list.add("test");
//        Mockito.when(reader.get(Mockito.anyString())).thenReturn(list);

        app.run("prices.txt 3000");

//        Mockito.verify(reader, VerificationModeFactory.times(1)).get(Mockito.anyString());
//        Mockito.verify(writer, VerificationModeFactory.times(1)).write(list);
    }

//    @Test
//    public void testGetHashByString() throws Exception {
//        CommandLineRunner runner = ctx.getBean(CommandLineRunner.class);
//        runner.run( "prices.txt 3000");
//    }

}
