package com.xworkz.isARelation;

public class CoffeeMaker extends  Appliance{

    public CoffeeMaker() {
        super();
        System.out.println("no-arg const of CoffeeMaker");
    }

    {
        super.turnOn();
        System.out.println("Running turnOn in CoffeeMaker");
    }

    {
        super.adjustSettings();
        System.out.println("Running adjustSettings in CoffeeMaker");
    }

    {
        super.showStatus();
        System.out.println("Running showStatus in CoffeeMaker");
    }

    {
        super.scheduleTask();
        System.out.println("Running scheduleTask in CoffeeMaker");
    }

    {
        super.turnOff();
        System.out.println("Running turnOff in CoffeeMaker");
    }

}
