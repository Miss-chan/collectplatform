package com.collectplatform.project.vo.LabelVo;

import lombok.Data;
import javax.validation.constraints.NotNull;


@Data
public class ListInVo {

    private String name;
    @NotNull
    private Integer page;
    @NotNull
    private Integer size;

}
