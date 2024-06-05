package itsStart.OOP.Lesson7;

public class Cat {

String color;
double weight;
String owerName;

public Cat (String colorName, double weightCat, String owner) {
    this.color = colorName;
    this.weight = weightCat;
    this.owerName = owner;
}
public void destroySofa (String sofaOwner){
    System.out.printf("Кот дерет диван %s", sofaOwner);
}
public String hunt (boolean isDay){
    if (isDay){
        return "mouse";
    }return "rat";

}


    @Override
    public String toString() {
        return "Dog{" +
                "color='" + color + '\'' +
                ", weight=" + weight +
                ", owerNeame='" + owerName + '\'' +
                '}';
    }


}
