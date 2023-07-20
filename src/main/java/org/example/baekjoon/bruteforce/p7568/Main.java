package org.example.baekjoon.bruteforce.p7568;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            people.add(new Person(x, y, 1));
        }

        for (int i = 0; i < people.size(); i++) {
            for (int j = 0; j < people.size(); j++) {
                Person cur = people.get(i);
                Person next = people.get(j);
                if (cur.weight < next.weight && cur.height < next.height) {
                    cur.seq++;
                }
            }
        }
        for (int i = 0; i < people.size(); i++) {
            sb.append(people.get(i).seq + " ");
        }
        System.out.println(sb);
    }
}

class Person {
    int weight;
    int height;
    int seq;

    public Person(int weight, int height, int seq) {
        this.weight = weight;
        this.height = height;
        this.seq = seq;
    }
}
