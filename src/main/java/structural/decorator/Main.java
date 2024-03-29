package structural.decorator;

import structural.decorator.decorators.AddDecorator;
import structural.decorator.decorators.MultiplyDecorator;
import structural.decorator.decorators.SubstractDecorator;

public class Main {

    public static void main(String[] args) {

        Operation operation = new AddDecorator(
                new MultiplyDecorator(
                        new DoubleNumber(6), new SqrtDoubleNumber(9)),
                new SubstractDecorator(
                        new DoubleNumber(10), new DoubleNumber(5)
                )
        );

        System.out.println(operation.calculate());

    }
}
