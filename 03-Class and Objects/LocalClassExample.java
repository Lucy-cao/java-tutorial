public class LocalClassExample {
    static String regularExpression = "[^0-9]";//匹配除了数字之外的所有字符

    public static void validatePhoneNumber(String phoneNumber1,String phoneNumber2){
        final int numberLength = 10;
        //在方法的内部定义了一个类
        class PhoneNumber{
            String formattedPhoneNumber = null;
            public PhoneNumber(String number){
                //regularExpression是外层类LocalClassExample的字段
                String curentNumber = number.replaceAll(regularExpression, "");
                //numberLength是方法的局部变量，并且
                if(curentNumber.length()==numberLength)
                    formattedPhoneNumber = curentNumber;
                else
                    formattedPhoneNumber = null;
            }

            public String getNumber(){
                return formattedPhoneNumber;
            }
        }

        PhoneNumber myNumber1=new PhoneNumber(phoneNumber1);
        PhoneNumber myNumber2=new PhoneNumber(phoneNumber2);

        System.out.println("Original numbers are " + phoneNumber1 +" and " + phoneNumber2);

        if(myNumber1.getNumber()==null)
            System.out.println(phoneNumber1 +" is invalid.");
        else
            System.out.println(phoneNumber1 +" is valid.");

        if(myNumber2.getNumber()==null)
            System.out.println(phoneNumber2 +" is invalid.");
        else
            System.out.println(phoneNumber2 +" is valid.");
    }

    public static void main(String[] args){
        validatePhoneNumber("123-456-7890", "456-7890");
    }
}
