package cn.yunyichina.log.common.entity.dto;


import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2016/11/15 9:44
 * @Description:
 */
@Getter
@Setter
@ToString
public class SearchConditionDTO {
    /**
     * @See cn.yunyichina.log.common.constant
     */
    private int searchEngineType;
    private boolean fuzzy;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date beginDateTime;
    @JSONField(format = "yyyy-MM-dd HH:mm")
    private Date endDateTime;
    private String noIndexKeyword;
    private String keyword;
    private String key;
    private String value;

    //    extra
    private Integer collectedItemId;

}
