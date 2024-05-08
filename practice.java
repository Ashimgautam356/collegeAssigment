import java.util.*;

public class practice {    

    static class Eulers{
        float x0, y0,z;
        float h,x2;  

        Eulers(float x0, float y0, float z , float h, float x2){
            this.x0 = x0; 
            this.y0 = y0 ; 
            this.z = z; 
            this.h = h; 
            this.x2 = x2;  
        }

        public float[] ans(){
            float  temp = y0; 
            while (x0 != x2) {
                
                y0 = y0 + (h*z);
                
                // let's suppose-------  6+3y-2z----- is the equation 
                // z = z + h* (6+(3*temp)-(2*z));
                
                // another equation for testing----- x^2z + 2xy----- 
                z= z + h*((x0*x0)*z + (2*x0*temp));
                temp = y0; 
                
                x0 += h; 
            }
            float ansers[] = new float[2];
            ansers[0] = y0; 
            ansers[1] = z; 
            return ansers; 
        }
    }

    public static void main(String args[]) {
    
    float x0= 0; 
    float y0= 1; 
    float z = 0;
    float h = 0.1f; 
    float x2 = 0.2f;
    
    Eulers obj1 = new Eulers(x0,y0,z,h,x2);

    float ans[] = obj1.ans();
    
    System.out.println(ans[0]+" "+ ans[1]);
    }
}
