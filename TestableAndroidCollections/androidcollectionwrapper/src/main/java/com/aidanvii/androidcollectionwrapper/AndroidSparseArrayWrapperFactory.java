package com.aidanvii.androidcollectionwrapper;

import android.util.SparseArray;

/**
 * Created by aidan.mcwilliams@vimn.com on 15/11/16.
 */
public class AndroidSparseArrayWrapperFactory<E> implements SparseArrayWrapperFactory<E> {
    @Override
    public SparseArrayWrapper<E> create() {
        return new SparseArrayWrapperImpl();
    }

    private final class SparseArrayWrapperImpl implements SparseArrayWrapper<E> {

        private final SparseArray<E> sparseArray = new SparseArray<>();

        @Override
        public E get(int key) {
            return sparseArray.get(key);
        }

        @Override
        public E get(int key, E valueIfKeyNotFound) {
            return sparseArray.get(key, valueIfKeyNotFound);
        }

        @Override
        public void delete(int key) {
            sparseArray.delete(key);
        }

        @Override
        public void remove(int key) {
            sparseArray.remove(key);
        }

        @Override
        public void removeAt(int index) {
            sparseArray.removeAt(index);
        }

        @Override
        public void removeAtRange(int index, int size) {
            sparseArray.removeAtRange(index, size);
        }

        @Override
        public void put(int key, E value) {
            sparseArray.put(key, value);
        }

        @Override
        public int size() {
            return sparseArray.size();
        }

        @Override
        public int keyAt(int index) {
            return sparseArray.keyAt(index);
        }

        @Override
        public E valueAt(int index) {
            return sparseArray.valueAt(index);
        }

        @Override
        public void setValueAt(int index, E value) {
            sparseArray.setValueAt(index, value);
        }

        @Override
        public int indexOfKey(int key) {
            return sparseArray.indexOfKey(key);
        }

        @Override
        public int indexOfValue(E value) {
            return sparseArray.indexOfValue(value);
        }

        @Override
        public void clear() {
            sparseArray.clear();
        }

        @Override
        public void append(int key, E value) {
            sparseArray.append(key, value);
        }
    }

}
