package com.zadania_wzorce.c_behavioral.visitor_data_base;

import java.util.ArrayList;
import java.util.Objects;

public class DataBase<T> {
    ArrayList<T> list;

    public DataBase() {
        this.list = new ArrayList<>();
    }

    public void add(T t) {
        list.add(t);
    }

    @Override
    public String toString() {
       return list.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DataBase<?> dataBase = (DataBase<?>) o;
        return Objects.equals(list, dataBase.list);
    }

    @Override
    public int hashCode() {
        return Objects.hash(list);
    }
}
