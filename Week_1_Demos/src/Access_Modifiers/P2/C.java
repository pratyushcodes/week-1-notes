package Access_Modifiers.P2;
import Access_Modifiers.P1.*;

public class C {
    public String publicmessage = "this is public"; /* this
    is accessible by anyone in any package because its public, plain
     and simple*/
    String defaultmessage = "this is the default";
    String protectedmessage = "this is protected"; /* something that is protected
    is visible to a different class in a different package as long as that class is
    a subclass */
}