package demo.v1;

public abstract class AnimalFactory {

    /**
     * Remember that the GoF definition says : "... Factory method lets a class defer
     * instantiation to subclasses."
     * In our case , the following method will create a Tiger or Dog but at this point it does not
     * know whether it will get a Dog or a Tiger.
     * This decision will be taken by the subclasses i.e DogFactory or TigerFactory
     * So , in this implementation the following method is playing the role of a factory.
     */

    public abstract Animal createAnimal();

}
