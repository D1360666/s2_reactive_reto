package co.com.sofka.utils;

import co.com.sofka.dto.ActivityDto;
import co.com.sofka.model.Activity;
import org.springframework.beans.BeanUtils;

public class AppUtils {

    public static ActivityDto entityToDto(Activity activity){
        ActivityDto activityDto= new ActivityDto();
        BeanUtils.copyProperties(activity, activityDto);
        return activityDto;
    }


    public static Activity dtoToEntity(ActivityDto activityDto){
        Activity activity= new Activity();
        BeanUtils.copyProperties(activityDto,activity);
        return activity;
    }
}
