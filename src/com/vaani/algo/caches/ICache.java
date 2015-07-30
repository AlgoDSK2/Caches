package com.vaani.algo.caches;

public interface ICache<K,V> {
	V get(K key);
	void add(K key, V value);
	V remove(K key);
}
