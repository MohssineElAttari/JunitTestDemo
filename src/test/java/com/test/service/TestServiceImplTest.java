package com.test.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.exceptions.base.MockitoException;

import static org.junit.jupiter.api.Assertions.*;
class TestServiceImplTest {
    TestServiceImpl testService = new TestServiceImpl();
    @Test
    public void multiple() {
       assertTrue( testService.multiple(5,9)==45);
    }

}