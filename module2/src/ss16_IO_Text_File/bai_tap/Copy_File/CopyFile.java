package ss16_IO_Text_File.bai_tap.Copy_File;

import javax.imageio.stream.ImageInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CopyFile {
    public static void copyFile(File initial, File copy) throws IOException {
        Files.copy(initial.toPath(), copy.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập file cần copy : ");
        String initialPath = scanner.nextLine();
        System.out.println("Nhập file muốn copy qua : ");
        String copyPath = scanner.nextLine();

        File initialFile = new File(initialPath);
        if (!initialFile.exists()) {
            System.out.println("File không tồn tại");
            return;
        }

        File copyFile = new File(copyPath);
        if (copyFile.exists()) {
            System.out.println("Tệp đích đã tồn tại");
            return;
        }
        copyFile(initialFile, copyFile);
        try {
            FileReader fileReader = new FileReader(copyFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            int count = 0;
            String temp[];
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                count += line.length();
            }
            System.out.println("Tổng số ký tự copy là : " + count);
        } catch (Exception exception) {
            System.out.println("Không copy file được.");
        }
    }
}

