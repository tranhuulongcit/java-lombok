package info.cafeit;

import info.cafeit.advance.Person;
import info.cafeit.basic.Employee;
import lombok.Cleanup;
import lombok.Synchronized;
import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Date;

@Slf4j
public class Main {
    public static void main(String... args) throws IOException {
        System.out.println("---------Lombok basic----------");
        Employee emp1 = new Employee(1l);
        Employee emp2 = new Employee(1l, "Long", "Trần");
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp1.equals(emp2));


        System.out.println("---------Lombok basic----------");
        Person longtran = Person.builder().id(197379230l).name("Long Tran").gender(1).birthDay(new Date()).build();
        System.out.println(longtran);

        log.info("Đây là log được log ra bằng log4j2");

        @Cleanup InputStream is = null;
        @Cleanup BufferedReader reader = null;
        StringBuilder buf = new StringBuilder();

        is = new FileInputStream(new File("src/main/resources/test.txt"));
        reader = new BufferedReader(new InputStreamReader(is));
        String str;
        while ((str = reader.readLine()) != null) {
            buf.append(str);
        }
        System.out.println(buf.toString());

    }

    @Synchronized
    public int test(int a, int b) {
        return a + b;
    }

}
