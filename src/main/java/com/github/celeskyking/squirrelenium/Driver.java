package com.github.celeskyking.squirrelenium;

import com.github.celeskyking.squirrelenium.engine.IEngine;


/**
 * Created by celes on 2016/3/16
 */
public class Driver {

    private IEngine engine;

    public Driver(IEngine engine) {
        this.engine = engine;
    }

    public Driver go(String url) {
        engine.driver().get(url);
        return this;
    }
}
