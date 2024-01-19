package firstProgram;

import java.util.Scanner;

public class casePercabangan {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan Nilai: ");
        int nilai = scanner.nextInt();
        char grade;

        switch (nilai) {
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
                grade = 'A';
                break;
            case 81:
            case 82:
            case 83:
            case 84:
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
                grade = 'B';
                break;
            case 71:
            case 72:
            case 73:
            case 74:
            case 75:
            case 76:
            case 77:
            case 78:
            case 79:
            case 80:
                grade = 'C';
                break;
            default:
                grade = 'D';
        }
        System.out.println("Grade adalah = " + grade);
    }
}