package part06;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=4525s
//        switches start at about 75:25 — stop at about 80:18
// Guide: GUIDE.md in this folder, steps 7–11
//
// Part 06 — switch, case, break, default
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called Switches.
//    Leave the "package part06;" line and the "public class Switches" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does.

public class Switches {
    public static void main(String [] args) {
        // declaring day as a String and then giving it whatever value I want but that its value set
        String day = "Pizza";
        // naming the switch
        switch (day) {
            // first case being sunday so if the day value is equivalent to sunday it is going to output what is assigned with it
            case "Sunday":
                System.out.println("It is Sunday");
                break;
            // 2nd case being monday so if the day value is equivalent to monday it is going to output what is assigned with it
            case "Monday":
                System.out.println("It is Monday");
                break;
            // first case being tuesday so if the day value is equivalent to tuesday it is going to output what is assigned with it
            case "Tuesday":
                System.out.println("It is Tuesday");
                break;
            // first case being wednesday so if the day value is equivalent to wednesday it is going to output what is assigned with it
            case "Wednesday":
                System.out.println("It is Wednesday");
                break;
            // first case being thursday so if the day value is equivalent to thursday it is going to output what is assigned with it
            case "Thursday":
                System.out.println("It is Thursday");
                break;
            // first case being friday so if the day value is equivalent to friday it is going to output what is assigned with it
            case "Friday":
                System.out.println("It is Friday");
                break;
            // first case being saturday so if the day value is equivalent to saturday it is going to output what is assigned with it
            case "Saturday":
                System.out.println("It is Saturday");
                break;
            // this is like an else statement so if days assigned value is not equal to any of the cases this is what is always outputted
            default:
                System.out.println(day + " is not a day");
        }

    }

}
