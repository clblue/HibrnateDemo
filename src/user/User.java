package user;

public class User {
    private String username;

    private String password;

    private Product product;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public User() {
    }

    public User(String username, String password, Product product) {
        this.username = username;
        this.password = password;
        this.product = product;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String print()
    {
/*        int[] a = new int[3];
        a[3] = 5;*/
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", product=" + product +
                '}';
    }
}
