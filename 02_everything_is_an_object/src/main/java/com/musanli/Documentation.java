package com.musanli;

import java.awt.Image;
import java.awt.image.ImageObserver;
import java.util.Date;

/**
 * @author: li_bin .
 * @description: java文档注释的使用 .
 * @date: 2018-10-12 09:23 .
 * -encoding UTF-8 -charset UTF-8
 */
public class Documentation {
    public Documentation(){

    }
    public Documentation(int i){
        this();
    }
    /**
     * System.out.println(new Date());
     * <pre>
     *     System.out.println(new Date())
     * </pre>
     */
    public Date date;

    /**
     * 你可以<em>随心所欲</em> insert a list
     * <ol>
     * <li>第一行</li>
     * <li>第二行</li>
     * <li>第三行</li>
     * </ol>
     */
    protected String name;

    public static void main(String[] args) {
        System.out.println(new Date());
    }

    /**
     * @return :Date
     * @see Date
     * @see java.util.Date
     * @see java.util.Date#Date()
     */
    public Date getDate() {
        return new Date();
    }

    /**
     * @return Date
     * @link java.util.Date#Date()
     */
    public Date getDate_link() {
        return new Date();
    }

    /**
     * @Description： 产生文档到根目录的相对路径
     * @docRoot：
     */
    public void docRoot(){};

    /**
     * @Description：
     * @inheritDoc：
     */
    public void inheritDoc(){};

    /**
     * @Description  当前版本
     * @version： 1.15
     */
    public void version(){};

    /**
     * @Description：作者
     * @author： li_bin
     */
    public String author;

    /**
     * Draws as much of the specified image as is currently available
     * with its northwest corner at the specified coordinate (x, y).
     * This method will return immediately in all cases, even if the
     * entire image has not yet been scaled, dithered and converted
     * for the current output device.
     * <p>
     * If the current output representation is not yet complete then
     * the method will return false and the indicated
     * {@link http://www.baidu.com } object will be notified as the
     * conversion process progresses.
     *
     * @param img the image to be drawn
     * @param x the x-coordinate of the northwest corner
     * of the destination rectangle in pixels
     * @param y the y-coordinate of the northwest corner
     * of the destination rectangle in pixels
     * @param observer the image observer to be notified as more
     * of the image is converted. May be
     * <code>null</code>
     * @return <code>true</code> if the image is completely
     * loaded and was painted successfully;
     * <code>false</code> otherwise.
     * @see Image
     * @see ImageObserver
     * @since 1.0
     */
    public void drawImage(Image img, int x, int y,
                          ImageObserver observer){};

}
