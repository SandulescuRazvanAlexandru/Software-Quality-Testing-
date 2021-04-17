package ro.ase.cts.program;

import ro.ase.cts.clase.Facade;
import ro.ase.cts.clase.Masa;
import ro.ase.cts.claseComposite.Produs;
import ro.ase.cts.claseComposite.Sectiune;

public class Main {
    public static void main(String[] args) {
//        Masa masa1 = new Masa(1, 10);
//        //Masa masa1 = new Masa(30, 10);
//
//        if (OperatorMese.esteLibera(masa1.getNrMasa())) {
//            Picolo picolo1 = new Picolo(("Gigel"));
//            if(picolo1.esteDebarasataMasa(masa1.getNrMasa())) {
//                if (picolo1.esteAranjataMasa(masa1.getNrMasa())) {
//                    System.out.println("Poftiti va rog la masa");
//                }
//                else {
//                    System.out.println("Va rog mai asteptati");
//                }
//            }
//            else {
//                System.out.println("Va rog mai asteptati");
//            }
//        }
//        else {
//            System.out.println("Va rog mai asteptati");
//        }

        if(Facade.esteMasaPregatita(new Masa(30, 4))) {
            System.out.println("Poftiti va rog la masa");
        }
        else {
            System.out.println("Va rog mai asteptati");
        }

        System.out.println("--------------------------------------------------------------------------------");

        Sectiune bauturi = new Sectiune(("bauturi"));
        Sectiune desert = new Sectiune(("desert"));

        Produs cola = new Produs("Cola");
        Produs tiramisu = new Produs("Tiramisu");
        Produs frappe = new Produs("Frappe");

        Sectiune meniu = new Sectiune("Meniu");
        meniu.adaugaNod(bauturi);
        meniu.adaugaNod(desert);

        bauturi.adaugaNod(cola);
        bauturi.adaugaNod(frappe);
        desert.adaugaNod(tiramisu);

        meniu.printareElement();

        desert.adaugaNod(frappe);
        bauturi.stergeNod(frappe);

        System.out.println();
        meniu.printareElement();
    }
}
