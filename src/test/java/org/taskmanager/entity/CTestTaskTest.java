package org.taskmanager.entity;

import static org.junit.Assert.*;

import org.junit.*;

public class CTestTaskTest {

    @Test
    public void test() {
        final long ID = 1L;
        CTestTask testTask = new CTestTask();
        testTask.setId(ID);

        assertEquals(ID, testTask.getId());
    }
}