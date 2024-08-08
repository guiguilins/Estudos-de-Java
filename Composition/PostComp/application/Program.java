package Composition.PostComp.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import Composition.PostComp.entities.Comment;
import Composition.PostComp.entities.Post;

public class Program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Comment c1 = new Comment("Have a nice trip!");
        Comment c2 = new Comment("Wow that's awesome!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
                "Traveling to New Zealand",
                "I'm going to visit this wonderful country!", 12);

        p1.addComments(c1);
        p1.addComments(c2);
       

        Comment c3 = new Comment("Eae blz");
        Comment c4 = new Comment("Tudo bem!");

        Post p2 = new Post(sdf.parse("08/08/2024 12:49:50"),
                "Jogando muito bem",
                "Estou viajando e jogando", 56);

        p2.addComments(c3);
        p2.addComments(c4);

        System.out.println(p1);
        System.out.println(p2);

        sc.close();
    }
}
