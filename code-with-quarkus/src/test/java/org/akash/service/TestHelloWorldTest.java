package org.akash.service;

import io.quarkus.test.junit.QuarkusTest;
import io.quarkus.test.junit.mockito.InjectMock;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;

@QuarkusTest
public class TestHelloWorldTest {

    @InjectMock
    GetTextHelloWorld getText;

    @Test
    void test(){
        Mockito.when(getText.get()).thenReturn("hello from mock");

        UseGetText useGetText = new UseGetText(getText);

        assertEquals("hello from mock", useGetText.get());
        //assertEquals(1,1);
    }

}
