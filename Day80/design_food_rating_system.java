package Day80;

public class design_food_rating_system {
    public static void main(String[] args) {
        String foods[] = { "kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi" };
        String cuisines[] = { "korean", "japanese", "japanese", "greek", "japanese", "korean" };
        int ratings[] = { 9, 12, 8, 15, 14, 7 };
        String food = "sushi";
        int newRating = 16;
        String cuisine = "japanese";
        FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
        obj.changeRating(food, newRating);
        String param_2 = obj.highestRated(cuisine);
        System.out.println(param_2);
    }
}
