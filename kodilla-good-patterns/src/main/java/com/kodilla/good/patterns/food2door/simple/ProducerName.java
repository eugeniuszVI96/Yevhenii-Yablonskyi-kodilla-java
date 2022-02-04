package com.kodilla.good.patterns.food2door.simple;

public class ProducerName {

    private final String internal;

    public ProducerName(String internal) {
        this.internal = internal;
    }

    public String getInternal() {
        return internal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProducerName producerName = (ProducerName) o;

        return internal.equals(producerName.internal);
    }

    @Override
    public int hashCode() {
        return internal.hashCode();
    }

    @Override
    public String toString() {
        return "Producer{" +
                "internal='" + internal + '\'' +
                '}';
    }

}
