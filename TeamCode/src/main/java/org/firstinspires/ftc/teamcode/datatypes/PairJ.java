package org.firstinspires.ftc.teamcode.datatypes;

import androidx.annotation.NonNull;

public class PairJ {
    public double x, y;

    public PairJ(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void rotate(double radians) {
        x = x*Math.cos(radians) - y*Math.sin(radians);
        y = x*Math.sin(radians) + y*Math.cos(radians);
    }
    public PairJ getRotated(double radians) {
        return new PairJ(
                x*Math.cos(radians) - y*Math.sin(radians),
                x*Math.sin(radians) + y*Math.cos(radians));
    }


    public void add(PairJ p2) {
        this.x += p2.getX();
        this.y += p2.getY();
    }

    public void normalize(double height, double width) {
        x = x/width;
        y = y/height;
    }
    public void normalize(PairJ dim) {
        normalize(dim.getY(), dim.getX());
    }

    public void rasterize(double height, double width) {
        x = Math.round(x*width);
        y = Math.round(y*height);
    }
    public void rasterize(PairJ dim) {
        rasterize(dim.getY(), dim.getX());
    }

    public PairJ getRasterized(double height, double width) {
        return new PairJ(Math.round(x*width), Math.round(y*height));
    }
    public PairJ getRasterized(PairJ dim) {
        return getRasterized(dim.getY(), dim.getX());
    }

    public double distance(PairJ p) {
        return Math.sqrt((Math.pow(this.x - p.getX(), 2) + Math.pow(this.y - p.getY(), 2)));
    }

    public PairJ copy() {
        return new PairJ(x, y);
    }

    @NonNull
    @Override
    public String toString() {

        return "X: " + String.format("%.2f", this.getX()) +
                " Y: " + String.format("%.2f", this.getY());
    }

}
