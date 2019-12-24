package ming.main;

import ming.Util.Utils;
import ming.student.Student;
import ming.teacher.Teacher;

import java.util.ArrayList;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> arrayList = new ArrayList<>();
        ArrayList<Teacher> arrayTeachers = new ArrayList<>();
        while(true){
            System.out.println("请输入功能编号");
            System.out.println("1. 学员信息管理  2 教师信息管理  3 退出");
            int op = scanner.nextInt();
            switch (op){
                case 1:
                    studentManage(arrayList, scanner);
                    break;
                case 2:
                    teacherManage(arrayTeachers, scanner);
                    break;
                case 3:
                    System.out.println("谢谢使用， 拜拜");
                    System.exit(0);
                default:
                    System.out.println("请输入正确的数字");
                    break;
            }
        }
    }

    private static void teacherManage(ArrayList<Teacher> arrayList, Scanner scanner) {
        System.out.println("[教师信息管理]");
        System.out.println("1. 添加教师  2. 修改教师  3 删除教师  4 查询教师  5 返回");
        System.out.println();

        int op = scanner.nextInt();
        switch (op){
            case 1:
                addTeacher(arrayList, scanner);
                break;
            case 2:
                updateTeacher(arrayList, scanner);
                break;
            case 3:
                deleteTeacher(arrayList, scanner);
                break;
            case 4:
                selectTeacher(arrayList, scanner);
                break;
            case 5:
                System.out.println("谢谢使用 拜拜");
                System.exit(0);
            default:
                System.out.println("请输入正确的数字");
                break;
        }
    }

    // 查询教师
    private static void selectTeacher(ArrayList<Teacher> arrayList, Scanner scanner) {
        System.out.println("----------------------------");
        for (Teacher teacher : arrayList) {
            System.out.println(teacher);
        }
    }

    // 删除教师
    private static void deleteTeacher(ArrayList<Teacher> arrayList, Scanner scanner) {
        // 获取教师编号
        System.out.println("请输入教师编号");
        int id = scanner.nextInt();
        // 查询教师
        Teacher teacher = arrayList.get(id - 1);
        arrayList.remove(teacher);
    }

    // 更新教师
    private static void updateTeacher(ArrayList<Teacher> arrayList, Scanner scanner) {
       System.out.println("输入教师编号");
       int number = scanner.nextInt();
       System.out.println("获取教师对象");
       Teacher teacher = arrayList.get(number - 1);
       System.out.println("输入教师姓名");
       teacher.setName(scanner.nextLine());
       System.out.println("输入教师年龄");
       teacher.setAge(scanner.nextInt());
       System.out.println("输入教师生日");
       teacher.setBirthday(scanner.nextLine());
       System.out.println("输入教师性别");
       teacher.setSex(scanner.nextLine());

    }

    // 添加教师
    private static void addTeacher(ArrayList<Teacher> arrayList, Scanner scanner) {
        System.out.println("[添加教师]");
        System.out.println("输入教师姓名");
        String name = scanner.next();
        System.out.println("输入教师性别");
        String sex = scanner.next();
        System.out.println("输入出生日期");
        String birthday = scanner.next();
        System.out.println("输入教师年龄");
        int age = scanner.nextInt();
        Teacher teacher = new Teacher();
        teacher.setName(name);
        teacher.setSex(sex);
        teacher.setAge(age);
        teacher.setBirthday(birthday);
        teacher.setId(++Utils.teaId);
        arrayList.add(teacher);
    }

    private static void studentManage(ArrayList<Student> arrayList, Scanner scanner) {
        System.out.println("[学员信息管理]");
        System.out.println("1. 添加学员   2. 修改学员  3. 删除学员   4. 查询学员   5. 返回 ");
        System.out.println();
        int op = scanner.nextInt();
        switch (op){
            case 1:
                addStudent(arrayList, scanner);
                break;
            case 2:
                updateStudent(arrayList, scanner);
                break;
            case 3:
                deleteStudent(arrayList, scanner);
                break;
            case 4:
                queryStudent(arrayList, scanner);
                break;
            case 5:
                return;
            default:
                System.out.println("请输入正确的数字");
                break;
        }
    }

    private static void queryStudent(ArrayList<Student> arrayList, Scanner scanner) {
        if(arrayList.size()==0){
            System.out.println("查询无数据");
            return;
        }
        Utils.printPersonList(arrayList);
    }

    // 删除学员
    private static void deleteStudent(ArrayList<Student> arrayList, Scanner scanner) {
        System.out.println("请输入要删除的学员");
        int id = scanner.nextInt();
        // 从集合中获取到学员对象
        Student student = arrayList.remove(id - 1);
    }

    private static void updateStudent(ArrayList<Student> arrayList, Scanner scanner) {
        System.out.println("请输入要更新的学员编号");
        int id = scanner.nextInt();
        // 从集合中获取到学员对象
        Student student = arrayList.get(id - 1);
        // 对数据进行更新
        System.out.println("请输入更新后的学员姓名");
        student.setName(scanner.next());
        System.out.println("请输入学员性别");
        student.setSex(scanner.next());
        System.out.println("请输入学员生日日期(yyyy-MM-dd)");
        student.setBirthday(scanner.next());
        System.out.println("请输入更新后的学员年龄");
        student.setAge(scanner.nextInt());
    }

    // 增加学员
    private static void addStudent(ArrayList<Student> arrayList, Scanner scanner) {
        System.out.println("请输入学员姓名");
        String name = scanner.next();
        System.out.println("请输入学员性别");
        String sex = scanner.next();
        System.out.println("请输入学员生日日期(yyyy-MM-dd)");
        String birthday = scanner.next();
        Student student = new Student();
        student.setName(name);
        student.setSex(sex);
        student.setBirthday(birthday);
        student.setId(++Utils.stuId);
        arrayList.add(student);
        System.out.println("学员信息添加成功");
    }
}

