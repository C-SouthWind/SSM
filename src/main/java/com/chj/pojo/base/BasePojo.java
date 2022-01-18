package com.chj.pojo.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class BasePojo {
    private Long id;
    private Date gmtCreate;
    private Date gmtUpdate;
    private String isDelete;
    private String version;
}
