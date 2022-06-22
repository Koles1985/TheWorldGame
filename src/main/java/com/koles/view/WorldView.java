package com.koles.view;

import org.springframework.stereotype.Component;

@Component("worldViewBean")
public class WorldView {

    /**
     * выводит графическое представление мира отрисовки мира
     * @param width ширина отрисовываемой области
     * @param height высота отрисовываемой области
     */
    public void drawWorld(int width, int height) {
        System.out.println("World view is started");
    }
}
