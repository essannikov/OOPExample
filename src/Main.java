import abstract_factory.Form;
import abstract_factory.GUIFactory;
import abstract_factory.MacGUIFactory;
import abstract_factory.WindowsGUIFactory;
import adapters.*;
import bridges.User;
import bridges.UserImplDonkey;
import decorators.BrickHouse;
import decorators.Garage;
import decorators.House;
import decorators.SecondFloor;
import factory.Figure;
import factory.FigureFabrica;
import iterators.Word;
import observers.CatholicChurch;
import observers.Parishioner;
import observers.javasupport.CatholicChurch2;
import observers.javasupport.Parishioner2;
import oop.generics.CatBritain;
import oop.generics.Zoo;
import oop.inner_classes.Bicycle;
import oop.inner_classes_method_local.PhoneNumberValidator;
import oop.oop.ParentClass;
import strategies.Buddhism;
import strategies.Christianity;
import strategies.Islam;
import strategies.Judaism;

import java.time.LocalDateTime;
import java.util.*;

@Info(author = "ESSannikov", version = "1.0")
public class Main {
    public static void main(String[] args) {
        System.out.println("Method:");
        int income = (new Scanner(System.in)).nextInt();

        switch (income){
            case 1:
                //DataStr
                method1();
                break;
            case 2:
                //Factory
                method2();
                break;
            case 3:
                //Abstract Factory
                method3();
                break;
            case 4:
                //Decorator
                method4();
                break;
            case 5:
                //Adapter
                method5();
                break;
            case 6:
                //Bridge
                method6();
                break;
            case 7:
                //Strategy
                method7();
                break;
            case 8:
                //Observer
                method8();
                break;
            case 9:
                //Inner classes
                method9();
                break;
            case 10:
                //Inner local classes
                method10();
                break;
            case 11:
                //Generics
                method11();
                break;
            case 12:
                //TRY-CATCH-FINALLY
                method12();
                break;
            case 13:
                //Iterator
                method13();
                break;
            case 14:
                //Stack
                method14();
                break;
            case 15:
                //Annotation
                method15();
                break;
            case 16:
                //StringBuilder
                method16();
                break;
        }
    }

    public static void method16(){
        Integer a = new Integer(0);
        Integer b = new Integer(0);

        b = a;
        a = 1;
        System.out.println(a);
        System.out.println(b);

        //ParentClass parentClass = new ParentClass();

        StringBuilder sb = new StringBuilder("01234567");
        sb.append('8');
        sb.append('9');
        System.out.println(sb.substring(3));
        System.out.println(sb.replace(3,5, "ABCDE"));

        StringBuffer sbuf = new StringBuffer(sb);
        System.out.println(sbuf.reverse());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        localDateTime = localDateTime.plusSeconds(60*60*5);
        System.out.println(localDateTime);
    }

    public static void method15(){
        if (Main.class.isAnnotationPresent(Info.class)){
            Info info = (Info) Main.class.getAnnotation(Info.class);

            System.out.println(info.author() + " " + info.version());
        }
    }

    public static void method14(){
        /*
        //List
        List<String> arrayList = new ArrayList<>();
        arrayList.add("asd");
        arrayList.get(0);
        arrayList.remove(0);
        arrayList.remove("asd");

        List<String> linkedList = new LinkedList<>();
        linkedList.add("fff");
        linkedList.get(0);
        linkedList.remove(0);
        linkedList.remove("fff");
        */

        //Неизменяемый список
        //List<String> fake = Collections.nCopies(5, "Привет");
        //fake.remove(1); //Exception

        //Set
        /*
        Set<String> stringSet = new HashSet<>();
        stringSet.add("asd");
        stringSet.add("ddd");
        stringSet.add("asd");

        System.out.println(Collections.min(stringSet));

        stringSet.forEach(s -> System.out.println(s));
        */

        //Stack
        Stack<String> deck = new Stack<>();
        deck.push("First");
        deck.push("Second");
        deck.push("Third");

        System.out.println(deck.pop());
        System.out.println(deck.peek());

        deck.forEach(e -> System.out.println(e));

        //Hashtable
        Hashtable<Integer, String> hashtable = new Hashtable<>();
    }

    public static void method13(){
        //Iterator
        Word.Prefix prefix = new Word.Prefix("Пере");
        Word.Root root = new Word.Root("беж");
        Word.Suffix suffix = new Word.Suffix("к");
        Word.Ending ending = new Word.Ending("а");

        Word word = new Word(root, prefix, suffix, ending);
        Iterator wordIterator = word.iterator();
        while (wordIterator.hasNext()){
            Word.WordPart part = (Word.WordPart) wordIterator.next();
            System.out.println(part.getClass() + " : " + part.getWordPart());
        }
    }

    public static void method12(){
        int var1 = 1;
        int var2 = 0;

        try {
            var1 = var1 / var2;
        } catch (Exception e){
            //e.printStackTrace();
        } finally {
            System.out.println("End");
        }
    }

    public static void method11(){
        //Generics
        Zoo<CatBritain> zoo = new Zoo<>();
        zoo.setCat(new CatBritain("Garfield"));
        System.out.println(zoo.getCatName());
    }

    public static void method10(){
        //Inner local classes
        PhoneNumberValidator phone = new PhoneNumberValidator();
        phone.validatePhoneNumber("1234asd");
        phone.validatePhoneNumber("123456789");
        phone.validatePhoneNumber("+123456789");
    }

    public static void method9(){
        //Inner classes
        Bicycle bicycle = new Bicycle("Peugeot", 120);
        Bicycle.HandleBar handleBar = bicycle.new HandleBar();
        Bicycle.Seat seat = bicycle.new Seat();

        seat.up();
        bicycle.start();
        handleBar.left();
        handleBar.right();
    }

    public static void method8(){
        //Observer
        /*
        CatholicChurch church = new CatholicChurch();

        Parishioner parishioner1 = new Parishioner("Mike");
        Parishioner parishioner2 = new Parishioner("John");
        Parishioner parishioner3 = new Parishioner("Steve");

        church.registerObserver(parishioner1);
        church.registerObserver(parishioner3);

        church.setNews("Merry Christmas!");
        church.notifyObservers();
        */

        CatholicChurch2 church2 = new CatholicChurch2();

        Parishioner2 parishioner1 = new Parishioner2("Mike");
        Parishioner2 parishioner2 = new Parishioner2("John");
        Parishioner2 parishioner3 = new Parishioner2("Steve");

        church2.addPropertyChangeListner(parishioner1);
        church2.addPropertyChangeListner(parishioner2);

        church2.setNews("Easter!");
    }

    public static void method7(){
        //Strategy
        new Christianity().believe();
        new Buddhism().believe();
        new Islam().believe();
        new Judaism().believe();
    }

    public static void method6(){
        //Bridge
        User user = new User(new UserImplDonkey());
        user.run();
        user.transformToDragon();
        user.run();
    }

    public static void method5(){
        //Adapter
        AlphaList alphaList = AlphaListManager.createList();
        BetaListManager.saveList(new ListAdapter(alphaList));
    }

    public static void method4(){
        //Decorator
        House brickHouse = new Garage(new SecondFloor(new BrickHouse()));
        System.out.println(brickHouse.getInfo());
        System.out.println(brickHouse.getPrice());
    }

    public static void method3(){
        //Abstract Factory
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;

        switch (osName.substring(0,3)){
            case "win":
                guiFactory = new WindowsGUIFactory();
                break;
            case "mac":
                guiFactory = new MacGUIFactory();
                break;
            default:
                System.out.println("Unknown OS");
                return;
        }

        Form form = new Form(guiFactory);
        form.getButton().onClick();
        form.getTextField().onInputChanged();
    }

    public static void method2(){
        //Factory
        Figure obj = FigureFabrica.createFigure(1);
        obj.write();
    }

    public static void method1(){
        String str = "Hello world!";

        ArrayList<DataStr> data = new ArrayList<>();
        data.add(new DataStr("Fedor", "Moscow", 99));
        data.add(new DataStr("Mike", "Ekaterinburg", 87));
        data.add(new DataStr("Ilia", "St.Peterburg", 15));

        HashMap<String, DataStr> dataHash= new HashMap<>();
        dataHash.put("Fedor99", new DataStr("Fedor", "Moscow", 99));
        dataHash.put("Mike87", new DataStr("Mike", "Ekaterinburg", 87));

        //Sort
        data.sort(
                new Comparator<DataStr>() {
                    @Override
                    public int compare(DataStr o1, DataStr o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                }
        );
        System.out.println(data);

        Collections.sort(data); //MergeSort algorithm
        System.out.println(data);

        //Search
        int result = Collections.binarySearch(data, new DataStr("I", "St.Peterburg", 115));
        System.out.println(result);

        System.out.println(dataHash.get("Mike87"));

        System.out.println(str + " " + str.hashCode());

        //synchronized(DataStr.class){ };
    }
}