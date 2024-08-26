package javaPractice;
import java.io.*;

public class FileInputStreams {

	public static void main(String[] args) throws Exception {
FileInputStream fi=new FileInputStream("C:\\Users\\LENOVO\\Desktop\\javaprograms\\first.txt");
int i=fi.read();
while(i!=-1)
{
	System.out.print((char)i);
	i=fi.read();

}
fi.close();
}
}