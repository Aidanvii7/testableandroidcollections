package com.aidanvii.androidcollectionwrapper;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by aidan.vii on 15/11/16.
 */
public class JavaSparseArrayWrapperFactory<E> implements SparseArrayWrapperFactory<E> {

    @Override
    public SparseArrayWrapper<E> create() {
        return new SparseArrayWrapperImpl();
    }

    private final class SparseArrayWrapperImpl implements SparseArrayWrapper<E> {

        private final Map<Integer, E> map = new TreeMap<>();

        private int getKeyAt(int index) {
            return new ArrayList<>(map.keySet()).get(index);
        }

        private E getValueAt(int index) {
            return new ArrayList<>(map.values()).get(index);
        }

        private int getIndexForKey(int key) {
            return new ArrayList<>(map.keySet()).indexOf(key);
        }

        private int getIndexForValue(E value) {
            return new ArrayList<>(map.values()).indexOf(value);
        }

        @Override
        public E get(int key) {
            return map.get(key);
        }

        @Override
        public E get(int key, E valueIfKeyNotFound) {
            final E existing = map.get(key);
            return existing != null ? existing : valueIfKeyNotFound;
        }

        @Override
        public void delete(int key) {
            map.remove(key);
        }

        @Override
        public void remove(int key) {
            map.remove(key);
        }

        @Override
        public void removeAt(int index) {
            map.remove(getKeyAt(index));
        }

        @Override
        public void removeAtRange(int index, int size) {
            final int endIndex = index + size;
            for (int curIndex = index; curIndex < endIndex; curIndex++) {
                map.remove(getKeyAt(curIndex));
            }
        }

        @Override
        public void put(int key, E value) {
            map.put(key, value);
        }

        @Override
        public int size() {
            return map.size();
        }

        @Override
        public int keyAt(int index) {
            return getKeyAt(index);
        }

        @Override
        public E valueAt(int index) {
            return getValueAt(index);
        }

        @Override
        public void setValueAt(int index, E value) {
            map.put(getKeyAt(index), value);
        }

        @Override
        public int indexOfKey(int key) {
            return getIndexForKey(key);
        }

        @Override
        public int indexOfValue(E value) {
            return getIndexForValue(value);
        }

        @Override
        public void clear() {
            map.clear();
        }

        @Override
        public void append(int key, E value) {
            map.put(key, value);
        }
    }

}
