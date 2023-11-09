package ru.milovtim.script;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CodePointCharStream;

public class Main {
    public static void main(String[] args) {
        CodePointCharStream charStream = CharStreams.fromString("x = 1 + 3\na = x - 12");

    }
}
