package com.dune.game.core;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.MathUtils;
import com.badlogic.gdx.math.Vector2;

public class BattleMap {
    private TextureRegion grassTexture;
    private TextureRegion circle;

    private Vector2 position;
    int [][] circles;
    private boolean active;
    private int circlePosition;

    public BattleMap() {
        this.grassTexture = Assets.getInstance().getAtlas().findRegion("grass");
        this.circle = Assets.getInstance().getAtlas().findRegion("circle");
        this.active = active;
        this.circles = new int [16][9];
        this.circles = circles;
        fillCircles();
        this.circlePosition = circlePosition;
    }

    public boolean isActive() {
        return active;
    }

    public int [][] fillCircles(){
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                circles[i][j] = MathUtils.random(0, 1);
            }
        }
        return circles;
    }

    public int getCirclePosition(){
        return circlePosition;
    }

    public int [][] getCircles(){
        return circles;
    }

    public void render(SpriteBatch batch) {
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 9; j++) {
                batch.draw(grassTexture, i * 80, j * 80);
                if (circles[i][j] == 1) {
                    batch.draw(circle, i * 80, j * 80);
                }
            }
        }
    }
}
