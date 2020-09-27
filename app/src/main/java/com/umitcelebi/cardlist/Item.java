package com.umitcelebi.cardlist;

public class Item {
    int background;
    String itemTitle;
    int profilePhone;
    int nbFollowers;

    public Item() {
    }

    public Item(int background, String itemTitle, int profilePhone, int nbFollowers) {
        this.background = background;
        this.itemTitle = itemTitle;
        this.profilePhone = profilePhone;
        this.nbFollowers = nbFollowers;
    }

    public int getBackground() {
        return background;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public int getProfilePhone() {
        return profilePhone;
    }

    public void setProfilePhone(int profilePhone) {
        this.profilePhone = profilePhone;
    }

    public int getNbFollowers() {
        return nbFollowers;
    }

    public void setNbFollowers(int nbFollowers) {
        this.nbFollowers = nbFollowers;
    }
}
