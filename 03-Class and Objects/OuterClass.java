public class OuterClass {
    String outerField = "Outer Field";
    static String staticOuterField = "Static Outer Field";

    class InnerClass{//内部类
        void accessMembers(){
            System.out.println(outerField);
            System.out.println(staticOuterField);
        }
    }

    //静态嵌套类
    static class StaticNestedClass{
        void accessMembers(OuterClass outerObj){
            //报错：Non-static field 'outerField' cannot be referenced from a static context
            //System.out.println(outerField);
            System.out.println(outerObj.outerField);
            System.out.println(staticOuterField);
        }
    }

    public static void main(String[] args){
        //创建内部类实例
        OuterClass outObj = new OuterClass();
        OuterClass.InnerClass innerObj =  outObj.new InnerClass();
        innerObj.accessMembers();

        System.out.println("=============");

        //创建内部嵌套类实例
        StaticNestedClass staticNestedObj = new StaticNestedClass();
        staticNestedObj.accessMembers(outObj);

        System.out.println("=============");

        //创建内部嵌套类实例
        TopLevelClass topLevelObj = new TopLevelClass();
        topLevelObj.accessMembers(outObj);
        System.out.println("=============");
    }
}
