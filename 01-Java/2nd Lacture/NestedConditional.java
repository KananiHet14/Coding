public class NestedConditional {

    public static void main(String[] args) {

        int salary = 23500;

        if(salary <= 10000) {
            System.out.println(salary+=2000);
        } else if (salary <= 5000){
            System.out.println(salary+=3000);
        } else {
            System.out.println(salary+=1000);
        }
    }
}