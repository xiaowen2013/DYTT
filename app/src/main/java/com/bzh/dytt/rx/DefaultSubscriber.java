package com.bzh.dytt.rx;

import rx.Subscriber;

/**
 * ==========================================================<br>
 * <b>版权</b>：　　　别志华 版权所有(c)2016<br>
 * <b>作者</b>：　　  biezhihua@163.com<br>
 * <b>创建日期</b>：　16-3-23<br>
 * <b>描述</b>：　　　<br>
 * <b>版本</b>：　    V1.0<br>
 * <b>修订历史</b>：　<br>
 * ==========================================================<br>
 */
public abstract class DefaultSubscriber<T> extends Subscriber<T> {

    @Override
    public abstract void onStart();

    @Override
    public abstract void onCompleted();

    @Override
    public abstract void onError(Throwable e);

    @Override
    public abstract void onNext(T t);
}