package Main;

public class Butelka {
    private double ileLitrow;

            Butelka(double ileLitrow)
            {
                this.ileLitrow = ileLitrow;
            }

            double getIleLitrów()
            {
                return ileLitrow;
            }
            void wlej(double ilosc)
            {
                this.ileLitrow += ilosc;
            }
            boolean wylej(double ilosc)
            {
                if (ilosc < ileLitrow)
                    this.ileLitrow -= ilosc;
                else
                    return false;
                return true;
            }

            void przelej(double ilosc, Butelka gdziePrzelac)
            {
                if (this.wylej(ilosc))
                {
                    gdziePrzelac.wlej(ilosc);
                }
                else
                    System.out.println("Za mało");
            }

            public static void  main(String[] args) {
                Butelka[] butelka = new Butelka[5]; //NULL

                butelka[0] = new Butelka(5);
                butelka[1] = new Butelka(8);
                butelka[2] = new Butelka(10);
                butelka[3] = new Butelka(9);
                butelka[4] = new Butelka(12);

                butelka[4].wlej(23);

                butelka[3].przelej(3, butelka[2]);

                System.out.println(butelka[0].getIleLitrów());
                System.out.println(butelka[1].getIleLitrów());
                System.out.println(butelka[2].getIleLitrów());
                System.out.println(butelka[3].getIleLitrów());
                System.out.println(butelka[4].getIleLitrów());
            }
}
