package idea.java.module;

/**
 * 文档注释
 */
public class customer extends persion{


    private  String name;
    private  String classname;


    public customer() {

    }

    public customer(String name, String classname) {
        this.name = name;
        this.classname = classname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public void  eat(){
        System.out.println("客户吃饭");
    }

}
