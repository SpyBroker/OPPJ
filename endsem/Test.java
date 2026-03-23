import java.io.*;

class Test{

public static void main(String args[]) throws IOException{

int i=0;

FileInputStream fin;

FileOutputStream fout=new FileOutputStream("xyz.txt");;

try{

fin=new FileInputStream("abc.txt");

} catch(FileNotFoundException e){ System.out.println("File Not Found"); return; }


try{

do{

i=fin.read();

if(i!=-1)

fout.write(i); }while(i!=-1);

}

catch(IOException e){

System.out.println("File Error");

}

fin.close();

fout.close();

}

}