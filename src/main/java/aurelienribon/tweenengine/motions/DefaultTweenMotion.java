package aurelienribon.tweenengine.motions;

import aurelienribon.tweenengine.TweenMotion;

/**
 * A tween delta which does nothing and returns
 * an original delta time.
 */
public class DefaultTweenMotion implements TweenMotion {

    /**
     * The instance of the {@link DefaultTweenMotion}.
     */
    public static final DefaultTweenMotion INSTANCE = new DefaultTweenMotion();

    private DefaultTweenMotion() {
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public float adjustDelta(float delta) {
        return delta;
    }
}
