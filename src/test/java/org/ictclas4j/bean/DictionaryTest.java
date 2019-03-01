package org.ictclas4j.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class DictionaryTest {
    @Test
    public void getMaxMatch() throws Exception {
        Dictionary dict = new Dictionary();


        dict.getMaxMatch("始##始");
    }

}