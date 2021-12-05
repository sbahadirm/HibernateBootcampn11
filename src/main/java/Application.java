import entityservice.KategoriEntityService;

public class Application {

    public static void main(String[] args) {

        KategoriEntityService service = new KategoriEntityService();
        service.findAll();
    }
}
