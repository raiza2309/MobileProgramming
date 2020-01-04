package raiza.id.charactermeme;

import java.util.ArrayList;

public class MemeCharData {
    private static int[] id = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    private static String[] name = {
            "Derp",
            "Derpina",
            "Herp",
            "Troll",
            "Yao Ming",
            "Forever Alone",
            "Cage",
            "Mr. Bean",
            "Brian",
            "Poker Face"
    };

    private static String[] detail = {
            "Meme yang biasanya menggambarkan sosok laki-laki. Ekspresi yang biasa ditampilkan oleh meme Derp adalah ekspresi tersenyum yang menggambarkan ekspresi kasual. Terkadang meme ini dapat diartikan sebagai visualisasi dari kalimat \"I have no idea what I'm Doing\" atau \"Saya tidak tahu apa yang baru saja saya lakukan\"",
            "Meme yang menggambarkan karikatur seorang wanita. Derpina dapat dibagi menjadi tiga jenis yaitu, Derpina pirang, Derpina berambut hitam, dan Derpina berambut coklat. Meme Derpina memiliki ekspresi kasual yang sama dengan Derp yaitu tersenyum. Meme Derpina memiliki banyak ekspresi wajah yang lainnya, seperti Derpina ramah, Derpina yang sedang marah, dan berbagai ekspresi lainnya.",
            "Herp, ini dia karakter yang bisa dibilang menggemaskan dan suka bikin jengkel. Karakter ini bodohnya sangat melebihi Derp dan Derpina. Dalam meme, dia selalu membuat pernyataan bodoh dan bikin kesal.",
            "Karakter ini adalah karakter yang paling jahil dalam meme. Dia sangat suka ngusilin orang atau karakter meme yang lainnya. Dia pintar, tapi kepintarannya disalahgunakan untuk jahil kepada orang. Dia juga memiliki muka yang khas dengan senyum sadisnya yang terkesan meledek. Karakter ini juga sangat terkenal dan paling banyak penggemarnya.",
            "Karakter yang digunakan oleh sang pembuat meme yang ingin protes terhadap ilustrasi gambar yang ia tampilkan. Muka Yao Ming didapat dari wajah mantan atlet basket dari tim Houston Rockets, Yao Ming.",
            "Dia adalah karakter yang digambarkan selalu sendiri, tidak punya teman, pacar, dan kalaupun dapat sms paling juga dari operator. Meme ini biasanya digunakan untuk menggambarkan betapa kesepiannya seseorang.",
            "Sering dijadikan sebagai reaksi dari meme Herp. Meme ini berasal dari potongan scene Nicolas Cage dalam film Vampire's Kiss pada tahun 1988. Meme ini menggambarkan respon yang sarkastik terhadap pernyataan atau pertanyaan yang sudah jelas jawabannya.",
            "Meme yang berasal dari potongan scene dari film Mr. Bean's Holiday pada tahun 2007 yang diperankan oleh aktor Rowan Atkinson. Meme ini menggambarkan ekspresi wajah yang menunjukkan bahwa terdapat makna lain dari perkataan sebelumnya. Seperti penggunaanya yaitu \"If you know what I mean\" yang artinya \"Jika Anda tahu apa yang Saya maksud\".",
            "Meme yang menggambarkan kesialan yang dapat menimpa seseorang. Meme ini terkadang memberikan kita rasa simpati kepada orang yang merasakan kesialan tersebut. Nama asli tokoh dalam meme Bad Luck Brian adalah Kyle.",
            "Meme ini digunakan ketika seseorang sedang dalam posisi tidak tahu harus berkata apa dan tidak tahu harus berbuat apa. Meme ini juga diartikan sebagai ekspresi kebingungan atas suatu tindakan yang harus dilakukan atau tindakan yang dilakukan orang lain."
    };

    private static int[] charImage = {
            R.drawable.derp,
            R.drawable.derpina,
            R.drawable.herp,
            R.drawable.troll,
            R.drawable.yao_ming,
            R.drawable.forever_alone,
            R.drawable.cage,
            R.drawable.bean_face,
            R.drawable.brian,
            R.drawable.poker_face
    };

    static ArrayList<MemeChar> getListData() {
        ArrayList<MemeChar> list = new ArrayList<>();
        for (int position = 0; position < name.length; position++) {
            MemeChar character = new MemeChar();
            character.setId(id[position]);
            character.setName(name[position]);
            character.setDetail(detail[position]);
            character.setPhoto(charImage[position]);
            list.add(character);
        }
        return list;
    }
}
