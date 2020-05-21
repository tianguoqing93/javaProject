package idea.java.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;

public class HelloWorld {




    private static final  int int_size=10;


    public static void main(String[] args) {

        //region Description
        getlist();

    }

    public static void getlist() {
        System.out.println("hello world!!");
        ArrayList list=new ArrayList();

        System.out.println("hello world!!");
        //endregion
        Date date = new Date();

        list.add(0, 123);

        System.out.println(list);
    }

    public void test()  {

        System.out.println("hello world!!");

        int number=10;
        try {
            FileInputStream fis=new FileInputStream("hello.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }




}
