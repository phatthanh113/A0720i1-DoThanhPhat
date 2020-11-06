package _12_map.exercise.array_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ProductManager {
    public static ArrayList<Product> productArrayList = new ArrayList<Product>();
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        showMenu();
    }

    private static void showMenu() {
        System.out.println("1.add\n" +
                "2.Edit\n" + "3.Delete\n" + "4.Print\n" + "5.Search\n" + "6.Sort\n");
        int choice = scanner.nextInt();
        while (true) {
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    print();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    sort();
                    break;
                default:
                    break;
            }
        }
    }

    //    Thêm sản phẩm
    public static void add() {
        int id = 0;
        Scanner scanner = new Scanner(System.in);
        if (productArrayList.isEmpty()) {
            id = 0;
        } else {
            id = productArrayList.size();
        }
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input price");
        Integer price = scanner.nextInt();
        productArrayList.add(new Product(name, id, price));
        showInfo();
        showMenu();
    }


    //    Sửa thông tin sản phẩm
    public static void edit() {
        System.out.println("input id cần sửa");
        int choice = scanner.nextInt();
//        yêu cầu người dùng nhập thông tin sửa

        scanner.skip("\n");
        System.out.println("input name");
        String name = scanner.nextLine();
        System.out.println("input price");
        Integer price = scanner.nextInt();

        productArrayList.get(choice).setName(name);
        productArrayList.get(choice).setPrice(price);
        showInfo();
        showMenu();
    }

    private static void showInfo() {
        for (Product product : productArrayList) {
            System.out.println(product);
        }
    }

    //   Xóa sản phẩm theo id
    public static void delete() {
        System.out.println("input id cần xóa");
        int choice = scanner.nextInt();
        productArrayList.remove(choice);
        showInfo();
        showMenu();
    }

    //    Hiển thị thông tin sản phẩm
    public static void print() {
        System.out.println("Bạn muốn xem thông tin sản phẩm nảo");
        for (int i = 0; i < productArrayList.size(); i++) {
            System.out.println(i + " " + productArrayList.get(i).getName());
        }
        int choice = scanner.nextInt();
        System.out.println(productArrayList.get(choice-1));
    }
//Tìm kiếm sản phẩm
    public static void search() {
        System.out.println("Nhập tên bạn muốn tìm");
        scanner.skip("\n");
        String name = scanner.nextLine();
        name.toLowerCase();
        boolean temp = false;
        for (int i = 0; i < productArrayList.size(); i++) {
            if (productArrayList.get(i).getName().equals(name)) {
                System.out.println(productArrayList.get(i));
                temp = true;
            }
        }
        if (!temp) System.out.println("Không có sản phẩm trong giỏ");
        showMenu();
    }
//Sắp xếp sản phẩm theo giá tăng hoặc giảm
    public static void sort() {
        ComparatorUp comparatorUp = new ComparatorUp();
        ComparatorDown comparatorDown = new ComparatorDown();
        System.out.println("Bạn muốn hiển thị danh sách theo giá tăng hay giảm  Up/Down");
        scanner.skip("\n");
        String choice = scanner.nextLine();
        choice.toLowerCase();
        if (choice.equals("up")) {
            Collections.sort(productArrayList, comparatorUp);
        } else if (choice.equals("down")) {
            Collections.sort(productArrayList, comparatorDown);
        } else System.out.println("Không có sự lựa chọn này");
        showInfo();
        showMenu();
    }
}
