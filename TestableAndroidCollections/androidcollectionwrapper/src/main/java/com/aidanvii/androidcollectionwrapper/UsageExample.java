package com.aidanvii.androidcollectionwrapper;

/**
 * Created by aidan.vii on 15/11/16.
 */
public final class UsageExample {

    private final SparseArrayWrapper<String> sparseArrayWrapper;

    public UsageExample(SparseArrayWrapper<String> sparseArrayWrapper) {
        this.sparseArrayWrapper = sparseArrayWrapper;
    }

    public UsageExample(SparseArrayWrapperFactory<String> sparseArrayWrapperFactory) {
        this.sparseArrayWrapper = sparseArrayWrapperFactory.create();
    }
}
