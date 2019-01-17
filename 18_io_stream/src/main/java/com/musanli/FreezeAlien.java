package com.musanli;//: io/FreezeAlien.java
// Create a serialized output file.

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class FreezeAlien {
    public static void main(String[] args) throws Exception {
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("X.file"));
        Alien quellek = new Alien();
        quellek.setAge(100);
        quellek.setName("张晓");
        quellek.setLike("打球");
        out.writeObject(quellek);
        out.flush();
        out.close();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("X.file"));
        Object o = ois.readObject();
        System.out.println(o.getClass().getSimpleName());
        Object getName = o.getClass().getMethod("getName", null).invoke(o, null);
        System.out.println(getName);
        Object getAge = o.getClass().getMethod("getAge", null).invoke(o, null);
        System.out.println(getAge);
        Object getLike = o.getClass().getMethod("getLike", null).invoke(o, null);
        System.out.println(getLike);
        ois.close();
    }
} ///:~

class Alien implements Serializable {
    private String name;
    private transient String like;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    private void writeObject(ObjectOutputStream stream) throws IOException {
//        stream.defaultWriteObject();
        stream.writeObject(name);
    }
//    private void writeExternal(ObjectOutputStream out) throws IOException {
//        out.writeObject(this.getName());
//        out.writeObject(this.getAge());
//        out.writeObject(this.getLike());
//    }

    private void readObject(ObjectInputStream stream)
            throws IOException, ClassNotFoundException {
//        stream.defaultReadObject();
        name = (String) stream.readObject();
    }

//    private void readExternal(ObjectInputStream in) throws IOException, ClassNotFoundException {
//        this.setName(in.readObject().toString());
//        this.setAge(Integer.valueOf(in.readObject().toString()));
//        this.setLike(in.readObject().toString());
//    }

    public Alien() {
    }

    public Alien(String name, String like, Integer age) {

        this.name = name;
        this.like = like;
        this.age = age;
    }
} ///:~
