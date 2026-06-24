import java.io.Serializable;
import java.io.*;
class Student implements Serializable{
    int id;
    String name;
    Student(int id,String name){
        this.id=id;
        this.name=name;
    }
}
public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student s1=new Student(101,"AKhi");
        FileOutputStream fout=new FileOutputStream("C:\\Users\\pagun\\OneDrive\\Desktop\\EthnoTech\\FileHandiling\\text.txt");
        ObjectOutputStream out=new ObjectOutputStream(fout);
        out.writeObject(s1);
        out.flush();
        out.close();
        System.out.println("success");
        FileInputStream fin=new FileInputStream("C:\\Users\\pagun\\OneDrive\\Desktop\\EthnoTech\\FileHandiling\\text.txt");
        ObjectInputStream in=new ObjectInputStream(fin);
        Student s2=(Student)in.readObject();
        System.out.println(s2.id+" "+s2.name);
        in.close();
    }
    
}
