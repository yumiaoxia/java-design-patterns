package com.itsherman.fp.shapemaker;

import com.itsherman.fp.shape.Circle;
import com.itsherman.fp.shape.Rectangle;
import com.itsherman.fp.shape.Shape;
import com.itsherman.fp.shape.Square;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        this.circle = new Circle();
        this.rectangle = new Rectangle();
        this.square = new Square();
    }

    public void drawCircle(){
        circle.draw();
    }

    public void drawRectangle(){
        rectangle.draw();
    }

    public void drawSquare(){
        square.draw();
    }
}
