package com.company;


import java.util.*;
import java.util.stream.Collectors;



public class Main {
    static class Student {
        private String name;
        private List<Main.Student.Course> courses;

        public Student(String name, List<Main.Student.Course> courses) {
            this.name = name;
            this.courses = courses;
        }

        static class Course {
            String courseName;

            public Course(String courseName) {
                this.courseName = courseName;
            }
        }
        private static void streamSimpleTask() {
            List<Main.Student.Course> = new ArrayList<>(Arrays.asList(
                        new Main.Student.Course("maths"),
                        new Main.Student.Course("english"),
                        new Main.Student.Course("physics"),
                        new Main.Student.Course("chemistry"),
                        new Main.Student.Course("chess"),
                        new Main.Student.Course("swimming"),
                        new Main.Student.Course("gymnastics"),
                        new Main.Student.Course("programming")
            ));
            List<Main.Student> students = new ArrayList<>(Arrays.asList(
                    new Main.Student("Student1", ArrayList < "physics", "chemistry" >),
                    new Main.Student("Student2", ArrayList < "chess", "gymnastics" >),
                    new Main.Student("Student3", ArrayList < "english", "swimming", "programming" >),
                    new Main.Student("Student4", ArrayList < "physics", "maths", "programming" >),
                    new Main.Student("Student5", ArrayList < "gymnastics" >),
                    new Main.Student("Student6", ArrayList < "english" >),
                    new Main.Student("Student7", ArrayList < "programming" >),
                    new Main.Student("Student8", ArrayList < "physics", "english", "maths" >)
            ));
        }

        public static void main(String[] args) {
            try {
                List<Main.Student> students = getList();
                System.out.println("+++++++++++++++++++++++++++++++++++++++");
                students.stream().filter(student -> {
                    return student.course.size() == 3;
                }).flatMap(student -> student.courses.stream()).collect(Collectors.toSet()) (courses -> {
                    System.out.println(course.courseName);
                });
                private static List<Main.Student> getList ();
            } catch () {
                continue;
            }
        }
    }
}


