public class Calculator { 
    public int div(int a, int b) { 
        if (b == 0) throw new IllegalArgumentException("Division by zero"); 
        return a / b; 
    } 
} 