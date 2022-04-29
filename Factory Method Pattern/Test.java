public class Test {

    public static void main(String[] args) {
        WeaponFactory weaponfactory = new ElveAxeShow();
        weaponfactory.show();

        weaponfactory = new ElveSpearShow();
        weaponfactory.show();

        weaponfactory = new OrcAxeShow();
        weaponfactory.show();

        weaponfactory = new OrcSpearShow();
        weaponfactory.show();

        weaponfactory = new OrcShortSwordShow();
        weaponfactory.show();



    }
}
