import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.Assert;

//import org.junit.jupiter.api.DisplayName;
//import org.junit.jupiter.api.Test;
//import static org.junit.Assert.*;

class Task {
    private String title;
    private String description;
    private int priority;
    private boolean isComplete;
 
    public Task(String var1, String var2, int var3) {
       this.title = var1;
       this.description = var2;
       this.priority = var3;
       this.isComplete = false;
    }
 
    public String getTitle() {
       return this.title;
    }
 
    public String getDescription() {
       return this.description;
    }
 
    public int getPriority() {
       return this.priority;
    }
 
    public boolean isComplete() {
       return this.isComplete;
    }
 
    public void markComplete() {
       this.isComplete = true;
    }
 
    public String toString() {
       String var10000 = this.isComplete ? "[\u00e2\u0153\u201d] " : "[ ] ";
       return var10000 + "Title: " + this.title + ", Priority: " + this.priority + ", Description: " + this.description;
    }
 }
 

public class UT_Test {
   @Test
    public void TestExample(){
        
        Task task1 = new Task("Assignment Deadline", "submit the assignment", 1);
        Assertions.assertEquals(task1.getPriority(), 1);

        Assertions.assertEquals(task1.getTitle(), "Assignment Deadline");

        Assertions.assertEquals(task1.getDescription(), "submit the assignment");
    }
    
    
}
