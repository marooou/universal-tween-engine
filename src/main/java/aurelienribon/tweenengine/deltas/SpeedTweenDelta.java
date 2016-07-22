package aurelienribon.tweenengine.deltas;

import aurelienribon.tweenengine.TweenDelta;

/**
 * A tween delta which changes the delta time
 * by multiplying it by speed coefficient.
 * <p>
 *   Slow motion, fast motion and backward play can be easily achieved by
 *   tweaking the speed. Set the speed to -1 to play the animation
 *   backward, or to 0.5 to play it twice slower than its normal speed.
 * </p>
 */
public class SpeedTweenDelta implements TweenDelta {

    private float speed;

    /**
     * Initializes a new instance of the {@link aurelienribon.tweenengine.deltas.SpeedTweenDelta}.
     * with a speed of 1.0 (unmodified).
     */
    public SpeedTweenDelta() {
        speed = 1.0f;
    }

    /**
     * Initializes a new instance of the {@link aurelienribon.tweenengine.deltas.SpeedTweenDelta}.
     * with given initial speed.
     */
    public SpeedTweenDelta(float initialSpeed) {
        speed = initialSpeed;
    }

    /**
     * Gets current speed coefficient.
     * @return The speed coefficient.
     */
    public float getSpeed() {
        return speed;
    }

    /**
     * Sets current speed coefficient.
     * @param speed The speed coefficient.
     */
    public void setSpeed(float speed) {
        this.speed = speed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float adjustDelta(float delta) {
        return delta * speed;
    }
}
