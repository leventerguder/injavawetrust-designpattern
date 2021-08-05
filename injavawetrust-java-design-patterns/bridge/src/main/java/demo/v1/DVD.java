package demo.v1;

/*
    DVD class also ok with the super class method.
    In addition to this, it uses one additional method
*/
public class DVD extends ElectronicGoods{

    public void doublePress() {
        hardButtonPressed();
        hardButtonPressed();
    }
}
