package com.blankspace.csdn.basic;

import java.io.DataInputStream;
import java.io.EOFException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EOFTest {

    @Test
    public void eofExceptionTest() {
        Assertions.assertThrows(EOFException.class, () -> {
            DataInputStream inputStream = new DataInputStream(Files.newInputStream(Paths.get("README.md")));
            while (true) {
                int data = inputStream.readInt();
                System.out.println(data);
            }
        });
    }

}
