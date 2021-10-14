package com.softin.util;

import org.junit.Assert;
import org.junit.Test;

public class StringUtilTest {
    @Test
    public void repeat_string_zero_times() {
        Assert.assertEquals("", StringUtil.repeat("Hola", 0));
    }

    @Test
    public void repeat_string_one() {
        Assert.assertEquals("Hola", StringUtil.repeat("Hola", 1));
    }

    @Test
    public void repeat_string_multiple_times() {
        Assert.assertEquals("HolaHolaHola", StringUtil.repeat("Hola", 3));
    }
}