public abstract class WeaponFactory {

    protected abstract Weapon getManufacture();

    public void show(){
        Weapon weapon = getManufacture();
        String message = weapon.Manufacture();
        System.out.println(message);
    }


}
