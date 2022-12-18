import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setHealth(100);
        boss.setDamage(50);
        boss.weapon.setWeaponType(WeaponType.STEEL);
        boss.weapon.setModel("Knife");

        System.out.println(
                " Health:  " + boss.getHealth() +
                " Damage:   " + boss.getDamage() + " Weapon: " + boss.weapon.getWeaponType()+" Model: " +boss.weapon.getModel());
        System.out.println("Boss - " + boss.printInfo());
        Sceleton sceleton = new Sceleton();
        sceleton.setHealth(50);
        sceleton.setDamage(10);
        sceleton.setArrows(10);
        sceleton.weapon.setWeaponType(WeaponType.FIRE);
        sceleton.weapon.setModel(" Gun ");
        System.out.println("Sceleton 1 - "+ sceleton.printInfo());

        Sceleton sceleton1 = new Sceleton();
        sceleton1.setHealth(90);
        sceleton1.setDamage(20);
        sceleton1.setArrows(35);
        sceleton1.weapon.setWeaponType(WeaponType.LASER);
        sceleton1.weapon.setModel(" Laser gun ");
        System.out.println("Sceleton 2 - "+sceleton1.printInfo());

    }


}