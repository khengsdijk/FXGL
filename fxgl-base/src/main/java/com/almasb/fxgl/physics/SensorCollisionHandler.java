/*
 * FXGL - JavaFX Game Library. The MIT License (MIT).
 * Copyright (c) AlmasB (almaslvl@gmail.com).
 * See LICENSE for details.
 */

package com.almasb.fxgl.physics;

import com.almasb.fxgl.entity.Entity;

/**
 * @author Almas Baimagambetov (almaslvl@gmail.com)
 */
public abstract class SensorCollisionHandler {

    private Object otherType;

    public final Object getOtherType() {
        return otherType;
    }

    /**
     * The order of types determines the order of entities in callbacks.
     *
     * @param a entity type of the first entity
     * @param b entity type of the second entity
     */
    public SensorCollisionHandler(Object otherType) {
        this.otherType = otherType;
    }

    /**
     * Called when entities A and B have just collided and weren't colliding in the last tick.
     */
    protected void onCollisionBegin(Entity other) {
        // no default implementation
    }

    /**
     * Called if entities A and B are currently colliding.
     */
    protected void onCollision(Entity other) {
        // no default implementation
    }

    /**
     * Called when entities A and B have just stopped colliding and were colliding in the last tick.
     */
    protected void onCollisionEnd(Entity other) {
        // no default implementation
    }
}
