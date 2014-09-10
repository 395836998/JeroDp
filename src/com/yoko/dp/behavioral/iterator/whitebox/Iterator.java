package com.yoko.dp.behavioral.iterator.whitebox;

public interface Iterator
{
    void first();

    void next();

    boolean isDone();

    Object currentItem();
}
