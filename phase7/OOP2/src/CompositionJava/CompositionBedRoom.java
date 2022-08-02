package CompositionJava;

/**
 * @author: Geoffrey Duncan O.
 * @since: Java 17 (2022).
 * Composition in Java.
 */

public class CompositionBedRoom {
    private String name;
    private CompEncapPolymorphism.Wall wall1;
    private CompEncapPolymorphism.Wall wall2;
    private CompEncapPolymorphism.Wall wall3;
    private CompEncapPolymorphism.Wall wall4;
    private Ceiling ceiling;
    private Bed bed;
    private CompEncapPolymorphism.Lamp lamp;

    // Constructor

    public CompositionBedRoom(String name, CompEncapPolymorphism.Wall wall1, CompEncapPolymorphism.Wall wall2, CompEncapPolymorphism.Wall wall3, CompEncapPolymorphism.Wall wall4, Ceiling ceiling, Bed bed, CompEncapPolymorphism.Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    // Getter
    public CompEncapPolymorphism.Lamp getLamp(){
        return this.lamp;
    }
    public void makeBed(){
        System.out.println("Bedroom -> Making bed");
        bed.make();
    }
}
