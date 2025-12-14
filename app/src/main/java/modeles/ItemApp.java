package modeles;

public class ItemApp {
    String id_item;
    int img_item;
    String name_item;
    String tx_item;
    String tx_Rating;
    String tx_Size;

    public ItemApp(String id_item, int img_item, String name_item, String tx_item, String tx_Rating, String tx_Size) {
        this.id_item = id_item;
        this.img_item = img_item;
        this.name_item = name_item;
        this.tx_item = tx_item;
        this.tx_Rating = tx_Rating;
        this.tx_Size = tx_Size;
    }

    public String getId_item() {
        return id_item;
    }

    public void setId_item(String id_item) {
        this.id_item = id_item;
    }

    public int getImg_item() {
        return img_item;
    }

    public void setImg_item(int img_item) {
        this.img_item = img_item;
    }

    public String getName_item() {
        return name_item;
    }

    public void setName_item(String name_item) {
        this.name_item = name_item;
    }

    public String getTx_item() {
        return tx_item;
    }

    public void setTx_item(String tx_item) {
        this.tx_item = tx_item;
    }

    public String getTx_Rating() {
        return tx_Rating;
    }

    public void setTx_Rating(String tx_Rating) {
        this.tx_Rating = tx_Rating;
    }

    public String getTx_Size() {
        return tx_Size;
    }

    public void setTx_Size(String tx_Size) {
        this.tx_Size = tx_Size;
    }
}
