package cz.heroult.pavel.java.book.Kap18.S317;

/////////////////////////////////////////////////////////////////
//                                                             //
// Tento zdrojov� k�d je sou��st� distribuce bal�ku program�,  //
//     poskytovan�ch jako dopl�uj�c� informace ke knize        //
//                                                             //
//                  U�ebnice jazyka Java                       //
//                                                             //
//     P�e�t�te si, pros�m, d�kladn� upozorn�n� v souboru      // 
//                       CTI_ME.TXT                            //
//        kter� je ned�lnou sou��st� t�to distribuce           //
//                                                             //
//                 (c) Pavel Herout, 2000                      // 
//                                                             //
/////////////////////////////////////////////////////////////////

import java.io.*;
import java.util.*;

class ImplSerializable implements Serializable {
  Date d;
  ImplSerializable() { 
    d = new Date(); 
  }
}

public class Io21 {
  public static void main(final String[] argv)
                throws IOException, ClassNotFoundException {
    FileOutputStream fwJm = new FileOutputStream("datum.bin");
    ObjectOutputStream fw = new ObjectOutputStream(fwJm);

    Date d = new Date();
    System.out.println("Vznik: " + d);
    ImplSerializable impl = new ImplSerializable();
    System.out.println(impl.d.toString());
    fw.writeObject(d);
    fw.writeObject(impl);
    fwJm.close();
    d = null;      // zruseni instance
    impl = null;

    FileInputStream frJm = new FileInputStream("datum.bin");
    ObjectInputStream fr = new ObjectInputStream(frJm);
    d = (Date)fr.readObject();
    impl = (ImplSerializable)fr.readObject();
    fwJm.close();
    System.out.println("Cteni: " + d);
    System.out.println(impl.d.toString());
  }
}


