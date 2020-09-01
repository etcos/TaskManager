package org.taskmanager.entity;

import static org.junit.Assert.*;

import org.junit.*;

public class CTask_4_Test {

    @Test
    public void test() {
        final long ID = 1L;

        CTask task = new CTask();
        task.setId(ID);

        assertEquals(ID, task.getId());
    }
}