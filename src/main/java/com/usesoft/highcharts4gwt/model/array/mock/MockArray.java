package com.usesoft.highcharts4gwt.model.array.mock;

import java.util.ArrayList;

import com.usesoft.highcharts4gwt.model.array.api.Array;

public class MockArray<T> extends ArrayList<T> implements Array<T>
{
    private static final long serialVersionUID = 1L;

    @Override
    public T getItem(int index)
    {
        return get(index);
    }

    @Override
    public int length()
    {
        return size();
    }

    @Override
    public void insert(int index, T element)
    {
        super.set(index, element);
    }

    @Override
    public void addToEnd(T value)
    {
        add(value);
    }

}
