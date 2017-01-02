package com.jsoniter.any;

import com.jsoniter.ValueType;
import com.jsoniter.spi.TypeLiteral;

class DoubleObjectAny extends ObjectAny {

    private double val;

    public DoubleObjectAny(double val) {
        this.val = val;
    }

    @Override
    public ValueType valueType() {
        return ValueType.NUMBER;
    }

    @Override
    public Object object() {
        return val;
    }

    @Override
    public boolean toBoolean() {
        return val != 0;
    }

    @Override
    public int toInt() {
        return (int) val;
    }

    @Override
    public long toLong() {
        return (long) val;
    }

    @Override
    public float toFloat() {
        return (float) val;
    }

    @Override
    public double toDouble() {
        return val;
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

    public Any set(double newVal) {
        this.val = newVal;
        return this;
    }
}