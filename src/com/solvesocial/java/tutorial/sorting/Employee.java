package com.solvesocial.java.tutorial.sorting;

public class Employee {
        private int id;
        private String name;
        private long salary;

        public Employee(int id, String name, long salary) {
            this.id = id;
            this.name = name;
            this.salary = salary;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setSalary(long salary) {
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public long getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
}
