package com.bp.unitttest.makito;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.mockito.runners.MockitoJUnitRunner;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

import static org.junit.Assert.assertEquals;

//At the beginning of your unit test class definition, add the @RunWith(MockitoJUnitRunner.class) annotation.
// This annotation tells the Mockito test runner to validate that your usage of the framework is correct and simplifies the initialization of your mock objects.

@RunWith(MockitoJUnitRunner.class)
public class CalculatorUseServiceTest {

    CalculatorUseService c = null;

   // CalculatorService service = Mockito.mock(CalculatorService.class);          //use below phrase instead of this line

    @Mock
    CalculatorService service;

    //this line can be not here
    @Rule public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void setUp(){
        c = new CalculatorUseService(service);
    }

    @Test
    public void perform() {

       when(service.add(2,3)).thenReturn(5);     //import static org.mockito.Mockito.*; to use this lone
        assertEquals(10,c.perform(2,3));

        verify(service).add(2,3); // this checks that your mock is in use or not

    }
}