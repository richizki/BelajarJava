package Praktikum_1;

class highArray {
    private int[] arr;
    private int nElemen;

    public highArray(int max) {
        arr = new int[max];
        nElemen = 0;
    }

    public void  insert(int value) {
        arr[nElemen] = value;
        nElemen++;
    }

    public int find(int nilaiDicari) {
        int left = 0, panjangArray = arr.length -1;

        while (left <= panjangArray) {
            int middle = 1 + (panjangArray - 1) / 2;

            // cek jika nilai yang dicari berada di tengah
            if (arr[middle] == nilaiDicari)
                return middle;

            // jika nilai yang di cari lebih besar, abaikan sisi kiri
            if (arr[middle] < nilaiDicari)
                left = middle + 1;

            // jika nilai yang di cari lebih kecil, abaikan sisi kanan
            else
                panjangArray = middle - 1;
        }

        return -1;
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
        }
        System.out.println("");
    }

    public void size() {
        System.out.println("Jumlah elemen array = "+this.arr.length);
    }

    //buat method untuk mengurutkan
    public int sorted(int value) {
        if (nElemen >= arr.length)
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

        // ============ Start Of Insert in Sorted Array ========= //
        // isi angka
        arr.insert(10);
        arr.insert(20);
        arr.insert(30);
        arr.insert(40);
        arr.insert(50);

        // mendapatkan batas array
        // nilai baru yang akan ditambahkan
        int value = 35;

        System.out.print("\nSebelum di tambahkan: ");

        arr.display();

        // Inserting key
        arr.sorted(value);

        System.out.print("\nSetelah di tambahkan: ");

        arr.display();
        // ============ End Of Insert in Sorted Array ========= //

        // ============ Start Of Binary Search Array ========= //
        int nilaiDicari = 10;

        int result = arr.find(nilaiDicari);

        if (result == -1) {
            System.out.println("Nilai tidak ditemukan");
        } else {
            System.out.println("Nilai " + nilaiDicari + " berada di index ke = "+ result);
        }
        // ============ End Of Binary Search Array ========= //

        // ============ Start
    }
}
