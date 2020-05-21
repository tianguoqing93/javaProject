package idea.java.project;

import idea.java.module.customer;

import java.util.ArrayList;

/**
 * @author tiangq
 * @date 2020/5/21 - 17:54
 */
public class Templates {

    //模板6：prsf/psf/psfi
    private static final customer CUST=new customer();

    //模板1：main
    public static void main(String[] args) {
        //模板2:sout/soutp/soutv/soutm
        System.out.println();
        int num1 = 10;
        System.out.println("num1 = " + num1);

        //模板3：fori/iter(foreach)
        String[] a = new String[]{"tom", "lilei", "jory"};
        for (String s : a) {
            System.out.println(s);
        }
        //模板4：list.for(需要有集合) /ifn/ifnn
        ArrayList list = new ArrayList();
        list.add(1, 123);
        list.add(2, 223);
        list.add(3, 323);
        list.get(2);

        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        if (list == null) {

        }


    }


}
