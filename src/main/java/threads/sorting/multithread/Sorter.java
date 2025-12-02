package threads.sorting.multithread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {

    List<Integer> values = new ArrayList<>();
    ExecutorService executorService;

    public Sorter(List<Integer> list, ExecutorService executorService){
        this.values            = list;
        this.executorService = executorService;
    }

    public List<Integer> call() throws ExecutionException, InterruptedException {

        if(values.size()<=1){
            return values;
        }

        int mid = values.size()/2;

        List<Integer> leftValues = values.subList(0,mid);
        Sorter leftSorter = new Sorter(leftValues,executorService);

        List<Integer> rightValues = values.subList(mid,values.size());
        Sorter rightSorter = new Sorter(rightValues,executorService);

        Future<List<Integer>> leftSortedFuture = executorService.submit(leftSorter);
        Future<List<Integer>> rightSortedFuture= executorService.submit(rightSorter);

        return mergeTwoLists(leftSortedFuture,rightSortedFuture);


    }
    public List<Integer> mergeTwoLists(Future<List<Integer>> sortedLeftFuture,
                                       Future<List<Integer>> sortedRightFuture) throws ExecutionException, InterruptedException {

        int first = 0;
        int second = 0;
        List<Integer> resultArray = new ArrayList<>();

        List<Integer> firstArray = sortedLeftFuture.get();
        List<Integer> secondArray = sortedRightFuture.get();

        while(first<firstArray.size() && second<secondArray.size()){

            if(firstArray.get(first) < secondArray.get(second)) {
                resultArray.add(firstArray.get(first));
                ++first;
            }
            else {
                resultArray.add(secondArray.get(second));
                ++second;
            }
        }

        while(first<firstArray.size())
            resultArray.add(firstArray.get(first++));
        while(second<secondArray.size())
            resultArray.add(secondArray.get(second++));

        return resultArray;
    }


}
