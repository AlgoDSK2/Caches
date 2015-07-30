package com.vaani.algo.caches;

import java.util.*;

import com.vaani.algo.caches.lru.DLLNode;

public class LRUCacheImpl<K,V> extends LinkedHashMap<K, V> implements ICache<K,V>{
	   private static final long serialVersionUID = 1L;
	   private int capacity;
	    
	   public LRUCacheImpl(int capacity, float loadFactor){
	      super(capacity, loadFactor, true);
	      this.capacity = capacity;
	   }
	    
	   /**
	    * removeEldestEntry() should be overridden by the user, otherwise it will not 
	    * remove the oldest object from the Map.
	    */
	   @Override
	   protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
	      return size() > this.capacity;
	   }
	    
	   public static void main(String arg[]){
	      ICache<Integer,String> lruCache = new LRUCacheImpl<Integer,String>(4, 0.75f);
	       
	      lruCache.add(1, "Object1");
	      lruCache.add(2, "Object2");
	      lruCache.add(3, "Object3");
	      lruCache.get(1);
	      lruCache.add(4, "Object4");
	      System.out.println(lruCache);
	      lruCache.add(5, "Object5");
	      lruCache.get(3);
	      lruCache.add(6, "Object6");
	      System.out.println(lruCache);
	      lruCache.get(4);
	      lruCache.add(7, "Object7");
	      lruCache.add(8, "Object8");
	      System.out.println(lruCache);
	   }

	@Override
	public void add(K key, V value) {
		// TODO Auto-generated method stub
		this.put(key, value);
	}
	}