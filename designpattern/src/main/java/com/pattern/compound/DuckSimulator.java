package com.pattern.compound;

/**
 * @author pc
 * @since 2018/1/5.
 */
public class DuckSimulator {

    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.registerObserver(new Quackologist());
        mallardDuck.quack();



//        DuckSimulator simulator = new DuckSimulator();
//        AbstractDuckFactory duckFactory = new CountingDuckFactory();
//        simulator.simulate(duckFactory);
    }

    void simulate(AbstractDuckFactory duckFactory) {
        Quackable mallardDuck = duckFactory.createMallarDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = new GooseAdapter(new Goose());
        System.out.println("\nDuck Simulator");

        Flock flockOfMallards = new Flock();

        flockOfMallards.add(redheadDuck);
        flockOfMallards.add(duckCall);
        flockOfMallards.add(rubberDuck);
        flockOfMallards.add(gooseDuck);

        simulate(flockOfMallards);

//        simulate(mallardDuck);
//        simulate(redheadDuck);
//        simulate(duckCall);
//        simulate(rubberDuck);
//        simulate(gooseDuck);

        System.out.println("The ducks quacked " +
                QuackCounter.getQuacks() + " times");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
