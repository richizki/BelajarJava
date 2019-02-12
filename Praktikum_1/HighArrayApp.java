package Praktikum_1;

class highArray {
    public int[] arr;
    private int nElemen;

    public highArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void  insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public boolean find(int key) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (arr[i] == key) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            return true;
        }
    }

    public boolean delete(int value) {
        int i;
        for (i = 0; i < nElemen; i++) {
            if (value == arr[i]) {
                break;
            }
        }
        if (i == nElemen) {
            return false;
        } else {
            for (int j = i; j < nElemen; j++)
                arr[j] = arr[j + 1];
        }
        nElemen--;
        return true;
    }

    public void display() {
        for (int i = 0; i < nElemen; i++) {
            System.out.print(arr[i] + " ");
        } System.out.println("");
    }

    public void size() {
        System.out.println("Jumlah elemen array = "+this.arr.length);
    }

    //buat method untuk mengurutkan
    public int sorted(int arr[], int value, int batas) {
        if (nElemen >= batas)
            return nElemen;

        int i;
        for (i=nElemen-1; (i >= 0 && arr[i] > value); i--)
            arr[i+1] = arr[i];

        arr[i+1] = value;

        return nElemen++;
    }
}

public class HighArrayApp {
    public static void main(String[] args) {
        int maxSize = 9;
        highArray arr;
        arr = new highArray(maxSize);

        // isi angka
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);

        // mendapatkan batas array
        int batas = arr.arr.length;
        // nilai baru yang akan ditambahkan
        int value = 30;

        System.out.print("\nSebelum di tambahkan: ");

        arr.display();

        // Inserting key
        arr.sorted(arr.arr, value, batas);

        System.out.print("\nSetelah di tambahkan: ");

        arr.display();
    }
}
