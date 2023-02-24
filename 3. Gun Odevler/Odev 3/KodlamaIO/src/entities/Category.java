package entities;

public class Category {

    private int categoryId;
    private String categoryName;
    private String categoryDetail;

    public Category() {
    }

    public Category(int categoryId, String categoryName, String categoryDetail) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryDetail = categoryDetail;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryDetail() {
        return categoryDetail;
    }

    public void setCategoryDetail(String categoryDetail) {
        this.categoryDetail = categoryDetail;
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryDetail='" + categoryDetail + '\'' +
                '}';
    }
}
