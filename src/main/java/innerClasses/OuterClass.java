package innerClasses;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data                   // gettery, settery, toString
@AllArgsConstructor     // OuterClass(String title){...}
public class OuterClass {
    private String title;
    public InnerClass getInnerClassObject(String serialNumber){
        return new InnerClass(serialNumber);
    }
    public InnerClass getInnerClassDefaultObject(){
        return new InnerClass();
    }
    // klasa wewnętrzna
    @Data
    public class InnerClass{
        private String serialNo;
        // konstruktor klasy wewnętrznej
        InnerClass(String serialNo) {
            this.serialNo = serialNo;
            title = "title from inner class";
        }
        InnerClass(){}
        public void getInnerInfo(){
            System.out.println("SERIAL: " + serialNo);
            System.out.println("TITLE: " + title);
        }
    }
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass("Example");
        System.out.println(outerClass);
        // utworzenie instancji klasy wewnętrznej
        InnerClass innerClass1 = outerClass.new InnerClass("QWE!@#");
        // utworzenie instancji na podstawie metody
        InnerClass innerClass2 = outerClass.getInnerClassObject("QWER$#@!");
        InnerClass innerClass3 = outerClass.getInnerClassDefaultObject();
        System.out.println(innerClass2);
        System.out.println(innerClass3);
        innerClass2.getInnerInfo();
    }
}
