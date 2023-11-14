package rs.ac.ni.pmf.oop2;

public class StoreOnNetwork  implements Storage
{

    @Override
    public void store(String input)
    {
        System.out.println("Storing " + input + " on network!");
    }
}
