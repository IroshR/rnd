package com.iroshnk.java.collection.weakhashmap;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

public class WeakHashMapSample {
    public static void main(String[] args) {
        /** Strong References
         * The strong reference is the most common type of Reference that we use in our day to day programming
         * The variable prime has a strong reference to an Integer object with value 1. Any object which has a strong reference pointing to it is not eligible for GC.
         */
        Integer prime = 1;


        /** Soft References
         * Simply put, an object that has a SoftReference pointing to it won’t be garbage collected until the JVM absolutely needs memory.
         *  we are wrapping prime strong reference into a soft reference. After making that strong reference null, a prime object is eligible for GC but will be collected only when JVM absolutely needs memory
         */
        Integer primeS = 1;
        SoftReference<Integer> soft = new SoftReference<Integer>(primeS);
        primeS = null;


        /**
         * The objects that are referenced only by weak references are garbage collected eagerly; the GC won’t wait until it needs memory in that case.
         * When we made a prime reference null, the prime object will be garbage collected in the next GC cycle, as there is no other strong reference pointing to it.
         */
        Integer primeW = 1;
        WeakReference<Integer> weak = new WeakReference<Integer>(primeW);
        primeW = null;

        WeakHashMap<UniqueImageName, BigImage> map = new WeakHashMap<>();
        BigImage bigImageFirst = new BigImage("foo");
        UniqueImageName imageNameFirst = new UniqueImageName("name_of_big_image");

        BigImage bigImageSecond = new BigImage("foo_2");
        UniqueImageName imageNameSecond = new UniqueImageName("name_of_big_image_2");

        map.put(imageNameFirst, bigImageFirst);
        map.put(imageNameSecond, bigImageSecond);

        System.out.println(map.containsKey(imageNameFirst));
        System.out.println(map.containsKey(imageNameSecond));

        imageNameFirst = null;
        System.gc();

        System.out.println("after imageNameFirst to null");

        System.out.println(map.containsKey(imageNameFirst));
        System.out.println(map.containsKey(imageNameSecond));

    }
}

class BigImage{
    private String name;

    public BigImage(String name){
        this.name = name;
    }
}

class UniqueImageName{
    private String name;

    public UniqueImageName(String name){
        this.name = name;
    }
}


