package com.example.mockitodemo.business;

public class SomeBusinessImpl {

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }


    private DataService dataService;
    public int findTheGreatestFromAllData(){
        int[] data=dataService.reteriveAllData();
        int greatestValue=Integer.MIN_VALUE;

        for (int value:data){
            if(value > greatestValue)
                greatestValue=value;
        }
        return greatestValue;
    }

}

interface DataService{
    int[] reteriveAllData();
}


//this is required for stub not for mock
class DataServiceStub implements DataService{

    @Override
    public int[] reteriveAllData() {
        return new int[]{25,15,5};
    }
}
