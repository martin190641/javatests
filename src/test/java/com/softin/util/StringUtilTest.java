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

    @Test(expected = IllegalArgumentException.class)
    public void repeat_string_negative_times() {
        StringUtil.repeat("Hola", -1);
    }

    @Test
    public void string_is_not_empty() {
        Assert.assertFalse(StringUtil.isEmpty("hola mundo!"));
    }

    @Test
    public void empty_qoute_is_string_empty() {
        Assert.assertTrue(StringUtil.isEmpty(""));
    }

    @Test
    public void null_is_string_empty() {
        Assert.assertTrue(StringUtil.isEmpty(null));
    }

    @Test
    public void string_spaces_is_string_empty() {
        Assert.assertTrue(StringUtil.isEmpty("  "));
    }

}