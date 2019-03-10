package com.test.asus.mymovie.Presenter;

import android.content.Context;
import com.test.asus.mymovie.Model.AnimeModel;
import com.test.asus.mymovie.View.MainView;
import com.test.asus.mymovie.R;
import java.util.ArrayList;
import java.util.List;

public class AnimePresenter {
    Context context;
    List<AnimeModel> animeModels = new ArrayList<>();
    MainView view;
    public AnimePresenter(MainView view, Context context){
        this.view = view;
        this.context = context;
    }

    public void setData(){
        AnimeModel anime;

        anime= new AnimeModel("The Last: Naruto the MovieThe Last",R.drawable.naruto,"merupakan film Naruto kesepuluh dan film Naruto Shippūden ketujuh. Film ini dibuat sebagai hari peringatan untuk ulang tahun ke-15 dari usaha waralaba. Film ini juga merupakan pertama yang tercatat pada Awal dari Projek Era Baru (Start of a New Era Project 新時代開幕プロジェクト, Shinjidai Kaimaku Purojekuto), dan film pertama yang menjadi bagian resmi dari tulisan asli alur cerita Naruto, serta set yang terjadi setelah timeskip antara dua bab terakhir dari seri manga. Film ini tayang perdana di bioskop pada tanggal 6 Desember 2014.[1][2] Tagline film ini adalah, Episode terakhir: cinta pertama. The last episode; a first love. 最後の物語は、はじめての愛。, Saigo no monogatari wa, hajimete no ai.");
        animeModels.add(anime);
        anime = new AnimeModel("Boruto: Naruto the Movie",R.drawable.boruto,"adalah film Naruto kesebelas yang berdasarkan manga karya Masashi Kishimoto dan disutradarai oleh Hiroyuki Yamashita. Ini adalah bagian yang lebih besar Awal dari Proyek Era Baru (Start of a New Era Project 新時代開幕プロジェクト, Shinjidai Kaimaku Purojekuto) untuk merayakan ulang tahun ke-15 dari seri manga Naruto." +
                "Film ini pertama kali diperkenalkan pada adegan pos-kredit film sebelumnya, The Last: Naruto the Movie yang menceritakan kisah tentang anak-anak dari karakter utama seri manga.");
        animeModels.add(anime);
        anime = new AnimeModel("Boku no Hero Academia: Futari No Hero",R.drawable.bokunohero,"(僕のヒーローアカデミア Boku no Hīrō Akademia) adalah sebuah serial manga komedi petualangan karya Kōhei Horikoshi. Manga ini telah diserialisasi di Mingguan Shonen Jump sejak Juli 2014, dan 15 volume yang telah dikumpulkan dalam bentuk tankōbon. Serial ini untuk dalam bahasa Inggris telah dilisensi oleh Viz Media, dan mulai serialisasi di mingguan manga antologi digital Mingguan Shonen Jump pada tanggal 9 Februari 2015." +
                "Manga ini menceritakan tentang Izuku Midoriya, seorang anak laki-laki lahir tanpa kekuatan super di dunia di mana kekuaan super adalah hal yang wajar, tetapi masih bercita-cita menjadi seorang pahlawan super, dan dibimbing oleh pahlawan terkuat di dunia yang memberikan kekuatanya kepada Izuku. Manga ini diadaptasi menjadi sebuah serial anime televisi; musim pertama ditayangkan dari tanggal 3 April sampai dengan 26 Juni 2016. Musim kedua ditayangkan dari tanggal 1 April hingga 30 September 2017. Musim ketiga sedang ditayangkan sejak 7 April 2018.");
        animeModels.add(anime);
        anime = new AnimeModel("Kimi no Na wa",R.drawable.kiminonawa,"(君の名は。, harfiah: Namamu), atau yang dikenal juga dengan judul bahasa Inggrisnya Your Name, adalah sebuah film animasi Jepang produksi tahun 2016 bertema fantasi untuk remaja yang ditulis dan disutradarai oleh Makoto Shinkai dan diproduksi oleh CoMix Wave Films. Perancangan tokoh film ini dikerjakan oleh Masayoshi Tanaka, dan penggubahan musik dibuat oleh band rock asal Jepang Radwimps. Film ini dibuat berdasarkan novel karya Makoto Shinkai berjudul sama yang dirilis sebulan sebelum pemutaran perdananya tentang seorang siswi di pedesaan Jepang dan seorang siswa di Tokyo yang saling bertukar tubuh. Film ini dibintangi oleh Ryunosuke Kamiki, Mone Kamishiraishi, Masami Nagasawa dan Etsuko Ichihara.");
        animeModels.add(anime);
        anime = new AnimeModel("A Silent Voice: The Movie",R.drawable.koenokatachi,"(bahasa Jepang: 映画 聲の形 Hepburn: Eiga Koe no Katachi, juga diterjemahkan sebagai The Shape of Voice: The Movie) adalah sebuah film drama remaja animasi Jepang tahun 2016 yang diproduksi oleh Kyoto Animation, disutradarai oleh Naoko Yamada dan ditulis oleh Reiko Yoshida, menampilkan desain karakter karya Futoshi Nishiya dan musik karya Kensuke Ushio. Film ini diadaptasi dari manga berjudul sama yang ditulis dan diilustrasikan oleh Yoshitoki Ōima. Film ini diputar perdana di Jepang pada tanggal 17 September 2016 dan di seluruh dunia antara bulan Februari dan Juni 2017.");
        animeModels.add(anime);
        anime = new AnimeModel("Let Me Eat Your Pancreas ",R.drawable.eatyourpancreas,"(bahasa Jepang: 君の膵臓をたべたい Hepburn: Kimi no Suizo wo Tabetai) adalah film drama romansa Jepang 2017 yang dibintangi Minami Hamabe, Takumi Kitamura, Keiko Kitagawa dan Shun Oguri. Disutradarai oleh Shō Tsukikawa, film ini didasarkan pada novel 2015 dengan judul yang sama oleh Yoru Sumino.");
        animeModels.add(anime);

        view.onSucsess(animeModels);
    }
}

