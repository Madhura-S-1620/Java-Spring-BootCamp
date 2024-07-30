//package serializableDemo;

import java.io.*;

public class BookSeri implements Serializable {
    int bid;
    String title;
   transient double price;

    public BookSeri(int i,String t,double p)
    {
        this.bid=i;
        this.title=t;
        this.price=p;
    }

    public static void main(String[] args) throws IOException,ClassNotFoundException {
        BookSeri bobj=new BookSeri(121,"Positive Thoughts",345.23);
        try {
            FileOutputStream  fos = new FileOutputStream("book.ser");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fos);

        objectOutputStream.writeObject(bobj);
            System.out.println("Book object serialized...");
            fos.close();
    }
        catch (Exception e)
        {
        e.printStackTrace();
        }
        FileInputStream fileInputStream=new FileInputStream("book.ser");
        ObjectInputStream objectOutputStream=new ObjectInputStream(fileInputStream);
        BookSeri book= (BookSeri) objectOutputStream.readObject();
        System.out.println(book.bid +" "+book.title + " " + book.price);
        fileInputStream.close();
    }

}