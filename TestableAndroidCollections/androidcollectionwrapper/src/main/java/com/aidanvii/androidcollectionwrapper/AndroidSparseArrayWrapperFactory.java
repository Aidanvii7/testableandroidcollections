package com.aidanvii.androidcollectionwrapper;

/**
 * Created by aidan.mcwilliams@vimn.com on 15/11/16.
 */
public class AndroidSparseArrayWrapperFactory<E> implements SparseArrayWrapperFactory<E> {
    @Override
    public SparseArrayWrapper<E> create() {
        return new AndroidSparseArrayWrapper<>();
    }
}
