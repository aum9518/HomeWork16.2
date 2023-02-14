import java.beans.beancontext.BeanContext;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Backend [] array = {new Java(),new Csharp(),new Python()};
        for (Backend a:array) {
            System.out.println(a.getClass());
            if (a instanceof Java){
                Java java = (Java) a;
               java.spring();
            } else if (a instanceof  Csharp) {
               Csharp cSharp = (Csharp) a;
                cSharp.dotNot();
            } else if (a instanceof Python) {
                Python python = (Python) a;
                python.django();
            }

        }
    }
}