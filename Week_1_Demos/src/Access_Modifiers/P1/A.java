package Access_Modifiers.P1;
import Access_Modifiers.P2.*;
public class A {
    public static void main(String[] args){
        C c = new C();
        /* this is spitting out an error because of the class method only being
        default
        /* anything with the default access modifier is only visible to anything in
        the same package
        System.out.println(c.defaultmessage);
         */
        System.out.println(c.publicmessage);
        protected String protectedmessage = "This is protected";

    }
}
