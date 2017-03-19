package com.example;

import org.apache.ignite.cache.store.CacheStore;
import org.apache.ignite.lang.IgniteBiInClosure;
import org.jetbrains.annotations.Nullable;

import javax.cache.Cache;
import javax.cache.integration.CacheLoaderException;
import javax.cache.integration.CacheWriterException;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

public class CacheStoreImpl implements CacheStore<Long, Long>, Serializable {
    @Override
    public void loadCache(IgniteBiInClosure<Long, Long> clo, @Nullable Object... args) throws CacheLoaderException { }

    @Override
    public void sessionEnd(boolean commit) throws CacheWriterException { }

    @Override
    public Long load(Long key) throws CacheLoaderException {
        return null;
    }

    @Override
    public Map<Long, Long> loadAll(Iterable<? extends Long> keys) throws CacheLoaderException {
        return null;
    }

    @Override
    public void write(Cache.Entry<? extends Long, ? extends Long> entry) throws CacheWriterException { }

    @Override
    public void writeAll(Collection<Cache.Entry<? extends Long, ? extends Long>> entries) throws CacheWriterException {}

    @Override
    public void delete(Object key) throws CacheWriterException {}

    @Override
    public void deleteAll(Collection<?> keys) throws CacheWriterException {}
}