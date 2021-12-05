import dao.KategoriDao;

public class Application {

    public static void main(String[] args) {

        KategoriDao kategoriDao = new KategoriDao();
        kategoriDao.findAll();
    }
}
