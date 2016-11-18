/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phones;

/**
 *
 * @author new
 */
public abstract class Phone {

    protected boolean touch;
    protected boolean hasWifi;
    protected int screenSize;

    public Phone() {
        System.out.println("Phone constructor");
    }

    public boolean isTouch() {
        return touch;
    }

    public boolean isHasWifi() {
        return hasWifi;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void call(String number) {
        System.out.println("Phone class is calling " + number);
    }

    public abstract void sendSMS(String number, String message);
}
