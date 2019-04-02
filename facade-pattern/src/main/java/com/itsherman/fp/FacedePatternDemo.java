package com.itsherman.fp;

import com.itsherman.fp.shapemaker.ShapeMaker;

/**
 * @author Sherman
 * created in 2019/3/27
 */

public class FacedePatternDemo {

    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawSquare();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
    }
}
