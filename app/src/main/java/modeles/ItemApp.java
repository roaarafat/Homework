package modeles;

public class ItemApp {
    String id_item;
    int img_item;
    String name_item;
    String tx_item;
    String tx_Rating;
    String tx_Size;
    String tx_event;
    String tx_ends;
    int img_event;

    public ItemApp(String id_item, int img_item, String name_item, String tx_item, String tx_Rating, String tx_Size,String tx_event,String tx_ends,int img_event) {
        this.id_item = id_item;
        this.img_item = img_item;
        this.name_item = name_item;
        this.tx_item = tx_item;
        this.tx_Rating = tx_Rating;
        this.tx_Size = tx_Size;
        this.tx_event=tx_event;
        this.tx_ends=tx_ends;
        this.img_event=img_event;
    }

    public int getImg_event() {
        return img_event;
    }

    public void setImg_event(int img_event) {
        this.img_event = img_event;
    }

    public String getTx_event() {
        return tx_event;
    }

    public void setTx_event(String tx_event) {
        this.tx_event = tx_event;
    }

    public String getTx_ends() {
        return tx_ends;
    }

    public void setTx_ends(String tx_ends) {
        this.tx_ends = tx_ends;
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
