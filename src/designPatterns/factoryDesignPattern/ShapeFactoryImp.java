package designPatterns.factoryDesignPattern;

import designPatterns.factoryDesignPattern.products.Circle;
import designPatterns.factoryDesignPattern.products.Rectangle;
import designPatterns.factoryDesignPattern.products.Shape;
import designPatterns.factoryDesignPattern.products.Square;

public class ShapeFactoryImp {
    public Shape getShape(String shapeType) {
        return switch (shapeType.toLowerCase()) {
            case "rectangle" -> new Rectangle();
            case "circle" -> new Circle();
            case "square" -> new Square();
            default -> null;
        };
    }
}
