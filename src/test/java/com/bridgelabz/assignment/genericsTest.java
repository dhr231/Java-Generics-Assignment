package com.bridgelabz.assignment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class genericsTest {
    @Test
    public void MaxIntAtFirstPlace_ReturnMax(){
        Integer maximum=generics.maximumInt(3,2,1);
        Assertions.assertEquals(3,maximum);
    }

    @Test
    public void MaxIntAtSecondPlace_ReturnMax(){
        Integer maximum=generics.maximumInt(2,3,1);
        Assertions.assertEquals(3,maximum);
    }

    @Test
    public void MaxIntAtThirdPlace_ReturnMax(){
        Integer maximum=generics.maximumInt(1,2,3);
        Assertions.assertEquals(3,maximum);
    }

    @Test
    public void MaxFloatAtFirstPlace_ReturnMax(){
        Float maximum=generics.maximumFloat(3.1f,2.1f,1.1f);
        Assertions.assertEquals(3.1f,maximum);
    }

    @Test
    public void MaxFloatAtSecondPlace_ReturnMax(){
        Float maximum=generics.maximumFloat(2.1f,3.1f,1.1f);
        Assertions.assertEquals(3.1f,maximum);
    }

    @Test
    public void MaxFloatAtThirdPlace_ReturnMax(){
        Float maximum=generics.maximumFloat(1.1f,2.1f,3.1f);
        Assertions.assertEquals(3.1f,maximum);
    }

    @Test
    public void MaxStringAtFirstPlace_ReturnMax(){
        String maximum=generics.maximumString("Orange","Mango","Apple");
        Assertions.assertEquals("Orange",maximum);
    }

    @Test
    public void MaxStringAtSecondPlace_ReturnMax(){
        String maximum=generics.maximumString("Mango","Orange","Apple");
        Assertions.assertEquals("Orange",maximum);
    }

    @Test
    public void MaxStringAtThirdPlace_ReturnMax(){
        String maximum=generics.maximumString("Mango","Apple","Orange");
        Assertions.assertEquals("Orange",maximum);
    }


}
