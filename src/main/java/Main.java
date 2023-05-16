public class Main {
    public static void main(String[] args) {
        Card card1 = new Card();
        card1.title = "Пылесос";
        card1.url = "https://www.websit.com/";

        Description description1 = new Description();
        description1.price = 300;
        description1.description = "Моющий, мощный, huawei";

        card1.description = description1;
    }
}
