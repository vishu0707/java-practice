import jdk.dynalink.beans.StaticClass;

import java.io.FilterOutputStream;

public class Lambda {
     interface V {
         String str();
     }
    public static void main(String[] args) {
        V v = ()-> "Vishu";
        System.out.println();

        }
    }


