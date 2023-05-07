import java.util.Enumeration;
import java.util.Hashtable;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

class Main {
    public static void main(String[] args) {
        try {
            Hashtable <String, String> merge = new Hashtable<>();
            
            // Colocar os arquivos de teste aqui
            File file1 = new File("teste1.txt");
            File file2 = new File("teste2.txt");

            Scanner readFile1 = new Scanner(file1);
            Scanner readFile2 = new Scanner(file2);
            FileWriter fileWriter = new FileWriter("resultado.txt");

            while (readFile1.hasNextLine()) {
                String line = readFile1.nextLine();
                String[] data = line.split(";"); 
                
                merge.put(data[0], data[1]);
            }

            while (readFile2.hasNextLine()) {
                String line = readFile2.nextLine();
                String[] data = line.split(";"); 
                
                merge.put(data[0], data[1]);
            }

            Enumeration<String> keys = merge.keys();
            while (keys.hasMoreElements()) {
                String key = keys.nextElement();
                fileWriter.write(key + ";" + merge.get(key) + "\n");
            }
            fileWriter.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Erro.");
            e.printStackTrace();
        }
    }
}