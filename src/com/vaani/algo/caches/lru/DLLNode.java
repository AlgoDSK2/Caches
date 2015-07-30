package com.vaani.algo.caches.lru;

public class DLLNode<K,V>{
    public K key;
    public V value;
    public DLLNode<K,V> pre;
    public DLLNode<K,V> next;
 
    public DLLNode(K key, V value){
        this.key = key;
        this.value = value;
    }
}
