package com.application.e_commerce;

public class CategoryModal {

    private int id;
    private String categroy;

    public CategoryModal(int id, String categroy) {
        this.id = id;
        this.categroy = categroy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategroy() {
        return categroy;
    }

    public void setCategroy(String categroy) {
        this.categroy = categroy;
    }
}
