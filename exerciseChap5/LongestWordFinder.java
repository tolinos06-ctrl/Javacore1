package javacore.chapter05.object.exercise;

public class LongestWordFinder {

    public static void main(String[] args) {

        String text = "a bb ccc ddddddddddd eeeeeeeeee fffffffff gggg hhhhh iiiiiiiiiiii jjjjjj kkkkkkk mmmmmmmm";
        String [] test = text.split(" ");
        String max = test[0];
        for(int i = 0;i<test.length;i++){
            if(test[i].length() > max.length()){
                max = test[i];
            }

        }
        System.out.println("Le mot le plus long est : " + max);


        String motLong = "";
        for (int i = 0; i<text.length();i++){
            String mot = " ";
            while(text.charAt(i) != ' ' && i < text.length() - 1){
                mot += text.charAt(i);
                i++;
            }
            if(mot.length() > motLong.length()){
                motLong = mot;
            }
        }
        System.out.println("Le mot le plus long est " + motLong);
    }
}