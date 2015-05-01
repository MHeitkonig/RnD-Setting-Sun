package com.example.tim.settingsun;

    /**
    * This class can store any two values as a tuple given that they are of the same type.
    * @author Ward Theunisse, Tim van Dijk, Martijn Heitkönig en Luuk van Bitterswijk
    */
public class Tuple<T> {
    public T x, y;

    Tuple (T x, T y) {
        this.x = x;
        this.y = y;
    }

}
