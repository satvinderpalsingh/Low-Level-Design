package designPatterns.factoryDesignPattern;

import designPatterns.factoryDesignPattern.products.Shape;

public class ShapeStore {
    public static void main(String[] args) {
        ShapeFactoryImp shapeFactory = new ShapeFactoryImp();
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
