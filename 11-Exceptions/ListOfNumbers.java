import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListOfNumbers {
    private List<Integer> list;
    private static final int SIZE = 10;

    public ListOfNumbers() {
        list = new ArrayList<>();
        for (int i = 0; i < SIZE; i++) {
            list.add(i);
        }
    }

    public void WriteList() throws IOException {
        PrintWriter out = null;
        FileWriter f = null;
        try {
            f = new FileWriter("OutFile.txt");
            //PrintWriter继承于Writer，Writer实现了Closeable，所以最后需要关闭资源
            out = new PrintWriter(f);

            for (int i = 0; i < SIZE; i++) {
                out.println("Value at " + i + " = " + list.get(i));
            }
        } catch (IOException ex) {
            System.out.println("IOException: " + ex.getMessage());
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("IndexOutOfBoundsException: " + ex.getMessage());
        } finally {
            System.out.println("finally语句");
            if (out != null) {
                System.out.println("PrintWriter打开了，需要关闭");
                out.close();
            } else {
                System.out.println("PrintWriter未打开");
            }
            if (f != null) {
                System.out.println("FileWriter打开了，需要关闭");
                f.close();
            }
        }
    }

    public void WriteList2() {
        //try-with-resource可以自动清理打开的语句
        try (FileWriter f = new FileWriter("OutFile.txt");
             PrintWriter out = new PrintWriter(f)) {
            for (int i = 0; i < SIZE; i++) {
                out.println("Value at " + i + " = " + list.get(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void recordException() {
        try {
            Handler handler = new FileHandler("out.log");
            Logger.getLogger("").addHandler(handler);
            throw new IOException();
        } catch (IOException e) {
            Logger logger = Logger.getLogger("recordException111");
            StackTraceElement[] elements = e.getStackTrace();
            for (StackTraceElement element : elements) {
                logger.log(Level.WARNING, element.getMethodName());
            }
        }
    }

    public static void testNewApiException() {
        try {
            throw new ApiException("500", "服务器内部错误");
        } catch (ApiException e) {
            System.out.println(e.getRetCd() + " " + e.getMsgDes());
        }

    }

    public static void readList() {
        //exercises 1
        try (InputStream in = Files.newInputStream(Paths.get("intValues.txt"))) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            String line = null;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void cat(File file) {
        //exercises 2
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
            return;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    System.out.println("fail to close");
                }
            }
        }
    }

    public static void main(String[] args) {
//        recordException();
//        testNewApiException();
        readList();
    }
}
