package risnadona.net.ormawapolines;

import android.content.Intent;

import java.util.ArrayList;

public class HmjData {
    public static String [][] data = new String[][]{
            {"0","HMJ Teknik Elektro", "Himpunan Mahasiswa Jurusan Teknik Elektro adalah salah satu Himpunan " +
                    "Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi" +
                    " kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik" +
                    " Elektro untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi","https://i.postimg.cc/QxdcLRBk/hme.jpg"},
            {"1","HMJ Teknik Sipil", "Himpunan Mahasiswa Jurusan Teknik Sipil adalah salah satu Himpunan " +
                    "Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi " +
                    "kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik " +
                    "Sipil untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi","https://i.postimg.cc/yxBXSxYw/hms.jpg"},
            {"2","HMJ Teknik Mesin", "Himpunan Mahasiswa Jurusan Teknik Mesin adalah salah satu Himpunan " +
                    "Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi" +
                    " kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan Teknik Mesin " +
                    "untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi","https://i.postimg.cc/LsL1BS7R/hmm.jpg"},
            {"3","HMJ Akuntansi", "Himpunan Mahasiswa Jurusan Akutansi adalah salah satu Himpunan Mahasiswa" +
                    " Jurusan yang ada di Politeknik Negeri Semarang yang merupakan organisasi kemahasiswaan " +
                    "di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan akutansi untuk melaksanakan" +
                    " kegiatan Tri Dharma Perguruan Tinggi","https://i.postimg.cc/3NS4Jxyj/hmak.jpg"},
            {"4","HMJ Administrasi Bisnis", "Himpunan Mahasiswa Jurusan Administrasi Bisnis adalah salah " +
                    "satu Himpunan Mahasiswa Jurusan yang ada di Politeknik Negeri Semarang yang merupakan" +
                    " organisasi kemahasiswaan di tingkat jurusan, yang dibentuk oleh mahasiswa Jurusan" +
                    " Administrasi Bisnis untuk melaksanakan kegiatan Tri Dharma Perguruan Tinggi","https://i.postimg.cc/pLYvD1Z4/hmab.jpg"},
            {"5","UKM PCC", "Unit Kegiatan Mahasiswa Polytechnic Computer Club atau biasa disingkat" +
                    " UKM PCC, merupakan organisasi di Politeknik Negeri Semarang yang bergerak " +
                    "di bidang informasi dan teknologi. UKM Polytechnic Computer Club secara eksplisit" +
                    " terbagi menjadi dua bagian inti, yaitu Workshop dan Organisasi","https://i.postimg.cc/8PGrdsgC/pcc.png"},
            {"6","UKM Konsep", "UKM Komunitas Seni Polines merupakan satu-satunya unit kegiatan mahasiswa" +
                    " di Politeknik Negeri Semarang yang bergerak di bidang Kesenian. Nama UKM Komunitas " +
                    "Seni Polines diresmikan pada tanggal 21 Juni 2003. Fungsi UKM KoNSeP adalah sebagai " +
                    "satu-satunya sarana pembangunan dan penyaluran minat dan bakat Mahasiswa Polines dalam" +
                    " bidang seni dan berorganisasi","https://i.postimg.cc/QC3VqYPz/konsep.png"}
    };

    public static ArrayList<Hmj> getListData(){
        ArrayList<Hmj> list = new ArrayList<>();
        for (String [] aData : data){
            Hmj hmj = new Hmj();
            hmj.setId(Integer.parseInt(aData[0]));
            hmj.setName(aData[1]);
            hmj.setDescription(aData[2]);
            hmj.setPhoto(aData[3]);

            list.add(hmj);
        }
        return list;
    }
}
