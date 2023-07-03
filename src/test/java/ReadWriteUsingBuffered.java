import java.io.*;

public class ReadWriteUsingBuffered {
    public static void main(String[] args) throws IOException {
        //For Read
        File f=new File("resources/TestFile.txt");
        FileReader fis=new FileReader(f.getAbsolutePath());
        BufferedReader br=new BufferedReader(fis);
        String s=br.readLine();

        //For Write.
        File fo=new File("resources/TestFilecopied.txt");
        FileWriter fio=new FileWriter(fo,true);
        BufferedWriter bw=new BufferedWriter(fio);

        while(s!=null){
            bw.write(s);
            s=br.readLine();
        }
        bw.flush();
        bw.close();
    }
}
