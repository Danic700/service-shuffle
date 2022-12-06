package com.example.serviceshuffle.service;

import com.example.serviceshuffle.model.Number;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class ShuffleServiceImpl implements ShuffleService{


    @Override
    public List<Integer> shuffle(Number number) {

        List<Integer> shuffledList = IntStream.range(1, number.getNumber() + 1)
                .boxed()
                .collect(Collectors.toList());
        Random rand = new Random();
        //Fisher-Yates Algorithm - runs at O(N) by randomly swapping members in the List from the end to the beginning and decreasing the index
        for (int i = shuffledList.size() - 1; i > 0 ; i--)
        {
            // generate a random number `j` such that `0 <= j <= i`
            int j = rand.nextInt(i + 1);
            // swap the current element with the randomly generated index
            Collections.swap(shuffledList, i, j);
        }

        return shuffledList;
    }

}
