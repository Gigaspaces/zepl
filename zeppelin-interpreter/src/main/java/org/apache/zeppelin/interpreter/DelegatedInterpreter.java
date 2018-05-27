package org.apache.zeppelin.interpreter;

/**
 *
 */
public interface DelegatedInterpreter {
    Interpreter getInnerInterpreter();
}
