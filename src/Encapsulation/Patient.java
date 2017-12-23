package Encapsulation;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Patient {

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<0){
            System.out.println("Age must be greater than 0");
        }else {
            this.age = age; }

    }
}
