package org.fxmisc.undo.impl;

public interface ChangeQueue<C> {

    boolean hasNext();

    boolean hasPrev();

    C next();

    C prev();

    @SuppressWarnings({"unchecked"})
    void push(C... changes);
}
