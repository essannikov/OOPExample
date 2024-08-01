package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyClass {
    private int number;
    private String name = "default";

    public MyClass(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void printData(){
        System.out.println(number + " - " + name);
    }

    public static void main(String[] args){
        //MyClass myClass = new MyClass(1, "asd");

        try {
            //Constructor
            MyClass myClass = null;
            Class cl = Class.forName(MyClass.class.getName());
            //Class[] params = {int.class, String.class};
            //myClass = (MyClass) cl.getConstructor(params).newInstance(1,"default2");
            Constructor[] constructors = cl.getConstructors();
            Class[] params = constructors[0].getParameterTypes();
            myClass = (MyClass) cl.getConstructor(params).newInstance(1,"default3");

            //Field
            Field field = myClass.getClass().getDeclaredField("name");
            field.setAccessible(true);

            String name = (String) field.get(myClass);
            System.out.println(name);

            field.set(myClass, "new value");

            name = (String) field.get(myClass);
            System.out.println(name);

            //Method
            printDataObject(myClass);
        } catch (NoSuchFieldException | IllegalAccessException |
                 ClassNotFoundException | NoSuchMethodException |
                 InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public static void printDataObject(Object myClass){
        try {
            Method method = myClass.getClass().getDeclaredMethod("printData");
            method.setAccessible(true);
            method.invoke(myClass);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
