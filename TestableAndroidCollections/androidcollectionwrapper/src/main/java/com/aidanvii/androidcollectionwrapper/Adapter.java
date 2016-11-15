package com.aidanvii.androidcollectionwrapper;

/**
 * Created by aidan.mcwilliams@vimn.com on 15/11/16.
 */

public final class Adapter {

    private final SparseArrayWrapper<String> sparseArrayWrapper;

    public Adapter(SparseArrayWrapper<String> sparseArrayWrapper) {
        this.sparseArrayWrapper = sparseArrayWrapper;
    }

    public Adapter(SparseArrayWrapperFactory<String> sparseArrayWrapperFactory) {
        this.sparseArrayWrapper = sparseArrayWrapperFactory.create();
    }
}
