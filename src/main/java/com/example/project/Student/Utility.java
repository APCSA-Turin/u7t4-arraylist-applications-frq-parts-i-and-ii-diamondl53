package com.example.project.Student;
import java.util.ArrayList;
import java.util.Arrays;

public class Utility {
    public static void main(String[] args) {
        Student s1 = new Student("Abby", "Smith", 96.7);
        Student s2 = new Student("Michelle", "Jones", 98.1);
        Student s3 = new Student("Chase", "Bean", 95.2);
        Student s4 = new Student("Jack", "Clancy", 97.3);
        Student s5 = new Student("Brittany", "Jones", 95.5);
        Student s6 = new Student("Lisa", "Frank", 92.4);
        Student s7 = new Student("Marie", "Angelina", 96.5);
        Student s8 = new Student("Peter", "Frank", 97.9);
        Student s9 = new Student("Lisa", "Frank", 99.5);
        Student s10 = new Student("Dean", "Jones", 93.2);
        
        ArrayList<Student> students = new ArrayList<Student>(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10));
        System.out.println(sortStudents(students));
    }
    public static ArrayList<Student> sortStudents(ArrayList<Student> list){
        //String firstLastName = list.get(0).getLastName();
        // ArrayList<Student> sortedList = new ArrayList<Student>();
        // String str;
        // int index;
        // while(list.size() != 0){
        //     index = 0;
        //     str = "";
        //     Student firstLastName = list.get(0);
        //     for(int i = 1; i < list.size(); i++){
        //         str = list.get(i).getLastName();
        //         if(str.compareTo(firstLastName.getLastName())<0){
        //             firstLastName = list.get(i);
        //             index = i;
        //         }
        //     }
            
        //     sortedList.add(firstLastName);
        //     list.remove(index);
            
            
        // }
        // ArrayList<Student> newList = new ArrayList<Student>();
        // newList = sortedList;
        // ArrayList<Integer> indexesRepeatLastName = new ArrayList<Integer>();
        
        // while(newList.size() != 0){
        //     String lastName = newList.get(0).getLastName();
        
        // for(int i = 1; i < newList.size(); i++){
        //     if(newList.get(i).getLastName().equals(lastName)){
        //         indexesRepeatLastName.add(i);
        //         newList.remove(i);
                
        //     }
        // }
        
        // }
        // return sortedList;
        int n = list.size();

        
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                
                if (list.get(j).getLastName().compareTo(list.get(minIndex).getLastName()) < 0) {
                    minIndex = j;
                }
                
                else if (list.get(j).getLastName().equals(list.get(minIndex).getLastName())) {
                    if (list.get(j).getFirstName().compareTo(list.get(minIndex).getFirstName()) < 0) {
                        minIndex = j;
                    }
                    
                    else if (list.get(j).getFirstName().equals(list.get(minIndex).getFirstName())) {
                        if (list.get(j).getGpa() > list.get(minIndex).getGpa()) {
                            minIndex = j;
                        }
                    }
                }
            }
           
            Student temp = list.get(minIndex);
            list.set(minIndex, list.get(i));
            list.set(i, temp);
        }
        return list;
    }
    }


