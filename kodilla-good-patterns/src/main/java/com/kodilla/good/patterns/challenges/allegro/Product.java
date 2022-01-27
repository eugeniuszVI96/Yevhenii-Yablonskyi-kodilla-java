package com.kodilla.good.patterns.challenges.allegro;

public class Product {

    private String index;
    private String name;
    private String type;

    public Product(String index, String name, String type) {
        this.index = index;
        this.name = name;
        this.type = type;
    }

    public String getIndex() {
        return index;
    }

    public void setIndex(String index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (!index.equals(product.index)) return false;
        if (!name.equals(product.name)) return false;
        return type.equals(product.type);
    }

    @Override
    public int hashCode() {
        int result = index.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Product{" +
                "index='" + index + '\'' +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
