public class Upcasting{
    public static void main (String[] args){
        Person p;
        Student s= new Student("이재문");
        p=s; //업캐스팅

        System.out.println(p.name);
    }
}