package demo.Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class ExceptionDemo {

    // =========================
    // Ví dụ 1: Checked Exception – xử lý bằng try-catch
    // =========================
    public static void checkedExceptionTryCatch() {
        long StartTime = System.nanoTime();
        System.out.println("=== Checked Exception: try-catch ===");

        try {
            FileReader reader = new FileReader("file.txt");
            System.out.println("Đang đọc file...");
            reader.close();
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
        long EndTime = System.nanoTime();
        System.out.println(StartTime+" "+EndTime);
    }

    // =========================
    // Ví dụ 2: Checked Exception – sử dụng throws
    // =========================
    public static void checkedExceptionThrows() throws IOException {
        System.out.println("\n=== Checked Exception: throws ===");
        FileReader reader = new FileReader("file.txt"); // Nếu file không có => lỗi
        System.out.println("Đã mở file thành công!");
        reader.close();
    }

    // =========================
    // Ví dụ 3: try-with-resources – tự động đóng file
    // =========================
    public static void tryWithResources() {
        System.out.println("\n=== Checked Exception: try-with-resources ===");
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line = reader.readLine();
            System.out.println("Nội dung dòng đầu: " + line);
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file bằng try-with-resources: " + e.getMessage());
        }
    }

    // =========================
    // Ví dụ 4: Unchecked Exception – runtime error
    // =========================
    public static void uncheckedExceptionExample() throws IOException {
        System.in.close();
        System.out.println("\n=== Unchecked Exception ===");

        String name = null;
        name.hashCode();
        System.out.println("Chiều dài tên: " + name.length()); // NullPointerException
    }

    // =========================
    // Main method
    // =========================
    public static void main(String[] args) throws IOException {
        // Ví dụ 1
        checkedExceptionTryCatch();

        // Ví dụ 2: xử lý throws
        try {
            checkedExceptionThrows();
        } catch (IOException e) {
            System.out.println("Lỗi được đẩy lên main(): " + e.getMessage());
        }

        // Ví dụ 3
        tryWithResources();

        // Ví dụ 4
        uncheckedExceptionExample();
    }
}
