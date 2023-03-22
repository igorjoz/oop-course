package com.igorjozefowicz.oop.lab3;

public class Main {
    public static void main(String[] args) {
        /*
         * Konstrukcja językowa try {} catch (...){} służy do
         * obsługi wyjątków. Kod w bloku try jest monitorowany
         * pod kątem wystąpienia wyjątku bądź wyjątków
         * wspomnianych na początku bloku/bloków catch.
         * Jeżeli gdzieś w bloku try wystąpi wyjątek, to sterowanie
         * zostanie natychmiast przeniesione do bloku catch.
         * Tam powinien znajdować się kod obsługujący wyjątek.
         * Może to być np. wypisanie stosu wywołań na wyjście błędów
         * lub zapisanie wyjątku w logach, lub wyrzucenie (zgłoszenie)
         * innego wyjątku lepiej opisującego sytuacje (można załączyć
         * wyjątek który zainicjował to zdarzenie patrz. Konstruktor
         * klasy java.lang.Exception)
         */
//        try {
//            Punkt p1 = Punkt.E_X;
//            System.out.println(p1);
//            Transformacja tr = new Translacja(5, 6);
//            System.out.println(tr);
//            Punkt p2 = tr.transformuj(p1);
//            System.out.println(p2);
//            Transformacja trr = tr.getTransformacjaOdwrotna();
//            System.out.println(trr);
//            Punkt p3 = trr.transformuj(p2);
//            System.out.println(p3);
//
//        } catch (BrakTransformacjiOdwrotnejException ex) {
//            ex.printStackTrace();
//        }
//        System.out.println();
//
//        try {
//            Punkt p1 = new Punkt(2, 2);
//            System.out.println(p1);
//            Transformacja tr2 = new Skalowanie(5, 4);
//            System.out.println(tr2);
//            Punkt p2 = tr2.transformuj(p1);
//            System.out.println(p2);
//            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
//            System.out.println(trr2);
//            Punkt p3 = trr2.transformuj(p2);
//            System.out.println(p3);
//        } catch (BrakTransformacjiOdwrotnejException ex) {
//            ex.printStackTrace();
//        }
//        System.out.println();
//
//        try {
//            Punkt p1 = new Punkt(2, 2);
//            Transformacja tr2 = new Skalowanie(5, 0);
//            System.out.println(tr2);
//            System.out.println(p1);
//            Punkt p2 = tr2.transformuj(p1);
//            System.out.println(p2);
//            Transformacja trr2 = tr2.getTransformacjaOdwrotna();
//            System.out.println(trr2);
//            Punkt p3 = trr2.transformuj(p2);
//            System.out.println(p3);
//        } catch (BrakTransformacjiOdwrotnejException ex) {
//            ex.printStackTrace();
//        }
//        System.out.println();




//        Zad3
//        try {
//            Punkt p1 = Punkt.O;
//            Transformacja t = new Obrot(90);
//            System.out.println();
//            System.out.println(p1);
//            Punkt p1_t = t.transformuj(p1);
//            System.out.println(p1_t);
//            System.out.println(t.getTransformacjaOdwrotna().transformuj(p1_t));
//
//            p1 = new Punkt(0,20);
//            System.out.println();
//            System.out.println(p1);
//
//            p1_t = t.transformuj(p1);
//            System.out.println(p1_t);
//            System.out.println(t.getTransformacjaOdwrotna().transformuj(p1_t));
//
//            p1 = new Punkt(-70,60);
//            t = new Obrot(30);
//            System.out.println();
//            System.out.println(p1);
//
//            p1_t = t.transformuj(p1);
//            System.out.println(p1_t);
//            System.out.println(t.getTransformacjaOdwrotna().transformuj(p1_t));
//        }
//        catch(BrakTransformacjiOdwrotnejException ex)
//        {
//            ex.printStackTrace();
//        }
//        System.out.println();




        // Lab3 in-class
        try {
            Punkt3D point1 = new Punkt3D(0, 0, 0);
            System.out.println(point1);

            Transformacja3D translation3D = new Translacja3D(5, 6, 7);
            System.out.println(translation3D);

            translation3D.transformuj3D(point1);
            Punkt3D p2;
            p2 = (Punkt3D) translation3D.transformuj3D(point1);
            System.out.println(p2);

            Transformacja3D reverseTransformation = translation3D.getTransformacjaOdwrotna();
            System.out.println(reverseTransformation);

            Punkt3D point3 = (Punkt3D) reverseTransformation.transformuj3D(p2);
            System.out.println(point3);

        } catch (BrakTransformacjiOdwrotnejException ex) {
            ex.printStackTrace();
        }
        System.out.println();



        try {
            Punkt3D point1 = new Punkt3D(1, 2, 3);
            Transformacja3D t = new Obrot3D(90);
            System.out.println();
            System.out.println(point1);
            Punkt p1_t = t.transformuj3D(point1);
            System.out.println(p1_t);
            System.out.println(t.getTransformacjaOdwrotna().transformuj3D((Punkt3D) p1_t));

            point1 = new Punkt3D(0,20, 40);
            System.out.println();
            System.out.println(point1);

            p1_t = t.transformuj3D(point1);
            System.out.println(p1_t);
            System.out.println(t.getTransformacjaOdwrotna().transformuj3D((Punkt3D) p1_t));

            point1 = new Punkt3D(-70,60, 30);
            t = new Obrot3D(30);
            System.out.println();
            System.out.println(point1);

            p1_t = t.transformuj3D(point1);
            System.out.println(p1_t);
            System.out.println(t.getTransformacjaOdwrotna().transformuj3D((Punkt3D) p1_t));
        }
        catch(BrakTransformacjiOdwrotnejException ex)
        {
            ex.printStackTrace();
        }
        System.out.println();



        try {
            Punkt3D point1 = new Punkt3D(2, 3, 4);
            Transformacja3D t = new ZlozenieTransformacji3D(new Transformacja3D[]{
                    new Obrot3D(180),
                    new Translacja3D(3, 4, 5),
            });
            System.out.println();
            System.out.println(point1);
            Punkt p1_t = t.transformuj3D(point1);
            System.out.println(p1_t);
            System.out.println(t.getTransformacjaOdwrotna().transformuj3D((Punkt3D) p1_t));
        } catch (BrakTransformacjiOdwrotnejException ex) {
                ex.printStackTrace();
        }
    }
}