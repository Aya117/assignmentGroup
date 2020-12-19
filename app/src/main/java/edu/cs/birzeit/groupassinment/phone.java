package edu.cs.birzeit.groupassinment;

public class phone {
    private String name;
    private int imageID;

    public static final phone[] phones = {
            new phone("Iphone 12", R.drawable.iphone12),
            new phone("Redmi 8 Pro", R.drawable.redmi8pro),
            new phone("Redmi Note 9 Pro Max", R.drawable.redmi),
            new phone("Iphone 10", R.drawable.iphone10),
            new phone("Redmi Note 10", R.drawable.note10),
            new phone("Samsung s10", R.drawable.s10),
            new phone("Samsung s20 ultra", R.drawable.ulto),
            new phone("nokia lumia", R.drawable.nokia),
            new phone("oopo a53", R.drawable.oopo),
            new phone("relmi 7 pro", R.drawable.relmi),

    };
    private phone(String name, int imageID){
        this.name = name;
        this.imageID = imageID;
    }
    public String getName(){return name;}
    public int getImageID(){return imageID;}


}
