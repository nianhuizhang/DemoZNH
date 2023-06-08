package com.hui.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)//链式写法
public class SC {
    private int sno;
    private int cno;
    private int score;
}
