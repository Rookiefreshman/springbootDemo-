package com.shixiang.demo.enums;

public enum CodeEnum {
    /**
     *操作成功提示
     */
    SUCCESS("操作成功", 0),
    /**
    失败后提示
     */
    FAILED("操作失败", -1),
    /**
     参数不正确提示
     */
    PARAM("参数不正确", 2);
    /**
     * 提示信息
     */
    private String msg;
    /**
     * 提示代码
     */
    private Integer code;

    private CodeEnum(String msg, Integer code) {
        this.msg = msg;
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
