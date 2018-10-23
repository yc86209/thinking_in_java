package com.musanli.final_;

/**
 * @author: li_bin .
 * @description: 测试final .
 * @create: 2018-10-19 08:31 .
 */
public class TestFinal {
    public static void main(String[] args) {
        Bean bean1 = new Bean();
        Bean bean = FinalTest.finalParam(bean1);
        System.out.println(bean1.toString());
//        System.out.println(bean.toString());
        System.out.println("-------------------------------------------");
        Bean bean2 = new Bean();
        Bean bean3 = FinalTest.normalParam(bean2);
        System.out.println(bean2.toString());
//        System.out.println(bean3.toString());
    }
}

class FinalTest {
    public static Bean finalParam(final Bean bean) {
        bean.setLike("看书");
        bean.setName("唐伯虎");
        bean.setStudy("诗词歌赋");
        return bean;
    }

    public static Bean normalParam(Bean bean) {
        bean = new Bean();
        bean.setLike("看书");
        bean.setName("唐伯虎");
        bean.setStudy("诗词歌赋");
        return bean;
    }
}

class Bean {
    public String getName() {
        return name;
    }

    public String getLike() {
        return like;
    }

    public String getStudy() {
        return study;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLike(String like) {
        this.like = like;
    }

    public void setStudy(String study) {
        this.study = study;
    }

    private String name;
    private String like;
    private String study;

    @Override
    public String toString() {
        return "Bean{" +
                "name='" + name + '\'' +
                ", like='" + like + '\'' +
                ", study='" + study + '\'' +
                '}';
    }
}