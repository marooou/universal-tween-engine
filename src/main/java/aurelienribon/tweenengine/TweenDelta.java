package aurelienribon.tweenengine;

/**
 * Modifies each frame's delta time before handling the tween.
 */
public interface TweenDelta {

    /**
     * Adjust an original delta time.
     * <p>
     *   Slow motion, fast motion and backward play can be easily achieved by
     *   tweaking the original delta time. Multiply it by -1 to play the animation
     *   backward, or by 0.5 to play it twice slower than its normal speed.
     * </p>
     * @param delta The original delta time.
     * @return The modified delta time.
     */
    float adjustDelta(float delta);
}
