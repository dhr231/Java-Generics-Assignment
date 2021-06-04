package com.bridgelabz.assignment;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class genericsTest {
    @Test
    public void MaxAtFirstPlace_ReturnMax(){
        Integer maximum=generics.maximumInt(3,2,1);
        Assertions.assertEquals(3,maximum);
    }

    @Test
    public void MaxAtSecondPlace_ReturnMax(){
        Integer maximum=generics.maximumInt(2,3,1);
        Assertions.assertEquals(3,maximum);
    }

    @Test
    public void MaxAtThirdPlace_ReturnMax(){
        Integer maximum=generics.maximumInt(1,2,3);
        Assertions.assertEquals(3,maximum);
    }


}
