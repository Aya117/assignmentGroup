package edu.cs.birzeit.groupassinment;

public class phone {
    private String name;
    private String description;
    private int imageID;
   // private String dd;

    public static final phone[] phones = {
            new phone("Iphone 12", R.drawable.iphone12,"Iphone 12,Screen: 6.1 inch,Operating System: iOS 14, Battery: 2815 mAh, Memory: 64 GB, Weight: 164 gram" ),
            new phone("Redmi 8 Pro", R.drawable.redmi8pro,"Redmi 8 Pro, Screen: 6.53 inch, Operating System: Android 9.0 pie, Battery: 4500 mAh, Memory: 256 GB, Weight: 199 gram"),
            new phone("Redmi Note 9 Pro Max", R.drawable.redmi, "Redmi Note 9 Pro Max, Screen: 6.67 inch, Operating System: Android 10 , Battery: 5020 mAh, Memory: 64 GB, Weight: 209 gram"),
            new phone("Iphone 10", R.drawable.iphone10, "Iphone 10, Screen: 5.8 inch,Operating System: iOS 13.6.1., Battery: 2716 mAh , Memory: 64/256 GB, Weight: 174 gram"),
            new phone("Redmi Note 10", R.drawable.note10,"Note 10, Screen: 6.57 inch, Operating System: Android 10, Battery: 4800 mAh, Memory: 256/64 GB, Weight: 210 gram" ),
            new phone("Samsung s10", R.drawable.s10,"Samsung s10, Screen: 6.2 inch,Operating System: Android 10, Battery: 4000 mAh, Memory:128 GB, Weight: 190 gram"),
            new phone("Samsung s20 ultra", R.drawable.ulto, "Samsung s20 ultra, Screen: 6.2 inch,Operating System: Android 10, Battery: 4000 mAh, Memory:128 GB, Weight: 190 gram"),
            new phone("nokia lumia", R.drawable.nokia, "nokia lumia, Screen 4.5 inch, Operating System: Android 8.1, Battery: 2000 mAh, Memory:8 GB, Weight: 174 gram"),
            new phone("oopo a53", R.drawable.oopo,"oopo a53, Screen 6.5 inch, Operating System: Android 10, Battery: 5000 mAh, Memory:64/128 GB, Weight: 200 gram"),
            new phone("relmi 7 pro", R.drawable.relmi,"relmi 7 pro, Screen 6.4 inch, Operating System: Android 10, Battery: 4500 mAh, Memory:128 GB, Weight: 190 gram"),

    };

    private phone(String name, int imageID, String description){
        this.name = name;
        this.imageID = imageID;
        this.description = description;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}
    public String getDescription(){return description;}

}
