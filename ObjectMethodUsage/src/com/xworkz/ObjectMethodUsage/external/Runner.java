package com.xworkz.ObjectMethodUsage.external;

import com.xworkz.ObjectMethodUsage.internal.*;
import org.w3c.dom.ranges.DocumentRange;

public class Runner {
    public static void main(String[] args) {
        Tyre tyre = new Tyre("Rubber", "Bus", 1000);
        Poster poster = new Poster("A4", true, 20);
        Labour labour = new Labour("Ramesh", "Banaglore", 10000);
        Cloth cloth  = new Cloth("Cotton", "Black", 10);
        Bottle bottle = new Bottle("Milton", 1, 200);
        Bucket bucket = new Bucket(10, "Orange", 180);
        Bag bag = new Bag("American Tourist", "Blue", 500);
        Chair chair = new Chair("Wood", "Brown", 1000);
        Laptop laptop = new Laptop("Hp" , 100, "I7");
        TShirt tShirt = new TShirt("XS", "White", 100);
        LipStick lipStick = new LipStick("Mars", "Red", 300);
        Television television = new Television("Samsung" ,32, 30000);
        Gold gold = new Gold("Chain", 10, 200000);
        Door door = new Door("Wooden", 3, 1);
        Bangle bangle = new Bangle("Metal", 22, 100);
        Chocolate chocolate = new Chocolate("KitKat", false, 30);
        Zoo zoo = new Zoo("Sri Chamarajendra Zoological Gardens","Mysore", 100 );
        Projector projector = new Projector("Epson", "White", 5000);
        Book book = new Book("A4", "Camel", 130);
        Test test = new Test("Online", "22-04-2025", 100);
        Institute institute = new Institute("Siddarth", "Tumkur", 2000);
        Planet planet = new Planet("Earth", 1, 100000);
        Eagle eagle = new Eagle("Brown", 2, true);
        Board board = new Board("White", 100, 180);
        Shoe shoe = new Shoe("Nike", 10, "Black");
        Watch watch = new Watch("Sonata", "wristWatch", true);
        Table table = new Table("Square", "Plastic", 4);
        Bike bike = new Bike("Yamaha", 100, 80);
        Camera camera = new Camera("Sony", 100, 10000);
        Helmet helmet = new Helmet("Sport touring", "Black", true);
        Keyboard keyboard = new Keyboard("Dell", false, 400);
        Speaker speaker = new Speaker("Boat", 14, true);
        Refrigerator refrigerator = new Refrigerator("Godrej", 180, true);
        Microwave microwave = new Microwave("Samsung", 1400, true);
        Tablet tablet = new Tablet("iPad", 1000,12);
        Cup cup = new Cup("Steel", 5.5, "Silver");
        Mirror mirror = new Mirror("Round", 10, 10);
        Sofa sofa = new Sofa("Satin", 3, "Brown");
        Clock clock = new Clock("Wall CLock", true, "Fastrack");
        Lamp lamp = new Lamp("Table lamp", 50, true);
        Student student = new Student("Sonika", 106,90);
        City city = new City("Davanagere", "Karnataka", 900000);
        Movie movie = new Movie("Orange", "RamCharan", 5);
        Employee employee = new Employee("CS106", "CSE", 100000);
        Festival festival = new Festival("Ugadi", "March", false);
        Game game = new Game("Cricket", 11, true);
        Flight flight = new Flight("Air India", 123, false);
        Weather weather = new Weather("Bangalore", 38, "Sunny");
        Metro metro = new Metro("Banglore", 1000, 30);
        Tile tile = new Tile("Granite", 50, true);
        Robot robot = new Robot("hand", "lifting", true);
        Library library  = new Library("Saptagiri", 1000, true);
        Mountain mountain = new Mountain("Mullayanagiri", 1000, "Chikkamagalore");
        Volcano volcano = new Volcano("Barren Island", "India", true);
        Podcast podcast = new Podcast("Mahabharat", "Sudipta Bhawmik", 1000);
        Currency currency = new Currency("India", "Rupee", 4.5);
        Signal signal = new Signal("Bhashyam Circle", 10, true);
        Temple temple = new Temple("Ram Mandir", "bhashyam circle", 5);
        InsurancePolicy insurancePolicy = new InsurancePolicy("Umamahesha", 100000, 10);
        FestivalEvent festivalEvent = new FestivalEvent("Holi", "Rajajinagar", "26-02-2025");
        Subscription subscription = new Subscription("Sonika", "1year", 365);
        Drone drone = new Drone("DJI Mini 3", 10.5, true);
        Painting painting = new Painting("Ramu", "Naturistic", 2025);
        Rocket rocket = new Rocket("Aaryabhat", 1000, false);
        App app = new App("Youtube", "Steve Chen", 2.0);
        Parcel parcel = new Parcel("suguna", "Sonika", 500);
        Contest contest = new Contest("DKD","Dance", 20 );
        Museum museum = new Museum("Vishveshwarayya", "Bangalore", 1000);
        FitnessTracker fitnessTracker = new FitnessTracker("Boat", true, 12);
        Recipe recipe = new Recipe("Pizza", 60, true);
        Tattoo tattoo = new Tattoo("Sun", "hand", false);
        Language language = new Language("English", 100000, true);
        BoardGame boardGame = new BoardGame("Chess", 2, true);
        Skyscraper skyscraper = new Skyscraper("Vismali", 120, "Bankok");
        ArtGallery artGallery = new ArtGallery("Monalisa", 1000, false);
        ThemePark themePark = new ThemePark("Fun world", 12, true);
        Lodge lodge = new Lodge("SRS", 2, 500);
        IceCream iceCream = new IceCream("Chocolate", 40, false);
        Instrument instrument = new Instrument("Guitar", "Musical", false);
        Factory factory = new Factory("Ghandi Cotton Factory", "Cloth", "Bangalore");
        Passport passport = new Passport("Sonika", "IND120", 2040);
        ComicBook comicBook = new ComicBook("Sinchan : The warrior", "Sichan", 14322);
        Antique antique = new Antique("Crown", 200, "Italy");
        AppUpdate appUpdate = new AppUpdate("2.5", "08-04-2025", true);
        Capsule capsule = new Capsule("Paraacetamol", "Fever", 2);
        Map map = new Map("India", 2600, true);
        Gadget gadget = new Gadget("Noise", "earphone", 100);
        Award award = new Award("Best Actress", "Film", 2024);
        CurrencyNote  currencyNote = new CurrencyNote(500, "India", false);
        Toothbrush toothbrush = new Toothbrush("Colgate", "Red", false);
        Umbrella umbrella = new Umbrella("small", "red", true);
        Backpack backpack = new Backpack("Safari", 6, true);
        LunchBox lunchBox = new LunchBox("Steel", 100, true);
        WashingMachine washingMachine = new WashingMachine("Samsung", 5, false);
        Notebook notebook = new Notebook(200, "A4", false);
        RemoteControl remoteControl = new RemoteControl("Car", 4, true);
        Slipper slipper = new Slipper("Bata", 6, "Leather");
        Soap soap = new Soap("Rexona", "Lemon", true);
        Mug mug = new Mug("Plastic", 500, true);
        Curtain curtain = new Curtain("Silk", "Gold", true);

        System.out.println("1.Tyre : "+tyre);
        System.out.println("2. Poster : "+poster);
        System.out.println("3. Labour : "+labour);
        System.out.println("4. Cloth : "+cloth);
        System.out.println("5. Bottle : "+bottle);
        System.out.println("6. Bucket : "+bucket);
        System.out.println("7. Bag : "+bag);
        System.out.println("8. Chair : "+chair);
        System.out.println("9. Laptop : "+laptop);
        System.out.println("10. TShirt : "+tShirt);
        System.out.println("11. LipStick : "+lipStick);
        System.out.println("12. Television : "+television);
        System.out.println("13. Gold : "+gold);
        System.out.println("14. Door : "+door);
        System.out.println("15. Bangle : "+bangle);
        System.out.println("16. Chocolate : "+chocolate);
        System.out.println("17. Zoo : "+zoo);
        System.out.println("18. Projector : " +projector);
        System.out.println("19. Book : "+book);
        System.out.println("20. Test : "+test);
        System.out.println("21. Institute : " + institute);
        System.out.println("22. Planet : "+planet);
        System.out.println("23. Eagle : "+eagle);
        System.out.println("24. Board : "+board);
        System.out.println("25. Shoe : "+shoe);
        System.out.println("26. Watch : "+watch);
        System.out.println("27 : Table : "+table);
        System.out.println("28. Bike : "+bike);
        System.out.println("29. Camera : "+camera);
        System.out.println("30. Helmet : "+helmet);
        System.out.println("31. Keyboard : "+keyboard);
        System.out.println("32. Speaker : "+speaker);
        System.out.println("33. Refrigerator : "+refrigerator);
        System.out.println("34. Microwave : "+microwave);
        System.out.println("35. Tablet : "+tablet);
        System.out.println("36. Cup : "+cup);
        System.out.println("37. Mirror: "+mirror);
        System.out.println("38. Sofa : "+sofa);
        System.out.println("39. Clock : "+clock);
        System.out.println("40. Lamp : "+lamp);
        System.out.println("41. Student : "+student);
        System.out.println("42. City : "+city);
        System.out.println("43. Movie : "+movie);
        System.out.println("44. Employee : "+employee);
        System.out.println("45. Festival : "+festival);
        System.out.println("46. Game : "+game);
        System.out.println("47. Flight : "+flight);
        System.out.println("48. Weather : "+weather);
        System.out.println("49. Mwtro : "+metro);
        System.out.println("50. Tile : "+tile);
        System.out.println("51. Robot : "+robot);
        System.out.println("52. Library : "+library);
        System.out.println("53. Mountain : "+mountain);
        System.out.println("54. Volcano : "+volcano);
        System.out.println("55. Podcast  : "+podcast);
        System.out.println("56. Currency : "+currency);
        System.out.println("57. Signal : "+signal);
        System.out.println("58. Temple :"+temple);
        System.out.println("59. InsurancePolicy : "+insurancePolicy);
        System.out.println("60. FestivalEvent : "+festivalEvent);
        System.out.println("61. Subscription : "+subscription);
        System.out.println("62. Drone : "+drone);
        System.out.println("63. Painting : "+painting);
        System.out.println("64. Rocket : "+rocket);
        System.out.println("65. App : "+app);
        System.out.println("66. Parcel : "+app);
        System.out.println("67. Constest : "+contest);
        System.out.println("68. Museum : "+museum);
        System.out.println("69. FitnessTracker : "+fitnessTracker);
        System.out.println("70. Recipe : "+recipe);
        System.out.println("71. Tattoo : "+tattoo);
        System.out.println("72. Language : " +language);
        System.out.println("73. BoardGame : "+boardGame);
        System.out.println("74. Skyscraper : "+skyscraper);
        System.out.println("75. ArtGallery : "+artGallery);
        System.out.println("76. ThemePark : " +themePark);
        System.out.println("77. Lodge : "+lodge);
        System.out.println("78. IceCream : "+iceCream);
        System.out.println("79. Instrument : "+instrument);
        System.out.println("80. Factory : "+factory);
        System.out.println("81 : Passport : "+passport);
        System.out.println("82. ComicBook : "+comicBook);
        System.out.println("83. Antique : "+antique);
        System.out.println("84. AppUpdate : "+appUpdate);
        System.out.println("85. Capsule : "+capsule);
        System.out.println("86. Map : "+map);
        System.out.println("87. Gadget : "+gadget);
        System.out.println("88. Award : "+award);
        System.out.println("89. CurrencyNote : "+currencyNote);
        System.out.println("90. Toothbrush  : "+toothbrush);
        System.out.println("91. Umbrella : "+umbrella);
        System.out.println("92. Backpack : "+backpack);
        System.out.println("93. LunchBox : "+lunchBox);
        System.out.println("94. WashingMachine : "+washingMachine);
        System.out.println("95. Notebook : "+notebook);
        System.out.println("96. RemoteControl : "+remoteControl);
        System.out.println("97. Slipper : "+slipper);
        System.out.println("98. Soap : "+soap);
        System.out.println("99. Mug : "+mug);
        System.out.println("100. Curtain : "+curtain);
    }
}
