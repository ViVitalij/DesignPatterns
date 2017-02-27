package pl.sda.mvc.model;

import java.util.List;

/**
 * Created by m.losK on 2017-02-27.
 */
public class ModelFacade {
    public static List<Long> getValueThroughFacade(){
        return Model.getValues();
    }

    public static void addNewValueThroughFacade(long newValue){
        Model.addValue(newValue);
    }
}
