package com.aidanvii.androidcollectionwrapper;

/**
 * Created by aidan.mcwilliams@vimn.com on 15/11/16.
 */

public interface SparseArrayWrapper<E> {

    E get(int key);

    E get(int key, E valueIfKeyNotFound);

    void delete(int key);

    void remove(int key);

    void removeAt(int index);

    void removeAtRange(int index, int size);

    void put(int key, E value);

    int size();

    int keyAt(int index);

    E valueAt(int index);

    void setValueAt(int index, E value);

    int indexOfKey(int key);

    int indexOfValue(E value);

    void clear();

    void append(int key, E value);

    String toString();
}
