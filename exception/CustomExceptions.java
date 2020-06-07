package com.StudentMarksDirectory.exception;

public class CustomExceptions extends Exception {

    public static class NullMarksArrayException extends Exception{
        public String toString(){
            return "NullMarksArrayException occurred";
        }
    }
    public static class NullNameException extends Exception {
        public String toString(){
            return "NullNameException occurred";
        }
    }

    public static class NullStudentException extends Exception {
        public String toString(){
            return "NullStudentException occurred";
        }
    }
}

