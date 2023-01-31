package UniversalPattern;



import java.util.Scanner;

public class Calculator<T> {
   public T add(T a, T b) {
       if (a.getClass().equals((Integer.class))) {
           return (T) (Object) ((Integer) a + (Integer) b);
       }
       if (a.getClass().equals((Double.class))) {
           return (T) (Object) ((Double) a + (Double) b);
       }
       return (T) (Object) 0;
   }
   public T subtract(T a, T b) {
       if (a.getClass().equals(Integer.class)) {
           return (T) (Object) ((Integer) a - (Integer) b);
       }
       if (a.getClass().equals(Double.class)) {
           return (T) (Object) ((Double) a - (Double) b);
       }
       return (T) (Object) 0;
   }
   public T multiply(T a, T b) {
       if (a.getClass().equals(Integer.class)) {
           return (T) (Object) ((Integer) a * (Integer) b);
       }
       if (a.getClass().equals(Double.class)) {
           return (T) (Object) ((Double) a * (Double) b);
       }
       return (T) (Object) 0;
   }
   public T divide(T a, T b) {
       if (a.getClass().equals(Integer.class)) {
           return (T) (Object) ((Integer) a / (Integer) b);
       }
       if (a.getClass().equals(Double.class)) {
           return (T) (Object) ((Double) a / (Double) b);
       }
       return (T) (Object) 0;
   }

}
