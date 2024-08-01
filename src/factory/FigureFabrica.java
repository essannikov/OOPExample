package factory;

import factory.Figure;
import factory.Figure1;
import factory.Figure2;

public class FigureFabrica {
    public static Figure createFigure(int value){
        switch (value){
            case 1:
                return new Figure1();
            default:
                return new Figure2();
        }
    }
}
