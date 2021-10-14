package com.softin.util;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.softin.util.PasswordUtil.SecurityLevel.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("1234567")); ;
    }

    @Test
    public void weak_when_has_only_letters(){
        assertEquals(WEAK, PasswordUtil.assessPassword("abcdefghij")); ;
    }

    @Test
    public void medium_when_has_letters_and_numbers(){
        assertEquals(MEDIUN, PasswordUtil.assessPassword("abcdef125")); ;
    }

    @Test
    public void strong_when_has_letters_and_numbers_and_simbols(){
        assertEquals(STRONG, PasswordUtil.assessPassword("abcdef125!")); ;
    }
}