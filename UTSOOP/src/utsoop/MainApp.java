package utsoop;

import java.util.Scanner;

import java.util.Scanner;

public class MainApp {  // Nama kelas adalah MainApp, tanpa ekstensi .java
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Membuat objek Scanner untuk membaca input pengguna
        NoteApp noteApp = new NoteApp(); // Membuat objek NoteApp
        int pilihan;

        do {
            // Menampilkan menu
            System.out.println("\n=== MENU APLIKASI CATATAN ===");
            System.out.println("1. Tambah Catatan");
            System.out.println("2. Tampilkan Catatan");
            System.out.println("3. Ubah Catatan");
            System.out.println("4. Hapus Catatan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt(); // Membaca input pilihan menu
            scanner.nextLine(); // Membersihkan newline setelah nextInt()

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan catatan baru: ");
                    String catatan = scanner.nextLine(); // Membaca input catatan
                    noteApp.tambahCatatan(catatan); // Menambah catatan
                    break;

                case 2:
                    noteApp.tampilkanCatatan(); // Menampilkan catatan
                    break;

                case 3:
                    noteApp.tampilkanCatatan(); // Menampilkan catatan yang ada
                    System.out.print("Masukkan nomor catatan yang ingin diubah: ");
                    int indexUbah = scanner.nextInt() - 1; // Mengurangi 1 karena indeks dimulai dari 0
                    scanner.nextLine(); // Membersihkan newline
                    System.out.print("Masukkan catatan baru: ");
                    String catatanBaru = scanner.nextLine();
                    noteApp.ubahCatatan(indexUbah, catatanBaru); // Mengubah catatan
                    break;

                case 4:
                    noteApp.tampilkanCatatan(); // Menampilkan catatan yang ada
                    System.out.print("Masukkan nomor catatan yang ingin dihapus: ");
                    int indexHapus = scanner.nextInt() - 1; // Mengurangi 1 karena indeks dimulai dari 0
                    scanner.nextLine(); // Membersihkan newline
                    noteApp.hapusCatatan(indexHapus); // Menghapus catatan
                    break;

                case 5:
                    System.out.println("👋 Terima kasih! Keluar dari aplikasi.");
                    break;

                default:
                    System.out.println("❗ Pilihan tidak valid, coba lagi.");
            }

        } while (pilihan != 5); // Mengulang menu sampai pilihan 5 dipilih untuk keluar

        scanner.close(); // Menutup objek scanner setelah selesai
    }

    private static class NoteApp {

        public NoteApp() {
        }

        private void tambahCatatan(String catatan) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void tampilkanCatatan() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void ubahCatatan(int indexUbah, String catatanBaru) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private void hapusCatatan(int indexHapus) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
