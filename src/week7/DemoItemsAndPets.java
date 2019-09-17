package week7;

public class DemoItemsAndPets {
    public static void main(String[] args) {

        ItemSold itemSold = new ItemSold();
        PetSold petSold = new PetSold();

        itemSold.setDescription("itemSold - Description");
        itemSold.setInvoiceNumber(124124);
        itemSold.setPrice(99.99);

        System.out.println(itemSold.getDescription());
        System.out.println(itemSold.getInvoiceNumber());
        System.out.println(itemSold.getPrice());

        petSold.setDescription("petSold - Description");
        petSold.setInvoiceNumber(421421);
        petSold.setPrice(11.11);
        petSold.setVaccinated(true);
        petSold.setHouseBroken(true);
        petSold.setNeutered(true);

        System.out.println(petSold.getDescription());
        System.out.println(petSold.getInvoiceNumber());
        System.out.println(petSold.getPrice());
        System.out.println(petSold.getVaccinated());
        System.out.println(petSold.getHouseBroken());
        System.out.println(petSold.getNeutered());

    }
}
