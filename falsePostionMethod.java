public class falsePostionMethod {

//  here we are finding  the value of x 

    private static float findingX (float x, float y, float fx, float fy){
        float ans = ((x*fy) - (y*fx))/(fy - fx);
        return ans;
    } 



//  here we are finding the value of f(x) taking equation as x^3-x^2-1;

    private static float findingfX (float x){
        float ans = (float)(Math.pow(x, 3) - Math.pow(x, 2) -1);
        return ans;
    }




    public static float ans(float a, float b, float fa, float fb , float x, float fx){
        float temp =1000; 
        x = findingX(a,b,fa,fb);
        fx = findingfX(x);  

        while( (Math.round(fx *1000.0)/1000.0) != (Math.round(temp *1000.0)/1000.0)){

            if(fx<0 && fa>0 || fx>0 && fa<0){
                b = x; 
                fb = fx; 
                temp = fx; 
                x = findingX(a,b,fa,fb);
                fx = findingfX(x);
            }
            else if(fx<0 && fb>0 || fx>0 && fb<0){
                a =x; 
                fa = fx; 
                temp = fa; 
                x = findingX(a,b,fa,fb);
                fx = findingfX(x);
            }
        }
        return x;
    }
    public static void main(String args[]) {
    
        float root = ans(1f, 1.5f, -1f, 0.125f, -1, -1);

        System.out.println("the answer is "+ root);
    }

}


//  i have tested only one equation but  you can try more equation by changing it from the (line no 15 ) inside the f(x) funciton 
// also i have checked this equation in codesansar website the answer matche's my answer. 