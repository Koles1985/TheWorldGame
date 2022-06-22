package com.koles.world;

import com.koles.view.WorldView;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("worldBean")
@Scope("singleton")
public class World {
    /**
     * конечная ширина всего мира
     */
    private final int WORLD_WIDTH = 1500000;

    /**
     * конечная длинна всего мира
     */
    private final int WORLD_HEIGHT = 1500000;

    /**
     * destroyWorld если вдруг нужно остановить всю работу программы
     * передаем значение - true
     */
    private boolean isDestroyWorld = false;

    private WorldView view;



    public World() {
        System.out.println("World is created!");
        try {
            startWorld();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void setDestroyWorld(boolean isDestroyWorld) {
        this.isDestroyWorld = isDestroyWorld;
    }

    /**
     * создает весь мир и при необходимости завершает
     * его радоту и останавливает всю программу
     * в метод  World.setDestroyWorld если вдруг нужно остановить всю работу программы
     * передаем значение - true
     */
    protected void startWorld() throws InterruptedException {
        while (!isDestroyWorld){
            //тут запускаем работу всего мира
            Thread.sleep(1000);
            System.out.println("Word is running");
        }
    }
}
