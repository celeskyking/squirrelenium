package com.github.celeskyking.squirrelenium.finder;

import com.github.celeskyking.squirrelenium.element.DomElement;

/**
 * Date : 2016/3/20
 * project : squirrelenium
 *
 * @author tianqing.wang.
 * <p>该接口用于操作页面的定位,主要是用来重写selenium的findElementBy。
 * 只是提供基础的api，不提供更深的操作方式</p>
 */
public interface IFinder {

    DomElement find(String location);

}
